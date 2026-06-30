package gl5;

/* loaded from: classes3.dex */
public final class k0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f354558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f354559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f354560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f354564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f354565i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354566j;

    public k0(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, gl5.d1 d1Var) {
        this.f354557a = i17;
        this.f354558b = f17;
        this.f354559c = i18;
        this.f354560d = i19;
        this.f354561e = i27;
        this.f354562f = i28;
        this.f354563g = i29;
        this.f354564h = f18;
        this.f354565i = f19;
        this.f354566j = d1Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int i17 = this.f354557a;
        float f17 = this.f354558b;
        float f18 = i17 + ((0 - i17) * f17);
        float f19 = this.f354559c + ((0 - r0) * f17);
        float width = this.f354560d + ((view.getWidth() - r0) * f17);
        float height = this.f354561e + ((view.getHeight() - r0) * f17);
        float f27 = this.f354562f + ((this.f354563g - r14) * f17);
        float f28 = this.f354565i;
        float f29 = this.f354564h;
        float f37 = f29 + ((f28 - f29) * f17);
        outline.setRoundRect((int) f18, (int) f19, (int) width, (int) height, f27);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f354566j.f354466j).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
