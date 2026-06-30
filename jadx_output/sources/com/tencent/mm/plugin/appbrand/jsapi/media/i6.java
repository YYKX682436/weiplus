package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class i6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 30;
    public static final java.lang.String NAME = "previewImage";

    /* renamed from: g, reason: collision with root package name */
    public final int f81852g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String o17;
        int i18;
        pa1.a aVar;
        pa1.e eVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) e9Var.t3().u0();
        if (appBrandInitConfigWC != null && appBrandInitConfigWC.k() && (aVar = (pa1.a) e9Var.V0().B1(pa1.a.class)) != null && (eVar = ((pa1.t) aVar).f352967x) != null) {
            r45.vd7 vd7Var = eVar.f352956a;
            if (vd7Var != null && vd7Var.f388138d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewImage", "addCustomDataListener to report canvas data");
                java.lang.String appId = e9Var.getAppId();
                com.tencent.mars.xlog.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "startListeningOperationEvent, appId:%s", appId);
                if (na1.d.f335951i == null) {
                    na1.d.f335951i = new na1.b(appId, e9Var);
                }
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(appId, na1.d.f335951i);
            }
        }
        android.app.Activity Z0 = e9Var.Z0();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        java.lang.String appId2 = e9Var.getAppId();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray == null || optJSONArray.length() <= 0 || V0 == null || V0.v1() == null) {
            o17 = o("fail:invalid data");
        } else {
            int length = optJSONArray.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                strArr[i19] = optJSONArray.optString(i19);
            }
            java.lang.Object opt = jSONObject.opt("current");
            if (opt instanceof java.lang.Integer) {
                i18 = ((java.lang.Integer) opt).intValue();
            } else if (opt instanceof java.lang.String) {
                int i27 = 0;
                for (int i28 = 0; i28 < length; i28++) {
                    if (opt.equals(strArr[i28])) {
                        i27 = i28;
                    }
                }
                i18 = i27;
            } else {
                i18 = 0;
            }
            for (int i29 = 0; i29 < length; i29++) {
                com.tencent.mm.vfs.r6 absoluteFile = V0.getFileSystem().getAbsoluteFile(strArr[i29]);
                if (absoluteFile == null) {
                    absoluteFile = V0.getFileSystem().getPrivateAbsoluteFile(strArr[i29]);
                }
                if (absoluteFile != null) {
                    strArr[i29] = absoluteFile.o();
                }
            }
            java.lang.String[] a17 = if1.a.a(strArr);
            java.lang.String[] b17 = if1.a.b(a17, strArr);
            if (i18 >= a17.length) {
                i18 = 0;
            }
            if (Z0 instanceof android.app.Activity) {
                boolean optBoolean = jSONObject.optBoolean("showmenu", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewImage", "showmenu:%b", java.lang.Boolean.valueOf(optBoolean));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("nowUrl", a17[i18]);
                intent.putExtra("urlList", a17);
                intent.putExtra("type", -255);
                intent.putExtra("isFromWebView", true);
                intent.putExtra("isFromAppBrand", true);
                intent.putExtra("showmenu", optBoolean);
                int i37 = V0.v1().getResources().getConfiguration().orientation;
                int i38 = i37 == 2 ? 0 : i37 == 1 ? 1 : -1;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewImage", "KOrientation:%d", java.lang.Integer.valueOf(i38));
                intent.putExtra("KOrientation", i38);
                uh1.a aVar2 = (uh1.a) V0.b(uh1.a.class);
                if (aVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar2.D)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPreviewImage", "config.referer is null");
                } else {
                    com.tencent.mm.plugin.appbrand.jsapi.media.q7.a(V0, jSONObject, intent, aVar2.D);
                }
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) V0.t3().u0();
                if (appBrandInitConfigWC2 != null) {
                    intent.putExtra("wxaSessionId", appBrandInitConfigWC2.f47276v);
                    intent.putExtra("isFromAppBrandGame", appBrandInitConfigWC2.k());
                    com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC2.f47269b2;
                    if (appBrandStatObject != null) {
                        intent.putExtra("wxaScene", appBrandStatObject.f87790f);
                    }
                }
                intent.putExtra("shouldShowScanQrCodeMenu", true);
                intent.putExtra("scanQrCodeGetA8KeyScene", 44);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 6);
                bundle.putString("stat_app_id", appId2);
                bundle.putString("stat_url", V0.X1());
                bundle.putString("wxappPathWithQuery", V0.Y1());
                intent.putExtra("_stat_obj", bundle);
                intent.setClassName(Z0, "com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI");
                try {
                    int length2 = intent.getExtras().toString().length();
                    if (length2 > 524288) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreviewImage", "data too large size:%d", java.lang.Integer.valueOf(length2));
                        o17 = o("fail:data too large");
                    } else {
                        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.media.h6(this, b17));
                        j45.l.o(Z0, "subapp", ".ui.gallery.GestureGalleryUI", intent, this.f81852g, false);
                        o17 = o("ok");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiPreviewImage", e17, "JsApiPreviewImage get size error", new java.lang.Object[0]);
                    o17 = o("fail");
                }
            } else {
                o17 = o("fail:internal error invalid android context");
            }
        }
        e9Var.a(i17, o17);
    }
}
