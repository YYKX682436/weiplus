package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni1.g f168224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168225g;

    public hc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2, ni1.g gVar, int i17) {
        this.f168222d = mcVar;
        this.f168223e = mcVar2;
        this.f168224f = gVar;
        this.f168225g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar = this.f168222d;
        if (!mcVar.f168418a.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar.f168420c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = this.f168223e.f168419b;
        p8Var.m52207xa18f7734(this.f168224f.name().toLowerCase());
        p8Var.m52205x3940e08c(this.f168225g);
    }
}
