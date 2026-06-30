package oe4;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements iu5.e, com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f426339d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f426340e;

    /* renamed from: f, reason: collision with root package name */
    public iu5.b f426341f = null;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f426341f = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f426339d = u0Var;
        return mo9409x10f9447a(sVar, this.f426340e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka.f34378x366c91de;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ts6();
        lVar.f152198b = new r45.us6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/updatesoterask";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka.f34378x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f426340e = a17;
        r45.ts6 ts6Var = (r45.ts6) a17.f152243a.f152217a;
        ts6Var.f468296f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka.f34378x366c91de;
        java.lang.String str = cVar.f376585b;
        ts6Var.f468294d = str;
        java.lang.String str2 = cVar.f376584a;
        ts6Var.f468295e = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadSoterASK", "keyJson: %s, signature: %s", str2, str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f426339d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        re4.g0.f476069b = str;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
            iu5.b bVar = this.f426341f;
            if (bVar != null) {
                bVar.a(new iu5.d(true));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
        iu5.b bVar2 = this.f426341f;
        if (bVar2 != null) {
            bVar2.a(new iu5.d(false));
        }
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
