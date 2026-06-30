package fi1;

/* loaded from: classes8.dex */
public class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 f344324d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12) {
        this.f344324d = c12478x3e6e5e12;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f344324d.E = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344324d;
        c12478x3e6e5e12.E = false;
        c12478x3e6e5e12.C = c12478x3e6e5e12.f167811i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344324d;
        c12478x3e6e5e12.E = true;
        fi1.t tVar = c12478x3e6e5e12.f167812m;
        if (tVar != null) {
            tVar.getClass();
        }
    }
}
