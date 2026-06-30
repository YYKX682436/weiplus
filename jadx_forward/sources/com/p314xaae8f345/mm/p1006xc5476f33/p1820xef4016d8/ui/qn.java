package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class qn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228890d;

    public qn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar) {
        this.f228890d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f228890d;
        float width = coVar.f228343f.getWidth() * 1.0993f;
        int round = java.lang.Math.round(width);
        int round2 = java.lang.Math.round(width * 1.72f);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f228345h.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round2;
        coVar.f228345h.setLayoutParams(layoutParams);
    }
}
