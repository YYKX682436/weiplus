package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 f198100d;

    public ob(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 viewOnClickListenerC14352x1d00aa30) {
        this.f198100d = viewOnClickListenerC14352x1d00aa30;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30.f197644o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post tab1Tv.measuredWidth:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 viewOnClickListenerC14352x1d00aa30 = this.f198100d;
        sb6.append(viewOnClickListenerC14352x1d00aa30.f197645d.getMeasuredWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTextIndicator", sb6.toString());
        viewOnClickListenerC14352x1d00aa30.f197651m.getLayoutParams().width = viewOnClickListenerC14352x1d00aa30.f197645d.getMeasuredWidth();
    }
}
