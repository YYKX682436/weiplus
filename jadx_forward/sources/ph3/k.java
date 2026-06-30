package ph3;

/* loaded from: classes14.dex */
public class k implements ph3.c {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Looper f435956a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435957b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f435958c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f435959d;

    /* renamed from: e, reason: collision with root package name */
    public final xu5.b f435960e;

    /* renamed from: f, reason: collision with root package name */
    public ph3.o f435961f;

    /* renamed from: g, reason: collision with root package name */
    public ph3.d f435962g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f435963h;

    public k(android.os.Looper looper, boolean z17, int i17) {
        ph3.j jVar = new ph3.j(this);
        this.f435963h = jVar;
        xu5.b a17 = xu5.b.a("VideoPlayer:inner");
        this.f435960e = a17;
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a18 = pu5.f.a("VideoPlayer:video", 10);
        this.f435958c = a18;
        a18.start();
        if (!z17) {
            android.os.HandlerThread a19 = pu5.f.a("VideoPlayer:audio", 10);
            this.f435959d = a19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "VideoPlayer init 4");
            a19.start();
        }
        this.f435956a = looper;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f435956a, jVar);
        this.f435957b = n3Var;
        this.f435961f = new ph3.o(n3Var, a17, this.f435958c.getLooper(), this.f435959d.getLooper(), z17, i17);
    }

    public static void j(ph3.k kVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s clear now.", kVar.m());
        kVar.f435960e.f538836b.g();
        kVar.f435958c.quitSafely();
        android.os.HandlerThread handlerThread = kVar.f435959d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        kVar.f435957b.mo50303x856b99f0(1);
        kVar.f435957b.mo50303x856b99f0(2);
        kVar.f435957b.mo50303x856b99f0(3);
        kVar.f435957b.mo50303x856b99f0(4);
        kVar.f435957b.mo50303x856b99f0(5);
        kVar.f435958c = null;
        kVar.f435957b = null;
        kVar.f435956a = null;
        kVar.f435962g = null;
        kVar.f435961f = null;
    }

    @Override // ph3.c
    public void a(int i17) {
        this.f435961f.a(i17);
    }

    @Override // ph3.c
    public void c(float f17) {
        ph3.o oVar = this.f435961f;
        if (oVar != null) {
            oVar.c(f17);
        }
    }

    @Override // ph3.c
    /* renamed from: getDurationMs */
    public long mo158540x37a7fa50() {
        return this.f435961f.f435976f;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s video player set path %s", m(), str);
        this.f435961f.h(str);
    }

    public void k(android.view.Surface surface) {
        if (surface != null) {
            ph3.o oVar = this.f435961f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", oVar.j(), java.lang.Integer.valueOf(surface.hashCode()));
            ph3.p pVar = oVar.f435982l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s set out put surface", pVar.i());
            pVar.f435989w = surface;
            if (!fp.h.c(23)) {
                pVar.v();
                return;
            }
            try {
                wo.i1 i1Var = pVar.f435948o;
                if (i1Var != null) {
                    android.view.Surface surface2 = pVar.f435989w;
                    try {
                        wo.k1.a(81);
                        i1Var.f529252a.setOutputSurface(surface2);
                        wo.k1.a(82);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy setOutputSurface", new java.lang.Object[0]);
                        wo.i1.u(34, e17, i1Var.f529253b);
                        throw e17;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTrackDataSource", e18, "%s change surface23 error [%s]", pVar.i(), e18.toString());
                pVar.v();
            }
        }
    }

    public int l() {
        ph3.h hVar;
        ph3.o oVar = this.f435961f;
        int i17 = 0;
        if (oVar != null && (hVar = oVar.f435979i) != null) {
            i17 = (int) (hVar.f435923e / 1000);
            int i18 = (int) hVar.f435921c;
            if (i18 != -1) {
                i17 = java.lang.Math.max(i17, i18);
            }
            long j17 = i17;
            long j18 = hVar.f435924f / 1000;
            if (j17 < j18) {
                i17 = (int) j18;
            }
            if (i17 != oVar.f435985o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", oVar.j(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(hVar.f435923e), java.lang.Long.valueOf(hVar.f435924f));
            }
            oVar.f435985o = i17;
        }
        return i17;
    }

    public java.lang.String m() {
        ph3.o oVar = this.f435961f;
        return oVar != null ? oVar.j() : "has no player!";
    }

    public boolean n() {
        ph3.o oVar = this.f435961f;
        if (oVar == null) {
            return false;
        }
        int i17 = oVar.f435980j;
        return i17 == 3 || i17 == 5 || i17 == 6;
    }

    public void o(int i17, boolean z17) {
        ph3.o oVar = this.f435961f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", oVar.j(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.VideoPlayerImpl", "seek stack", new java.lang.Object[0]);
        if (oVar.f435980j < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", oVar.j(), java.lang.Integer.valueOf(oVar.f435980j), java.lang.Integer.valueOf(i17));
            return;
        }
        oVar.f435982l.l();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = oVar.f435972b;
        n3Var.mo50303x856b99f0(4);
        ph3.a aVar = oVar.f435984n;
        if (aVar != null) {
            aVar.l();
            oVar.f435973c.mo50303x856b99f0(4);
        }
        if (i17 < oVar.f435976f) {
            n3Var.mo50289x733c63a2(8).sendToTarget();
            n3Var.mo50292x733c63a2(5, new int[]{i17, z17 ? 1 : 0}).sendToTarget();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(oVar.f435976f));
            oVar.m(6);
            oVar.f435974d.mo50289x733c63a2(9).sendToTarget();
        }
    }

    public void p(boolean z17) {
        ph3.h hVar;
        ph3.o oVar = this.f435961f;
        if (oVar == null || (hVar = oVar.f435979i) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", oVar.j(), java.lang.Boolean.valueOf(z17));
        hVar.f435928j = z17;
    }

    @Override // ph3.c
    /* renamed from: pause */
    public void mo158541x65825f6() {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 1) {
            m();
            int i17 = this.f435961f.f435980j;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        ph3.o oVar = this.f435961f;
        int i18 = oVar.f435980j;
        if (!(i18 == 6)) {
            if (!(i18 == 5)) {
                oVar.mo158541x65825f6();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", m());
    }

    @Override // ph3.c
    /* renamed from: prepare */
    public boolean mo158542xed060d07() {
        this.f435961f.mo158542xed060d07();
        return true;
    }

    public void q(boolean z17) {
        ph3.o oVar = this.f435961f;
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s setNeedResetExtractor [%b]", oVar.j(), java.lang.Boolean.valueOf(z17));
            ph3.h hVar = oVar.f435979i;
            if (hVar != null) {
                hVar.f435927i = z17;
            }
        }
    }

    @Override // ph3.c
    /* renamed from: release */
    public void mo158543x41012807() {
        try {
            this.f435961f.mo158543x41012807();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // ph3.c
    /* renamed from: setMute */
    public void mo158544x764d819b(boolean z17) {
        try {
            ph3.o oVar = this.f435961f;
            if (oVar != null) {
                oVar.mo158544x764d819b(z17);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // ph3.c
    /* renamed from: setSurface */
    public void mo158545x42c875eb(android.view.Surface surface) {
        if (surface != null) {
            this.f435961f.mo158545x42c875eb(surface);
        }
    }

    @Override // ph3.c
    /* renamed from: start */
    public void mo158546x68ac462() {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 1) {
            m();
            int i17 = this.f435961f.f435980j;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        ph3.o oVar = this.f435961f;
        int i18 = oVar.f435980j;
        if (!(i18 == 6)) {
            if (!(i18 == 5)) {
                oVar.mo158546x68ac462();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", m());
    }

    @Override // ph3.c
    /* renamed from: stop */
    public void mo158547x360802() {
        this.f435961f.mo158547x360802();
    }
}
