package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.m implements yz5.l {
    public r(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.modelcdntran.z.class, "doStart", "doStart(Lcom/tencent/mm/modelcdntran/CdnFSC$RunningObj;)I", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelcdntran.e p07 = (com.tencent.mm.modelcdntran.e) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ((com.tencent.mm.modelcdntran.z) this.receiver).getClass();
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.tencent.mm.modelcdntran.s1.fj().b();
        dn.m mVar = p07.f70927a;
        java.lang.String str = mVar.S;
        int i17 = -1;
        if ((str == null || r26.n0.N(str)) || mVar.P == null) {
            int i18 = mVar.field_fileType;
            if (i18 == 40001 || i18 == 19) {
                i17 = com.tencent.mm.modelcdntran.s1.cj().q(mVar);
            } else if (i18 == 30001 || i18 == 30003 || i18 == 30007 || i18 == 31000) {
                mVar.f241789h = -1;
                if ((i18 == 30003 || i18 == 30007) && mVar.M) {
                    mVar.f241812z1 = 30002;
                    mVar.f241810y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_patchdl_maxpcdn, 0);
                }
                if (!mVar.C) {
                    mVar.N = "Accept-Encoding:";
                }
                i17 = com.tencent.mm.modelcdntran.s1.cj().j(mVar);
            } else if (mVar.F) {
                mVar.f241789h = -1;
                java.lang.String format = java.lang.String.format("X-Forwarded-Access-Type:%s\r\n", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                mVar.N = format;
                mVar.field_fileType = 30002;
                mVar.D = 18;
                mVar.f241812z1 = 30003;
                mVar.f241810y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_gamedl_maxpcdn, 0);
                i17 = com.tencent.mm.modelcdntran.s1.cj().j(mVar);
            } else if (!mVar.K) {
                i17 = (mVar.f241789h != 3 || mVar.f241786e) ? (i18 != 0 || mVar.f241786e) ? mVar.f241786e ? com.tencent.mm.modelcdntran.s1.cj().u(mVar) : com.tencent.mm.modelcdntran.s1.cj().t(mVar) : com.tencent.mm.modelcdntran.s1.cj().q(mVar) : com.tencent.mm.modelcdntran.s1.cj().j(mVar);
            } else if (mVar instanceof dn.i) {
                i17 = com.tencent.mm.modelcdntran.s1.cj().n((dn.i) mVar);
            } else if (mVar instanceof dn.j) {
                i17 = com.tencent.mm.modelcdntran.s1.cj().o((dn.j) mVar);
            }
        } else {
            com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
            try {
                i17 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startURIChannelRequest(cj6.z(mVar), cj6);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CdnTransportEngine", e17, "startCustomUriReq", new java.lang.Object[0]);
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
