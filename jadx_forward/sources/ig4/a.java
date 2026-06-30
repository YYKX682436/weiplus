package ig4;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f372968d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f372969e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372970f;

    /* renamed from: g, reason: collision with root package name */
    public int f372971g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e17 f372972h;

    /* renamed from: i, reason: collision with root package name */
    public long f372973i;

    /* renamed from: m, reason: collision with root package name */
    public int f372974m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372975n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372976o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x17 f372977p;

    /* renamed from: q, reason: collision with root package name */
    public int f372978q = -1;

    /* renamed from: r, reason: collision with root package name */
    public r45.zu6 f372979r;

    public a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        H(str, i17, -1, -1L, str2, i18, str3, str4);
    }

    public final void H(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.a30();
        lVar.f152198b = new r45.b30();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkvoicetrans";
        lVar.f152200d = 546;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f372968d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        if (i18 >= 0) {
            this.f372972h = ig4.d.a(i18, str2, 0L, "");
        }
        if (j17 > 0) {
            this.f372973i = j17;
        }
        this.f372970f = str;
        this.f372971g = i17;
        this.f372974m = i19;
        this.f372975n = str3;
        this.f372976o = str4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f372969e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f372968d;
        r45.a30 a30Var = (r45.a30) oVar.f152243a.f152217a;
        a30Var.f451225d = this.f372970f;
        a30Var.f451226e = this.f372971g;
        a30Var.f451228g = this.f372972h;
        a30Var.f451229h = this.f372973i;
        a30Var.f451230i = this.f372974m;
        a30Var.f451231m = this.f372975n;
        a30Var.f451232n = this.f372976o;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 546;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.b30 b30Var = (r45.b30) this.f372968d.f152244b.f152233a;
            if (b30Var == null) {
                return;
            }
            this.f372977p = b30Var.f452025e;
            this.f372978q = b30Var.f452024d;
            this.f372979r = b30Var.f452026f;
            r45.oh5 oh5Var = b30Var.f452027g;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this.f372970f);
        }
        this.f372969e.mo815x76e0bfae(i18, i19, str, this);
    }

    public a(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        H(str, i17, i18, j17, str2, i19, str3, str4);
    }
}
