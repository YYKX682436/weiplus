package bm5;

/* loaded from: classes9.dex */
public abstract class i0 {
    public static java.util.Map a(java.util.Map map, m3.d... dVarArr) {
        if (dVarArr == null || dVarArr.length == 0) {
            return map != null ? new java.util.HashMap(map) : new java.util.HashMap();
        }
        java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap(dVarArr.length + 4);
        for (m3.d dVar : dVarArr) {
            hashMap.put(dVar.f323092a, dVar.f323093b);
        }
        return hashMap;
    }
}
