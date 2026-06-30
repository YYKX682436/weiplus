package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227456d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227456d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227456d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.ViewOnTouchListenerC16345x245cec57 viewOnTouchListenerC16345x245cec57 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.ViewOnTouchListenerC16345x245cec57) ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c16344xea85a40c.getLayoutParams()).f92539a;
        c16344xea85a40c.B1 = viewOnTouchListenerC16345x245cec57;
        viewOnTouchListenerC16345x245cec57.G = c16344xea85a40c.M1;
        int i17 = c16344xea85a40c.K1;
        viewOnTouchListenerC16345x245cec57.I = i17 == 1;
        viewOnTouchListenerC16345x245cec57.F = i17 == 1 || i17 == 2;
        viewOnTouchListenerC16345x245cec57.H = c16344xea85a40c.T1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16350x7d7c911b c16350x7d7c911b = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16350x7d7c911b) c16344xea85a40c.getParent();
        c16344xea85a40c.f227322x = c16350x7d7c911b;
        c16344xea85a40c.K = c16350x7d7c911b.findViewById(com.p314xaae8f345.mm.R.id.iza);
        ((java.util.ArrayList) c16344xea85a40c.f227322x.D).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.m(this));
        c16344xea85a40c.K.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.n(this));
        c16344xea85a40c.m();
    }
}
