package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class v4 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4 f174793d;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4 u4Var) {
        this.f174793d = u4Var;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4 u4Var = this.f174793d;
        gp1.v vVar = u4Var.f174790b.f174669h;
        if (vVar != null) {
            vVar.u0(true);
        }
        u4Var.f174790b.f174772n.q(true);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4 u4Var = this.f174793d;
        gp1.v vVar = u4Var.f174790b.f174669h;
        if (vVar != null) {
            vVar.u0(true);
        }
        u4Var.f174790b.f174772n.q(false);
    }
}
