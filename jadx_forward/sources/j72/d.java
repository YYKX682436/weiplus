package j72;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f379578d;

    /* renamed from: e, reason: collision with root package name */
    public r45.of3 f379579e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f379580f;

    public d(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nf3();
        lVar.f152198b = new r45.of3();
        lVar.f152200d = 1108;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getfacecontractstatus";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f379578d = a17;
        r45.nf3 nf3Var = (r45.nf3) a17.f152243a.f152217a;
        r45.ae aeVar = new r45.ae();
        nf3Var.f462884g = aeVar;
        aeVar.f451493n = wo.w0.n();
        nf3Var.f462884g.f451494o = wo.w0.a() ? 1 : 0;
        nf3Var.f462884g.f451495p = wo.w0.b() ? 1 : 0;
        nf3Var.f462881d = i17;
        nf3Var.f462882e = str;
        nf3Var.f462883f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUICGI", "[cgi-request]NetSceneGetFaceContract scene:%s,userInfo:%s,sign:%s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f379580f = u0Var;
        return mo9409x10f9447a(sVar, this.f379578d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1108;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUICGI", "[cgi-ret]onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f379579e = (r45.of3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f379580f.mo815x76e0bfae(i18, i19, str, this);
    }
}
