package j72;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f379568d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f379569e;

    /* renamed from: f, reason: collision with root package name */
    public r45.if3 f379570f;

    public a(int i17, java.lang.String str, java.lang.String str2) {
        this(i17, str, str2, 1, new byte[1]);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f379568d = u0Var;
        return mo9409x10f9447a(sVar, this.f379569e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2696;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFaceCheckAction", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f379570f = (r45.if3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f379568d.mo815x76e0bfae(i18, i19, str, this);
    }

    public a(int i17, java.lang.String str, java.lang.String str2, int i18, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hf3();
        lVar.f152198b = new r45.if3();
        lVar.f152200d = 2696;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getfacecheckaction";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f379569e = a17;
        r45.hf3 hf3Var = (r45.hf3) a17.f152243a.f152217a;
        r45.ae aeVar = new r45.ae();
        hf3Var.f457649i = aeVar;
        aeVar.f451493n = wo.w0.n();
        hf3Var.f457649i.f451494o = wo.w0.a() ? 1 : 0;
        hf3Var.f457649i.f451495p = wo.w0.b() ? 1 : 0;
        hf3Var.f457644d = i17;
        hf3Var.f457645e = str;
        hf3Var.f457646f = str2;
        hf3Var.f457647g = i18;
        hf3Var.f457648h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
            new r45.ju3();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            hf3Var.f457650m = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(k57Var.mo14344x5f01b1f6());
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_vpn_report, false)) {
            hf3Var.f457651n = ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ai();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFaceCheckAction", "create GetFaceCheckAction, scene: %s, packageName: %s, packageSign: %s", java.lang.Integer.valueOf(i17), str, str2);
    }
}
