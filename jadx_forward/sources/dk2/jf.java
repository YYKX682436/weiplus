package dk2;

/* loaded from: classes3.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.jf f315198a = new dk2.jf();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f315199b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f315200c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f315201d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f315202e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f315203f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f315204g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f315205h = new java.util.HashMap();

    public final void a(java.lang.String key, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSysMsgCallback", "register close live callback");
        if (aVar != null) {
            java.util.HashMap hashMap = f315202e;
            if (hashMap.get(key) == null) {
                hashMap.put(key, aVar);
            }
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSysMsgCallback", "release callback");
        f315199b.clear();
        f315200c.clear();
        f315201d.clear();
        f315202e.clear();
        f315203f.clear();
        f315204g.clear();
        f315205h.clear();
    }
}
