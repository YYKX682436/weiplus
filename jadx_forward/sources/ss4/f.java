package ss4;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493589d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493590e;

    public f(java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qa3();
        lVar.f152198b = new r45.ra3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/bankresource";
        lVar.f152200d = 1650;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493590e = a17;
        a17.m47986x306cfea3(true);
        r45.qa3 qa3Var = (r45.qa3) a17.f152243a.f152217a;
        qa3Var.f465324d = linkedList;
        qa3Var.f465325e = at4.g0.c();
        if (!h45.y.c()) {
            qa3Var.f465326f = h45.y.f360501a;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(42, 1);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493589d = u0Var;
        return mo9409x10f9447a(sVar, this.f493590e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1650;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + i18 + "errCode=" + i19);
        if (i18 == 0 && i19 == 0) {
            r45.ra3 ra3Var = (r45.ra3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", ra3Var.f466226g);
            java.util.LinkedList linkedList = ra3Var.f466223d;
            if (linkedList != null && linkedList.size() != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5957xbd0cae36 c5957xbd0cae36 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5957xbd0cae36();
                c5957xbd0cae36.f136256g.f88894a = linkedList;
                c5957xbd0cae36.e();
            }
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC;
            java.lang.String str2 = ra3Var.f466226g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            c17.x(u3Var, str2);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(43, 1);
        }
        this.f493589d.mo815x76e0bfae(i18, i19, str, this);
    }
}
