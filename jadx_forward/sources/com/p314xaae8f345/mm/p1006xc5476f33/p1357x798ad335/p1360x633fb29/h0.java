package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f178578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f178579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178580g;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var, long j17, int i17, boolean z17) {
        this.f178580g = l0Var;
        this.f178577d = j17;
        this.f178578e = i17;
        this.f178579f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.a(this.f178580g)) {
            g1Var.b(this.f178577d, this.f178578e, this.f178579f);
        }
        java.util.Vector vector = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.f178611a;
    }
}
