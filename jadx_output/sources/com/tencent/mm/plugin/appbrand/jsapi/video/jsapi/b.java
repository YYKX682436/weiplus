package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes15.dex */
public class b implements com.tencent.mm.plugin.appbrand.page.qd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f83608a;

    public b(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a aVar, com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f83608a = appBrandVideoView;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.qd
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f83608a;
        appBrandVideoView.o("onExitFullScreen", new java.lang.Object[0]);
        if (appBrandVideoView.f83532i.c()) {
            appBrandVideoView.f83532i.l();
        }
        appBrandVideoView.c(false);
    }
}
