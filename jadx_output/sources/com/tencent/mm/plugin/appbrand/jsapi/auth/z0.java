package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class z0 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y f79806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y0 f79807b;

    public z0(com.tencent.mm.plugin.appbrand.jsapi.auth.y0 y0Var, com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar) {
        this.f79807b = y0Var;
        this.f79806a = yVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.y0 y0Var = this.f79807b;
        y0Var.f79792e.N = (arrayList == null ? java.util.Collections.emptyList() : arrayList).size() > 0 ? (java.lang.String) arrayList.get(0) : "";
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = y0Var.f79792e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar = this.f79806a;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                jsApiAuthorize$AuthorizeTask.C("");
                yVar.a(z17, 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "user cancel");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(jsApiAuthorize$AuthorizeTask.N);
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask.B(jsApiAuthorize$AuthorizeTask, 2, arrayList2, z17);
            yVar.a(z17, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "click NegativeButton");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(jsApiAuthorize$AuthorizeTask.N);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask.B(jsApiAuthorize$AuthorizeTask, 1, arrayList3, z17);
        yVar.a(z17, 0);
        if (jsApiAuthorize$AuthorizeTask.N.equals("scope.voip")) {
            com.tencent.mm.plugin.appbrand.y mComponent = jsApiAuthorize$AuthorizeTask.f79331g;
            kotlin.jvm.internal.o.g(mComponent, "mComponent");
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
                fl1.g2 authorizeDialogContainer = mComponent.getRuntime().getAuthorizeDialogContainer();
                android.content.Context f147807d = mComponent.getF147807d();
                kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
                ((fl1.c0) authorizeDialogContainer).c(new ui1.e0(f147807d));
                L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "click PositiveButton");
    }
}
