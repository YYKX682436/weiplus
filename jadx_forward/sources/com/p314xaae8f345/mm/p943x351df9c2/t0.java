package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes4.dex */
public class t0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152075d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f152076e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f152077f = null;

    public t0(java.util.LinkedList linkedList) {
        this.f152076e = null;
        this.f152076e = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.util.LinkedList linkedList = this.f152076e;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetHeadImg", fp.k.c() + "doScene ReqSize==0");
            return -1;
        }
        this.f152075d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nf();
        lVar.f152198b = new r45.of();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchgetheadimg";
        lVar.f152200d = 123;
        lVar.f152201e = 15;
        lVar.f152202f = 1000000015;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.nf nfVar = (r45.nf) a17.f152243a.f152217a;
        nfVar.f462868e = linkedList;
        nfVar.f462867d = linkedList.size();
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 123;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f152077f = ((r45.of) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f463742e;
        this.f152075d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
