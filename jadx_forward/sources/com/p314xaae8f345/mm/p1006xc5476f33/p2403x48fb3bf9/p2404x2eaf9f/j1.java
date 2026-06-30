package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes2.dex */
public final class j1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f263387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f263388e;

    public j1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f263387d = c0Var;
        this.f263388e = rVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f263387d;
        if (c0Var.f391645d) {
            return 0;
        }
        boolean z17 = true;
        c0Var.f391645d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f263388e;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (fVar instanceof r45.ns3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWuidResp");
                r45.ns3 ns3Var = (r45.ns3) fVar;
                java.lang.String str2 = ns3Var.f463173e;
                if (str2 != null && !r26.n0.N(str2)) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack wuid is null");
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1.f263424a.b(2L);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack wuid=" + ns3Var.f463173e);
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(ns3Var.f463173e));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1.f263424a.b(1L);
                }
                return 0;
            }
        }
        rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1.f263424a.b(3L);
        return 0;
    }
}
