package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f89731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f89732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI f89733h;

    public g7(com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI appBrandSearchUI, java.lang.String str, int i17, int i18, int i19) {
        this.f89733h = appBrandSearchUI;
        this.f89729d = str;
        this.f89730e = i17;
        this.f89731f = i18;
        this.f89732g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f89733h.f183844p0;
        if (nVar != null) {
            if (!nVar.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchGuideDataReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", this.f89729d);
            hashMap.put("isCacheData", java.lang.Integer.valueOf(this.f89730e));
            hashMap.put("isExpired", java.lang.Integer.valueOf(this.f89731f));
            hashMap.put("isPreload", java.lang.Integer.valueOf(this.f89732g));
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.s1(nVar, nw4.x2.c("onSearchGuideDataReady", hashMap, nVar.f340903q, nVar.f340904r)));
        }
    }
}
