package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nb implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb f195139d;

    public nb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar) {
        this.f195139d = tbVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean isShown;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f195139d;
        if (tbVar.t1().isShown()) {
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb.B;
            jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb.B;
            if (((android.graphics.Rect) ((jz5.n) gVar2).mo141623x754a37bb()).right > 0 && ((android.graphics.Rect) ((jz5.n) gVar2).mo141623x754a37bb()).bottom > 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                tbVar.t1().getGlobalVisibleRect(rect);
                isShown = tbVar.t1().isShown() && rect.intersect((android.graphics.Rect) ((jz5.n) gVar2).mo141623x754a37bb());
                tbVar.z1(isShown);
            }
        }
        isShown = tbVar.t1().isShown();
        tbVar.z1(isShown);
    }
}
