package af1;

/* loaded from: classes15.dex */
public class u implements m8.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f86031d;

    public u(af1.x xVar, af1.k kVar) {
        this.f86031d = xVar;
    }

    @Override // m8.z
    public void A() {
        this.f86031d.A.getClass();
    }

    @Override // m8.z
    public void b(boolean z17) {
        af1.x xVar = this.f86031d;
        xVar.A.getClass();
        if (z17) {
            xVar.V(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.String th6;
        af1.x xVar = this.f86031d;
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
                        android.content.Context context = xVar.f86035q;
                        cf1.a aVar = af1.z.f86049a;
                        boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoMediaPlayer", cause, "ExoPlaybackException hasNetwork=" + m40088x550b09c5, new java.lang.Object[0]);
                        if (m40088x550b09c5) {
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
                        cf1.a aVar2 = af1.z.f86049a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                            ((ku5.t0) ku5.t0.f394148d).g(new af1.y(oVar, 0, null, 10));
                        } else {
                            oVar.mo1850x58b836e(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14395x5bc87bc1, -1);
                        return;
                    }
                    if (cause instanceof java.lang.IllegalStateException) {
                        af1.p pVar = new af1.p(this);
                        cf1.a aVar3 = af1.z.f86049a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                            ((ku5.t0) ku5.t0.f394148d).g(new af1.y(pVar, 0, null, 10));
                        } else {
                            pVar.mo1850x58b836e(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14389xe3ffb3dd, -1);
                        return;
                    }
                    if (cause instanceof y8.b) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayError, error: ");
                        cf1.a aVar4 = af1.z.f86049a;
                        if (eVar instanceof y8.b) {
                            y8.b bVar = (y8.b) eVar;
                            th6 = "DecoderInitializationException{message='" + bVar.getLocalizedMessage() + "', mimeType='" + bVar.f541329d + "', secureDecoderRequired=" + bVar.f541330e + ", decoderName='" + bVar.f541331f + "', diagnosticInfo='" + bVar.f541332g + "'}";
                        } else {
                            th6 = eVar.toString();
                        }
                        sb6.append(th6);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoMediaPlayer", sb6.toString());
                        af1.q qVar = new af1.q(this);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                            ((ku5.t0) ku5.t0.f394148d).g(new af1.y(qVar, 0, null, 10));
                        } else {
                            qVar.mo1850x58b836e(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14396x273766a1, -1);
                        return;
                    }
                    if (cause instanceof r9.f0) {
                        af1.r rVar = new af1.r(this);
                        cf1.a aVar5 = af1.z.f86049a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                            ((ku5.t0) ku5.t0.f394148d).g(new af1.y(rVar, 0, null, 10));
                        } else {
                            rVar.mo1850x58b836e(af1.z.b(0, null, 10));
                        }
                        xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14391xd665298e, -1);
                        return;
                    }
                }
            }
            if (1 == eVar.f406088d) {
                af1.s sVar = new af1.s(this);
                cf1.a aVar6 = af1.z.f86049a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    ((ku5.t0) ku5.t0.f394148d).g(new af1.y(sVar, 0, null, 10));
                } else {
                    sVar.mo1850x58b836e(af1.z.b(0, null, 10));
                }
                xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14392x660d477e, -1);
                return;
            }
        }
        af1.t tVar = new af1.t(this);
        cf1.a aVar7 = af1.z.f86049a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            ((ku5.t0) ku5.t0.f394148d).g(new af1.y(tVar, 0, null, 30));
        } else {
            tVar.mo1850x58b836e(af1.z.b(0, null, 30));
        }
        xVar.G(i17, -1);
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        this.f86031d.A.e(l0Var, nVar);
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        this.f86031d.A.t(m0Var, obj);
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        this.f86031d.A.u(yVar);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        this.f86031d.A.y(z17, i17);
        af1.x xVar = this.f86031d;
        synchronized (xVar) {
            if (xVar.f86036r != null && !xVar.K) {
                m8.i iVar = xVar.f86036r;
                int i18 = ((m8.k) iVar).f406116k;
                boolean z18 = ((m8.k) iVar).f406114i;
                int a17 = xVar.f86039u.a(z18, i18);
                if (a17 != xVar.f86039u.f86033a[3]) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "reportPlayerState, set new recent state [" + z18 + "," + i18 + "]");
                    xVar.f86039u.c(z18, i18);
                    if (a17 == 3) {
                        xVar.V(true);
                    } else if (a17 == 1 || a17 == 4) {
                        xVar.V(false);
                    }
                    if (a17 == xVar.f86039u.a(true, 4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "reportPlayerState, isSeeking: %b, loopingPlaySeek: %b", java.lang.Boolean.valueOf(xVar.M.get()), java.lang.Boolean.valueOf(xVar.f86034J));
                        if (xVar.M.getAndSet(false) && !xVar.f86034J) {
                            xVar.K();
                        }
                        if (xVar.I) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "looping play start");
                            xVar.f86034J = true;
                            xVar.mo1861xc9fc1b13(0L);
                        } else {
                            xVar.f542695a = 6;
                            xVar.E();
                        }
                        return;
                    }
                    af1.w wVar = xVar.f86039u;
                    if (!wVar.b(new int[]{wVar.a(false, 1), xVar.f86039u.a(false, 2), xVar.f86039u.a(false, 3)}, false) && (!xVar.X || i18 != 3)) {
                        if ((xVar.f86039u.b(new int[]{100, 2, 3}, true) | xVar.f86039u.b(new int[]{2, 100, 3}, true)) || xVar.f86039u.b(new int[]{100, 3, 2, 3}, true)) {
                            if (xVar.f86034J) {
                                xVar.f86034J = false;
                            } else {
                                xVar.K();
                            }
                            xVar.M.set(false);
                            return;
                        }
                        af1.w wVar2 = xVar.f86039u;
                        if (wVar2.b(new int[]{wVar2.a(true, 3), xVar.f86039u.a(true, 2)}, false)) {
                            xVar.I(701, xVar.M() ? ((m8.k) xVar.f86036r).g() : 0);
                            return;
                        } else {
                            af1.w wVar3 = xVar.f86039u;
                            if (wVar3.b(new int[]{wVar3.a(true, 2), xVar.f86039u.a(true, 3)}, false)) {
                                xVar.I(702, xVar.M() ? ((m8.k) xVar.f86036r).g() : 0);
                            }
                        }
                    }
                    xVar.f542695a = 2;
                    xVar.J();
                    xVar.X = false;
                }
            }
        }
    }

    @Override // m8.z
    public void z(int i17) {
        this.f86031d.A.getClass();
    }
}
