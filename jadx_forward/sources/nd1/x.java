package nd1;

/* loaded from: classes7.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f417948e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, nd1.c0 c0Var) {
        this.f417947d = o6Var;
        this.f417948e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f417947d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = o6Var.u0().L1;
        if (c11816x5915d2c1 != null && (c11820x84c5f368 = c11816x5915d2c1.f158899p) != null) {
            c11820x84c5f368.b(false);
        }
        nd1.c0.D(this.f417948e, o6Var, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = this.f417947d.u0().L1;
        if (c11816x5915d2c1 == null || (c11820x84c5f368 = c11816x5915d2c1.f158899p) == null) {
            return;
        }
        c11820x84c5f368.b(true);
    }
}
