package gl5;

/* loaded from: classes3.dex */
public final class h0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f354536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f354537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f354538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f354542h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f354543i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354544j;

    public h0(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, gl5.d1 d1Var) {
        this.f354535a = i17;
        this.f354536b = f17;
        this.f354537c = i18;
        this.f354538d = i19;
        this.f354539e = i27;
        this.f354540f = i28;
        this.f354541g = i29;
        this.f354542h = f18;
        this.f354543i = f19;
        this.f354544j = d1Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float f17 = 0;
        float f18 = this.f354535a - 0;
        float f19 = this.f354536b;
        float f27 = width + ((this.f354538d - width) * f19);
        float f28 = height + ((this.f354539e - height) * f19);
        float f29 = this.f354540f + ((this.f354541g - r2) * f19);
        float f37 = this.f354543i;
        float f38 = this.f354542h;
        float f39 = f38 + ((f37 - f38) * f19);
        outline.setRoundRect((int) ((f18 * f19) + f17), (int) (f17 + ((this.f354537c - 0) * f19)), (int) f27, (int) f28, f29);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f354544j.f354466j).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f39));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
