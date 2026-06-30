package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class v0 implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.p944x882e457a.z0, com.p314xaae8f345.mm.p944x882e457a.b1, com.p314xaae8f345.mm.p944x882e457a.w0, dg0.e, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7, c01.a8 {
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 U;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f284293J;
    public gp1.v K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d L;
    public boolean M;
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h N;
    public final com.p314xaae8f345.mm.p944x882e457a.a1 P;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Q;
    public final gp1.z R;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 S;
    public boolean T;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f284295e;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.c1 f284298h;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284302o;

    /* renamed from: q, reason: collision with root package name */
    public yb5.d f284304q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.Context f284305r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro f284306s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f284307t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f284308u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f284309v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f284312y;

    /* renamed from: z, reason: collision with root package name */
    public int f284313z;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f284294d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("voice_continue_play_info");

    /* renamed from: f, reason: collision with root package name */
    public w21.u0 f284296f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f284297g = false;

    /* renamed from: i, reason: collision with root package name */
    public long f284299i = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f284300m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f284301n = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f284303p = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f284310w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f284311x = -1;
    public java.lang.String A = "";
    public boolean B = true;
    public boolean C = false;
    public long D = 0;
    public long E = 0;
    public boolean F = false;
    public boolean G = false;
    public float H = 1.0f;
    public final float I = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20068xb17b172f());

    public v0(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar, java.lang.String str) {
        this.f284293J = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20071x5dbd5fa1()) == 1;
        this.M = false;
        this.N = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w0(this);
        this.P = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x0(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21610x5a6bf972 c21610x5a6bf972 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21610x5a6bf972(this, com.p314xaae8f345.mm.app.a0.f134821d);
        this.Q = c21610x5a6bf972;
        this.R = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z0(this);
        this.S = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.a1(this, android.os.Looper.getMainLooper());
        this.T = false;
        this.f284305r = dVar.g();
        this.f284304q = dVar;
        this.f284306s = roVar;
        if (this.f284307t == null) {
            this.f284307t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(this.f284305r.getApplicationContext());
        }
        if (this.f284309v == null) {
            this.f284309v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(this.f284305r.getApplicationContext());
        }
        g(str);
        c21610x5a6bf972.mo48813x58998cd();
        com.p314xaae8f345.mm.p642xad8b531f.b bVar = (com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c();
        bVar.getClass();
        ((java.util.ArrayList) bVar.f144838a).add(this);
    }

    public final void A() {
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = this.f284306s;
        if (roVar != null) {
            if (android.os.Looper.getMainLooper().isCurrentThread()) {
                roVar.u0();
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro.this.u0();
                }
            });
        }
    }

    public boolean B(long j17) {
        tl.h hVar;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f284298h;
        if (c1Var == null || (hVar = ((sl.j) c1Var).f490561a) == null) {
            return false;
        }
        return hVar.mo166731x35ce78(j17);
    }

    public final void C(final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            D(c12886x91aa2b6d);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0.this.D(c12886x91aa2b6d);
            }
        });
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "setBallInfo: " + c12886x91aa2b6d);
        if (c12886x91aa2b6d == null && this.L == null) {
            return;
        }
        if (this.K == null) {
            this.K = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        }
        gp1.v vVar = this.K;
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlay", "setBallInfo: float ball service is null");
            return;
        }
        android.content.Context context = this.f284305r;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h hVar = this.N;
        gp1.z zVar = this.R;
        if (c12886x91aa2b6d != null) {
            if (this.f284299i >= 0) {
                c12886x91aa2b6d.H = 32768;
                android.content.res.Resources resources = context.getResources();
                float f17 = this.H;
                int i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.czb;
                c12886x91aa2b6d.f174594v = resources.getDrawable(f17 > 1.0f ? com.p314xaae8f345.mm.R.C30861xcebc809e.czb : com.p314xaae8f345.mm.R.C30861xcebc809e.cza);
                android.content.res.Resources resources2 = context.getResources();
                if (this.H <= 1.0f) {
                    i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.cza;
                }
                c12886x91aa2b6d.f174595w = resources2.getDrawable(i17);
            } else {
                c12886x91aa2b6d.H = 65536;
                c12886x91aa2b6d.f174594v = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
                c12886x91aa2b6d.f174595w = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78789x4ae29487);
            }
            if (this.K.t0(c12886x91aa2b6d) != null) {
                this.K.V(c12886x91aa2b6d);
            } else {
                this.K.a0(c12886x91aa2b6d.f174579d, zVar);
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(hVar);
                sl.j jVar = (sl.j) this.f284298h;
                jVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "setOnBackPlayInterruptListener() called with: onBackPlayInterruptListener = [" + this + "]");
                jVar.f490567g = this;
                c12886x91aa2b6d.f174581f = 2;
                this.K.u(c12886x91aa2b6d);
                yd5.r.f542685f = true;
            }
        } else if (vVar.t0(this.L) != null) {
            this.K.L(this.L.f174579d, zVar);
            this.K.U(this.L);
            sl.j jVar2 = (sl.j) this.f284298h;
            jVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "setOnBackPlayInterruptListener() called with: onBackPlayInterruptListener = [null]");
            jVar2.f490567g = null;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(hVar);
        }
        this.L = c12886x91aa2b6d;
    }

    public final void E(long j17) {
        if (this.L != null) {
            this.f284300m = j17;
        } else {
            this.f284300m = -1L;
        }
        this.f284299i = j17;
        if (j17 == -1) {
            this.f284303p = -1L;
        }
    }

    public final void F(boolean z17) {
        yb5.d dVar = this.f284304q;
        if (dVar != null) {
            dVar.e().F0(z17);
        }
    }

    public void G(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.AutoPlay", "speakerOn has been set %s", java.lang.Boolean.valueOf(z17));
        this.f284308u = z17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:61|62|63|(3:98|99|(3:103|94|95))|65|(4:67|(1:69)|74|(1:76))(4:87|(1:93)|94|95)|70|71|74|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0.H(com.tencent.mm.storage.f9, boolean):void");
    }

    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "stopBackPlay() called");
        C(null);
        this.f284301n = -1L;
        this.f284302o = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "destroyBack: ");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var = U;
        U = null;
        if (v0Var != null) {
            v0Var.J(true);
            v0Var.r();
        }
    }

    public void J(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "stop play");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        u();
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f284298h;
        ((sl.j) c1Var).f490570j = true;
        ((sl.j) c1Var).h(false);
        this.f284296f = null;
        I();
    }

    public void K() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f284298h;
        if (c1Var == null || !((sl.j) c1Var).c()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", java.lang.Boolean.valueOf(this.f284308u), java.lang.Boolean.valueOf(((sl.j) this.f284298h).c()));
        ((sl.j) this.f284298h).f(this.f284308u);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlay", "voice play error");
        J(true);
        s();
    }

    @Override // c01.a8
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
        this.G = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.z0
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "voice play pause. %b", java.lang.Boolean.valueOf(z17));
        mo47945xc39f8281();
    }

    @Override // c01.a8
    public void d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.AutoPlay", "phone comming or record start, stop play", new java.lang.Object[0]);
        this.G = true;
        if (m()) {
            return;
        }
        J(true);
        h();
        y();
    }

    public void e(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389;
        if (this.f284305r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlay", "context is null");
            return;
        }
        yb5.d dVar = this.f284304q;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlay", "add next failed: null mChattingContext");
            return;
        }
        int mo8143x7444f759 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).mo8143x7444f759();
        if (i17 < 0 || i17 >= mo8143x7444f759 || (mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f284304q.f542241c.a(sb5.z.class))).mo75871xfb80e389(i17)) == null) {
            return;
        }
        if (mo75871xfb80e389.g3() && mo75871xfb80e389.A0() == 0 && !w21.x0.n(mo75871xfb80e389) && !w21.x0.o(mo75871xfb80e389)) {
            f(mo75871xfb80e389);
        }
        e(i17 + 1);
    }

    public void f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        if (!c01.d9.b().E() && this.f284304q != null) {
            if (this.f284295e.isEmpty()) {
                return;
            }
            this.f284295e.clear();
            db5.t7.k(this.f284305r, this.f284304q.f542250l.m78646xc2a54588());
            return;
        }
        int size = this.f284295e.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f284295e.get(i17)).m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                return;
            }
        }
        if (this.f284312y || this.f284295e.isEmpty()) {
            this.f284295e.add(f9Var);
        }
        this.f284295e.size();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSensorEvent, isON:");
        sb6.append(z17);
        sb6.append("  hasSkip:");
        sb6.append(this.T);
        sb6.append(" tick:");
        long j17 = this.f284310w;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append("  lt:");
        sb6.append(this.f284310w);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", sb6.toString());
        if (this.T) {
            this.T = !z17;
            return;
        }
        if (this.f284305r == null) {
            this.f284307t.a();
            return;
        }
        yb5.d dVar = this.f284304q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "isScreenOn: %s", java.lang.Boolean.valueOf(dVar != null ? dVar.e().f290183j : false));
        if (!z17) {
            long j18 = this.f284310w;
            if (j18 != -1 && android.os.SystemClock.elapsedRealtime() - j18 > 400) {
                this.T = true;
                return;
            }
        }
        this.T = false;
        this.f284298h.getClass();
        if (ym1.f.Ni()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = this.f284306s;
        if (roVar != null ? roVar.f281398e : this.M) {
            G(false);
            if (this.f284299i != -1) {
                F(z17);
                this.C = z17;
            } else {
                F(true);
                this.C = true;
            }
            K();
            return;
        }
        if (this.f284299i != -1) {
            yb5.d dVar2 = this.f284304q;
            if ((dVar2 != null ? dVar2.e().f290183j : false) == z17) {
                return;
            }
            F(z17);
            this.C = z17;
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.c1(this, z17), false).c(50L, 50L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", java.lang.Boolean.valueOf(this.C));
    }

    public void g(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", java.lang.Boolean.valueOf(this.C));
        if (this.C || this.f284305r == null) {
            return;
        }
        this.A = str;
        if (str == null) {
            this.A = "";
        }
        this.f284295e = new java.util.LinkedList();
        this.f284297g = false;
        u();
        E(-1L);
        this.f284308u = false;
        this.f284310w = -1L;
        this.f284312y = false;
        this.f284313z = 0;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f284298h;
        com.p314xaae8f345.mm.p944x882e457a.a1 a1Var = this.P;
        if (c1Var != null) {
            ((java.util.ArrayList) ((sl.j) c1Var).f490572l).remove(a1Var);
        }
        boolean I4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(str);
        float f17 = this.I;
        if (I4) {
            this.f284313z = 1;
            this.f284298h = new sl.j(this.f284305r, 1, f17);
        } else {
            this.f284313z = 0;
            this.f284298h = new sl.j(this.f284305r, 0, f17);
        }
        ((java.util.ArrayList) ((sl.j) this.f284298h).f490572l).add(a1Var);
    }

    public void h() {
        if (1 == com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        this.f284301n = -1L;
        this.f284302o = null;
        this.f284295e.clear();
    }

    public void i(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !f9Var.g3()) {
            return;
        }
        long j17 = new w21.u0(f9Var.j()).f524013b;
        if (j17 == 0 && f9Var.A0() == 0) {
            return;
        }
        if (f9Var.P0() == 1 && f9Var.A0() == 1) {
            return;
        }
        if (f9Var.A0() == 0 && j17 == -1) {
            return;
        }
        h();
        I();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f284304q.Z(com.p314xaae8f345.mm.R.raw.f79714x614cd13e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g, this.f284305r.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4s), 4000L);
        }
        if (((sl.j) this.f284298h).c() && f9Var.m124847x74d37ac6() == this.f284299i) {
            this.F = true;
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void j(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        h();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f284304q.Z(com.p314xaae8f345.mm.R.raw.f79714x614cd13e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g, this.f284305r.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4s), 4000L);
        }
        if (((sl.j) this.f284298h).c() && f9Var.m124847x74d37ac6() == this.f284299i) {
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void k(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        h();
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
        if (bool == null || !bool.booleanValue()) {
            c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
            this.f284304q.Z(com.p314xaae8f345.mm.R.raw.f79714x614cd13e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g, this.f284305r.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4s), 4000L);
        }
        if (((sl.j) this.f284298h).c() && f9Var.m124847x74d37ac6() == this.f284299i) {
            J(true);
            return;
        }
        f(f9Var);
        if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
            e(i17 + 1);
        }
        s();
    }

    public void l() {
        this.f284297g = false;
        if (m()) {
            return;
        }
        s();
    }

    public boolean m() {
        return this.f284300m >= 0 || this.L != null;
    }

    public boolean n() {
        return ((sl.j) this.f284298h).c();
    }

    public final void o() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.b1(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "voice play completion isSpeakerOn %b, %d, %d", java.lang.Boolean.valueOf(this.f284308u), java.lang.Long.valueOf(this.f284299i), java.lang.Long.valueOf(this.E));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15160, java.lang.Long.valueOf(this.f284299i), java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(this.E), 0);
        if (this.f284305r != null || m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "stop play complete");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
            A();
            x();
            if (this.f284295e.isEmpty()) {
                y();
            }
            o();
            E(-1L);
            yd5.r.f542680a.a();
            A();
            t(false, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.b1
    /* renamed from: onStop */
    public void mo47945xc39f8281() {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f284299i);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.E);
        long j17 = this.D;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "voice play stop. %d, %d, %d, %b, %b, %s", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(this.F), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        long j18 = this.f284299i;
        if (j18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Long.valueOf(j18);
            objArr[1] = java.lang.Long.valueOf(this.E);
            int i17 = 2;
            objArr[2] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.D);
            if (this.G) {
                i17 = 3;
            } else if (this.F) {
                i17 = 1;
            }
            objArr[3] = java.lang.Integer.valueOf(i17);
            g0Var.d(15160, objArr);
        }
        this.G = false;
        this.F = false;
        A();
        u();
        x();
        if (this.f284295e.isEmpty()) {
            y();
        }
        o();
        E(-1L);
        yd5.r.f542680a.a();
        this.C = false;
        F(true);
        I();
    }

    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!(this.B && this.f284295e.isEmpty()) && f9Var != null && f9Var.g3() && f9Var.A0() != 1 && f9Var.Q0() != null && f9Var.Q0().equals(this.f284304q.x()) && c01.d9.e().f152304n && this.f284304q.f542247i) {
            if (w21.x0.o(f9Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlay", "should not in this setData");
                return;
            }
            f(f9Var);
            if (this.f284297g || ((sl.j) this.f284298h).c() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(this.f284305r)) {
                return;
            }
            s();
        }
    }

    public void q(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "onBackPlayInterrupt() called with: pause = [" + z17 + "]");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.L;
            if (c12886x91aa2b6d != null) {
                this.f284301n = this.f284300m;
                java.util.Iterator it = this.f284295e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                    if (f9Var.m124847x74d37ac6() == this.f284301n) {
                        this.f284302o = f9Var;
                        break;
                    }
                }
            }
            this.G = false;
            this.F = false;
            A();
            u();
            y();
            E(-1L);
            o();
            this.C = false;
            F(true);
            if (c12886x91aa2b6d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "onPause: back playing");
                C(c12886x91aa2b6d);
                y();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.L;
        if (c12886x91aa2b6d2 == null || this.f284301n < 0 || this.f284302o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "resumeBackPlay: resume, but no pausedBackPlayingVoiceId or ball info");
        } else {
            boolean n17 = n();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f284294d;
            if (n17) {
                w();
                z();
                E(this.f284301n);
                o4Var.putLong("current_interrupt_msg_id-" + this.A, 0L);
                o();
                C(c12886x91aa2b6d2);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "onBackPlayInterrupt: resume, but player is playing");
            yb5.d dVar = this.f284304q;
            int R0 = dVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).R0(this.f284302o) : 0;
            if (R0 >= 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f284302o;
                if (f9Var2 != null && f9Var2.g3()) {
                    long j17 = new w21.u0(f9Var2.j()).f524013b;
                    if ((j17 != 0 || f9Var2.A0() != 0) && ((f9Var2.P0() != 1 || f9Var2.A0() != 1) && (f9Var2.A0() != 0 || j17 != -1))) {
                        boolean z18 = ((java.util.LinkedList) this.f284295e).size() > 1;
                        h();
                        if (((sl.j) this.f284298h).c() && f9Var2.m124847x74d37ac6() == this.f284299i) {
                            this.F = true;
                            J(true);
                        } else {
                            f(f9Var2);
                            if (f9Var2.A0() == 0 && z18) {
                                e(R0 + 1);
                            }
                            s();
                            long j18 = this.f284311x;
                            if (j18 > 0 && B(j18)) {
                                o4Var.putLong("current_interrupt_msg_id-" + this.A, 0L);
                            }
                        }
                    }
                }
                C(c12886x91aa2b6d2);
                return;
            }
        }
        C(null);
        this.f284301n = -1L;
        this.f284302o = null;
    }

    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f284309v;
        if (s7Var != null) {
            s7Var.b();
        }
        ((sl.j) this.f284298h).i();
        this.f284305r = null;
        this.C = false;
        this.f284304q = null;
        this.f284306s = null;
        this.Q.mo48814x2efc64();
        ((java.util.ArrayList) ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).f144838a).remove(this);
    }

    public void s() {
        t(true, false);
    }

    public final void t(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "play next: size: %s needAudioFocus: %s", java.lang.Integer.valueOf(((java.util.LinkedList) this.f284295e).size()), java.lang.Boolean.valueOf(z17));
        int size = ((java.util.LinkedList) this.f284295e).size();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.S;
        if (size <= 0) {
            n3Var.mo50307xb9e94560(0, 1000L);
            I();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f284298h;
        if (c1Var != null) {
            ((sl.j) c1Var).f490570j = z17;
            ((sl.j) c1Var).f490569i = z17;
        }
        if (!z18) {
            this.H = 1.0f;
        }
        boolean z19 = !z18;
        try {
            ((java.util.LinkedList) this.f284295e).size();
            if (((java.util.LinkedList) this.f284295e).size() <= 0) {
                n3Var.mo50307xb9e94560(0, 1000L);
                return;
            }
            long mo78012x3fdd41df = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f284295e).get(0)).mo78012x3fdd41df();
            int size2 = ((java.util.LinkedList) this.f284295e).size();
            int i17 = 0;
            for (int i18 = 1; i18 < size2; i18++) {
                if (mo78012x3fdd41df > ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f284295e).get(i18)).mo78012x3fdd41df()) {
                    mo78012x3fdd41df = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f284295e).get(i18)).mo78012x3fdd41df();
                    i17 = i18;
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f284295e).get(i17);
            if (f9Var == null || (f27 = pt0.f0.f2(f9Var.Q0(), f9Var.m124847x74d37ac6())) == null || !f27.g3()) {
                return;
            }
            H(f9Var, z19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AutoPlay", e17, "", new java.lang.Object[0]);
        }
    }

    public final void u() {
        if (this.f284299i < 0 || this.f284311x <= 2500) {
            return;
        }
        java.lang.String str = this.f284299i + "";
        java.lang.String str2 = this.f284311x + "," + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f284294d;
        o4Var.putString(str, str2);
        o4Var.putLong("current_interrupt_msg_id-" + this.A, this.f284299i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "[voice interrupt] record id: " + str + " info: " + str2 + this.A);
    }

    public final void v(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.L;
        if (c12886x91aa2b6d != null) {
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
            java.lang.Object[] objArr = new java.lang.Object[2];
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String y07 = f9Var.y0();
            java.lang.String Q0 = R4 ? f9Var.Q0() : null;
            ((sg3.a) v0Var).getClass();
            objArr[0] = c01.a2.f(y07, Q0);
            objArr[1] = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.huk), java.lang.Integer.valueOf((int) w21.x0.m(this.f284296f.f524013b)));
            c12886x91aa2b6d.f174596x = java.lang.String.format("%s：%s", objArr);
            C(c12886x91aa2b6d);
        }
    }

    public final void w() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f284307t;
        if (c21000x8b2f716.f273966h) {
            return;
        }
        c21000x8b2f716.b(this);
        if (this.f284309v.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.d1(this))) {
            this.f284310w = 0L;
        } else {
            this.f284310w = -1L;
        }
    }

    public final void x() {
        int size = ((java.util.LinkedList) this.f284295e).size();
        int i17 = -1;
        for (int i18 = 0; i18 < size; i18++) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f284295e).get(i18)).m124847x74d37ac6() == this.f284299i) {
                i17 = i18;
            }
        }
        if (i17 != -1) {
            ((java.util.LinkedList) this.f284295e).remove(i17);
        }
        ((java.util.LinkedList) this.f284295e).size();
        if (((java.util.LinkedList) this.f284295e).size() == 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6221xe44826f2().b(android.os.Looper.getMainLooper());
        }
    }

    public final void y() {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f284307t;
            if (c21000x8b2f716 != null) {
                c21000x8b2f716.a();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f284309v;
            if (s7Var != null) {
                s7Var.b();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AutoPlay", e17, "reset sensor error: %s", e17.getMessage());
        }
    }

    public final void z() {
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = this.f284306s;
        if (roVar != null) {
            if (android.os.Looper.getMainLooper().isCurrentThread()) {
                roVar.f280113d.Q(true);
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.v0$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro.this.f280113d.Q(true);
                }
            });
        }
    }
}
