package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes3.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f230559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16542x2e9b46d3 f230561f;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16542x2e9b46d3 c16542x2e9b46d3, int i17, int i18) {
        this.f230561f = c16542x2e9b46d3;
        this.f230559d = i17;
        this.f230560e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16542x2e9b46d3 c16542x2e9b46d3 = this.f230561f;
        int i17 = this.f230559d;
        c16542x2e9b46d3.f230470i = i17;
        c16542x2e9b46d3.f230465d = java.lang.Math.min(this.f230560e, c16542x2e9b46d3.getWidth() - (i17 * 2));
        c16542x2e9b46d3.invalidate();
    }
}
