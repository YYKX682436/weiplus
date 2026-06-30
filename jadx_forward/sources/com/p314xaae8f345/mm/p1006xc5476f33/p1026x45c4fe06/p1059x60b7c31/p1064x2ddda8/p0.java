package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class p0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f161210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f161211c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q0 f161212d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, int i17) {
        this.f161212d = q0Var;
        this.f161209a = yVar;
        this.f161210b = c0Var;
        this.f161211c = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q0 q0Var = this.f161212d;
        java.lang.String k17 = q0Var.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161209a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = this.f161210b;
        boolean c17 = yVar.c(k17, c0Var);
        int i19 = this.f161211c;
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi callback, callbackId:%s, service not running or preloaded", java.lang.Integer.valueOf(i19));
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (fVar instanceof r45.n24) {
                r45.n24 n24Var = (r45.n24) fVar;
                if (n24Var.f462548d.f459024d != 0) {
                    yVar.d0(i19, q0Var.o("fail:errorCode:" + n24Var.f462548d.f459024d + ",errorMsg:" + n24Var.f462548d.f459025e), c0Var);
                    return;
                }
                java.lang.String i27 = n24Var.f462549e.i();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i27)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, data is null");
                    yVar.d0(i19, q0Var.o("fail invalid response"), c0Var);
                    return;
                }
                java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Map map = i81.j.f371125a;
                try {
                    if (i81.a0.b(mo48798x74292566).f371107r == 0) {
                        i81.a0.b(mo48798x74292566).f371107r = currentTimeMillis;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, callbackId:%s, callback data:%s", java.lang.Integer.valueOf(i19), n24Var.f462549e.i());
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, i27);
                    yVar.d0(i19, q0Var.p("ok", hashMap), c0Var);
                    return;
                } catch (java.lang.NullPointerException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "setAdOperateCallbackSendTime npe, appId:%s, runtime:%s", mo48798x74292566, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(mo48798x74292566));
                    throw e17;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi fail, errType:%s, errCode:%s, errMsg:%s, response:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f152244b.f152233a);
        yVar.d0(i19, q0Var.o("fail invalid response"), c0Var);
    }
}
