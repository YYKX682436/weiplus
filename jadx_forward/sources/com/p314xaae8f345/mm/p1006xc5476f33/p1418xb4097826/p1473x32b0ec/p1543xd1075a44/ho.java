package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ho implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io f200111d;

    public ho(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar) {
        this.f200111d = ioVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = this.f200111d;
        android.view.View view = ioVar.f293560f;
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getHeight()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMMCustomHalfBottomDialog", sb6.toString());
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.view.View view2 = ioVar.f293560f;
        ((b92.d1) zbVar).nj(ioVar, view2 != null ? view2.getHeight() : 0);
        android.view.View view3 = ioVar.f293560f;
        if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
