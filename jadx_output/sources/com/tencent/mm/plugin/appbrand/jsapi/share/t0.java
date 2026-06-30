package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f83233a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83234b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f83235c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83236d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83237e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83238f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f83239g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelmulti.WxaInfo f83240h;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, org.json.JSONObject data, com.tencent.mm.plugin.appbrand.y env) {
        com.tencent.mm.modelmulti.WxaInfo wxaInfo;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(env, "env");
        java.lang.String optString = data.optString("imagePath");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f83233a = optString;
        boolean optBoolean = data.optBoolean("needShowEntrance", false);
        this.f83234b = optBoolean;
        java.lang.String optString2 = data.optString("entrancePath");
        this.f83235c = optString2;
        java.lang.String optString3 = data.optString("chatroomUsername");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f83236d = optString3;
        java.lang.String optString4 = data.optString("openId");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        this.f83237e = optString4;
        java.lang.String optString5 = data.optString("quality", "compressed");
        kotlin.jvm.internal.o.f(optString5, "optString(...)");
        this.f83238f = com.tencent.mm.plugin.appbrand.jsapi.share.a1.f83106h.a(optString5);
        if (env.t3() instanceof com.tencent.mm.plugin.appbrand.o6) {
            if (optString2 == null || optString2.length() == 0) {
                com.tencent.mm.plugin.appbrand.page.w2 currentPage = env.t3().x0().getCurrentPage();
                kotlin.jvm.internal.o.d(currentPage);
                com.tencent.mm.plugin.appbrand.page.v5 currentPageView = currentPage.getCurrentPageView();
                kotlin.jvm.internal.o.e(currentPageView, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
                this.f83235c = com.tencent.mm.plugin.appbrand.menu.l0.e((com.tencent.mm.plugin.appbrand.page.n7) currentPageView) ? currentPage.getCurrentUrl() : "";
            }
            if (optBoolean) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = env.t3();
                kotlin.jvm.internal.o.e(t37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = ((com.tencent.mm.plugin.appbrand.o6) t37).E0();
                if ((E0 == null ? 1 : k91.a.f305526m.a(E0)) != 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke fail, isPosterJumpBanned: true not show entrance");
                    this.f83234b = false;
                }
            }
        }
        if (this.f83234b) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t38 = env.t3();
            kotlin.jvm.internal.o.f(t38, "getRuntime(...)");
            java.lang.String str = this.f83235c;
            wxaInfo = com.tencent.mm.plugin.appbrand.jsapi.share.o2.a(t38, str != null ? str : "");
        } else {
            wxaInfo = null;
        }
        this.f83240h = wxaInfo;
    }

    public java.lang.String toString() {
        return "imagePath: " + this.f83233a + ", compressType: " + this.f83238f + " needEntrance: " + this.f83234b + ", entrancePath: " + this.f83235c + " chatroomUsername: " + this.f83236d + " openId: " + this.f83237e + " wxaInfo: " + this.f83240h;
    }
}
