package pa;

/* loaded from: classes13.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca.j f434472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f434473e;

    public e(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842 abstractC2724x48049842, ca.j jVar, android.graphics.drawable.Drawable drawable) {
        this.f434472d = jVar;
        this.f434473e = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f434472d.mo14553x72714ee0(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f434472d.mo14553x72714ee0(this.f434473e);
    }
}
