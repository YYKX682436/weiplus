package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes4.dex */
public class f1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152853d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152854e;

    public f1(java.lang.String str, java.lang.String str2, int i17, r45.cu5 cu5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p26();
        lVar.f152198b = new r45.q26();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newsetpasswd";
        lVar.f152200d = 383;
        lVar.f152201e = 180;
        lVar.f152202f = 1000000180;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152854e = a17;
        r45.p26 p26Var = (r45.p26) a17.f152243a.f152217a;
        p26Var.f464217d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A(str);
        p26Var.f464218e = str2;
        p26Var.f464220g = i17;
        p26Var.f464219f = cu5Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(x51.j1.d(cu5Var));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152853d = u0Var;
        return mo9409x10f9447a(sVar, this.f152854e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 383;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f152853d.mo815x76e0bfae(i18, i19, str, this);
    }
}
