package z12;

/* loaded from: classes2.dex */
public class z extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550921d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f550923f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550924g;

    public z(java.util.List list, int i17) {
        this.f550923f = new java.util.ArrayList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nu6();
        lVar.f152198b = new r45.ou6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
        lVar.f152200d = 717;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550922e = lVar.a();
        this.f550923f = list;
        this.f550924g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550921d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550922e;
        r45.nu6 nu6Var = (r45.nu6) oVar.f152243a.f152217a;
        int i17 = this.f550924g;
        nu6Var.f463221d = i17;
        java.util.List<java.lang.String> list = this.f550923f;
        if (list != null) {
            for (java.lang.String str : list) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(java.lang.String.valueOf(17))) {
                    str = "com.tencent.xin.emoticon.tusiji";
                }
                nu6Var.f463222e.add(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(list.size()));
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 717;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 0L, 1L, false);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 3600000));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 1L, 1L, false);
        }
        this.f550921d.mo815x76e0bfae(i18, i19, str, this);
    }
}
