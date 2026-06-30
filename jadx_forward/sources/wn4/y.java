package wn4;

/* loaded from: classes11.dex */
public final class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, rf0.n {

    /* renamed from: d, reason: collision with root package name */
    public final int f529109d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f529110e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f529111f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f529112g;

    /* renamed from: h, reason: collision with root package name */
    public oq1.n f529113h;

    public y(java.lang.String baseId, java.lang.String patchId, java.util.LinkedList targets, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseId, "baseId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchId, "patchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targets, "targets");
        this.f529109d = i17;
        this.f529110e = "MicroMsg.Updater.NetSceneManualCheckWxUpdate";
        r45.f35 f35Var = new r45.f35();
        f35Var.f455520d = baseId;
        f35Var.f455521e = patchId;
        f35Var.f455522f = targets;
        f35Var.f455527n = 1;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = f35Var;
        lVar.f152198b = new r45.g35();
        lVar.f152199c = "/cgi-bin/micromsg-bin/prconfig";
        lVar.f152200d = 3899;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f529111f = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.NetSceneManualCheckWxUpdate", "Create NetSceneManualCheckWxUpdate baseId:" + baseId + " patchId:" + patchId);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f529112g = u0Var;
        return mo9409x10f9447a(sVar, this.f529111f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3899;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529110e, "errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        if (i18 == 0 && i19 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PRConfigResponse");
            r45.j35 j35Var = ((r45.g35) fVar).f456386d;
            if (j35Var != null) {
                this.f529113h = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb(j35Var);
            }
        }
        oq1.n nVar = this.f529113h;
        if (nVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(nVar, "null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse");
            y73.p.c((com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) nVar);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f529112g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
