package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class q6 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f272109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f272110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f272111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f272115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f272116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272117j;

    public q6(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f272108a = i17;
        this.f272109b = f17;
        this.f272110c = i18;
        this.f272111d = i19;
        this.f272112e = i27;
        this.f272113f = i28;
        this.f272114g = i29;
        this.f272115h = f18;
        this.f272116i = f19;
        this.f272117j = c8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int i17 = this.f272108a;
        float f17 = this.f272109b;
        float f18 = i17 + ((0 - i17) * f17);
        float f19 = this.f272110c + ((0 - r0) * f17);
        float width = this.f272111d + ((view.getWidth() - r0) * f17);
        float height = this.f272112e + ((view.getHeight() - r0) * f17);
        float f27 = this.f272113f + ((this.f272114g - r14) * f17);
        float f28 = this.f272116i;
        float f29 = this.f272115h;
        float f37 = f29 + ((f28 - f29) * f17);
        outline.setRoundRect((int) f18, (int) f19, (int) width, (int) height, f27);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f272117j.f271759h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
