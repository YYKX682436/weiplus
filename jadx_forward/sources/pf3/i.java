package pf3;

/* loaded from: classes5.dex */
public final class i implements pf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f435362a;

    /* renamed from: b, reason: collision with root package name */
    public final pf3.j f435363b;

    public i(android.view.View view, pf3.j hitExt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitExt, "hitExt");
        this.f435362a = view;
        this.f435363b = hitExt;
    }

    @Override // pf3.k
    public boolean a(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int[] iArr = new int[2];
        android.view.View view = this.f435362a;
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int rawX = ((int) event.getRawX()) - i17;
        int rawY = ((int) event.getRawY()) - i18;
        pf3.j jVar = this.f435363b;
        jVar.getClass();
        int i19 = rawX + 0;
        int i27 = jVar.f435364a;
        int i28 = rawY + i27;
        int width = view.getWidth() + 0 + 0;
        int height = view.getHeight() + i27;
        int i29 = jVar.f435365b;
        boolean z17 = view.getVisibility() == 0 && view.isEnabled() && i19 >= 0 && i19 < width && i28 >= 0 && i28 < height + i29;
        if (z17) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            rect.top -= i27;
            rect.bottom += i29;
            rect.left -= 0;
            rect.right += 0;
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 != null) {
                view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
            }
        }
        return z17;
    }
}
