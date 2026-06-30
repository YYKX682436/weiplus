package ac1;

/* loaded from: classes7.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84529d;

    public d(ac1.g gVar, android.view.View view) {
        this.f84529d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f84529d.setX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
