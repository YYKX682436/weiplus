package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f168111f;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2, boolean z17) {
        this.f168109d = mcVar;
        this.f168110e = mcVar2;
        this.f168111f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar = this.f168109d;
        if (mcVar.f168418a.mo50262x39e05d35()) {
            this.f168110e.f168419b.m52206x8e3d1bf8(this.f168111f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar.f168420c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
