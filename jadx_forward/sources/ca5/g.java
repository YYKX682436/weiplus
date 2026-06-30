package ca5;

/* loaded from: classes14.dex */
public class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f121621e;

    public g(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, int i17) {
        this.f121621e = c21330xc127fb4d;
        this.f121620d = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f121621e;
        if (ca5.i.WAITING == c21330xc127fb4d.f277961e) {
            if (this.f121620d == c21330xc127fb4d.f277964h.size() - 1 && c21330xc127fb4d.isShown()) {
                java.util.Iterator it = c21330xc127fb4d.f277964h.iterator();
                while (it.hasNext()) {
                    ((android.animation.AnimatorSet) it.next()).start();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
