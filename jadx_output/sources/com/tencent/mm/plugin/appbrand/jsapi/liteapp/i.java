package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes14.dex */
public final class i extends gb1.d {
    public static final int CTRL_INDEX = 1332;
    public static final java.lang.String NAME = "insertLiteAppView";

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLiteAppView", "invoke");
        B(lVar, data, i17, lVar.getF147808e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t component, org.json.JSONObject data) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z37;
        android.view.View view;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLiteAppView", "inflateView");
        android.content.Context f147807d = component.getF147807d();
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        double d17 = 0.75d;
        boolean z38 = true;
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("isHalfScreen");
            boolean optBoolean2 = optJSONObject.optBoolean("enablePullDown", true);
            z29 = optJSONObject.optBoolean("enablePullUp", true);
            z27 = optJSONObject.optBoolean("enableFullscreenPullDown", false);
            d17 = optJSONObject.optDouble("halfScreenHeightPercent", 0.75d);
            z37 = optJSONObject.optBoolean("withMask", true);
            z28 = optJSONObject.optBoolean("autoRotate", false);
            java.lang.String optString = optJSONObject.optString("enterType", "");
            if (optString.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                z17 = true;
                z38 = optBoolean2;
                z19 = optBoolean;
                z18 = false;
            } else if (optString.equals("modal")) {
                z17 = false;
                z18 = true;
                z38 = optBoolean2;
                z19 = optBoolean;
            } else {
                z17 = false;
                z38 = optBoolean2;
                z19 = optBoolean;
                z18 = false;
            }
        } else {
            z17 = false;
            z18 = false;
            z19 = false;
            z27 = false;
            z28 = false;
            z29 = true;
            z37 = true;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Context f147807d2 = component.getF147807d();
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
        iVar.getClass();
        if (z19) {
            com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = new com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView(f147807d2);
            wxaHalfScreenLiteAppView.setHeightPercent(d17);
            wxaHalfScreenLiteAppView.setEnablePullDown(z38);
            wxaHalfScreenLiteAppView.setEnablePullUp(z29);
            wxaHalfScreenLiteAppView.setEnableFullscreenPullDown(z27);
            wxaHalfScreenLiteAppView.setWithMask(z37);
            wxaHalfScreenLiteAppView.setAutoRotate(z28);
            wxaHalfScreenLiteAppView.setLandscape(false);
            wxaHalfScreenLiteAppView.setFullscreenEnter(z17);
            wxaHalfScreenLiteAppView.setModal(z18);
            view = wxaHalfScreenLiteAppView;
        } else {
            view = iVar.oj(f147807d2, false, false, null);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(f147807d, view);
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t component, int i17, android.view.View view, org.json.JSONObject data) {
        boolean z17;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLiteAppView", "onInsertView");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String optString3 = data.optString("query");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (optJSONObject != null) {
            jSONObject.put("params", optJSONObject);
            z17 = optJSONObject.optBoolean("isTransparent");
        } else {
            z17 = false;
        }
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.liteapp.ui.WxaLiteAppBaseView.class);
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = optString;
        d0Var.f360650b = optString2;
        d0Var.f360651c = optString3;
        d0Var.f360673y = jSONObject;
        d0Var.f360652d = java.lang.Boolean.valueOf(z17);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WA_APP;
        d0Var.f360674z = liteAppReferrerInfo;
        if (wxaLiteAppBaseView != null) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            com.tencent.mm.plugin.appbrand.jsapi.liteapp.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.h(component);
            com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
            iVar.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f360649a)) {
                hVar.fail();
            } else {
                com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
                iVar.rk(wxaLiteAppBaseView, iVar.mj(d0Var, openExtraData), d0Var.f360666r, d0Var.f360667s, openExtraData, hVar);
            }
        }
    }
}
