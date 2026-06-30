package ur2;

/* loaded from: classes3.dex */
public final class a extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur2.c f511912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f511913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f511914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f511915d;

    public a(ur2.c cVar, float f17, float f18, float f19) {
        this.f511912a = cVar;
        this.f511913b = f17;
        this.f511914c = f18;
        this.f511915d = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float f19 = 0.0f;
        if (java.lang.Float.isNaN(f17)) {
            f18 = 0.0f;
        } else {
            f18 = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(view.getHeight() * f17) / this.f511913b, 1.0f), 0.0f);
            f19 = java.lang.Math.max(java.lang.Math.min((f18 - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        ur2.c cVar = this.f511912a;
        android.view.View view2 = cVar.f511924h;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headIndicatorArrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleDetail$enableHeadIndicator$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleDetail$enableHeadIndicator$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = cVar.f511925i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headIndicatorLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        float f27 = this.f511915d;
        float f28 = this.f511914c;
        layoutParams.height = (int) (f28 + (f18 * (f27 - f28)));
        android.view.View view4 = cVar.f511925i;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headIndicatorLine");
            throw null;
        }
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (i17 == 4 || i17 == 5) {
            ur2.c cVar = this.f511912a;
            if (cVar.f511920d.f()) {
                cVar.f511920d.q();
            }
        }
    }
}
