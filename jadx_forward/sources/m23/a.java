package m23;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f404616d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fg3 f404617e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gg3 f404618f;

    /* renamed from: g, reason: collision with root package name */
    public n23.m f404619g;

    /* renamed from: i, reason: collision with root package name */
    public final l23.a f404621i;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f404620h = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f404622m = null;

    public a(l23.a aVar, n23.m mVar) {
        this.f404619g = null;
        if (aVar == null) {
            return;
        }
        this.f404619g = mVar;
        this.f404621i = aVar;
        qk.h6 h6Var = (qk.h6) aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", h6Var.f66762x4b6e43c0, java.lang.Integer.valueOf(h6Var.f66763x28ef0850), h6Var.f66769xf47740ff);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fg3();
        lVar.f152198b = new r45.gg3();
        lVar.f152200d = 825;
        lVar.f152199c = h6Var.f66762x4b6e43c0;
        lVar.f152201e = h6Var.f66763x28ef0850;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f404616d = a17;
        r45.fg3 fg3Var = (r45.fg3) a17.f152243a.f152217a;
        this.f404617e = fg3Var;
        java.lang.String str = h6Var.f66769xf47740ff;
        fg3Var.f455841d = str;
        java.lang.String str2 = h6Var.f66764x5ae6efa9;
        if (str2 != null) {
            fg3Var.f455842e = str2;
        }
        r45.tp tpVar = h6Var.f66761xe40d67b3;
        fg3Var.f455844g = tpVar;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Long.valueOf(tpVar.f468169d);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f404617e.f455844g.f468170e;
        objArr[2] = java.lang.Integer.valueOf(gVar != null ? gVar.f273689a.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "NetSceneGetFuncMsg request FunctionMsgID[%s] BusinessId[%d, %d]", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        l23.a aVar = this.f404621i;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", ((qk.h6) aVar).f66769xf47740ff);
            ((qk.h6) aVar).f66777x10a0fed7 = 1;
        }
        this.f404620h = u0Var;
        return mo9409x10f9447a(sVar, this.f404616d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 825;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.gg3 gg3Var = (r45.gg3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f404618f = gg3Var;
        this.f404622m = gg3Var.f456750g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f404618f.f456747d);
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f404622m));
        java.lang.Long valueOf5 = java.lang.Long.valueOf(this.f404618f.f456748e);
        l23.a aVar = this.f404621i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s, functionMsgId: %s", valueOf, valueOf2, str, valueOf3, valueOf4, valueOf5, ((qk.h6) aVar).f66769xf47740ff);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f404622m)) {
            r45.fg3 fg3Var = (r45.fg3) this.f404616d.f152243a.f152217a;
            this.f404617e = fg3Var;
            fg3Var.f455842e = this.f404622m;
        }
        if (i18 == 0 || i19 == 0) {
            if (((qk.h6) aVar).f66773x44eeef4 != 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(((qk.h6) aVar).f66773x44eeef4, ((qk.h6) aVar).f66778x8d6cefe1, 1L, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetFuncMsg", "fetchItem.getReportId() is 0!");
            }
            this.f404620h.mo815x76e0bfae(i18, i19, str, this);
            n23.m mVar = this.f404619g;
            if (mVar != null) {
                ((xr.c) mVar).d(i18, i19, str, this);
            }
        } else if (i18 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "server error");
            this.f404620h.mo815x76e0bfae(i18, i19, str, this);
            n23.m mVar2 = this.f404619g;
            if (mVar2 != null) {
                ((xr.c) mVar2).d(i18, i19, str, this);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
            this.f404620h.mo815x76e0bfae(i18, i19, str, this);
            n23.m mVar3 = this.f404619g;
            if (mVar3 != null) {
                ((xr.c) mVar3).d(i18, i19, str, this);
            }
        }
        this.f404619g = null;
    }
}
