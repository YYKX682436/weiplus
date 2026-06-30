package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class mc extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "highlightTitleForSinglePage";

    /* renamed from: g, reason: collision with root package name */
    public boolean f85744g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) lVar;
        if (n7Var == null || n7Var.P3() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHighlightTitleForSinglePage", NAME);
        pm0.v.X(new com.tencent.mm.plugin.appbrand.lc(this, n7Var));
        n7Var.a(i17, o("ok"));
    }
}
