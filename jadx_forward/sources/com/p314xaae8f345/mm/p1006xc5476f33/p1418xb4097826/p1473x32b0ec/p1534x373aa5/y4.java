package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class y4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 f198351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f198352e;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553, yz5.a aVar) {
        this.f198351d = c14314xae44553;
        this.f198352e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFloatContainerV2", "hideStatePanel: animation end");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553 = this.f198351d;
        c14314xae44553.f197420u = null;
        c14314xae44553.setAlpha(0.0f);
        c14314xae44553.setVisibility(8);
        yz5.a aVar = this.f198352e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
