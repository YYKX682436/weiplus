package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class jn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228607d;

    public jn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar) {
        this.f228607d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f228607d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f228351q.getLayoutParams();
        layoutParams.width = coVar.f228343f.getWidth();
        layoutParams.height = coVar.f228343f.getHeight();
        coVar.f228351q.setLayoutParams(layoutParams);
    }
}
