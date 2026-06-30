package ph3;

/* loaded from: classes14.dex */
public class o implements ph3.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435971a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435972b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435973c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435974d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f435975e;

    /* renamed from: f, reason: collision with root package name */
    public long f435976f;

    /* renamed from: g, reason: collision with root package name */
    public long f435977g;

    /* renamed from: h, reason: collision with root package name */
    public long f435978h;

    /* renamed from: i, reason: collision with root package name */
    public final ph3.h f435979i;

    /* renamed from: j, reason: collision with root package name */
    public int f435980j;

    /* renamed from: l, reason: collision with root package name */
    public final ph3.p f435982l;

    /* renamed from: n, reason: collision with root package name */
    public ph3.a f435984n;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f435986p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f435987q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f435988r;

    /* renamed from: k, reason: collision with root package name */
    public boolean f435981k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f435983m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f435985o = -1;

    public o(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, xu5.b bVar, android.os.Looper looper, android.os.Looper looper2, boolean z17, int i17) {
        ph3.l lVar = new ph3.l(this);
        this.f435986p = lVar;
        ph3.m mVar = new ph3.m(this);
        this.f435987q = mVar;
        ph3.n nVar = new ph3.n(this);
        this.f435988r = nVar;
        this.f435971a = n3Var;
        this.f435975e = z17;
        ph3.h hVar = new ph3.h(z17, i17);
        this.f435979i = hVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(bVar, lVar);
        this.f435974d = n3Var2;
        n3Var2.m77789xc5a5549d(false);
        this.f435982l = new ph3.p(hVar, n3Var);
        this.f435972b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(looper, mVar);
        if (looper2 != null) {
            this.f435984n = new ph3.a(hVar, n3Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(looper2, nVar);
            this.f435973c = n3Var3;
            n3Var3.m77789xc5a5549d(false);
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s seek to mSeekSec %d", j(), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.VideoPlayerImpl", "seek stack", new java.lang.Object[0]);
        if (this.f435980j < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", j(), java.lang.Integer.valueOf(this.f435980j), java.lang.Integer.valueOf(i17));
            return;
        }
        ph3.p pVar = this.f435982l;
        pVar.l();
        ph3.a aVar = this.f435984n;
        if (aVar != null) {
            aVar.l();
        }
        m(5);
        if (i17 >= this.f435976f) {
            this.f435974d.mo50289x733c63a2(9).sendToTarget();
            return;
        }
        pVar.f();
        this.f435979i.f435921c = pVar.s(i17);
        pVar.t(5);
        n(5);
        l();
    }

    @Override // ph3.c
    public void c(float f17) {
        ph3.p pVar = this.f435982l;
        if (pVar != null) {
            if (f17 > 0.0f) {
                pVar.C = f17;
            } else {
                pVar.getClass();
            }
        }
    }

    @Override // ph3.c
    /* renamed from: getDurationMs */
    public long mo158540x37a7fa50() {
        return this.f435976f;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s set path %s", j(), str);
        this.f435982l.f435937d = str;
        ph3.a aVar = this.f435984n;
        if (aVar != null) {
            aVar.f435937d = str;
        }
    }

    public java.lang.String j() {
        return this.f435979i.c() + "_" + android.os.Process.myTid();
    }

    public final void k(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, long j17, long j18) {
        if (ph3.e.a(this.f435980j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayerImpl", "isEnd state=%s", java.lang.Integer.valueOf(this.f435980j));
            return;
        }
        if (n3Var.mo50287xb9a7fe99()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayerImpl", "handler has quit");
            return;
        }
        n3Var.mo50303x856b99f0(2);
        long elapsedRealtime = (j17 + j18) - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            n3Var.mo50305x3d8a09a2(2);
        } else {
            n3Var.mo50307xb9e94560(2, elapsedRealtime);
        }
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s seek done", j());
        this.f435982l.t(5);
        ph3.a aVar = this.f435984n;
        ph3.h hVar = this.f435979i;
        if (aVar != null) {
            aVar.f();
            hVar.f435924f = this.f435984n.s((int) hVar.f435921c);
            this.f435984n.t(5);
        }
        n(7);
        m(4);
        this.f435971a.mo50290x733c63a2(3, 0, 0).sendToTarget();
        hVar.f435923e = hVar.f435921c * 1000;
        hVar.f435921c = -1L;
    }

    public void m(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d", j(), java.lang.Integer.valueOf(this.f435980j), java.lang.Integer.valueOf(i17));
        this.f435980j = i17;
        this.f435979i.f435925g = 0L;
    }

    public final void n(int i17) {
        java.lang.String j17 = j();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ph3.h hVar = this.f435979i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", j17, valueOf, java.lang.Long.valueOf(hVar.f435919a), java.lang.Long.valueOf(hVar.f435920b), java.lang.Long.valueOf(hVar.f435922d));
        if (i17 == 3) {
            long j18 = hVar.f435920b;
            if (j18 > 0) {
                hVar.f435922d += j18 - hVar.f435919a;
                hVar.f435920b = 0L;
            }
            hVar.f435919a = android.os.SystemClock.elapsedRealtime();
        } else if (i17 != 4) {
            if (i17 == 5) {
                hVar.f435922d = hVar.f435921c;
                hVar.f435919a = android.os.SystemClock.elapsedRealtime();
                hVar.f435920b = 0L;
                hVar.f435924f = 0L;
                hVar.f435923e = 0L;
            } else if (i17 == 6) {
                hVar.f435922d = hVar.f435921c;
                hVar.f435920b = 0L;
                hVar.f435919a = 0L;
                hVar.f435924f = 0L;
                hVar.f435923e = 0L;
            } else if (i17 == 7) {
                hVar.f435922d = hVar.f435921c;
                hVar.f435920b = 0L;
                hVar.f435919a = 0L;
            }
        } else if (hVar.f435919a <= 0) {
            hVar.f435920b = 0L;
        } else {
            hVar.f435920b = android.os.SystemClock.elapsedRealtime();
        }
        this.f435977g = hVar.f435919a;
        this.f435978h = hVar.f435922d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", j(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f435977g), java.lang.Long.valueOf(this.f435978h));
    }

    @Override // ph3.c
    /* renamed from: pause */
    public void mo158541x65825f6() {
        m(4);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f435972b;
        n3Var.mo50303x856b99f0(4);
        n3Var.mo50289x733c63a2(4).sendToTarget();
        if (this.f435984n != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f435973c;
            n3Var2.mo50303x856b99f0(4);
            n3Var2.mo50289x733c63a2(4).sendToTarget();
        }
    }

    @Override // ph3.c
    /* renamed from: prepare */
    public boolean mo158542xed060d07() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", j());
        this.f435972b.mo50289x733c63a2(1).sendToTarget();
        if (this.f435984n != null) {
            this.f435973c.mo50289x733c63a2(1).sendToTarget();
        }
        return true;
    }

    @Override // ph3.c
    /* renamed from: release */
    public void mo158543x41012807() {
        m(9);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f435974d;
        n3Var.mo50303x856b99f0(2);
        n3Var.mo50303x856b99f0(9);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f435972b;
        n3Var2.mo50303x856b99f0(1);
        n3Var2.mo50303x856b99f0(2);
        n3Var2.mo50303x856b99f0(3);
        n3Var2.mo50303x856b99f0(4);
        n3Var2.mo50303x856b99f0(6);
        n3Var2.mo50302x6b17ad39(null);
        int i17 = j62.e.g().i("clicfg_video_player_release_direct_releasedecoder", 0, true, true);
        ph3.p pVar = this.f435982l;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s release directly release videoTrack decoder", j());
            try {
                pVar.t(9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", pVar.i(), java.lang.Boolean.valueOf(pVar.f435990x));
                if (pVar.f435990x && fp.h.b(19)) {
                    pVar.p();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoPlayerImpl", e17, "%s release error %s", j(), e17.toString());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s release post to handler thread release videoTrack decoder", j());
            pVar.t(9);
        }
        n3Var2.mo50303x856b99f0(7);
        n3Var2.mo50289x733c63a2(7).sendToTarget();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = this.f435973c;
        if (n3Var3 != null) {
            n3Var3.mo50303x856b99f0(1);
            n3Var3.mo50303x856b99f0(2);
            n3Var3.mo50303x856b99f0(3);
            n3Var3.mo50303x856b99f0(4);
            n3Var3.mo50303x856b99f0(6);
            n3Var3.mo50303x856b99f0(7);
            n3Var3.mo50289x733c63a2(7).sendToTarget();
        }
        ph3.h hVar = this.f435979i;
        hVar.f435919a = 0L;
        hVar.f435920b = 0L;
        hVar.f435921c = -1L;
        hVar.f435922d = 0L;
        hVar.f435923e = 0L;
        hVar.f435924f = 0L;
    }

    @Override // ph3.c
    /* renamed from: setMute */
    public void mo158544x764d819b(boolean z17) {
        if (this.f435984n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", j(), java.lang.Boolean.valueOf(z17));
            this.f435984n.x(z17);
        }
    }

    @Override // ph3.c
    /* renamed from: setSurface */
    public void mo158545x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", j(), java.lang.Integer.valueOf(surface.hashCode()));
        this.f435982l.f435989w = surface;
    }

    @Override // ph3.c
    /* renamed from: start */
    public void mo158546x68ac462() {
        m(3);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f435972b;
        n3Var.mo50303x856b99f0(3);
        n3Var.mo50289x733c63a2(3).sendToTarget();
        if (this.f435984n != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f435973c;
            n3Var2.mo50303x856b99f0(3);
            n3Var2.mo50289x733c63a2(3).sendToTarget();
        }
    }

    @Override // ph3.c
    /* renamed from: stop */
    public void mo158547x360802() {
        m(8);
    }
}
