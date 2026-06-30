package ot4;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430397d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430400g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, java.lang.String str9) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f65();
        lVar.f152198b = new r45.g65();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payibggenprepay";
        lVar.f152200d = 1563;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430398e = a17;
        r45.f65 f65Var = (r45.f65) a17.f152243a.f152217a;
        f65Var.f455579d = str;
        f65Var.f455582g = str4;
        f65Var.f455580e = str2;
        f65Var.f455583h = str5;
        f65Var.f455584i = str6;
        f65Var.f455581f = str3;
        f65Var.f455585m = str7;
        f65Var.f455586n = str8;
        f65Var.f455587o = i17;
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", str, str4, str2, str5, str6, str3, str7, str8);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430397d = u0Var;
        return mo9409x10f9447a(sVar, this.f430398e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1563;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.g65 g65Var = (r45.g65) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", java.lang.Integer.valueOf(g65Var.f456459g), g65Var.f456460h);
            str = g65Var.f456460h;
            i19 = g65Var.f456459g;
            this.f430399f = g65Var.f456457e;
            this.f430400g = g65Var.f456461i;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
            this.f430399f = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        }
        this.f430397d.mo815x76e0bfae(i18, i19, str, this);
    }
}
