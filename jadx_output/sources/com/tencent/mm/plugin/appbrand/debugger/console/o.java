package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f77696a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f77697b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f77698c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f77699d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f77700e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f77701f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77702g;

    public o(yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f77696a = (i17 & 1) != 0 ? null : aVar;
        this.f77697b = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.n.f77689d);
        this.f77698c = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.i(this));
        this.f77699d = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.console.j.f77677d);
        this.f77700e = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.m(this));
        this.f77701f = jz5.h.b(new com.tencent.mm.plugin.appbrand.debugger.console.h(this));
    }

    public static final android.graphics.Point a(com.tencent.mm.plugin.appbrand.debugger.console.o oVar) {
        return (android.graphics.Point) ((jz5.n) oVar.f77698c).getValue();
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f77700e).getValue();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, isShown: " + this.f77702g);
        if (this.f77702g) {
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f77697b).getValue();
                if (windowManager != null) {
                    windowManager.removeView(b());
                    this.f77702g = false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, removeView fail since " + e17);
            }
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, isShown: " + this.f77702g);
        if (this.f77702g) {
            return;
        }
        try {
            android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f77697b).getValue();
            if (windowManager != null) {
                windowManager.addView(b(), (android.view.WindowManager.LayoutParams) ((jz5.n) this.f77701f).getValue());
                this.f77702g = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, addView fail since " + e17);
        }
    }
}
