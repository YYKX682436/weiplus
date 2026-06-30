package z12;

/* loaded from: classes15.dex */
public final class u implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.v f550903d;

    public u(z12.v vVar) {
        this.f550903d = vVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public final void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        z85.z zVar;
        z12.v vVar = this.f550903d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f550906f, "ErrType: " + i18 + ", errCode:" + i19);
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_REC_LIST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_REC_LIST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 28800000) + 600000));
        }
        if (i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f550906f, "insertCache, type:" + vVar.f550907g);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                zVar = f17.f276702g;
            }
            int i27 = vVar.f550907g;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = vVar.f550904d;
            r45.oo3 oo3Var = null;
            if (oVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                if (fVar instanceof r45.oo3) {
                    oo3Var = (r45.oo3) fVar;
                }
            }
            zVar.y0(i27, oo3Var);
        }
        if (i18 == 0 || i18 == 4) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = vVar.f550905e;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, vVar);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = vVar.f550905e;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, vVar);
        }
    }
}
