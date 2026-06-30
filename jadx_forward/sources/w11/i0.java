package w11;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523589d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f523590e;

    public i0(java.util.List list, long j17, r45.wx3 wx3Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sa3();
        lVar.f152198b = new r45.ta3();
        lVar.f152199c = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
        lVar.f152200d = 1708;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f523590e = a17;
        r45.sa3 sa3Var = (r45.sa3) a17.f152243a.f152217a;
        sa3Var.f467130d.addAll(list);
        sa3Var.f467132f = j17;
        sa3Var.f467131e = wx3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", java.lang.Integer.valueOf(sa3Var.f467130d.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523589d = u0Var;
        return mo9409x10f9447a(sVar, this.f523590e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1708;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f523589d.mo815x76e0bfae(i18, i19, str, this);
        r45.sa3 sa3Var = (r45.sa3) this.f523590e.f152243a.f152217a;
        java.util.LinkedList linkedList = sa3Var.f467130d;
        r45.vx3 vx3Var = (r45.vx3) linkedList.get(0);
        r45.wx3 wx3Var = sa3Var.f467131e;
        r45.ta3 ta3Var = (r45.ta3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12659, 1, java.lang.Integer.valueOf(linkedList.size()), vx3Var.f470175d, java.lang.Integer.valueOf(vx3Var.f470176e), java.lang.Integer.valueOf(vx3Var.f470177f), java.lang.String.valueOf(wx3Var.f471086d), java.lang.String.valueOf(wx3Var.f471087e), 1, java.lang.Integer.valueOf(ta3Var.f467768g));
        } else if (ta3Var.f467768g != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12659, 1, java.lang.Integer.valueOf(linkedList.size()), vx3Var.f470175d, java.lang.Integer.valueOf(vx3Var.f470176e), java.lang.Integer.valueOf(vx3Var.f470177f), java.lang.String.valueOf(wx3Var.f471086d), java.lang.String.valueOf(wx3Var.f471087e), 2, java.lang.Integer.valueOf(ta3Var.f467768g));
        }
    }
}
