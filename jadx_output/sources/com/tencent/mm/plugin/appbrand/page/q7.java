package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q7 implements com.tencent.mm.plugin.appbrand.widget.recent.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87038a;

    public q7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87038a = n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.h0
    public boolean a(android.view.View view, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.h0
    public boolean b(android.view.View view, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, float f17, float f18) {
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.page.p7(this), 100L);
        if (xVar.f92085b != 1) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87038a;
        appBrandStatObject.f87791g = n7Var.getAppId();
        com.tencent.mm.plugin.appbrand.launching.precondition.x xVar2 = com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a;
        android.content.Context f147807d = n7Var.getF147807d();
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = xVar.f92084a;
        ((com.tencent.mm.plugin.appbrand.launching.a) xVar2).b(f147807d, localUsageInfo.f76361d, localUsageInfo.f76362e, null, localUsageInfo.f76363f, -1, appBrandStatObject, null, null);
        return true;
    }
}
