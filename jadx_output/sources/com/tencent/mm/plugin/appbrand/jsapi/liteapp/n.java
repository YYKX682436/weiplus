package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.liteapp.u f81549d;

    public n(com.tencent.mm.plugin.appbrand.jsapi.liteapp.u uVar) {
        this.f81549d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.i3 x07 = this.f81549d.f81558h.t3().x0();
        x07.getClass();
        x07.c0(new com.tencent.mm.plugin.appbrand.page.j3(x07, 1, "scene_jsapi_navigate_back", null, null));
    }
}
