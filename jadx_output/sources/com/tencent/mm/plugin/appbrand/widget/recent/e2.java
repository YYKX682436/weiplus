package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class e2 implements com.tencent.mm.plugin.appbrand.widget.recent.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView f91972a;

    public e2(com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView menuAppBrandRecentView) {
        this.f91972a = menuAppBrandRecentView;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.h0
    public boolean a(android.view.View view, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, float f17, float f18) {
        com.tencent.mm.plugin.appbrand.widget.recent.h0 h0Var = this.f91972a.f91924t2;
        if (h0Var != null) {
            return h0Var.a(view, xVar, f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.h0
    public boolean b(android.view.View view, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, float f17, float f18) {
        com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView menuAppBrandRecentView = this.f91972a;
        com.tencent.mm.plugin.appbrand.widget.recent.h0 h0Var = menuAppBrandRecentView.f91924t2;
        if (h0Var != null ? h0Var.b(view, xVar, f17, f18) : false) {
            return true;
        }
        if (xVar.f92085b != 2) {
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX;
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            android.content.Context context = menuAppBrandRecentView.getContext();
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = xVar.f92084a;
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(context, localUsageInfo.f76361d, null, localUsageInfo.f76363f, -1, null, appBrandStatObject);
        }
        return false;
    }
}
