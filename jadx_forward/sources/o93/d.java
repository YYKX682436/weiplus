package o93;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t {

    /* renamed from: d, reason: collision with root package name */
    public final o93.e f425259d = new o93.e();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s cacheCategory:%s cacheKey:%s cacheType:%d", java.lang.String.valueOf(url), str3, str, str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s ", java.lang.String.valueOf(url), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: addJavascriptInterface */
    public void mo14658x74041feb(java.lang.Object obj, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "addJavascriptInterface name:%s ", str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "destroy");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript script:%s ", str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "getAddon");
        return this.f425259d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(sVar != null ? sVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "setJsExceptionHandler handler:%s ", objArr);
    }
}
