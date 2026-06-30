package af1;

/* loaded from: classes15.dex */
public class u implements m8.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f4498d;

    public u(af1.x xVar, af1.k kVar) {
        this.f4498d = xVar;
    }

    @Override // m8.z
    public void A() {
        this.f4498d.A.getClass();
    }

    @Override // m8.z
    public void b(boolean z17) {
        af1.x xVar = this.f4498d;
        xVar.A.getClass();
        if (z17) {
            xVar.V(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.String th6;
        af1.x xVar = this.f4498d;
        xVar.A.d(eVar);
        if (xVar.M()) {
            xVar.V(false);
        }
        int i17 = -4999;
        if (eVar != 0) {
            java.lang.Throwable cause = eVar.getCause();
            if (cause != null) {
                if (cause instanceof r9.x) {
                    if (cause.toString().contains("Unable to connect")) {
                        android.content.Context context = xVar.f4502q;
                        cf1.a aVar = af1.z.f4516a;
                        boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context);
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayer", cause, "ExoPlaybackException hasNetwork=" + isNetworkConnected, new java.lang.Object[0]);
                        if (isNetworkConnected) {
                            xVar.G(-4000, -3);
                            return;
                        } else {
                            xVar.G(-4000, -2);
                            return;
                        }
                    }
                    if (cause instanceof r9.y) {
                        java.lang.String th7 = cause.toString();
                        if (th7.contains("403")) {
                            xVar.G(-4000, -10);
                            return;
                        }
                        if (th7.contains("404")) {
                            xVar.G(-4000, -11);
                            return;
                        }
                        if (th7.contains("500")) {
                            xVar.G(-4000, -12);
                            return;
                        } else if (th7.contains("502")) {
                            xVar.G(-4000, -13);
                            return;
                        } else {
                            xVar.G(-4000, -30);
                            return;
                        }
                    }
                    i17 = -4000;
                } else {
                    if (cause instanceof d9.m0) {
                        af1.o oVar = new af1.o(this);
                        cf1.a aVar2 = af1.z.f4516a;
                        if (com.tencent.mm.sdk.platformtools.u3.e()) {
                            ((ku5.t0) ku5.t0.f312615d).g(new af1.y(oVar, 0, null, 10));
                        } else {
                            oVar.apply(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_OPEN_FAILED, -1);
                        return;
                    }
                    if (cause instanceof java.lang.IllegalStateException) {
                        af1.p pVar = new af1.p(this);
                        cf1.a aVar3 = af1.z.f4516a;
                        if (com.tencent.mm.sdk.platformtools.u3.e()) {
                            ((ku5.t0) ku5.t0.f312615d).g(new af1.y(pVar, 0, null, 10));
                        } else {
                            pVar.apply(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_DECODE_FAILED, -1);
                        return;
                    }
                    if (cause instanceof y8.b) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayError, error: ");
                        cf1.a aVar4 = af1.z.f4516a;
                        if (eVar instanceof y8.b) {
                            y8.b bVar = (y8.b) eVar;
                            th6 = "DecoderInitializationException{message='" + bVar.getLocalizedMessage() + "', mimeType='" + bVar.f459796d + "', secureDecoderRequired=" + bVar.f459797e + ", decoderName='" + bVar.f459798f + "', diagnosticInfo='" + bVar.f459799g + "'}";
                        } else {
                            th6 = eVar.toString();
                        }
                        sb6.append(th6);
                        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.ExoMediaPlayer", sb6.toString());
                        af1.q qVar = new af1.q(this);
                        if (com.tencent.mm.sdk.platformtools.u3.e()) {
                            ((ku5.t0) ku5.t0.f312615d).g(new af1.y(qVar, 0, null, 10));
                        } else {
                            qVar.apply(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_OVER_LIMIT, -1);
                        return;
                    }
                    if (cause instanceof r9.f0) {
                        af1.r rVar = new af1.r(this);
                        cf1.a aVar5 = af1.z.f4516a;
                        if (com.tencent.mm.sdk.platformtools.u3.e()) {
                            ((ku5.t0) ku5.t0.f312615d).g(new af1.y(rVar, 0, null, 10));
                        } else {
                            rVar.apply(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_OPERATION, -1);
                        return;
                    }
                }
            }
            if (1 == eVar.f324555d) {
                af1.s sVar = new af1.s(this);
                cf1.a aVar6 = af1.z.f4516a;
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    ((ku5.t0) ku5.t0.f312615d).g(new af1.y(sVar, 0, null, 10));
                } else {
                    sVar.apply(af1.z.b(0, null, 10));
                }
                xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_PATH, -1);
                return;
            }
        }
        af1.t tVar = new af1.t(this);
        cf1.a aVar7 = af1.z.f4516a;
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            ((ku5.t0) ku5.t0.f312615d).g(new af1.y(tVar, 0, null, 30));
        } else {
            tVar.apply(af1.z.b(0, null, 30));
        }
        xVar.G(i17, -1);
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        this.f4498d.A.e(l0Var, nVar);
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        this.f4498d.A.t(m0Var, obj);
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        this.f4498d.A.u(yVar);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        this.f4498d.A.y(z17, i17);
        af1.x xVar = this.f4498d;
        synchronized (xVar) {
            if (xVar.f4503r != null && !xVar.K) {
                m8.i iVar = xVar.f4503r;
                int i18 = ((m8.k) iVar).f324583k;
                boolean z18 = ((m8.k) iVar).f324581i;
                int a17 = xVar.f4506u.a(z18, i18);
                if (a17 != xVar.f4506u.f4500a[3]) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "reportPlayerState, set new recent state [" + z18 + "," + i18 + "]");
                    xVar.f4506u.c(z18, i18);
                    if (a17 == 3) {
                        xVar.V(true);
                    } else if (a17 == 1 || a17 == 4) {
                        xVar.V(false);
                    }
                    if (a17 == xVar.f4506u.a(true, 4)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "reportPlayerState, isSeeking: %b, loopingPlaySeek: %b", java.lang.Boolean.valueOf(xVar.M.get()), java.lang.Boolean.valueOf(xVar.f4501J));
                        if (xVar.M.getAndSet(false) && !xVar.f4501J) {
                            xVar.K();
                        }
                        if (xVar.I) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "looping play start");
                            xVar.f4501J = true;
                            xVar.seekTo(0L);
                        } else {
                            xVar.f461162a = 6;
                            xVar.E();
                        }
                        return;
                    }
                    af1.w wVar = xVar.f4506u;
                    if (!wVar.b(new int[]{wVar.a(false, 1), xVar.f4506u.a(false, 2), xVar.f4506u.a(false, 3)}, false) && (!xVar.X || i18 != 3)) {
                        if ((xVar.f4506u.b(new int[]{100, 2, 3}, true) | xVar.f4506u.b(new int[]{2, 100, 3}, true)) || xVar.f4506u.b(new int[]{100, 3, 2, 3}, true)) {
                            if (xVar.f4501J) {
                                xVar.f4501J = false;
                            } else {
                                xVar.K();
                            }
                            xVar.M.set(false);
                            return;
                        }
                        af1.w wVar2 = xVar.f4506u;
                        if (wVar2.b(new int[]{wVar2.a(true, 3), xVar.f4506u.a(true, 2)}, false)) {
                            xVar.I(701, xVar.M() ? ((m8.k) xVar.f4503r).g() : 0);
                            return;
                        } else {
                            af1.w wVar3 = xVar.f4506u;
                            if (wVar3.b(new int[]{wVar3.a(true, 2), xVar.f4506u.a(true, 3)}, false)) {
                                xVar.I(702, xVar.M() ? ((m8.k) xVar.f4503r).g() : 0);
                            }
                        }
                    }
                    xVar.f461162a = 2;
                    xVar.J();
                    xVar.X = false;
                }
            }
        }
    }

    @Override // m8.z
    public void z(int i17) {
        this.f4498d.A.getClass();
    }
}
