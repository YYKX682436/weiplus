package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class nh implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 f214247d;

    public nh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 c15335x24ba89b5) {
        this.f214247d = c15335x24ba89b5;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindLayout", "[onAnimationCancel]");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.lh lhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.lh.f214136f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 c15335x24ba89b5 = this.f214247d;
        c15335x24ba89b5.A = lhVar;
        int ordinal = c15335x24ba89b5.B.ordinal();
        if (ordinal == 1) {
            c15335x24ba89b5.e();
        } else if (ordinal != 2) {
            c15335x24ba89b5.c();
        } else {
            c15335x24ba89b5.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindLayout", "[onAnimationEnd]");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindLayout", "[onAnimationStart]");
    }
}
