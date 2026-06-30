package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes11.dex */
public final class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f179082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z12.w f179083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l f179084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f179086h;

    public h(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, z12.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f179082d = h0Var;
        this.f179083e = wVar;
        this.f179084f = lVar;
        this.f179085g = str;
        this.f179086h = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.n().f354821b.q(413, (com.p314xaae8f345.mm.p944x882e457a.u0) this.f179082d.f391656d);
        z12.w wVar = this.f179083e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, wVar)) {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f179086h;
            java.lang.String str2 = this.f179085g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar = this.f179084f;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f179107c, "removeOne: " + str2 + " fail");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception())));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f179107c, "removeOne: " + str2 + " success");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().L0(wVar.f550911f);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        }
    }
}
