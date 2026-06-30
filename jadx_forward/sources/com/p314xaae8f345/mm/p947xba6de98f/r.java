package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final /* synthetic */ class r extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public r(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p947xba6de98f.z.class, "doStart", "doStart(Lcom/tencent/mm/modelcdntran/CdnFSC$RunningObj;)I", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p947xba6de98f.e p07 = (com.p314xaae8f345.mm.p947xba6de98f.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        ((com.p314xaae8f345.mm.p947xba6de98f.z) this.f72685xcfcbe9ef).getClass();
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.s1.fj().b();
        dn.m mVar = p07.f152460a;
        java.lang.String str = mVar.S;
        int i17 = -1;
        if ((str == null || r26.n0.N(str)) || mVar.P == null) {
            int i18 = mVar.f69592xf1ebe47b;
            if (i18 == 40001 || i18 == 19) {
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().q(mVar);
            } else if (i18 == 30001 || i18 == 30003 || i18 == 30007 || i18 == 31000) {
                mVar.f323322h = -1;
                if ((i18 == 30003 || i18 == 30007) && mVar.M) {
                    mVar.f323345z1 = 30002;
                    mVar.f323343y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_patchdl_maxpcdn, 0);
                }
                if (!mVar.C) {
                    mVar.N = "Accept-Encoding:";
                }
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().j(mVar);
            } else if (mVar.F) {
                mVar.f323322h = -1;
                java.lang.String format = java.lang.String.format("X-Forwarded-Access-Type:%s\r\n", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                mVar.N = format;
                mVar.f69592xf1ebe47b = 30002;
                mVar.D = 18;
                mVar.f323345z1 = 30003;
                mVar.f323343y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_gamedl_maxpcdn, 0);
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().j(mVar);
            } else if (!mVar.K) {
                i17 = (mVar.f323322h != 3 || mVar.f323319e) ? (i18 != 0 || mVar.f323319e) ? mVar.f323319e ? com.p314xaae8f345.mm.p947xba6de98f.s1.cj().u(mVar) : com.p314xaae8f345.mm.p947xba6de98f.s1.cj().t(mVar) : com.p314xaae8f345.mm.p947xba6de98f.s1.cj().q(mVar) : com.p314xaae8f345.mm.p947xba6de98f.s1.cj().j(mVar);
            } else if (mVar instanceof dn.i) {
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().n((dn.i) mVar);
            } else if (mVar instanceof dn.j) {
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().o((dn.j) mVar);
            }
        } else {
            com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
            try {
                i17 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37791xd4f2056(cj6.z(mVar), cj6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CdnTransportEngine", e17, "startCustomUriReq", new java.lang.Object[0]);
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
