package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xj extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 f201875d;

    public xj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 c14399xad75a698) {
        this.f201875d = c14399xad75a698;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 c14399xad75a698 = this.f201875d;
        c14399xad75a698.m57903x9e6c4d1c(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFixClickIssueRecyclerView", "resetTranslationY finish translationY:" + c14399xad75a698.getTranslationY() + '!');
    }
}
