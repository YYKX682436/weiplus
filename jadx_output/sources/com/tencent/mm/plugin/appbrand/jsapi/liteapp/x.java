package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes7.dex */
public final class x extends gb1.h {
    public static final int CTRL_INDEX = 1334;
    public static final java.lang.String NAME = "updateLiteAppView";

    @Override // gb1.h, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLiteAppView", "invoke");
        B(lVar, data, i17, lVar.getJsRuntime());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLiteAppView", "onUpdateView(viewId : %s, %s)", java.lang.Integer.valueOf(i17), jSONObject);
        return true;
    }
}
