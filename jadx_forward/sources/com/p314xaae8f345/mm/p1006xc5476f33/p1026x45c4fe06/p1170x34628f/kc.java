package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class kc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168371e;

    public kc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2) {
        this.f168370d = mcVar;
        this.f168371e = mcVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar = this.f168370d;
        if (!mcVar.f168418a.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar.f168420c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2 = this.f168371e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mcVar2.f168420c, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + mcVar2.f168418a.mo48798x74292566() + " url:" + mcVar2.f168418a.X1());
        try {
            if (mcVar2.f168418a.a2().mo14667x95a6d12e() != 0) {
                mcVar2.f168418a.a2().o0();
            }
            mcVar2.f168419b.g(true);
            mcVar2.f168419b.f();
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar2.f168420c, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + mcVar2.f168418a.mo48798x74292566() + " url:" + mcVar2.f168418a.X1() + " e:" + e17);
            throw e17;
        }
    }
}
