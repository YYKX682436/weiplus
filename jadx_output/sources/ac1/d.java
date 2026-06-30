package ac1;

/* loaded from: classes7.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2996d;

    public d(ac1.g gVar, android.view.View view) {
        this.f2996d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f2996d.setX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
