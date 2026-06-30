package dp1;

/* loaded from: classes14.dex */
public class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.k f323657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f323658e;

    public d(dp1.l lVar, dp1.k kVar) {
        this.f323658e = lVar;
        this.f323657d = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        dp1.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d;
        dp1.l lVar = this.f323658e;
        mp1.c cVar = lVar.f323700i;
        if (cVar != null) {
            cVar.getClass();
        }
        mp1.e eVar = lVar.f323699h;
        if (eVar == null || (kVar = this.f323657d) == null || (c12886x91aa2b6d = kVar.f323669d) == null) {
            return;
        }
        eVar.b(c12886x91aa2b6d, kVar.f323670e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        mp1.c cVar = this.f323658e.f323700i;
        if (cVar != null) {
            ((rp1.p1) cVar).a();
        }
    }
}
