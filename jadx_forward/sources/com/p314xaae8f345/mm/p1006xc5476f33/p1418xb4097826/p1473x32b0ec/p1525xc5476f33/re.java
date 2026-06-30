package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class re implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f195661d;

    public re(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f195661d = mgVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = i19 - i17;
        if (i37 - i28 != i39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "new List width: " + i65.a.c(view.getContext(), i39));
            ((we2.s) this.f195661d.S0().a(we2.s.class)).f526790i = i39;
        }
    }
}
