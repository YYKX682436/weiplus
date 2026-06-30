package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238330d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238331e;

    /* renamed from: f, reason: collision with root package name */
    public r45.al4 f238332f;

    public c0(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zk4();
        lVar.f152198b = new r45.al4();
        lVar.f152200d = 4708;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtpayhome";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238331e = a17;
        r45.zk4 zk4Var = (r45.zk4) a17.f152243a.f152217a;
        zk4Var.f473700d = str;
        zk4Var.f473702f = i17;
        zk4Var.f473703g = i18;
        zk4Var.f473704h = str2;
        zk4Var.f473705i = j17;
        zk4Var.f473706m = str3;
        zk4Var.f473707n = i19;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        zk4Var.f473708o = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "NetSceneMerchantPayGetQRCodeInfo, qrcode: %s,scan_scene:%s, channel :%s qrcodeSenderUsername:%s msgSvrId:%s username:%s chatType:%s wallet_region:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, java.lang.Long.valueOf(j17), str3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "doScene");
        this.f238330d = u0Var;
        return mo9409x10f9447a(sVar, this.f238331e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4708;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.al4 al4Var = (r45.al4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238332f = al4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayGetQRCodeInfo", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(al4Var.f451626d), this.f238332f.f451627e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238330d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
