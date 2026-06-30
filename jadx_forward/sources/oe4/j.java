package oe4;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements iu5.e, com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f426342d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 f426343e;

    /* renamed from: f, reason: collision with root package name */
    public iu5.b f426344f = null;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f426344f = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f426342d = u0Var;
        return mo9409x10f9447a(sVar, this.f426343e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z4.f35032x366c91de;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        oe4.b bVar = new oe4.b();
        this.f426343e = bVar;
        r45.ts6 ts6Var = ((oe4.c) bVar.mo47979x2d63726f()).f426333a;
        ts6Var.f468294d = cVar.f376585b;
        ts6Var.f468295e = cVar.f376584a;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadSoterASKRsa", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f426342d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
            iu5.b bVar = this.f426344f;
            if (bVar != null) {
                bVar.a(new iu5.d(true));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
        iu5.b bVar2 = this.f426344f;
        if (bVar2 != null) {
            bVar2.a(new iu5.d(false));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
