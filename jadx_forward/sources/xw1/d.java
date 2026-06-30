package xw1;

/* loaded from: classes9.dex */
public class d extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539196m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jw f539197n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539198o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f539199p;

    public d(boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.iw();
        lVar.f152198b = new r45.jw();
        lVar.f152200d = 1323;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getrewardqrcode";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539196m = a17;
        ((r45.iw) a17.f152243a.f152217a).f458886d = z17;
        this.f539199p = z17;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jw jwVar = (r45.jw) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539197n = jwVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(jwVar.f459675d), this.f539197n.f459676e);
        boolean z17 = this.f539194h;
        if (!z17 && this.f539197n.f459675d != 0) {
            this.f539195i = true;
        }
        if (!z17 && !this.f539195i) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f539197n.f459688t));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f539197n.f459681m));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f539197n.f459682n);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, this.f539197n.f459680i);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, java.lang.Integer.valueOf(this.f539197n.f459687s));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, this.f539197n.f459686r);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, this.f539197n.f459685q);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f539197n.f459678g);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f539197n.f459691w)) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, this.f539197n.f459691w);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f539197n.f459684p.iterator();
            while (it.hasNext()) {
                arrayList.add("" + ((java.lang.Integer) it.next()).intValue());
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 2L, 1L, false);
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 4L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 3L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539198o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539198o = u0Var;
        return mo9409x10f9447a(sVar, this.f539196m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1323;
    }
}
