package xb;

/* loaded from: classes15.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef f534406d;

    public g(com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef) {
        this.f534406d = c2885xf34260ef;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef = this.f534406d;
        c2885xf34260ef.f127363f.a(valueAnimator.getAnimatedFraction());
        c2885xf34260ef.a();
        c2885xf34260ef.invalidate();
    }
}
