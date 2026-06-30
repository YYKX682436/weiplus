package c01;

/* loaded from: classes11.dex */
public final class d1 implements qk.s6 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f118632f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f118633g;

    /* renamed from: h, reason: collision with root package name */
    public static int f118634h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f118635i;

    /* renamed from: d, reason: collision with root package name */
    public static final c01.d1 f118630d = new c01.d1();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f118631e = jz5.h.b(c01.c1.f118610d);

    /* renamed from: m, reason: collision with root package name */
    public static final uh4.i0 f118636m = c01.b1.f118601d;

    @Override // qk.s6
    public java.lang.String Hg() {
        return (java.lang.String) ((jz5.n) f118631e).mo141623x754a37bb();
    }

    @Override // qk.s6
    public void U6(int i17, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20912, 1, java.lang.Integer.valueOf(i17), str, str2);
    }

    public void a() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService account not ready");
            return;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService service null and ignore");
            return;
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(f118636m);
        f118633g = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        f118634h = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        int i17 = gm0.m.i();
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService invalid account");
            f118632f = null;
            return;
        }
        java.lang.String str = i17 + "_biz_teen_mode_mmkv";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(str, 2, null);
        f118632f = N;
        if (N != null) {
            N.putBoolean("is_teen_mode", f118633g);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f118632f;
        if (o4Var != null) {
            o4Var.putInt("biz_teen_mode_acct_option", f118634h);
        }
        f118635i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeService", "initBizTeenModeService key: %s, isTeenMode: %b, bizAcctOption: %d", str, java.lang.Boolean.valueOf(f118633g), java.lang.Integer.valueOf(f118634h));
    }

    @Override // qk.s6
    public void da(dm.h1 h1Var) {
        if (h1Var != null && f118633g) {
            java.lang.String str = h1Var.f66748xdec927b;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20911, 1, str, c01.a2.e(str));
        }
    }

    @Override // qk.s6
    public boolean g0() {
        if (!f118635i) {
            a();
        }
        return f118633g && f118634h == 2;
    }

    @Override // qk.s6
    public boolean hh() {
        if (!f118635i) {
            a();
        }
        return !f118633g || f118634h == 1;
    }

    @Override // qk.s6
    /* renamed from: isTeenMode */
    public boolean mo13794x74219ae7() {
        if (!f118635i) {
            a();
        }
        return f118633g;
    }

    @Override // qk.s6
    public boolean pb(java.lang.String url, java.lang.String host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        if (!f118635i) {
            a();
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        return f118633g && parse != null && parse.getHost() != null && r26.i0.q(parse.getHost(), host, false, 2, null);
    }

    @Override // qk.s6
    public void s2(int i17, java.lang.String str) {
        if (str != null && f118633g) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            U6(i17, str, c01.a2.e(str));
        }
    }
}
