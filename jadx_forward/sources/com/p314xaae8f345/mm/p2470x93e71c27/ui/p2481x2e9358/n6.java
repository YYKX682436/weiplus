package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class n6 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f272034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f272035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f272036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f272040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f272041i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272042j;

    public n6(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f272033a = i17;
        this.f272034b = f17;
        this.f272035c = i18;
        this.f272036d = i19;
        this.f272037e = i27;
        this.f272038f = i28;
        this.f272039g = i29;
        this.f272040h = f18;
        this.f272041i = f19;
        this.f272042j = c8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float f17 = 0;
        float f18 = this.f272033a - 0;
        float f19 = this.f272034b;
        float f27 = width + ((this.f272036d - width) * f19);
        float f28 = height + ((this.f272037e - height) * f19);
        float f29 = this.f272038f + ((this.f272039g - r2) * f19);
        float f37 = this.f272041i;
        float f38 = this.f272040h;
        float f39 = f38 + ((f37 - f38) * f19);
        outline.setRoundRect((int) ((f18 * f19) + f17), (int) (f17 + ((this.f272035c - 0) * f19)), (int) f27, (int) f28, f29);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f272042j.f271759h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f39));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
