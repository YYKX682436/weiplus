package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.m f81295a;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        this.f81295a = mVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String invokeHandler(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f81295a;
            return mVar == null ? "" : mVar.p0(str, str2, "", i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e17, "invokeHandler", new java.lang.Object[0]);
            throw e17;
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String invokeHandler2(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        try {
            com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f81295a;
            return mVar == null ? "" : mVar.p0(str, str2, str3, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e17, "invokeHandler", new java.lang.Object[0]);
            throw e17;
        }
    }

    @android.webkit.JavascriptInterface
    public void publishHandler(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f81295a;
            if (mVar == null) {
                return;
            }
            int[] iArr = new int[0];
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
                iArr = new int[jSONArray.length()];
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    iArr[i17] = jSONArray.getInt(i17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSInterface", e17.getMessage());
            }
            mVar.d(str, str2, iArr);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSInterface", e18, "publishHandler", new java.lang.Object[0]);
            throw e18;
        }
    }
}
