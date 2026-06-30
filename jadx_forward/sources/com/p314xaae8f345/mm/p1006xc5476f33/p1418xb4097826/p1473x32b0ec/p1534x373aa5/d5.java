package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class d5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 f197778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f197779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f197780f;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553, boolean z17, yz5.a aVar) {
        this.f197778d = c14314xae44553;
        this.f197779e = z17;
        this.f197780f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553 = this.f197778d;
        c14314xae44553.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFloatContainerV2", "showStatePanel: global layout");
        if (c14314xae44553.f197407e || c14314xae44553.f197410h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFloatContainerV2", "showStatePanel: reset position,isFirstShow:" + c14314xae44553.f197407e + ",shouldResetPosition:" + c14314xae44553.f197410h + ",defaultX:" + c14314xae44553.f197408f + ",defaultY:" + c14314xae44553.f197409g);
            c14314xae44553.j(c14314xae44553.f197408f, c14314xae44553.f197409g);
            c14314xae44553.f(false);
        } else {
            c14314xae44553.i(false);
        }
        c14314xae44553.f197407e = false;
        c14314xae44553.b();
        android.animation.ValueAnimator valueAnimator = c14314xae44553.f197420u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c14314xae44553.f197420u = null;
        boolean z17 = this.f197779e;
        yz5.a aVar = this.f197780f;
        if (!z17) {
            c14314xae44553.setAlpha(1.0f);
            c14314xae44553.f197414o = false;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        c14314xae44553.setAlpha(0.0f);
        c14314xae44553.f197414o = true;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(c14314xae44553.f197422w);
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b5(c14314xae44553, aVar));
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c5(c14314xae44553));
        ofFloat.start();
        c14314xae44553.f197420u = ofFloat;
    }
}
