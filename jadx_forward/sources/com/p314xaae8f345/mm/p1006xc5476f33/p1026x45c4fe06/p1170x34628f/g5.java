package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final u81.f f168169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 f168170e;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var) {
        this.f168170e = d5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f5(this, this);
        this.f168169d = f5Var;
        d5Var.mo52154x9a3f0ba2().N.a(f5Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "debug timeout call runtime onReady, appId:%s", this.f168170e.m52168x74292566());
        this.f168170e.I();
        this.f168170e.mo52154x9a3f0ba2().N.c(this.f168169d);
    }
}
