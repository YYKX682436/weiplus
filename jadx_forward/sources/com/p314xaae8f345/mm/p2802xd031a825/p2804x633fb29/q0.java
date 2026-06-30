package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295516d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f295517e;

    public q0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.et();
        lVar.f152198b = new r45.ft();
        lVar.f152199c = "/cgi-bin/mmpay-bin/cancelqrpay";
        lVar.f152200d = 410;
        lVar.f152201e = nd1.d1.f72919x366c91de;
        lVar.f152202f = 1000000198;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str2);
        lVar.f152204h = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295517e = a17;
        r45.et etVar = (r45.et) a17.f152243a.f152217a;
        etVar.f455249d = str;
        etVar.f455250e = str2;
        etVar.f455251f = at4.g0.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295516d = u0Var;
        return mo9409x10f9447a(sVar, this.f295517e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 410;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f295516d.mo815x76e0bfae(i18, i19, str, this);
    }
}
