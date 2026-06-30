package rl1;

/* loaded from: classes13.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl1.e f478695d;

    public d(rl1.e eVar) {
        this.f478695d = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f478695d.f478696a.mo37261x742bae00((float) java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue())));
    }
}
