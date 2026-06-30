package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177606d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var) {
        this.f177606d = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = this.f177606d;
        if (p0Var.f177559p0) {
            p0Var.f177559p0 = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("" + p0Var.f177561q + "_wxa_voip").putBoolean("isCameraStart", p0Var.f177559p0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g0.f177443c.m120013xfec52689(p0Var.Z ? 1 : 0, p0Var.f177559p0 ? 1 : 0, 0);
        }
    }
}
