package ni;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ni.b f418703d = new ni.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f418704a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f418705b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f418706c = new java.util.HashMap();

    public final oi.e a(java.util.Map map, long j17, int i17) {
        oi.e eVar;
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) map.get(java.lang.Long.valueOf(j17));
            if (map2 == null) {
                map2 = new java.util.HashMap();
                map.put(java.lang.Long.valueOf(j17), map2);
            }
            eVar = (oi.e) map2.get(java.lang.Integer.valueOf(i17));
        }
        return eVar;
    }

    public final void b(java.util.Map map, int i17, long j17, oi.e eVar, oi.d dVar) {
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) map.get(java.lang.Long.valueOf(j17));
            if (map2 == null) {
                map2 = new java.util.HashMap();
                map.put(java.lang.Long.valueOf(j17), map2);
            }
            map2.put(java.lang.Integer.valueOf(i17), eVar);
        }
    }
}
