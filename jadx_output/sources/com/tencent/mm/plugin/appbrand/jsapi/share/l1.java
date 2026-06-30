package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class l1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 779;
    public static final java.lang.String NAME = "showShareTimelineMenu";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowShareTimelineMenu", "invoke showShareTimelineMenu");
        if (c0Var == null) {
            c0Var.a(i17, o("fail"));
            return;
        }
        if (c0Var.V0() == null) {
            c0Var.a(i17, o("fail"));
        } else if (c0Var.V0().H1(4) == null) {
            c0Var.a(i17, o("fail"));
        } else {
            c0Var.V0().H1(4).f85995c = false;
            c0Var.a(i17, o("ok"));
        }
    }
}
