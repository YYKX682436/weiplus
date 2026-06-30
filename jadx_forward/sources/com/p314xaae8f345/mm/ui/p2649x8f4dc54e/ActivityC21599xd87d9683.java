package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/brandservice/BrandServiceTimelineUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.brandservice.BrandServiceTimelineUI */
/* loaded from: classes9.dex */
public final class ActivityC21599xd87d9683 extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 {

    /* renamed from: u, reason: collision with root package name */
    public final android.os.Handler f279571u = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public boolean f279572v;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.l_);
        super.onCreate(bundle);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428861y);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        zv.m0 m0Var = zv.m0.f557562a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_brand_service_box_report_cgi_android, false)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tl_main_session_holder", "view_clk", kz5.c1.m(m0Var.c(), zv.m0.f557568g), 12, false);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("tl_main_session_holder", "view_clk", kz5.c1.m(m0Var.c(), zv.m0.f557568g), 32424);
        }
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceTimelineUI);
        aVar.Rj(this, iy1.a.BizTimeline);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a d17 = yw.a3.f547799a.d();
        java.lang.String b17 = d17 != null ? d17.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        jz5.l lVar = new jz5.l("custom_session_id", b17);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        aVar.mk(this, kz5.c1.k(lVar, new jz5.l("expose_id", java.lang.String.valueOf(zv.m0.f557563b)), new jz5.l("ui_version", 1)));
        aVar.kk(this, 32, 32424, false);
        getWindow().getDecorView().setBackgroundColor(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f279571u.removeCallbacksAndMessages(null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        boolean z18 = this.f279572v;
        if (z18 || !z17 || z18) {
            return;
        }
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.o(this));
    }
}
