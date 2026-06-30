package pa1;

/* loaded from: classes7.dex */
public class t extends ce.o implements pa1.a, h63.q1 {

    /* renamed from: x, reason: collision with root package name */
    public pa1.e f434500x;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        super(n7Var);
        this.f434500x = null;
    }

    @Override // ce.o, ce.d
    public void C(android.view.View view) {
        if (F() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2() == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.dc.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2())) {
            return;
        }
        super.C(view);
    }

    @Override // ce.o
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 P(android.content.Context context) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = new com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2(context, new qa1.p(context));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35210xcaf602da, "", elapsedRealtime, android.os.SystemClock.elapsedRealtime());
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360818d = this;
        return c4216x654bedf2;
    }

    @Override // ce.o
    public void W() {
        G(pa1.a.class, this);
    }

    @Override // ce.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        if (F() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(mo32091x9a3f0ba2)) {
                java.lang.String str2 = mo32091x9a3f0ba2.f156336n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hf(str2, mo32091x9a3f0ba2));
                if (mo32091x9a3f0ba2.u0().k()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).l4();
                    k01.j jVar = k01.j.f384572a;
                    if (jVar.b(null, mo32091x9a3f0ba2.f156336n) && mo32091x9a3f0ba2.u0().C1 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).h4((java.lang.String) jVar.a(mo32091x9a3f0ba2.u0().C1.f158737e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d));
                    }
                }
            } else {
                al1.b r17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).r1();
                if (r17 != null) {
                    al1.h0 h0Var = al1.h0.PageConfig;
                    r17.l(true, h0Var);
                    if (k01.j.f384572a.b(null, mo32091x9a3f0ba2.f156336n)) {
                        r17.l(false, h0Var);
                    }
                }
            }
            mo32091x9a3f0ba2.H2.v((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F(), wdVar);
        }
        return true;
    }

    @Override // ce.o, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void k() {
        pa1.e eVar;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo48798x74292566()) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE && (eVar = this.f434500x) != null) {
            r45.vd7 vd7Var = eVar.f434489a;
            if (vd7Var != null && vd7Var.f469671d) {
                new na1.d().x(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).U1(), na1.c.BeforeBack, 0);
            }
        }
        super.k();
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            android.content.Context context = I();
            java.lang.String appId = H();
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2().f156338p.f158814g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterBackGround");
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i17).booleanValue()) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433705h, appId, 0, null, 12, null), p60.q.class, null);
                ((i63.b0) i95.n0.c(i63.b0.class)).Bi();
                if (!v0Var.f360822h) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433713s, appId, 0, null, 12, null), p60.q.class, null);
                }
                ((p60.u) i95.n0.c(p60.u.class)).Ri(p60.j.f433697i);
            }
        }
    }

    @Override // ce.o, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void m() {
        java.lang.String mo48798x74292566 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "stopListeningOperationEvent, appId:%s", mo48798x74292566);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var = na1.d.f417484i;
        if (l0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(mo48798x74292566, l0Var);
            na1.d.f417484i = null;
        }
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360818d = null;
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            I();
            java.lang.String appId = H();
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2().f156338p.f158814g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i17).booleanValue()) {
                ((p60.u) i95.n0.c(p60.u.class)).Ri(p60.j.f433698m);
                v0Var.Ui();
            }
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.tencent.mm.ipcinvoker.r] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // ce.o, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void n() {
        java.lang.String str;
        java.lang.Class cls;
        p60.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf c16060x33daecf;
        boolean z17;
        java.lang.String str2;
        ?? r102;
        int i17;
        java.lang.Object obj;
        super.n();
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            ze.n runtime = J();
            android.content.Context context = I();
            java.lang.String appId = H();
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2().f156338p.f158814g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterForeground");
            p60.u uVar2 = (p60.u) i95.n0.c(p60.u.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) runtime;
            if (!uVar2.Bi(appId, i18).booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
                ce.g gVar = N2 != null ? (ce.g) N2.B1(ce.g.class) : null;
                if (gVar != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new ce.v((ce.o) gVar));
                }
                j63.p pVar = v0Var.f360819e;
                if (pVar != null) {
                    pVar.f379434a = null;
                }
                v0Var.f360819e = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterForeground not gameLiving,return");
                return;
            }
            v0Var.f360819e = new j63.p(o6Var);
            int i19 = h63.w.f360828b[uVar2.Ai().ordinal()];
            if (i19 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "state %s", uVar2.Ai().h());
                java.lang.String str3 = ((km0.c) gm0.j1.p().a()).f390520a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getProcessName(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", "zbql:setAppBrandPackageName,".concat(str3));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
                o4Var.putString("appbrandPackageName", str3);
                p60.r rVar = p60.s.f433725e;
                int i27 = o4Var.getInt("gameLivePrepareScene", 0);
                rVar.getClass();
                int i28 = h63.w.f360827a[(i27 != 1 ? i27 != 2 ? p60.s.f433726f : p60.s.f433728h : p60.s.f433727g).ordinal()];
                if (i28 != 1) {
                    if (i28 != 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandProcessService", "preparing, the scene is wrong");
                        str2 = appId;
                    } else {
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        str2 = appId;
                        h63.h0 h0Var = new h63.h0(o6Var, context, str2, i18);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(h0Var, 300L, false);
                    }
                    c16060x33daecf = null;
                    str = str2;
                    cls = p60.q.class;
                    uVar = uVar2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "from gamestart");
                    h63.v[] vVarArr = h63.v.f360817d;
                    str = appId;
                    cls = p60.q.class;
                    uVar = uVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(appId, i18, 1, 0, null, null, 0, 0L, 248, null);
                    h63.e0 e0Var = h63.e0.f360758a;
                    java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
                    c16060x33daecf = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f, e0Var, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t[] tVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t.f167522d;
                z17 = false;
                v0Var.Di(2, 0, c16060x33daecf);
                uVar.Ri(p60.j.f433696h);
                r102 = c16060x33daecf;
            } else if (i19 == 2 || i19 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "state %s", uVar2.Ai().h());
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433712r, appId, 0, null, 12, null), p60.q.class, null);
                ((i63.b0) i95.n0.c(i63.b0.class)).Di();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N22 = o6Var.N2();
                ce.g gVar2 = N22 != null ? (ce.g) N22.B1(ce.g.class) : null;
                if (gVar2 != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new ce.v((ce.o) gVar2));
                }
                ((p60.u) i95.n0.c(p60.u.class)).getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = p60.u.f433732g;
                if (o4Var2.getBoolean("isPushing", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "startPush: isPushing return");
                    i17 = 2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "startPush");
                    ((p60.u) i95.n0.c(p60.u.class)).getClass();
                    o4Var2.putBoolean("isPushing", true);
                    i63.b0 b0Var = (i63.b0) i95.n0.c(i63.b0.class);
                    b0Var.m134805x360802();
                    b0Var.f370521x = kk.k.g(java.lang.String.format(java.util.Locale.US, "%s%d", "MicroMsgGameLiveAudio", java.lang.Integer.valueOf(o6Var.u0().f128812x0)).getBytes());
                    i17 = 2;
                    b0Var.f370504d = ((ku5.t0) ku5.t0.f394148d).o(java.lang.String.format("gamelive_audio_mix_%s", b0Var.f370521x), 2, 2, new java.util.concurrent.LinkedBlockingQueue());
                    fa1.s sVar = (fa1.s) o6Var.C0().z1(fa1.s.class);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "start appbrand audio %s %s", sVar, b0Var.f370521x);
                    b0Var.f370520w = new java.lang.ref.WeakReference(sVar);
                    b0Var.f370516s = false;
                    b0Var.f370504d.execute(new i63.v(b0Var));
                    b0Var.f370504d.execute(new i63.w(b0Var));
                    if (((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f433733d).mo141623x754a37bb()).booleanValue()) {
                        try {
                            b0Var.f370512o = com.p314xaae8f345.mm.vfs.w6.K("/sdcard/pcm/mix.pcm", false);
                        } catch (java.io.FileNotFoundException unused) {
                        }
                    }
                    b0Var.f370510m.b(44100, (short) 2);
                    b0Var.f370515r = b0Var.f370513p.getStreamVolume(3);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, b0Var.f370518u);
                    if (!b0Var.Ai()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671) b0Var.f370522y).b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b0Var);
                    }
                    ((k63.s) i95.n0.c(k63.s.class)).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433703f, null, 0, null, 14, null), p60.q.class, new h63.r0(v0Var));
                }
                if (uVar2.Ai() == p60.j.f433698m) {
                    java.lang.String str4 = ((km0.c) gm0.j1.p().a()).f390520a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getProcessName(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", "zbql:setAppBrandPackageName,".concat(str4));
                    p60.u.f433732g.putString("appbrandPackageName", str4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t[] tVarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t.f167522d;
                    obj = null;
                    v0Var.Di(i17, 0, null);
                    v0Var.Di(1, 0, null);
                } else {
                    obj = null;
                }
                uVar2.Ri(p60.j.f433696h);
                r102 = obj;
                cls = p60.q.class;
                str = appId;
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandProcessService", "gameLiving onAppbrandEnterForeground,but state is wrong,state:%s", uVar2.Ai().h());
                cls = p60.q.class;
                str = appId;
                z17 = false;
                r102 = 0;
            }
            v0Var.f360820f = z17;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433706i, str, 0, null, 12, null), cls, r102);
            v0Var.f360822h = z17;
        }
    }

    @Override // ce.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void o(al1.b bVar) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2())) {
            super.o(bVar);
            return;
        }
        bVar.m2222xad580900(false);
        bVar.m2216x67d2e40e(0.0d);
        bVar.mo2219xf502931e(-1);
        bVar.mo2224x4c2b09dd(J().u0().f158812e);
    }

    @Override // ce.o, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void v() {
        super.v();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2())) {
            ((ni1.j) r(ni1.j.class)).d();
        }
        if (F() == null || !n91.t.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2())) {
            return;
        }
        G(ni1.j.class, new n91.m((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F()));
    }

    @Override // ce.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void z(android.view.View view) {
        super.z(view);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).mo32091x9a3f0ba2())) {
            android.view.View view2 = new android.view.View(I());
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = this.f122218f;
            c3895x4edfdd1b.addView(view2, c3895x4edfdd1b.indexOfChild(this.f122221i), new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.view.View view3 = new android.view.View(I());
            view3.setBackgroundDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Integer.MIN_VALUE, 0}));
            int h17 = com.p314xaae8f345.mm.ui.bl.h(I()) + i65.a.f(I(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561555lv);
            this.f122218f.addView(view3, new android.widget.FrameLayout.LayoutParams(-1, h17));
            ae.q qVar = (ae.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).U1().z1(ae.q.class);
            if (qVar != null) {
                yd.u F0 = ((ae.a) qVar).F0();
                if (F0.f542500c != null && F0.f542500c.f542472a != null) {
                    yd.d0 d0Var = F0.f542500c.f542472a;
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) d0Var.getLayoutParams();
                    layoutParams.topMargin = h17;
                    layoutParams.bottomMargin = 52;
                    d0Var.setLayoutParams(layoutParams);
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) F()).C1().d(new pa1.s(this));
        }
    }
}
