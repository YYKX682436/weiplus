package com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/OpenMaterialJsBridge;", "", "", "htmlTemplateContent", "Lbi1/g;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", "Lcom/tencent/mm/plugin/appbrand/openmaterial/model/AppBrandOpenMaterialDetailModel;", "openMaterialDetailModels", "attachMyOpenMaterials2Template", "", "launchJsonStr", "Ljz5/f0;", "launchWeApp", "", "newHeight", "onWindowHeightChange", "weAppJsonStr", "onWeAppExposure", "Lcom/tencent/mm/ui/widget/MMWebView;", "webView", "Lcom/tencent/mm/ui/widget/MMWebView;", "Lfi1/v;", "launchWeAppDelegate", "Lfi1/v;", "getLaunchWeAppDelegate", "()Lfi1/v;", "setLaunchWeAppDelegate", "(Lfi1/v;)V", "Lfi1/w;", "weAppExposureDelegate", "Lfi1/w;", "getWeAppExposureDelegate", "()Lfi1/w;", "setWeAppExposureDelegate", "(Lfi1/w;)V", "<init>", "(Lcom/tencent/mm/ui/widget/MMWebView;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OpenMaterialJsBridge {
    private fi1.v launchWeAppDelegate;
    private fi1.w weAppExposureDelegate;
    private final com.tencent.mm.ui.widget.MMWebView webView;

    public OpenMaterialJsBridge(com.tencent.mm.ui.widget.MMWebView webView) {
        kotlin.jvm.internal.o.g(webView, "webView");
        this.webView = webView;
    }

    public final byte[] attachMyOpenMaterials2Template(byte[] htmlTemplateContent, bi1.g scene, java.util.List<? extends com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> openMaterialDetailModels) {
        kotlin.jvm.internal.o.g(htmlTemplateContent, "htmlTemplateContent");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(openMaterialDetailModels, "openMaterialDetailModels");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachMyOpenMaterials2Template, scene: ");
        java.lang.String myName = scene.f20991d;
        sb6.append(myName);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", sb6.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel : openMaterialDetailModels) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d;
                com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel2 = appBrandOpenMaterialDetailModel.f86255d;
                jSONObject.put("appId", appBrandOpenMaterialModel.f86262d);
                jSONObject.put("versionType", appBrandOpenMaterialModel2.f86263e);
                jSONObject.put("enterPath", appBrandOpenMaterialModel2.f86264f);
                jSONObject.put("iconUrl", appBrandOpenMaterialModel2.f86265g);
                jSONObject.put("functionName", appBrandOpenMaterialModel2.f86266h);
                jSONObject.put("functionDesc", appBrandOpenMaterialDetailModel.f86258g);
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List categories = appBrandOpenMaterialDetailModel.f86256e;
                kotlin.jvm.internal.o.f(categories, "categories");
                java.util.Iterator it = categories.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((java.lang.String) it.next());
                }
                jSONObject.put("functionCategories", jSONArray2);
                jSONObject.put(ya.b.SCORE, java.lang.Float.valueOf(appBrandOpenMaterialDetailModel.f86257f));
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "attachMyOpenMaterials2Template, " + appBrandOpenMaterialDetailModel + " to json fail since " + e17);
            }
        }
        java.lang.String jSONArray3 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray3, "toString(...)");
        java.nio.charset.Charset charset = r26.c.f368865a;
        java.lang.String str = new java.lang.String(htmlTemplateContent, charset);
        kotlin.jvm.internal.o.f(myName, "myName");
        byte[] bytes = r26.i0.t(r26.i0.t(str, "###scene###", myName, false), "###preloadObjFeedsData###", jSONArray3, false).getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    public final fi1.v getLaunchWeAppDelegate() {
        return this.launchWeAppDelegate;
    }

    public final fi1.w getWeAppExposureDelegate() {
        return this.weAppExposureDelegate;
    }

    @android.webkit.JavascriptInterface
    public final void launchWeApp(java.lang.String launchJsonStr) {
        kotlin.jvm.internal.o.g(launchJsonStr, "launchJsonStr");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchJsonStr: ".concat(launchJsonStr));
        fi1.v vVar = this.launchWeAppDelegate;
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchWeAppDelegateSnapshot is null");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(launchJsonStr);
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(string2);
            zh1.c cVar = (zh1.c) vVar;
            ((ku5.t0) ku5.t0.f312615d).B(new zh1.b(cVar.f472865a, cVar.f472866b, string, i17, string2));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, fail since " + e17);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onWeAppExposure(java.lang.String weAppJsonStr) {
        kotlin.jvm.internal.o.g(weAppJsonStr, "weAppJsonStr");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppJsonStr: ".concat(weAppJsonStr));
        fi1.w wVar = this.weAppExposureDelegate;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppExposureDelegateSnapshot is null");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(weAppJsonStr);
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(string2);
            ((zh1.d) wVar).a(string, i17, string2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, fail since " + e17);
        }
    }

    public final void onWindowHeightChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, newHeight: " + i17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("height", i17);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            ((ku5.t0) ku5.t0.f312615d).B(new fi1.y(jSONObject2, this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, fail since " + e17);
        }
    }

    public final void setLaunchWeAppDelegate(fi1.v vVar) {
        this.launchWeAppDelegate = vVar;
    }

    public final void setWeAppExposureDelegate(fi1.w wVar) {
        this.weAppExposureDelegate = wVar;
    }
}
