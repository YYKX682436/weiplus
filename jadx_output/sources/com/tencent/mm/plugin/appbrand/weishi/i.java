package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 621;
    public static final java.lang.String NAME = "showShareActionSheet";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f90971g;

    public static void C(com.tencent.mm.plugin.appbrand.weishi.i iVar) {
        iVar.getClass();
        try {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = iVar.f90971g;
            if (k0Var != null) {
                k0Var.u();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowShareActionSheet", "hideActionSheet exception:%s", e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.n7 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.service.c0 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0() : lVar instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) lVar : null;
        if (V0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowShareActionSheet", "fail, page view is null");
            lVar.a(i17, o("fail:page don't exist"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowShareActionSheet", "weishi show share action sheet");
            V0.getRuntime().m(new com.tencent.mm.plugin.appbrand.weishi.d(this, V0));
            lVar.a(i17, o("ok"));
        }
    }
}
