package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class t7 implements com.tencent.mm.plugin.appbrand.widget.recent.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87116c;

    public t7(com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.view.View view, int i17) {
        this.f87116c = n7Var;
        this.f87114a = view;
        this.f87115b = i17;
    }

    public boolean a(android.view.View view, com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = z0Var.f92092a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "onItemClick appId:%s, username:%s", localUsageInfo.f76362e, localUsageInfo.f76361d);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87116c;
        n7Var.U1 = 1;
        n7Var.S1.a();
        n7Var.R1.a();
        int i17 = z0Var.f92093b;
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX;
        appBrandStatObject.f87791g = n7Var.getAppId();
        final com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = z0Var.f92092a;
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.t7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = appBrandStatObject;
                com.tencent.mm.plugin.appbrand.page.t7 t7Var = com.tencent.mm.plugin.appbrand.page.t7.this;
                t7Var.getClass();
                com.tencent.mm.plugin.appbrand.launching.precondition.x xVar = com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a;
                android.content.Context context = t7Var.f87116c.getContext();
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 = localUsageInfo2;
                ((com.tencent.mm.plugin.appbrand.launching.a) xVar).b(context, localUsageInfo3.f76361d, localUsageInfo3.f76362e, null, localUsageInfo3.f76363f, -1, appBrandStatObject2, null, null);
            }
        }, 250L);
        return true;
    }
}
