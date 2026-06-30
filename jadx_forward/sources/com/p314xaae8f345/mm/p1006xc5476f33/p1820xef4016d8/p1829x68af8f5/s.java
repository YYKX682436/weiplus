package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227441d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227441d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227441d;
        c16344xea85a40c.f227321w.getGlobalVisibleRect(rect);
        c16344xea85a40c.f227321w.setTranslationY((c16344xea85a40c.f227313l1 - rect.bottom) / 2.0f);
        c16344xea85a40c.f227323x0 = true;
        c16344xea85a40c.f227321w.getTranslationY();
    }
}
