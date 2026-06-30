package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lot0/f3;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI */
/* loaded from: classes15.dex */
public final class ActivityC12693xccd93dc7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements ot0.f3 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f171003e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f171004f;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f171007i;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70 f171015t;

    /* renamed from: u, reason: collision with root package name */
    public int f171016u;

    /* renamed from: v, reason: collision with root package name */
    public int f171017v;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171002d = "MicroMsg.AppBrandVideoPreviewUI";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171005g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f171006h = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f171008m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f171009n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f171010o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f171011p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f171012q = -1L;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f171013r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f171014s = "";

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f171002d, "hy: fail do job: %s", e3Var);
    }

    public final void T6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f171013r) ? 2 : 1);
        objArr[1] = this.f171011p;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = 1;
        g0Var.d(17608, objArr);
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f171002d, "hy: requestExitSelectedMode do job: %s", e3Var);
        if (e3Var == ot0.e3.trans) {
            T6(4);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569648hk;
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f171002d, "hy: doInBackground do job: %s", e3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0188  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f171004f;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.o("onUIDestroy", new java.lang.Object[0]);
            c12262x4a2a25a.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f171004f;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.f165062f.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f171004f;
        if (c12262x4a2a25a != null) {
            c12262x4a2a25a.r();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
