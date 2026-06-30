package xw1;

/* loaded from: classes9.dex */
public class i extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539210m;

    /* renamed from: n, reason: collision with root package name */
    public r45.px f539211n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539212o;

    public i(java.util.LinkedList linkedList, java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ox();
        lVar.f152198b = new r45.px();
        lVar.f152200d = 1562;
        lVar.f152199c = "/cgi-bin/mmpay-bin/setrewardqrcode";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539210m = a17;
        r45.ox oxVar = (r45.ox) a17.f152243a.f152217a;
        oxVar.f464120d = linkedList;
        oxVar.f464121e = str;
        oxVar.f464122f = z17;
        oxVar.f464123g = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.px pxVar = (r45.px) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539211n = pxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(pxVar.f464975d), this.f539211n.f464976e);
        boolean z17 = this.f539194h;
        if (!z17 && this.f539211n.f464975d != 0) {
            this.f539195i = true;
        }
        if (!z17 && !this.f539195i) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f539211n.f464982n));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f539211n.f464979h));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f539211n.f464981m);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f539211n.f464977f);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f539211n.f464983o)) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, this.f539211n.f464983o);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f539211n.f464980i.iterator();
            while (it.hasNext()) {
                arrayList.add("" + ((java.lang.Integer) it.next()).intValue());
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 5L, 1L, false);
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 7L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 6L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539212o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539212o = u0Var;
        return mo9409x10f9447a(sVar, this.f539210m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1562;
    }
}
