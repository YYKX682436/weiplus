package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f159187a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f159188b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f159189c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f159190d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f159191e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f159192f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159193g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f159194h;

    public d0(yz5.a aVar, yz5.a aVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        aVar = (i17 & 1) != 0 ? null : aVar;
        aVar2 = (i17 & 2) != 0 ? null : aVar2;
        this.f159187a = aVar;
        this.f159188b = aVar2;
        this.f159189c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.c0.f159185d);
        this.f159190d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.x(this));
        this.f159191e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.b0(this));
        this.f159192f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.w.f159251d);
        this.f159194h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.y(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0 a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0) ((jz5.n) this.f159194h).mo141623x754a37bb();
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, isShown: " + this.f159193g);
        if (this.f159193g) {
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f159189c).mo141623x754a37bb();
                if (windowManager != null) {
                    windowManager.removeView((android.view.View) ((jz5.n) this.f159191e).mo141623x754a37bb());
                    this.f159193g = false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, removeView fail since " + e17);
            }
        }
    }
}
