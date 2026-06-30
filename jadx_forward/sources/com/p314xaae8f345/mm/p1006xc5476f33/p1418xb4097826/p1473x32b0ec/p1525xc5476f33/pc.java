package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pc implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f195389d;

    public pc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        this.f195389d = adVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f195389d;
        android.view.View view = adVar.f193401x;
        if (view != null && view.getMeasuredWidth() == 0) {
            return;
        }
        android.view.View view2 = adVar.f193401x;
        if (view2 != null && view2.getMeasuredHeight() == 0) {
            return;
        }
        android.view.View view3 = adVar.f193401x;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.t1(adVar);
    }
}
