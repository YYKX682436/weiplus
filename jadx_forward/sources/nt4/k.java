package nt4;

/* loaded from: classes4.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f421365d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f421366e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421367f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f421368g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u73();
        lVar.f152198b = new r45.v73();
        lVar.f152199c = "/cgi-bin/mmpay-bin/genmallprepay";
        lVar.f152200d = 2755;
        lVar.f152201e = 189;
        lVar.f152202f = 1000000189;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f421366e = a17;
        r45.u73 u73Var = (r45.u73) a17.f152243a.f152217a;
        u73Var.f468652d = str;
        u73Var.f468655g = str4;
        u73Var.f468653e = str3;
        u73Var.f468656h = str5;
        u73Var.f468657i = str2;
        u73Var.f468654f = str6;
        u73Var.f468658m = str7;
        u73Var.f468659n = str8;
        u73Var.f468660o = i17;
        u73Var.f468661p = str9;
        if (i18 > 0) {
            u73Var.f468662q = i18;
        }
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", str, str4, str3, str5, str2, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f421365d = u0Var;
        return mo9409x10f9447a(sVar, this.f421366e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2755;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        r45.v73 v73Var = (r45.v73) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGenMallPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", java.lang.Integer.valueOf(v73Var.f469494f), v73Var.f469495g);
        if (i18 == 0 && i19 == 0) {
            this.f421367f = v73Var.f469492d;
            this.f421368g = v73Var.f469493e;
        }
        java.lang.String str2 = v73Var.f469495g;
        this.f421365d.mo815x76e0bfae(i18, v73Var.f469494f, str2, this);
    }
}
