package sk5;

/* loaded from: classes14.dex */
public final class d extends sk5.j {

    /* renamed from: c, reason: collision with root package name */
    public static final sk5.d f490542c = new sk5.d();

    public d() {
        super(0L, 1, null);
    }

    @Override // sk5.j
    public android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k animParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animParam, "animParam");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", (-i17) * 0.3f, 0.0f);
        ofFloat.setDuration(f490542c.f490549a);
        ofFloat.setInterpolator(ta5.h.f498412a.c());
        return ofFloat;
    }
}
