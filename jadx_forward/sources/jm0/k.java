package jm0;

/* loaded from: classes4.dex */
public abstract class k extends n75.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jm0.i f381802h = new jm0.i(null);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f381803i = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f381804e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f381805f;

    /* renamed from: g, reason: collision with root package name */
    public l75.k0 f381806g;

    public final boolean O6(java.lang.String dbPath) {
        long j17;
        d95.b0 b0Var;
        boolean S;
        d95.b0 b0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbPath, "dbPath");
        synchronized (this.f381804e) {
            boolean z17 = false;
            if (this.f381805f || this.f381806g != null) {
                l75.k0 k0Var = this.f381806g;
                if (k0Var != null && !k0Var.J()) {
                    z17 = true;
                }
                return z17;
            }
            long c17 = c01.id.c();
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(dbPath);
            if (!com.p314xaae8f345.mm.vfs.w6.j(r17)) {
                com.p314xaae8f345.mm.vfs.w6.u(r17);
            }
            d95.b0 b0Var3 = new d95.b0();
            java.util.HashMap hashMap = new java.util.HashMap();
            if (Q6()) {
                j17 = c17;
                b0Var = b0Var3;
                S = b0Var3.R("", dbPath, "", gm0.j1.b().h(), wo.w0.g(true), hashMap, false);
            } else {
                j17 = c17;
                b0Var = b0Var3;
                S = b0Var.S(dbPath, hashMap, false, true);
            }
            if (S) {
                b0Var2 = b0Var;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MMMvvmDB", "create db error, dbPath:".concat(dbPath));
                b0Var2 = null;
            }
            this.f381806g = b0Var2;
            java.util.Iterator it = N6().iterator();
            while (it.hasNext()) {
                ((l75.f0) it.next()).mo9764xdf360ce6(this.f381806g);
            }
            long c18 = c01.id.c();
            this.f381805f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MMMvvmDB", "initDB params %d %s %s", java.lang.Long.valueOf(c18 - j17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(com.p314xaae8f345.mm.vfs.w6.k(dbPath), 100.0d), dbPath);
            return S;
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b P6(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(this.f416990d, new jm0.j(this)).a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b) a17;
    }

    public l75.k0 Q4() {
        synchronized (this.f381804e) {
            l75.k0 k0Var = this.f381806g;
            boolean z17 = false;
            if (k0Var != null && !k0Var.J()) {
                z17 = true;
            }
            if (!z17) {
                return null;
            }
            return this.f381806g;
        }
    }

    public abstract boolean Q6();

    @Override // n75.a, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        l75.k0 k0Var;
        super.mo528x82b764cd();
        l75.k0 k0Var2 = this.f381806g;
        if (((k0Var2 == null || k0Var2.J()) ? false : true) && (k0Var = this.f381806g) != null) {
            k0Var.mo70513x5a5ddf8();
        }
        this.f381805f = false;
        this.f381806g = null;
    }
}
