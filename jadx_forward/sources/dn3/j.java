package dn3;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f323553d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f323554e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323555f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.d64 d64Var, int i17, java.util.LinkedList linkedList, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.da0();
        lVar.f152198b = new r45.ea0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/createpoi";
        lVar.f152200d = me1.c.f72882x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f323553d = a17;
        str4 = str4 == null ? "" : str4;
        str5 = str5 == null ? "" : str5;
        r45.da0 da0Var = (r45.da0) a17.f152243a.f152217a;
        da0Var.f453794d = str;
        da0Var.f453795e = str2;
        da0Var.f453797g = d64Var;
        da0Var.f453798h = i17;
        if (linkedList != null) {
            da0Var.f453799i = linkedList;
        }
        da0Var.f453800m = str4;
        da0Var.f453801n = str5;
        da0Var.f453796f = str3;
        float f17 = d64Var.f453708e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f323554e = u0Var;
        return mo9409x10f9447a(sVar, this.f323553d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return me1.c.f72882x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.n nVar = this.f323553d.f152244b;
        r45.ea0 ea0Var = (r45.ea0) nVar.f152233a;
        if (nVar.mo150578x7f2fddf8() != 0) {
            this.f323554e.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f323555f = ea0Var.f454717d;
            this.f323554e.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
