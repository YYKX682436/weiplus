package pa;

/* loaded from: classes13.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434471d;

    public d(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842 abstractC2724x48049842, android.view.View view) {
        this.f434471d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f434471d.invalidate();
    }
}
