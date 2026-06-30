package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/gg", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI */
/* loaded from: classes11.dex */
public final class ActivityC18672xb885c992 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gg f255226f = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gg(null);

    /* renamed from: g, reason: collision with root package name */
    public static mj4.h f255227g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f255228h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f255229i;

    /* renamed from: d, reason: collision with root package name */
    public bi4.n0 f255230d;

    /* renamed from: e, reason: collision with root package name */
    public int f255231e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d0_;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusShowStatusCardUI", "onCreate: ");
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        vj5.o.e(getWindow());
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        getWindow().setNavigationBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        this.f255231e = getIntent().getIntExtra("KEY_ACTION", 0);
        mj4.h hVar = f255227g;
        if (hVar != null && (str = f255228h) != null) {
            bi4.k1 k1Var = new bi4.k1();
            k1Var.e(true);
            k1Var.f(true);
            k1Var.q(true);
            k1Var.j(false);
            k1Var.f102600g = 11;
            k1Var.f102597d |= 32;
            k1Var.r(true);
            k1Var.d(false);
            k1Var.i(false);
            k1Var.c(true);
            k1Var.g(false);
            k1Var.h(true);
            k1Var.o(true);
            k1Var.f102598e = true;
            k1Var.f102599f = true;
            k1Var.n(true);
            k1Var.m(true);
            k1Var.f102597d |= 1024;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3(this, k1Var);
            bi4.p0.U2(q3Var, str, hVar, null, 4, null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f567049hy4);
            if (viewGroup != null) {
                viewGroup.addView(q3Var.f255729m);
                try {
                    q3Var.u(q3Var.A);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(q3Var.f255723e, th6, "update handleThirdBack failed", new java.lang.Object[0]);
                }
                viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.hg(this, hVar, viewGroup, str), 150L);
            }
            q3Var.D1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ig(this);
            this.f255230d = q3Var;
            qj4.s.m(qj4.s.f445491a, this, 1L, null, hVar, 0L, 0L, 0L, 0L, null, null, k1Var.f102600g, 1012, null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusCardFeedsActivity);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "TextStatusShowStatusCardUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.TextState);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 28809);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f255228h = null;
        f255227g = null;
        f255229i = null;
        bi4.n0 n0Var = this.f255230d;
        if (n0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) n0Var).c();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        bi4.n0 n0Var = this.f255230d;
        if (n0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) n0Var).d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        bi4.n0 n0Var = this.f255230d;
        if (n0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) n0Var).a();
        }
        bi4.n0 n0Var2 = this.f255230d;
        if (n0Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) n0Var2).v5(false);
        }
    }
}
