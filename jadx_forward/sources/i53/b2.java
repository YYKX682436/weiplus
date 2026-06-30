package i53;

/* loaded from: classes8.dex */
public class b2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d2 f370057d;

    public b2(i53.d2 d2Var) {
        this.f370057d = d2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f370057d.d((int) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
