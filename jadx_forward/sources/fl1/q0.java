package fl1;

/* loaded from: classes4.dex */
public class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f345379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f345380e;

    public q0(fl1.c1 c1Var, android.widget.ImageView imageView, android.widget.TextView textView) {
        this.f345379d = imageView;
        this.f345380e = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f345379d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f345380e.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
