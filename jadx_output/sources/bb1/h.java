package bb1;

/* loaded from: classes7.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final int a(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        switch (type.hashCode()) {
            case -844996807:
                if (type.equals("uint32")) {
                    return com.tencent.mm.wexnet.XnetDataKind.INSTANCE.getStorageDataKindUInt32();
                }
                break;
            case -766443077:
                if (type.equals("float32")) {
                    return com.tencent.mm.wexnet.XnetDataKind.INSTANCE.getStorageDataKindFloat32();
                }
                break;
            case 3237417:
                if (type.equals("int8")) {
                    return com.tencent.mm.wexnet.XnetDataKind.INSTANCE.getStorageDataKindInt8();
                }
                break;
            case 100359822:
                if (type.equals("int32")) {
                    return com.tencent.mm.wexnet.XnetDataKind.INSTANCE.getStorageDataKindInt32();
                }
                break;
            case 100359917:
                if (type.equals("int64")) {
                    return com.tencent.mm.wexnet.XnetDataKind.INSTANCE.getStorageDataKindInt64();
                }
                break;
            case 111289374:
                if (type.equals("uint8")) {
                    return com.tencent.mm.wexnet.XnetDataKind.getStorageDataKindUInt8();
                }
                break;
        }
        throw new java.lang.RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
    }

    public final java.lang.String b(int i17) {
        if (i17 == com.tencent.mm.wexnet.XnetDataKind.getStorageDataKindUInt8()) {
            return "uint8";
        }
        com.tencent.mm.wexnet.XnetDataKind xnetDataKind = com.tencent.mm.wexnet.XnetDataKind.INSTANCE;
        if (i17 == xnetDataKind.getStorageDataKindInt8()) {
            return "int8";
        }
        if (i17 == xnetDataKind.getStorageDataKindUInt32()) {
            return "uint32";
        }
        if (i17 == xnetDataKind.getStorageDataKindInt32()) {
            return "int32";
        }
        if (i17 == xnetDataKind.getStorageDataKindFloat32()) {
            return "float32";
        }
        if (i17 == xnetDataKind.getStorageDataKindInt64()) {
            return "int64";
        }
        throw new java.lang.RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
    }
}
