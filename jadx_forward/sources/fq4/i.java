package fq4;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347135d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f347136e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f347137f;

    /* renamed from: g, reason: collision with root package name */
    public int f347138g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347139h;

    /* renamed from: m, reason: collision with root package name */
    public int f347141m;

    /* renamed from: n, reason: collision with root package name */
    public final int f347142n;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347140i = false;

    /* renamed from: o, reason: collision with root package name */
    public int f347143o = 0;

    public i(java.lang.String str, int i17, int i18, int i19) {
        this.f347138g = 0;
        this.f347139h = false;
        this.f347141m = 0;
        this.f347142n = 0;
        this.f347142n = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pn5();
        lVar.f152198b = new r45.qn5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/registervoiceprint";
        lVar.f152200d = 612;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f347136e = a17;
        r45.pn5 pn5Var = (r45.pn5) a17.f152243a.f152217a;
        this.f347137f = str;
        this.f347138g = 0;
        pn5Var.f464768g = i18;
        pn5Var.f464765d = i17;
        this.f347141m = i19;
        pn5Var.f464766e = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f347139h = true;
        H();
    }

    public final int H() {
        r45.pn5 pn5Var = (r45.pn5) this.f347136e.f152243a.f152217a;
        r45.i17 i17Var = new r45.i17();
        pn5Var.f464767f = i17Var;
        java.lang.String str = this.f347137f;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f347138g;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f523998b == 0) {
            return -2;
        }
        int i18 = d17.f524000d;
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneRegisterVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f347138g;
        if (i19 >= 469000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f523997a);
        i17Var.f458204g = cu5Var;
        i17Var.f458201d = this.f347138g;
        i17Var.f458202e = d17.f523998b;
        i17Var.f458203f = 0;
        pn5Var.f464766e = this.f347141m;
        if (this.f347139h) {
            if (d17.f523999c >= ((int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f458203f = 1;
                this.f347140i = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f347138g = d17.f523999c;
        pn5Var.f464767f = i17Var;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347135d = u0Var;
        return mo9409x10f9447a(sVar, this.f347136e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 612;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.qn5 qn5Var = (r45.qn5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 && i19 != 0) {
            this.f347135d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "voice ticket %d ret %d nextstep %d %d ", java.lang.Integer.valueOf(qn5Var.f465645g), java.lang.Integer.valueOf(qn5Var.f465642d), java.lang.Integer.valueOf(qn5Var.f465643e), java.lang.Integer.valueOf(qn5Var.f465642d));
        this.f347141m = qn5Var.f465645g;
        this.f347143o = qn5Var.f465642d;
        if (this.f347140i) {
            this.f347135d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        mo807x6c193ac1(m47995xb7ba1aa7(), this.f347135d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "loop doscene");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 240;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
