package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class j4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 747;
    public static final java.lang.String NAME = "batchPreloadMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) e9Var.getRuntime();
        if (o6Var == null) {
            e9Var.a(i17, o("fail:runtime error"));
        } else {
            e9Var.a(i17, o(new com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController().preload(jSONObject, o6Var.q2())));
        }
    }
}
