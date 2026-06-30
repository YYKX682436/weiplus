package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178546f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var, long j17, java.lang.String str) {
        this.f178546f = l0Var;
        this.f178544d = j17;
        this.f178545e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.a(this.f178546f)) {
            g1Var.l(this.f178544d, this.f178545e);
        }
        java.util.Vector vector = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.f178611a;
    }
}
