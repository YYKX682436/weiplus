package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f263573d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f263574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f263575f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f263576g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f263577h;

    /* renamed from: i, reason: collision with root package name */
    public int f263578i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f263579m = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f263580n;

    public c(int i17, java.lang.String str, byte[] bArr, int i18, long j17) {
        this.f263577h = null;
        this.f263578i = -1;
        this.f263580n = 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mw5();
        lVar.f152198b = new r45.nw5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsearchemotion";
        lVar.f152200d = 234;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f263573d = lVar.a();
        this.f263575f = i17;
        this.f263576g = str;
        this.f263577h = bArr;
        this.f263578i = i18;
        this.f263580n = j17;
    }

    public r45.nw5 H() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f263573d;
        if (oVar == null) {
            return null;
        }
        return (r45.nw5) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f263574e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f263573d;
        r45.mw5 mw5Var = (r45.mw5) oVar.f152243a.f152217a;
        byte[] bArr = this.f263577h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            mw5Var.f462403f = new r45.cu5();
            this.f263579m = true;
        } else {
            mw5Var.f462403f = x51.j1.a(bArr);
            this.f263579m = false;
            mw5Var.f462404g = this.f263580n;
        }
        r45.cu5 cu5Var = mw5Var.f462403f;
        if (cu5Var != null) {
            cu5Var.m161592x9616526c();
        }
        mw5Var.f462401d = this.f263575f;
        mw5Var.f462402e = this.f263576g;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 234;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f263574e.mo815x76e0bfae(i18, i19, str, this);
    }
}
