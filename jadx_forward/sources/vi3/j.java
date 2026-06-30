package vi3;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f519132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi3.k f519133e;

    public j(vi3.k kVar, vi3.f fVar) {
        this.f519133e = kVar;
        this.f519132d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, this);
        vi3.k kVar = this.f519133e;
        vi3.f fVar = this.f519132d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize appmsg.  errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            kVar.a();
            if (fVar.f519106a.equals("afterLogin")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(466L, 3L, 1L, false);
            } else if (fVar.f519106a.equals("afterSleep")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(466L, 18L, 1L, false);
            } else if (fVar.f519106a.equals("getMore")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(466L, 34L, 1L, false);
            }
            vi3.b.b(0L, 0L, 0L, 0L, 2, kVar.f519136b, fVar.f519106a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize success. ");
        kn1.k.k(vi3.l.b());
        kn1.k.k(vi3.l.c());
        kVar.f519139e = false;
        long j17 = kVar.f519137c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (fVar.f519106a.equals("afterLogin")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(466L, 1L, 1L, false);
            g0Var.mo68477x336bdfd8(466L, 5L, fVar.f519110e, false);
            g0Var.mo68477x336bdfd8(466L, 7L, currentTimeMillis, false);
            g0Var.mo68477x336bdfd8(466L, 11L, fVar.f519109d, false);
            g0Var.mo68477x336bdfd8(466L, 12L, fVar.f519108c, false);
        } else if (fVar.f519106a.equals("afterSleep")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(466L, 16L, 1L, false);
            g0Var2.mo68477x336bdfd8(466L, 20L, fVar.f519110e, false);
            g0Var2.mo68477x336bdfd8(466L, 22L, currentTimeMillis, false);
            g0Var2.mo68477x336bdfd8(466L, 26L, fVar.f519109d, false);
            g0Var2.mo68477x336bdfd8(466L, 27L, fVar.f519108c, false);
        } else if (fVar.f519106a.equals("getMore")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.mo68477x336bdfd8(466L, 32L, 1L, false);
            g0Var3.mo68477x336bdfd8(466L, 36L, fVar.f519110e, false);
            g0Var3.mo68477x336bdfd8(466L, 38L, currentTimeMillis, false);
            g0Var3.mo68477x336bdfd8(466L, 42L, fVar.f519109d, false);
            g0Var3.mo68477x336bdfd8(466L, 43L, fVar.f519108c, false);
        }
        vi3.b.b(fVar.f519110e, currentTimeMillis, fVar.f519109d, fVar.f519108c, 0, kVar.f519136b, fVar.f519106a);
    }
}
