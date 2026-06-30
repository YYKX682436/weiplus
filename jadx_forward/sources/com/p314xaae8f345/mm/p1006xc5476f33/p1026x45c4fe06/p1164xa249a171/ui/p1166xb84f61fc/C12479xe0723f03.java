package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/OpenMaterialJsBridge;", "", "", "htmlTemplateContent", "Lbi1/g;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "", "Lcom/tencent/mm/plugin/appbrand/openmaterial/model/AppBrandOpenMaterialDetailModel;", "openMaterialDetailModels", "attachMyOpenMaterials2Template", "", "launchJsonStr", "Ljz5/f0;", "launchWeApp", "", "newHeight", "onWindowHeightChange", "weAppJsonStr", "onWeAppExposure", "Lcom/tencent/mm/ui/widget/MMWebView;", "webView", "Lcom/tencent/mm/ui/widget/MMWebView;", "Lfi1/v;", "launchWeAppDelegate", "Lfi1/v;", "getLaunchWeAppDelegate", "()Lfi1/v;", "setLaunchWeAppDelegate", "(Lfi1/v;)V", "Lfi1/w;", "weAppExposureDelegate", "Lfi1/w;", "getWeAppExposureDelegate", "()Lfi1/w;", "setWeAppExposureDelegate", "(Lfi1/w;)V", "<init>", "(Lcom/tencent/mm/ui/widget/MMWebView;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge */
/* loaded from: classes8.dex */
public final class C12479xe0723f03 {
    private fi1.v launchWeAppDelegate;
    private fi1.w weAppExposureDelegate;
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView;

    public C12479xe0723f03(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        this.webView = webView;
    }

    /* renamed from: attachMyOpenMaterials2Template */
    public final byte[] m52087xc587783b(byte[] htmlTemplateContent, bi1.g scene, java.util.List<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21> openMaterialDetailModels) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(htmlTemplateContent, "htmlTemplateContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialDetailModels, "openMaterialDetailModels");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachMyOpenMaterials2Template, scene: ");
        java.lang.String myName = scene.f102524d;
        sb6.append(myName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", sb6.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 : openMaterialDetailModels) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = c12474x8b872a21.f167788d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b22 = c12474x8b872a21.f167788d;
                jSONObject.put("appId", c12475x7cfc32b2.f167795d);
                jSONObject.put("versionType", c12475x7cfc32b22.f167796e);
                jSONObject.put("enterPath", c12475x7cfc32b22.f167797f);
                jSONObject.put("iconUrl", c12475x7cfc32b22.f167798g);
                jSONObject.put("functionName", c12475x7cfc32b22.f167799h);
                jSONObject.put("functionDesc", c12474x8b872a21.f167791g);
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List categories = c12474x8b872a21.f167789e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(categories, "categories");
                java.util.Iterator it = categories.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((java.lang.String) it.next());
                }
                jSONObject.put("functionCategories", jSONArray2);
                jSONObject.put(ya.b.f77498x4b14672, java.lang.Float.valueOf(c12474x8b872a21.f167790f));
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "attachMyOpenMaterials2Template, " + c12474x8b872a21 + " to json fail since " + e17);
            }
        }
        java.lang.String jSONArray3 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray3, "toString(...)");
        java.nio.charset.Charset charset = r26.c.f450398a;
        java.lang.String str = new java.lang.String(htmlTemplateContent, charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(myName, "myName");
        byte[] bytes = r26.i0.t(r26.i0.t(str, "###scene###", myName, false), "###preloadObjFeedsData###", jSONArray3, false).getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    public final fi1.v getLaunchWeAppDelegate() {
        return this.launchWeAppDelegate;
    }

    public final fi1.w getWeAppExposureDelegate() {
        return this.weAppExposureDelegate;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: launchWeApp */
    public final void m52090xf1d11c80(java.lang.String launchJsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchJsonStr, "launchJsonStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchJsonStr: ".concat(launchJsonStr));
        fi1.v vVar = this.launchWeAppDelegate;
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchWeAppDelegateSnapshot is null");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(launchJsonStr);
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            zh1.c cVar = (zh1.c) vVar;
            ((ku5.t0) ku5.t0.f394148d).B(new zh1.b(cVar.f554398a, cVar.f554399b, string, i17, string2));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, fail since " + e17);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onWeAppExposure */
    public final void m52091x383e7afb(java.lang.String weAppJsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppJsonStr, "weAppJsonStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppJsonStr: ".concat(weAppJsonStr));
        fi1.w wVar = this.weAppExposureDelegate;
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppExposureDelegateSnapshot is null");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(weAppJsonStr);
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            ((zh1.d) wVar).a(string, i17, string2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, fail since " + e17);
        }
    }

    /* renamed from: onWindowHeightChange */
    public final void m52092xebf95006(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, newHeight: " + i17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("height", i17);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ((ku5.t0) ku5.t0.f394148d).B(new fi1.y(jSONObject2, this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, fail since " + e17);
        }
    }

    /* renamed from: setLaunchWeAppDelegate */
    public final void m52093xa517a63(fi1.v vVar) {
        this.launchWeAppDelegate = vVar;
    }

    /* renamed from: setWeAppExposureDelegate */
    public final void m52094xc0d322fd(fi1.w wVar) {
        this.weAppExposureDelegate = wVar;
    }
}
