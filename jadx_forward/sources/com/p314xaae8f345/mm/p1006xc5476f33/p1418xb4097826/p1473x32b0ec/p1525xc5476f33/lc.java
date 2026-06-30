package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lc extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc f194908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f194909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f194910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc f194911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f194912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f194913i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f194914m;

    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc ncVar, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc jcVar, int i17, yz5.a aVar, yz5.a aVar2) {
        this.f194908d = ncVar;
        this.f194909e = view;
        this.f194910f = view2;
        this.f194911g = jcVar;
        this.f194912h = i17;
        this.f194913i = aVar;
        this.f194914m = aVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc.a(this.f194908d, this.f194909e, this.f194910f, this.f194911g);
        java.lang.String str = "Animation cancelled for buttonType: " + this.f194912h;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveButtonEnhanceInteractionAnimator", str, null);
        yz5.a aVar = this.f194914m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc.a(this.f194908d, this.f194909e, this.f194910f, this.f194911g);
        java.lang.String str = "Animation completed for buttonType: " + this.f194912h;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveButtonEnhanceInteractionAnimator", str, null);
        yz5.a aVar = this.f194913i;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
