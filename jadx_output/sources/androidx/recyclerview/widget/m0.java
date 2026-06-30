package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n0 f12127d;

    public m0(androidx.recyclerview.widget.n0 n0Var) {
        this.f12127d = n0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        androidx.recyclerview.widget.n0 n0Var = this.f12127d;
        n0Var.f12148f.setAlpha(floatValue);
        n0Var.f12149g.setAlpha(floatValue);
        n0Var.f12164y.invalidate();
    }
}
