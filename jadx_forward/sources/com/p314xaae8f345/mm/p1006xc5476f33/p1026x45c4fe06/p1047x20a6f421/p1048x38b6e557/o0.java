package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes8.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o0 f159236d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o0();

    public o0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FloatConsolePrinter", "onClick#controlFloatWindow");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.r0.f159241a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.r0.f159243c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, isShown: " + d0Var.f159193g);
            if (!d0Var.f159193g) {
                try {
                    android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) d0Var.f159189c).mo141623x754a37bb();
                    if (windowManager != null) {
                        windowManager.addView((android.view.View) ((jz5.n) d0Var.f159191e).mo141623x754a37bb(), (android.view.WindowManager.LayoutParams) ((jz5.n) d0Var.f159192f).mo141623x754a37bb());
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.v) ((jz5.n) d0Var.f159190d).mo141623x754a37bb()).b();
                        d0Var.f159193g = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, addView fail since " + e17);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
