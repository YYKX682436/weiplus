package wu3;

/* loaded from: classes15.dex */
public class m1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f531312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 f531313e;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f531313e = c17047xc20d96b0;
        this.f531312d = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f531313e.f237575m = false;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f531312d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f531313e.f237575m = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f531312d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
