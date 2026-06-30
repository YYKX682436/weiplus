package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f159229a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f159230b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f159231c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f159232d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f159233e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f159234f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159235g;

    public o(yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f159229a = (i17 & 1) != 0 ? null : aVar;
        this.f159230b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n.f159222d);
        this.f159231c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.i(this));
        this.f159232d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.j.f159210d);
        this.f159233e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.m(this));
        this.f159234f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.h(this));
    }

    public static final android.graphics.Point a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o oVar) {
        return (android.graphics.Point) ((jz5.n) oVar.f159231c).mo141623x754a37bb();
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f159233e).mo141623x754a37bb();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, isShown: " + this.f159235g);
        if (this.f159235g) {
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f159230b).mo141623x754a37bb();
                if (windowManager != null) {
                    windowManager.removeView(b());
                    this.f159235g = false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, removeView fail since " + e17);
            }
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, isShown: " + this.f159235g);
        if (this.f159235g) {
            return;
        }
        try {
            android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f159230b).mo141623x754a37bb();
            if (windowManager != null) {
                windowManager.addView(b(), (android.view.WindowManager.LayoutParams) ((jz5.n) this.f159234f).mo141623x754a37bb());
                this.f159235g = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, addView fail since " + e17);
        }
    }
}
