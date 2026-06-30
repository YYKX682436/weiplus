package nt4;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f421381d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f421382e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f421383f;

    public t(int i17, int i18, java.lang.String str, r45.py3 py3Var, r45.oy3 oy3Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cx6();
        lVar.f152198b = new r45.dx6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/boss/verifyandroidiappackage";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f421381d = a17;
        r45.cx6 cx6Var = (r45.cx6) a17.f152243a.f152217a;
        cx6Var.f453447d = i17;
        cx6Var.f453448e = i18;
        this.f421383f = str;
        cx6Var.f453450g = py3Var;
        cx6Var.f453449f = oy3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f421382e = u0Var;
        return mo9409x10f9447a(sVar, this.f421381d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 != 0 || i19 != 0) {
            this.f421382e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.dx6 dx6Var = (r45.dx6) this.f421381d.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "business: errCode:" + dx6Var.f454373d + ",errMsg:" + dx6Var.f454374e);
        this.f421382e.mo815x76e0bfae(i18, dx6Var.f454373d, str, this);
    }
}
