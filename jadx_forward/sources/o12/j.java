package o12;

/* loaded from: classes10.dex */
public final class j extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.j f423691b = new o12.j();

    public j() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        return o12.a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468.f178984J, rect.right, rect.top, i17, i18, i19);
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        rect.set(rect.left, e06.p.f(rect.top + i18, view.getPaddingTop(), rect.bottom - i19), e06.p.f(rect.right + i17, rect.left + i19, view.getWidth() - view.getPaddingRight()), rect.bottom);
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        int min = java.lang.Math.min((view.getWidth() - view.getPaddingRight()) - rect.left, rect.bottom - view.getPaddingTop());
        if (java.lang.Math.abs(i17) <= java.lang.Math.abs(i18)) {
            i17 = -i18;
        }
        int i27 = rect.left;
        int i28 = rect.top - i17;
        int i29 = rect.bottom;
        int f17 = e06.p.f(i28, i29 - min, i29 - i19);
        int i37 = rect.right + i17;
        int i38 = rect.left;
        rect.set(i27, f17, e06.p.f(i37, i19 + i38, i38 + min), rect.bottom);
    }
}
