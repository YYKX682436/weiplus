package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class fn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228450d;

    public fn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar) {
        this.f228450d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f228450d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f228346i.getLayoutParams();
        layoutParams.width = coVar.f228360z.getWidth();
        coVar.f228346i.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) coVar.f228347m.getLayoutParams();
        layoutParams2.width = coVar.f228345h.getWidth();
        layoutParams2.height = coVar.f228345h.getHeight();
        coVar.f228347m.setLayoutParams(layoutParams2);
    }
}
