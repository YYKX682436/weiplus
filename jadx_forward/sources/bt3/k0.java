package bt3;

/* loaded from: classes9.dex */
public class k0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f105834d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f105835e;

    /* renamed from: f, reason: collision with root package name */
    public final bt3.j0 f105836f;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, bt3.j0 j0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i10();
        lVar.f152198b = new r45.j10();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkmd5";
        lVar.f152200d = 939;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f105835e = a17;
        r45.i10 i10Var = (r45.i10) a17.f152243a.f152217a;
        i10Var.f458190d = str;
        i10Var.f458191e = str2;
        i10Var.f458192f = str3;
        i10Var.f458193g = i17;
        this.f105836f = j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", str, str2, str3, java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f105834d = u0Var;
        return mo9409x10f9447a(sVar, this.f105835e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 939;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f105834d.mo815x76e0bfae(i18, i19, str, this);
        bt3.j0 j0Var = this.f105836f;
        if (j0Var != null) {
            if (i18 != 0 || i19 != 0) {
                j0Var.a("", i18, i19);
            } else {
                r45.j10 j10Var = (r45.j10) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
                j0Var.a(j10Var != null ? j10Var.f459023d : "", i18, i19);
            }
        }
    }
}
