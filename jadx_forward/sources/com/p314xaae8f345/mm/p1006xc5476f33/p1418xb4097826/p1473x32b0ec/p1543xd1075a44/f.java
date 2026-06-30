package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g f199829d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g gVar) {
        this.f199829d = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g gVar = this.f199829d;
        sb6.append(gVar.f199917g.f526370d.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseBottomPanelSheet", sb6.toString());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(gVar, gVar.f199917g.f526370d.getHeight());
        gVar.f199917g.f526370d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
