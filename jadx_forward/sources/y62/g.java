package y62;

/* loaded from: classes11.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f541170d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f541171e;

    /* renamed from: f, reason: collision with root package name */
    public final int f541172f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f541173g;

    /* renamed from: h, reason: collision with root package name */
    public final int f541174h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f541175i;

    /* renamed from: m, reason: collision with root package name */
    public int f541176m;

    /* renamed from: n, reason: collision with root package name */
    public final int f541177n;

    /* renamed from: o, reason: collision with root package name */
    public final int f541178o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f541179p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.ka f541180q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.ea f541181r;

    /* renamed from: s, reason: collision with root package name */
    public int f541182s;

    /* renamed from: t, reason: collision with root package name */
    public final long f541183t;

    public g(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, r45.ka kaVar, r45.ea eaVar) {
        this.f541182s = 5000;
        this.f541183t = 0L;
        this.f541172f = i17;
        this.f541173g = str;
        this.f541174h = i18;
        this.f541178o = i19;
        this.f541177n = i27;
        this.f541180q = kaVar;
        this.f541181r = eaVar;
        this.f541179p = str2;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i27);
        objArr[4] = java.lang.Integer.valueOf(i19);
        objArr[5] = java.lang.Boolean.valueOf(kaVar != null);
        objArr[6] = java.lang.Boolean.valueOf(eaVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f541170d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 985;
        lVar.f152199c = "/cgi-bin/micromsg-bin/appvoicecontrol";
        lVar.f152197a = new r45.fa();
        lVar.f152198b = new r45.ga();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f541171e = a17;
        r45.fa faVar = (r45.fa) a17.f152243a.f152217a;
        faVar.f455652d = this.f541172f;
        faVar.f455653e = this.f541173g;
        faVar.f455654f = this.f541174h;
        faVar.f455655g = this.f541178o;
        faVar.f455656h = this.f541180q;
        faVar.f455657i = this.f541181r;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 985;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0 && v0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f541170d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
        }
    }

    public g(int i17, int i18, java.lang.String str, int i19, r45.ka kaVar, r45.ea eaVar, long j17) {
        this.f541182s = 5000;
        this.f541183t = 0L;
        this.f541172f = i17;
        this.f541173g = str;
        this.f541174h = i18;
        this.f541178o = i19;
        this.f541180q = kaVar;
        this.f541181r = eaVar;
        this.f541183t = j17;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Boolean.valueOf(kaVar != null);
        objArr[5] = java.lang.Boolean.valueOf(eaVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", objArr);
    }
}
