package yy1;

/* loaded from: classes13.dex */
public class a implements yy1.b {
    public java.util.Map a(java.util.List list, ry1.a aVar, java.util.Map map, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (aVar != null) {
            java.lang.String str2 = aVar.f482895a;
            if (!u46.l.e(str2)) {
                hashMap2.put("page_id", str2);
            }
            java.util.Map map2 = aVar.f482896b;
            if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
                hashMap2.putAll(map2);
            }
        }
        if (hashMap2.size() > 0) {
            if (!u46.l.e(str) && (u46.l.c(str, "biz_in") || u46.l.c(str, "biz_out") || u46.l.c(str, "session_in") || u46.l.c(str, "session_out") || u46.l.c(str, "page_in") || u46.l.c(str, "page_out"))) {
                hashMap.putAll(hashMap2);
            } else {
                hashMap.put("cur_page", hashMap2);
            }
        }
        if (list != null && list.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int size = list.size() - 1; size >= 0; size--) {
                ry1.a aVar2 = (ry1.a) list.get(size);
                if (aVar2 != null) {
                    java.lang.String str3 = aVar2.f482895a;
                    if (!u46.l.e(str3)) {
                        hashMap.put("view_id", str3);
                        arrayList.add(0, str3);
                        java.util.Map map3 = aVar2.f482896b;
                        if (map3 != null && ((java.util.HashMap) map3).size() > 0) {
                            hashMap.putAll(map3);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                hashMap.put("view_path", arrayList);
            }
        }
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }
}
