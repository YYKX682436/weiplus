package mz2;

/* loaded from: classes9.dex */
public class d1 implements pz2.d {

    /* renamed from: g, reason: collision with root package name */
    public int f414640g;

    /* renamed from: a, reason: collision with root package name */
    public pz2.b f414634a = null;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f414635b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f414636c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f414637d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f414638e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414639f = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f414641h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(new mz2.y0(this));

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        this.f414636c = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context;
        this.f414634a = bVar;
        this.f414639f = str;
        java.lang.String m63459x2e2166f5 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63459x2e2166f5(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k());
        re4.n.j();
        if (android.text.TextUtils.isEmpty(m63459x2e2166f5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "FingerPrintAuth.getRsaKey() is null");
            s75.d.b(new mz2.a2(new mz2.c2(new mz2.c1(this, null))), mz2.c2.class.getName());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "do NetSceneTenpayGetOpenTouchCert");
            this.f414636c.m83099x5406100e(new oz2.e(m63459x2e2166f5), false);
        }
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        this.f414635b = bVar;
        if (android.text.TextUtils.isEmpty(this.f414639f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "get user pwd error");
            bVar.h(-1, this.f414636c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k));
            return;
        }
        java.lang.String b17 = mz2.n0.b();
        java.lang.String k17 = wo.w0.k();
        java.lang.String a17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.a();
        if (mz2.n0.c()) {
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63453xf4fe79c1(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), b17, k17, java.lang.String.valueOf(this.f414640g), a17, "", this.f414637d, this.f414638e, wo.w0.m());
            str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63454x6d7333e1(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k(), str2);
        } else {
            str2 = "";
            str3 = "";
        }
        if (android.text.TextUtils.isEmpty(this.f414637d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypted_device_info which return by FingerPrintAuth.genOpenFPEncrypt is null");
        } else if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypto_open_sign which return by FingerPrintAuth.genOpenFPSign is null");
        }
        this.f414636c.m83099x5406100e(new oz2.f(str2, str3, this.f414639f, i17), false);
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
        ((nz2.o) gm0.j1.s(nz2.o.class)).g9(context, new nz2.f(""), new mz2.z0(this, bVar));
    }

    @Override // pz2.d
    /* renamed from: clear */
    public void mo148634x5a5b64d() {
    }

    @Override // pz2.d
    /* renamed from: onSceneEnd */
    public boolean mo148635x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof oz2.e)) {
            if (!(m1Var instanceof oz2.f)) {
                return false;
            }
            if (i17 == 0 && i18 == 0) {
                re4.n.h();
                re4.n.g(0, 0, 0, "OK");
                this.f414635b.h(0, "");
            } else {
                this.f414635b.h(-2, "");
            }
            return true;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert success");
            oz2.e eVar = (oz2.e) m1Var;
            this.f414637d = eVar.f431783d;
            this.f414638e = eVar.f431784e;
            this.f414634a.h(0, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert error");
            pz2.b bVar = this.f414634a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = this.f414636c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            bVar.h(-1, str);
        }
        return true;
    }
}
