package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f77654a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f77655b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f77656c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f77657d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f77658e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f77659f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77660g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f77661h;

    public d0(yz5.a aVar, yz5.a aVar2, int i17, kotlin.jvm.internal.i iVar) {
        aVar = (i17 & 1) != 0 ? null : aVar;
        aVar2 = (i17 & 2) != 0 ? null : aVar2;
        this.f77654a = aVar;
        this.f77655b = aVar2;
        this.f77656c = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.c0.f77652d);
        this.f77657d = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.x(this));
        this.f77658e = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.b0(this));
        this.f77659f = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.w.f77718d);
        this.f77661h = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.y(this));
    }

    public final com.tencent.mm.plugin.appbrand.debugger.console.f0 a() {
        return (com.tencent.mm.plugin.appbrand.debugger.console.f0) ((jz5.n) this.f77661h).getValue();
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, isShown: " + this.f77660g);
        if (this.f77660g) {
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f77656c).getValue();
                if (windowManager != null) {
                    windowManager.removeView((android.view.View) ((jz5.n) this.f77658e).getValue());
                    this.f77660g = false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, removeView fail since " + e17);
            }
        }
    }
}
