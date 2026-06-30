package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI */
/* loaded from: classes11.dex */
public class ActivityC18771x75e3b580 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f256843n = 0;

    /* renamed from: f, reason: collision with root package name */
    public jn4.m f256846f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 f256847g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f256848h;

    /* renamed from: d, reason: collision with root package name */
    public int f256844d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f256845e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f256849i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.q(this), true);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f256850m = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.r(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580, boolean z17) {
        activityC18771x75e3b580.getClass();
        android.content.Intent intent = new android.content.Intent(activityC18771x75e3b580, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.class);
        intent.putExtra("diagnose_result", z17);
        if (!z17) {
            activityC18771x75e3b580.f256846f.getClass();
            intent.putExtra("diagnose_log_file_path", jn4.m.f382347i);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC18771x75e3b580, arrayList.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18771x75e3b580.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC18771x75e3b580, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18771x75e3b580.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f256848h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lzd);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 c21509xb4b2d0e6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6) findViewById(com.p314xaae8f345.mm.R.id.cy8);
        this.f256847g = c21509xb4b2d0e6;
        c21509xb4b2d0e6.m79070xa4ffe27a(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.s(this));
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.t(this));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.u(this), 200L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.j(this, com.p314xaae8f345.mm.R.C30867xcad56011.bau, com.p314xaae8f345.mm.R.C30867xcad56011.bp9, com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu, com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx, new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.a0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.b0(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.f256847g.m79068x5133727e(false);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (!c01.d9.b().E()) {
            db5.t7.k(this, null);
        } else {
            this.f256847g.m79068x5133727e(true);
            super.onResume();
        }
    }
}
