package qy1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qy1.c f449250a = new qy1.c();

    /* renamed from: b, reason: collision with root package name */
    public static x51.k0 f449251b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f449252c;

    /* renamed from: d, reason: collision with root package name */
    public static qy1.d f449253d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f449254e;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f449252c = hashMap;
        f449254e = new java.lang.Object();
        hashMap.put(428459010, qy1.a.f449225a);
    }

    public final void a() {
        synchronized (f449254e) {
            x51.k0 k0Var = f449251b;
            if (k0Var != null) {
                if (k0Var != null) {
                    k0Var.W(f449250a.hashCode());
                }
                f449251b = null;
            }
        }
        if (f449253d != null) {
            f449253d = null;
        }
    }

    public final x51.k0 b() {
        if (!gm0.j1.a()) {
            return null;
        }
        if (f449251b == null) {
            f449251b = x51.l0.a(hashCode(), gm0.j1.u().h() + "WxCgiReport.db", f449252c, true, true);
        }
        return f449251b;
    }

    public final void c() {
        if (f449253d == null) {
            synchronized (f449254e) {
                if (f449253d == null) {
                    try {
                        x51.k0 b17 = f449250a.b();
                        if (b17 != null) {
                            f449253d = new qy1.d(b17);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiDBHelper", "create db or table err! " + e17);
                    }
                }
            }
        }
    }
}
