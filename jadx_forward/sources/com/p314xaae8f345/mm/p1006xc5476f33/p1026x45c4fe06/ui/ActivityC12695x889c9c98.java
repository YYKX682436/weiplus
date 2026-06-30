package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI */
/* loaded from: classes13.dex */
public final class ActivityC12695x889c9c98 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f171024h;

    /* renamed from: d, reason: collision with root package name */
    public zx5.c f171025d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f171026e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f171027f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f171028g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate");
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.y0.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, kill tools");
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        boolean l17 = com.p314xaae8f345.p3210x3857dc.a3.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, current status downloading:%b", java.lang.Boolean.valueOf(l17));
        if (!l17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), null, null, true, true, null);
            this.f171026e = Q;
            Q.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ac(this));
            if (this.f171025d == null) {
                this.f171025d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc(this, null);
            }
            com.p314xaae8f345.p3210x3857dc.b3.f301748c = this.f171025d;
            by5.c4.f("XWebUpdater", "checkNeedDownload, start check runtime update");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "2");
            ((zx5.i0) zx5.n0.f558785a).e(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, hashMap);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, is foreground downloading");
        if (f171024h) {
            setResult(0, new android.content.Intent());
            finish();
            return;
        }
        if (this.f171025d == null) {
            this.f171025d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc(this, null);
        }
        com.p314xaae8f345.p3210x3857dc.b3.f301748c = this.f171025d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, xweb is downloading, ignore duplicated request");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q2 = db5.e1.Q(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571878se), true, true, null);
        this.f171026e = Q2;
        if (Q2.getWindow() != null) {
            android.view.WindowManager.LayoutParams attributes = this.f171026e.getWindow().getAttributes();
            attributes.dimAmount = 0.0f;
            this.f171026e.getWindow().setAttributes(attributes);
        }
        this.f171026e.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yb(this));
        android.os.Handler handler = new android.os.Handler();
        this.f171027f = handler;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zb zbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zb(this);
        this.f171028g = zbVar;
        handler.postDelayed(zbVar, 20000L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.lang.Runnable runnable;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDestroy");
        this.f171025d = null;
        com.p314xaae8f345.p3210x3857dc.b3.f301748c = null;
        android.os.Handler handler = this.f171027f;
        if (handler != null && (runnable = this.f171028g) != null) {
            handler.removeCallbacks(runnable);
        }
        super.onDestroy();
    }
}
