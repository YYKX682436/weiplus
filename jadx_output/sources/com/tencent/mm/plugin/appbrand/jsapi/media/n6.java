package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class n6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 787;
    public static final java.lang.String NAME = "previewMedia";

    /* renamed from: g, reason: collision with root package name */
    public final int f81951g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f81952h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f81953i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f81954m = new java.lang.Object();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        pa1.a aVar;
        pa1.e eVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "previewMedia data:%s", jSONObject);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) e9Var.t3().u0();
        if (appBrandInitConfigWC != null && appBrandInitConfigWC.k() && (aVar = (pa1.a) e9Var.V0().B1(pa1.a.class)) != null && (eVar = ((pa1.t) aVar).f352967x) != null) {
            r45.vd7 vd7Var = eVar.f352956a;
            if (vd7Var != null && vd7Var.f388138d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "addCustomDataListener to report canvas data");
                java.lang.String appId = e9Var.getAppId();
                com.tencent.mars.xlog.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "startListeningOperationEvent, appId:%s", appId);
                if (na1.d.f335951i == null) {
                    na1.d.f335951i = new na1.b(appId, e9Var);
                }
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(appId, na1.d.f335951i);
            }
        }
        java.lang.String appId2 = e9Var.getAppId();
        android.app.Activity Z0 = e9Var.Z0();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sources");
        if (optJSONArray == null || V0 == null || V0.v1() == null) {
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        int length = optJSONArray.length();
        java.lang.String[] strArr = new java.lang.String[length];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
            com.tencent.mm.media.model.AppBrandMediaSource appBrandMediaSource = new com.tencent.mm.media.model.AppBrandMediaSource();
            appBrandMediaSource.f68932d = optJSONObject.optString("url");
            appBrandMediaSource.f68933e = optJSONObject.optString("type");
            appBrandMediaSource.f68934f = optJSONObject.optString("poster");
            appBrandMediaSource.f68935g = optJSONObject.optString("thumbUrl");
            strArr[i19] = appBrandMediaSource.f68932d;
            if (!android.text.TextUtils.isEmpty(appBrandMediaSource.f68934f)) {
                com.tencent.mm.vfs.r6 absoluteFile = V0.getFileSystem().getAbsoluteFile(appBrandMediaSource.f68934f);
                if (absoluteFile != null) {
                    appBrandMediaSource.f68934f = absoluteFile.o();
                }
                if (appBrandMediaSource.f68934f.startsWith("http") && !arrayList2.contains(appBrandMediaSource.f68934f)) {
                    arrayList2.add(appBrandMediaSource.f68934f);
                }
            }
            if (!android.text.TextUtils.isEmpty(appBrandMediaSource.f68932d)) {
                com.tencent.mm.vfs.r6 absoluteFile2 = V0.getFileSystem().getAbsoluteFile(appBrandMediaSource.f68932d);
                if (absoluteFile2 != null) {
                    strArr[i19] = absoluteFile2.o();
                    appBrandMediaSource.f68932d = absoluteFile2.o();
                }
                if (appBrandMediaSource.f68932d.startsWith("http") && !"video".equalsIgnoreCase(appBrandMediaSource.f68933e) && !arrayList2.contains(appBrandMediaSource.f68932d)) {
                    arrayList2.add(appBrandMediaSource.f68932d);
                }
            }
            if (!android.text.TextUtils.isEmpty(appBrandMediaSource.f68935g)) {
                com.tencent.mm.vfs.r6 absoluteFile3 = V0.getFileSystem().getAbsoluteFile(appBrandMediaSource.f68935g);
                if (absoluteFile3 != null) {
                    appBrandMediaSource.f68935g = absoluteFile3.o();
                }
                if (appBrandMediaSource.f68935g.startsWith("http") && !arrayList2.contains(appBrandMediaSource.f68935g)) {
                    arrayList2.add(appBrandMediaSource.f68935g);
                }
            }
            arrayList.add(appBrandMediaSource);
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
        if (i18 < 0 || i18 >= length) {
            i18 = 0;
        }
        java.lang.String[] a17 = if1.a.a(strArr);
        java.lang.String[] b17 = if1.a.b(a17, strArr);
        int i29 = i18 >= a17.length ? 0 : i18;
        if (!(Z0 instanceof android.app.Activity)) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        synchronized (this.f81954m) {
            this.f81952h.clear();
            this.f81953i.clear();
            if (b17.length > 0) {
                this.f81952h.addAll(java.util.Arrays.asList(b17));
            }
        }
        if (arrayList2.isEmpty()) {
            e9Var.a(i17, C(Z0, V0, appId2, jSONObject, a17, i29, arrayList));
            return;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        com.tencent.mm.plugin.appbrand.jsapi.media.j6 j6Var = new com.tencent.mm.plugin.appbrand.jsapi.media.j6(this, a17, arrayList, Z0, V0, appId2, jSONObject, i29, e9Var, i17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(java.util.Arrays.asList(strArr2));
        for (java.lang.String str : strArr2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "getImageFromDiskCache url:%s", str);
            if (str.startsWith("http")) {
                V0.a2().n(str, new com.tencent.mm.plugin.appbrand.jsapi.media.l6(this, arrayList3, j6Var));
            }
        }
    }

    public final java.lang.String C(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String[] strArr, int i17, java.util.ArrayList arrayList) {
        boolean optBoolean = jSONObject.optBoolean("showmenu", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "showmenu:%b", java.lang.Boolean.valueOf(optBoolean));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", strArr[i17]);
        intent.putParcelableArrayListExtra("mediaSource", arrayList);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("isFromAppBrand", true);
        int i18 = v5Var.v1().getResources().getConfiguration().orientation;
        int i19 = i18 == 2 ? 0 : i18 == 1 ? 1 : -1;
        intent.putExtra("KOrientation", i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "KOrientation:%d", java.lang.Integer.valueOf(i19));
        intent.putExtra("showmenu", optBoolean);
        uh1.a aVar = (uh1.a) v5Var.b(uh1.a.class);
        if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.D)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPreviewMedia", "config.referer is null");
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.media.q7.a(v5Var, jSONObject, intent, aVar.D);
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) v5Var.t3().u0();
        if (appBrandInitConfigWC != null) {
            intent.putExtra("wxaSessionId", appBrandInitConfigWC.f47276v);
            intent.putExtra("isFromAppBrandGame", appBrandInitConfigWC.k());
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
            if (appBrandStatObject != null) {
                intent.putExtra("wxaScene", appBrandStatObject.f87790f);
            }
        }
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        intent.putExtra("scanQrCodeGetA8KeyScene", 44);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 6);
        bundle.putString("stat_app_id", str);
        bundle.putString("stat_url", v5Var.X1());
        bundle.putString("wxappPathWithQuery", v5Var.Y1());
        intent.putExtra("_stat_obj", bundle);
        intent.setClassName(context, "com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI");
        try {
            int length = intent.getExtras().toString().length();
            if (length > 524288) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreviewMedia", "data too large size:%d", java.lang.Integer.valueOf(length));
                return o("fail:data too large");
            }
            nf.g.a(context).f(new com.tencent.mm.plugin.appbrand.jsapi.media.k6(this));
            j45.l.o(context, "subapp", ".ui.gallery.GestureGalleryUI", intent, this.f81951g, false);
            return o("ok");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiPreviewMedia", e17, "JsApiPreviewImage get size error", new java.lang.Object[0]);
            return o("fail");
        }
    }
}
