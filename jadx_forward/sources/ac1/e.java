package ac1;

/* loaded from: classes7.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84530d;

    public e(ac1.g gVar, android.view.View view) {
        this.f84530d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f84530d.setY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
