package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227434d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227434d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227434d;
        android.view.ViewGroup.LayoutParams layoutParams = c16344xea85a40c.f227318t.getLayoutParams();
        layoutParams.width = c16344xea85a40c.f227317s.getWidth();
        layoutParams.height = c16344xea85a40c.f227317s.getHeight();
        c16344xea85a40c.f227318t.setLayoutParams(layoutParams);
    }
}
