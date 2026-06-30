package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes12.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.o3 f173782d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.o3 o3Var) {
        this.f173782d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.b("MicroMsg.WxAssistantMonitor", "ANR detected, killing wxa process now! token=0", new java.lang.Object[0]);
        this.f173782d.h();
    }
}
