package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class p0 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f235107f;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17) {
        this.f235107f = e0Var;
        this.f235105d = z3Var;
        this.f235106e = i17;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235105d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0.b(this.f235107f, z3Var, this.f235106e, str);
            return;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
            return;
        }
        r21.w.wi().k1(str, 2);
        r61.z1.c(z3Var.J0(), 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a59293 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293();
        java.lang.String J0 = z3Var.J0();
        am.hq hqVar = c5891xc4a59293.f136199g;
        hqVar.f88395a = J0;
        hqVar.f88396b = 1;
        c5891xc4a59293.e();
    }
}
