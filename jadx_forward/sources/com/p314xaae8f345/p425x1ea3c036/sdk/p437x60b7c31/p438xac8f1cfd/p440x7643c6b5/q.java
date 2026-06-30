package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f129049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f129050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n f129051c;

    public q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar, long j17, boolean z17) {
        this.f129051c = nVar;
        this.f129049a = j17;
        this.f129050b = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Failed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Success");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) this.f129051c.F();
        if (yVar == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f129049a;
        boolean z17 = this.f129050b;
        cl.r3.c(3, currentTimeMillis, z17 ? 1 : 0, yVar.mo48798x74292566(), -1, 0, yVar.x().i());
    }
}
