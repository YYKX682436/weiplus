package ll0;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f400653c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f400654d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f400655a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f400656b = false;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("KaraCleanCache", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ll0.a(), false);
        f400654d = b4Var;
        b4Var.m77789xc5a5549d(false);
    }

    public java.lang.Object a(java.lang.String str, ll0.b bVar) {
        java.lang.Object obj;
        if (!this.f400656b) {
            this.f400655a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_plugin_kara_data_cache", "1", false, true), 1) != 0;
            this.f400656b = true;
        }
        if (!this.f400655a) {
            return bVar.mo145883xfb7e5820();
        }
        java.util.Map map = f400653c;
        synchronized (map) {
            java.lang.Class<?> cls = getClass();
            if (((java.util.HashMap) map).get(cls) == null) {
                ((java.util.HashMap) map).put(cls, new java.util.HashMap());
            }
            java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(cls);
            obj = map2.get(str);
            if (obj == null) {
                obj = bVar.mo145883xfb7e5820();
                map2.put(str, obj);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f400654d;
        if (b4Var.e()) {
            b4Var.c(1200000L, 1200000L);
        }
        return obj;
    }
}
