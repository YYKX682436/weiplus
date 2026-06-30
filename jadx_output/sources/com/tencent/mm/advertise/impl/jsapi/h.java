package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class h extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f53172f = "";

    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.jsapi.z1.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        int i17;
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f317890a;
        if (eVar instanceof hq0.b0) {
            kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.MagicCardStarterSclBiz");
            if (kotlin.jvm.internal.o.b(((hq0.b0) eVar).f282970x.f293634a, "MagicAdMiniProgram")) {
                java.lang.String optString = data.optString("ad_info");
                this.f53172f = optString != null ? optString : "";
                i17 = 15175;
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent(this.f53172f, i17), com.tencent.mm.advertise.impl.jsapi.f.class, new com.tencent.mm.advertise.impl.jsapi.g(this));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String optString2 = data.optString("ad_info");
        if (optString2 == null) {
            optString2 = "";
        }
        sb6.append(optString2);
        sb6.append(',');
        java.lang.String optString3 = data.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        sb6.append(optString3 != null ? optString3 : "");
        this.f53172f = sb6.toString();
        i17 = 13297;
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent(this.f53172f, i17), com.tencent.mm.advertise.impl.jsapi.f.class, new com.tencent.mm.advertise.impl.jsapi.g(this));
    }
}
