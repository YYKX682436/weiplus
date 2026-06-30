package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class jc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168332f;

    public jc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2, java.lang.String str) {
        this.f168330d = mcVar;
        this.f168331e = mcVar2;
        this.f168332f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar = this.f168330d;
        if (mcVar.f168418a.mo50262x39e05d35()) {
            this.f168331e.f168419b.m52211xf63e47d6(this.f168332f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar.f168420c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
