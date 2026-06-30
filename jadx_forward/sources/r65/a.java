package r65;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474600d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474601e;

    public a(int i17) {
        int i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vp3();
        lVar.f152198b = new r45.wp3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getupdateinfo";
        lVar.f152200d = 113;
        lVar.f152201e = 35;
        lVar.f152202f = 1000000035;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474600d = a17;
        r45.vp3 vp3Var = (r45.vp3) a17.f152243a.f152217a;
        vp3Var.f469952d = i17;
        vp3Var.f469953e = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
        if (10012 == x51.o1.f533597q && (i18 = x51.o1.f533598r) > 0) {
            vp3Var.f469953e = i18;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 3L, 1L, true);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 4L, 1L, true);
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 5L, 1L, true);
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 6L, 1L, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", java.lang.Integer.valueOf(vp3Var.f469952d), java.lang.Integer.valueOf(vp3Var.f469953e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474601e = u0Var;
        return mo9409x10f9447a(sVar, this.f474600d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 7L, 1L, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(405L, 8L, 1L, true);
            if (i18 == 4) {
                g0Var.mo68477x336bdfd8(405L, 9L, 1L, true);
                if (i19 == -16) {
                    g0Var.mo68477x336bdfd8(405L, 10L, 1L, true);
                } else if (i19 == -17) {
                    g0Var.mo68477x336bdfd8(405L, 11L, 1L, true);
                } else if (i19 == -18) {
                    g0Var.mo68477x336bdfd8(405L, 12L, 1L, true);
                }
            }
        }
        this.f474601e.mo815x76e0bfae(i18, i19, str, this);
        java.lang.String str2 = ((r45.wp3) this.f474600d.f152244b.f152233a).f470903m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 14L, 1L, true);
            return;
        }
        uk.m a17 = uk.m.a(str2);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", str2);
            return;
        }
        int i27 = a17.f510041c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", java.lang.Integer.valueOf(i27));
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 13L, 1L, true);
    }
}
