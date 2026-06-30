import zipfile
import struct

def read_uleb128(data, offset):
    result = 0
    shift = 0
    while True:
        byte = data[offset]
        offset += 1
        result |= (byte & 0x7f) << shift
        if (byte & 0x80) == 0:
            break
        shift += 7
    return result, offset

def read_string(data, string_ids_off, idx):
    # Read string_id -> string_data_off
    off = string_ids_off + idx * 4
    string_data_off = struct.unpack_from("<I", data, off)[0]
    # Read uleb128 length then UTF-8 data
    pos = string_data_off
    length, pos = read_uleb128(data, pos)
    return data[pos:pos+length].decode("utf-8", errors="replace")

apk = zipfile.ZipFile(r"C:\Users\15853\Downloads\wechat.apk")
target_classes = [
    "com/tencent/mm/ui/contact/SelectContactUI",
    "com/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI",
    "com/tencent/mm/pluginsdk/ui/chat/ChatFooter",
    "com/tencent/mm/pluginsdk/ui/MultiSelectContactView",
]

for dex_name in sorted([n for n in apk.namelist() if n.endswith(".dex")]):
    data = apk.read(dex_name)
    if len(data) < 100:
        continue
    
    # Parse DEX header
    # string_ids_size at offset 56, string_ids_off at offset 60
    string_ids_size = struct.unpack_from("<I", data, 56)[0]
    string_ids_off = struct.unpack_from("<I", data, 60)[0]
    # type_ids_size at 64, type_ids_off at 68
    type_ids_size = struct.unpack_from("<I", data, 64)[0]
    type_ids_off = struct.unpack_from("<I", data, 68)[0]
    # proto_ids at 72/76
    # field_ids at 80/84
    # method_ids at 88/92
    method_ids_size = struct.unpack_from("<I", data, 88)[0]
    method_ids_off = struct.unpack_from("<I", data, 92)[0]
    # class_defs at 96/100
    class_defs_size = struct.unpack_from("<I", data, 96)[0]
    class_defs_off = struct.unpack_from("<I", data, 100)[0]
    
    # First, find the type_id for our target classes
    target_type_ids = {}
    for tid in range(type_ids_size):
        sidx = struct.unpack_from("<I", data, type_ids_off + tid * 4)[0]
        cls_name = read_string(data, string_ids_off, sidx)
        for tc in target_classes:
            if cls_name == tc:
                target_type_ids[tc] = tid
                break
    
    if not target_type_ids:
        continue
    
    print(f"\n=== {dex_name} ===")
    
    # Now parse class_defs to find method lists for target classes
    for cd_idx in range(class_defs_size):
        cd_off = class_defs_off + cd_idx * 32
        class_idx = struct.unpack_from("<I", data, cd_off)[0]
        # direct_methods_off at cd_off+20, virtual_methods_off at cd_off+24
        # class_data_off at cd_off+28
        class_data_off = struct.unpack_from("<I", data, cd_off + 28)[0]
        
        if class_idx not in target_type_ids.values():
            continue
        if class_data_off == 0:
            continue
        
        # Find which target class this is
        tc_name = [k for k, v in target_type_ids.items() if v == class_idx][0]
        print(f"  Class: {tc_name}")
        
        # Parse class_data
        pos = class_data_off
        # static_fields_size, instance_fields_size, direct_methods_size, virtual_methods_size
        static_fields_size, pos = read_uleb128(data, pos)
        instance_fields_size, pos = read_uleb128(data, pos)
        direct_methods_size, pos = read_uleb128(data, pos)
        virtual_methods_size, pos = read_uleb128(data, pos)
        
        # Skip field definitions
        for _ in range(static_fields_size + instance_fields_size):
            _, pos = read_uleb128(data, pos)  # field_idx_diff
            _, pos = read_uleb128(data, pos)  # access_flags
        
        all_methods = []
        # Read method definitions (direct + virtual)
        for method_list in [("direct", direct_methods_size), ("virtual", virtual_methods_size)]:
            last_method_idx = 0
            for _ in range(method_list[1]):
                method_idx_diff, pos = read_uleb128(data, pos)
                access_flags, pos = read_uleb128(data, pos)
                code_off, pos = read_uleb128(data, pos)
                last_method_idx += method_idx_diff
                # Read method name from method_ids
                mid_off = method_ids_off + last_method_idx * 8
                # method_id: class_idx(2) + proto_idx(2) + name_idx(4)
                name_idx = struct.unpack_from("<I", data, mid_off + 4)[0]
                method_name = read_string(data, string_ids_off, name_idx)
                all_methods.append((method_name, access_flags, method_list[0]))
        
        # Print methods
        for name, flags, kind in all_methods:
            marker = ["pub" if flags & 0x1 else "pri", "static" if flags & 0x8 else "", kind[:3]]
            print(f"    [{','.join(m for m in marker if m)}] {name}")
        
        break  # only first match per dex
