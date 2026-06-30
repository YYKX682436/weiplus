package ww1;

/* loaded from: classes14.dex */
public class s2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f531813d;

    public s2(ww1.b3 b3Var) {
        this.f531813d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f531813d.f531662e.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
