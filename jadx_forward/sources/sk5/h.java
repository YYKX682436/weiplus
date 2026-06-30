package sk5;

/* loaded from: classes14.dex */
public final class h extends sk5.j {

    /* renamed from: c, reason: collision with root package name */
    public static final sk5.h f490546c = new sk5.h();

    public h() {
        super(0L, 1, null);
    }

    @Override // sk5.j
    public android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k animParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animParam, "animParam");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        ofFloat.setDuration(f490546c.f490549a);
        return ofFloat;
    }
}
