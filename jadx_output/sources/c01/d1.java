package c01;

/* loaded from: classes11.dex */
public final class d1 implements qk.s6 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f37099f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f37100g;

    /* renamed from: h, reason: collision with root package name */
    public static int f37101h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f37102i;

    /* renamed from: d, reason: collision with root package name */
    public static final c01.d1 f37097d = new c01.d1();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f37098e = jz5.h.b(c01.c1.f37077d);

    /* renamed from: m, reason: collision with root package name */
    public static final uh4.i0 f37103m = c01.b1.f37068d;

    @Override // qk.s6
    public java.lang.String Hg() {
        return (java.lang.String) ((jz5.n) f37098e).getValue();
    }

    @Override // qk.s6
    public void U6(int i17, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20912, 1, java.lang.Integer.valueOf(i17), str, str2);
    }

    public void a() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService account not ready");
            return;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService service null and ignore");
            return;
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(f37103m);
        f37100g = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        f37101h = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        int i17 = gm0.m.i();
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTeenModeService", "initBizTeenModeService invalid account");
            f37099f = null;
            return;
        }
        java.lang.String str = i17 + "_biz_teen_mode_mmkv";
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N(str, 2, null);
        f37099f = N;
        if (N != null) {
            N.putBoolean("is_teen_mode", f37100g);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f37099f;
        if (o4Var != null) {
            o4Var.putInt("biz_teen_mode_acct_option", f37101h);
        }
        f37102i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTeenModeService", "initBizTeenModeService key: %s, isTeenMode: %b, bizAcctOption: %d", str, java.lang.Boolean.valueOf(f37100g), java.lang.Integer.valueOf(f37101h));
    }

    @Override // qk.s6
    public void da(dm.h1 h1Var) {
        if (h1Var != null && f37100g) {
            java.lang.String str = h1Var.field_username;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20911, 1, str, c01.a2.e(str));
        }
    }

    @Override // qk.s6
    public boolean g0() {
        if (!f37102i) {
            a();
        }
        return f37100g && f37101h == 2;
    }

    @Override // qk.s6
    public boolean hh() {
        if (!f37102i) {
            a();
        }
        return !f37100g || f37101h == 1;
    }

    @Override // qk.s6
    public boolean isTeenMode() {
        if (!f37102i) {
            a();
        }
        return f37100g;
    }

    @Override // qk.s6
    public boolean pb(java.lang.String url, java.lang.String host) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(host, "host");
        if (!f37102i) {
            a();
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        return f37100g && parse != null && parse.getHost() != null && r26.i0.q(parse.getHost(), host, false, 2, null);
    }

    @Override // qk.s6
    public void s2(int i17, java.lang.String str) {
        if (str != null && f37100g) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            U6(i17, str, c01.a2.e(str));
        }
    }
}
