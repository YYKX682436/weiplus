package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f83626d;

    public k(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f83626d = appBrandVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f83626d.f();
    }
}
