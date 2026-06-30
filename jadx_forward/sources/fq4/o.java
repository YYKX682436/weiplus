package fq4;

/* loaded from: classes9.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347154d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f347155e;

    /* renamed from: f, reason: collision with root package name */
    public int f347156f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f347157g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347158h;

    /* renamed from: m, reason: collision with root package name */
    public int f347160m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347159i = false;

    /* renamed from: n, reason: collision with root package name */
    public int f347161n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f347162o = "";

    public o(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f347156f = 0;
        this.f347158h = false;
        this.f347160m = 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fq4.d dVar = new fq4.d();
        this.f347157g = dVar;
        c01.n9 n9Var = (c01.n9) dVar.mo47979x2d63726f();
        this.f347155e = str;
        this.f347156f = 0;
        r45.ry6 ry6Var = n9Var.f118882a;
        ry6Var.f466840f = i17;
        ry6Var.f466841g = str2;
        this.f347160m = i18;
        ry6Var.f466839e = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f347158h = true;
        H();
    }

    public final int H() {
        c01.n9 n9Var = (c01.n9) this.f347157g.mo47979x2d63726f();
        r45.i17 i17Var = new r45.i17();
        n9Var.f118882a.f466838d = i17Var;
        java.lang.String str = this.f347155e;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f347156f;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f523998b == 0) {
            return -2;
        }
        int i18 = d17.f524000d;
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f347156f;
        if (i19 >= 469000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f523997a);
        i17Var.f458204g = cu5Var;
        i17Var.f458201d = this.f347156f;
        i17Var.f458202e = d17.f523998b;
        i17Var.f458203f = 0;
        int i27 = this.f347160m;
        r45.ry6 ry6Var = n9Var.f118882a;
        ry6Var.f466839e = i27;
        if (this.f347158h) {
            if (d17.f523999c >= ((int) com.p314xaae8f345.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f458203f = 1;
                this.f347159i = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f347156f = d17.f523999c;
        ry6Var.f466838d = i17Var;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347154d = u0Var;
        return mo9409x10f9447a(sVar, this.f347157g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 617;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        c01.o9 o9Var = (c01.o9) v0Var.mo13821x7f35c2d1();
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.n(this, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
            return;
        }
        if (i18 != 0 && i19 != 0) {
            this.f347154d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.sy6 sy6Var = o9Var.f118899a;
        int i27 = sy6Var.f467555f;
        this.f347160m = i27;
        this.f347161n = sy6Var.f467554e;
        this.f347162o = sy6Var.f467556g;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i27);
        objArr[1] = java.lang.Integer.valueOf(this.f347161n);
        objArr[2] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f347162o));
        objArr[3] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f347162o) ? 0 : this.f347162o.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", objArr);
        if (this.f347159i) {
            this.f347154d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        mo807x6c193ac1(m47995xb7ba1aa7(), this.f347154d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
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
