package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class c1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.d1 f11983d;

    public c1(androidx.recyclerview.widget.d1 d1Var) {
        this.f11983d = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f11983d.f11998s = valueAnimator.getAnimatedFraction();
    }
}
