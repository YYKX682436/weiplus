package fq4;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347167d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f347168e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f347169f;

    /* renamed from: g, reason: collision with root package name */
    public int f347170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347171h;

    /* renamed from: m, reason: collision with root package name */
    public int f347173m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347172i = false;

    /* renamed from: n, reason: collision with root package name */
    public int f347174n = 0;

    public q(java.lang.String str, int i17, int i18) {
        this.f347170g = 0;
        this.f347171h = false;
        this.f347173m = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.py6();
        lVar.f152198b = new r45.qy6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyvoiceprint";
        lVar.f152200d = 613;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f347168e = a17;
        r45.py6 py6Var = (r45.py6) a17.f152243a.f152217a;
        this.f347169f = str;
        this.f347170g = 0;
        py6Var.f465016f = i17;
        this.f347173m = i18;
        py6Var.f465015e = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f347171h = true;
        H();
    }

    public final int H() {
        r45.py6 py6Var = (r45.py6) this.f347168e.f152243a.f152217a;
        r45.i17 i17Var = new r45.i17();
        py6Var.f465014d = i17Var;
        java.lang.String str = this.f347169f;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f347170g;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f523998b == 0) {
            return -2;
        }
        int i18 = d17.f524000d;
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f347170g;
        if (i19 >= 469000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f523997a);
        i17Var.f458204g = cu5Var;
        i17Var.f458201d = this.f347170g;
        i17Var.f458202e = d17.f523998b;
        i17Var.f458203f = 0;
        py6Var.f465015e = this.f347173m;
        if (this.f347171h) {
            if (d17.f523999c >= ((int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f458203f = 1;
                this.f347172i = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f347170g = d17.f523999c;
        py6Var.f465014d = i17Var;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347167d = u0Var;
        return mo9409x10f9447a(sVar, this.f347168e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 613;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.qy6 qy6Var = (r45.qy6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 && i19 != 0) {
            this.f347167d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        int i27 = qy6Var.f465891f;
        this.f347173m = i27;
        this.f347174n = qy6Var.f465890e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f347174n));
        if (this.f347172i) {
            this.f347167d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        mo807x6c193ac1(m47995xb7ba1aa7(), this.f347167d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
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
