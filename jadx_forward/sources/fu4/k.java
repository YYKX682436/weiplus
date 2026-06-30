package fu4;

/* loaded from: classes9.dex */
public class k extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348433d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f348434e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f348435f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f348436g;

    public k(java.lang.String str) {
        this.f348436g = null;
        this.f348436g = str;
    }

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f348434e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: authkey required");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348433d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
        if (this.f348434e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "pay auth key expired when upload pay auth key");
            this.f348434e.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348433d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348433d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        re4.g0.f476070c = str;
        iu5.b bVar = this.f348434e;
        if (bVar != null) {
            if (i18 == 0 && i19 == 0) {
                bVar.a(new iu5.d(true));
            } else {
                bVar.a(new iu5.d(false));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348433d = u0Var;
        return mo9409x10f9447a(sVar, this.f348435f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1665;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fo6();
        lVar.f152198b = new r45.go6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/touchlockupdateauthkey";
        lVar.f152200d = 1244;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348435f = a17;
        r45.fo6 fo6Var = (r45.fo6) a17.f152243a.f152217a;
        fo6Var.f456027d = cVar.f376584a;
        fo6Var.f456029f = cVar.f376585b;
        java.lang.String str = this.f348436g;
        fo6Var.f456028e = str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5626x12e7fcd7 c5626x12e7fcd7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5626x12e7fcd7();
        c5626x12e7fcd7.f135953g.f89728a = str;
        c5626x12e7fcd7.e();
        fo6Var.f456030g = c5626x12e7fcd7.f135954h.f89814a;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
