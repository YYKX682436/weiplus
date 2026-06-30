package ig4;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372980d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f372981e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f372982f;

    /* renamed from: g, reason: collision with root package name */
    public int f372983g = -1;

    /* renamed from: h, reason: collision with root package name */
    public r45.x17 f372984h;

    public b(java.lang.String str) {
        iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        this.f372980d = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gr3();
        lVar.f152198b = new r45.hr3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getvoicetransres";
        lVar.f152200d = 548;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f372981e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f372982f = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f372981e;
        ((r45.gr3) oVar.f152243a.f152217a).f457035d = this.f372980d;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 548;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.hr3 hr3Var = (r45.hr3) this.f372981e.f152244b.f152233a;
            r45.oh5 oh5Var = hr3Var.f457933e;
            if (oh5Var != null) {
                this.f372983g = oh5Var.f463804d;
            }
            this.f372984h = hr3Var.f457932d;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f372982f.mo815x76e0bfae(i18, i19, str, this);
    }
}
