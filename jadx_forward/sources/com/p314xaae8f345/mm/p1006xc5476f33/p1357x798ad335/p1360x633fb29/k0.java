package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178607e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var, long j17) {
        this.f178607e = l0Var;
        this.f178606d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.a(this.f178607e)) {
            g1Var.f(this.f178606d);
        }
    }
}
