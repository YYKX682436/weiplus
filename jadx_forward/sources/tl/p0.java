package tl;

/* loaded from: classes12.dex */
public class p0 implements com.p314xaae8f345.mm.p944x882e457a.g1 {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f501599w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f501600x;

    /* renamed from: b, reason: collision with root package name */
    public f25.m0 f501602b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f501604d;

    /* renamed from: f, reason: collision with root package name */
    public qi3.b0 f501606f;

    /* renamed from: g, reason: collision with root package name */
    public cg0.d f501607g;

    /* renamed from: k, reason: collision with root package name */
    public long f501611k;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f501615o;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.f1 f501618r;

    /* renamed from: t, reason: collision with root package name */
    public final fl.c f501620t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Runnable f501622v;

    /* renamed from: a, reason: collision with root package name */
    public tl.d f501601a = null;

    /* renamed from: c, reason: collision with root package name */
    public tl.o0 f501603c = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f501605e = "";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f501608h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f501609i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f501610j = false;

    /* renamed from: l, reason: collision with root package name */
    public long f501612l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f501613m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f501614n = false;

    /* renamed from: p, reason: collision with root package name */
    public int f501616p = 0;

    /* renamed from: q, reason: collision with root package name */
    public to.c f501617q = to.c.UNKNOWN;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.e1 f501619s = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f501621u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new tl.k0(this), true);

    static {
        f501599w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20069xf198100e()) == 1;
        f501600x = false;
    }

    public p0(android.content.Context context, boolean z17) {
        this.f501615o = false;
        this.f501615o = z17;
        boolean z18 = f501599w;
        if (z18) {
            this.f501620t = new fl.c(new tl.j0(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "new SceneVoiceRecorder, useSpeex: %s, useBlurtooth: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public java.lang.String a() {
        return this.f501605e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void b(com.p314xaae8f345.mm.p944x882e457a.e1 e1Var) {
        this.f501619s = e1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public long c() {
        long j17 = this.f501612l;
        if (j17 == 0) {
            return 0L;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return android.os.SystemClock.elapsedRealtime() - j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: cancel */
    public boolean mo47958xae7a2e7a() {
        tl.d dVar;
        synchronized (this) {
            dVar = this.f501601a;
        }
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of cancel[%s]! stop synchronized Record:" + this.f501605e, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
            dVar.mo166726xad07d6f3();
            l();
        }
        if (f501599w) {
            this.f501620t.C();
        }
        if (!m() || this.f501606f == null) {
            w21.x0.p(this.f501605e);
            w21.p0.Bi().e();
        } else {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f501606f);
        }
        if (this.f501601a != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f501605e) && !this.f501615o) {
            java.lang.String str = this.f501605e;
            long c17 = c();
            int a17 = this.f501601a.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(c17);
            stringBuffer.append(",");
            stringBuffer.append(1);
            stringBuffer.append(",");
            stringBuffer.append(a17);
            g0Var.mo68478xbd3cda5f(10513, stringBuffer.toString());
        }
        this.f501605e = "";
        this.f501606f = null;
        this.f501607g = null;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int d() {
        tl.d dVar = this.f501601a;
        if (dVar == null) {
            return 0;
        }
        return dVar.d();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int e() {
        if (this.f501615o) {
            return 1;
        }
        to.c cVar = this.f501617q;
        if (cVar == to.c.PCM || cVar == to.c.AMR) {
            return 0;
        }
        return cVar == to.c.SILK ? 2 : -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f501621u;
        if (b4Var != null) {
            b4Var.d();
            this.f501621u.mo50302x6b17ad39(null);
        }
        if (f501599w) {
            this.f501620t.C();
        }
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of stop2[%s]! stop synchronized Record:" + this.f501605e, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
            tl.d dVar = this.f501601a;
            if (dVar != null) {
                dVar.mo166726xad07d6f3();
                l();
            }
        }
        this.f501616p = -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public boolean g(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "Start Record to  " + str);
        mo47959x6761d4f();
        this.f501608h = f9Var;
        this.f501604d = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f501611k = android.os.SystemClock.elapsedRealtime();
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Start Record toUser null");
            return false;
        }
        this.f501609i = str.equals("_USER_FOR_THROWBOTTLE_");
        if (str.equals("medianote")) {
            this.f501610j = (c01.z1.p() & 16384) == 0;
        }
        if (this.f501615o) {
            this.f501605e = w21.x0.g(str, "spx_");
        } else if (this.f501609i) {
            this.f501605e = w21.g1.n0(c01.z1.r(), "amr_");
        } else if (this.f501610j) {
            this.f501605e = w21.g1.n0("medianote", "amr_");
        } else if (m() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(str)) {
            java.lang.String n07 = w21.g1.n0(c01.z1.r(), "amr_");
            this.f501605e = n07;
            cg0.d dVar = new cg0.d(str, n07);
            this.f501607g = dVar;
            dVar.f122590j = this;
            dVar.f122589i = 0;
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            cg0.d params = this.f501607g;
            ((ig0.o) fVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            this.f501606f = new jg0.x(params);
            dg0.f fVar2 = (dg0.f) i95.n0.c(dg0.f.class);
            qi3.b0 b0Var = this.f501606f;
            ((ig0.o) fVar2).getClass();
            if (b0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsgFeatureService", "initSync task is null");
            } else {
                if (!(b0Var instanceof qi3.c)) {
                    throw new java.lang.UnsupportedOperationException("initSync only support BaseSendMsgTask Type");
                }
                pu.t0 a17 = pu.t0.f439909i.a();
                qi3.c cVar = (qi3.c) b0Var;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
                cVar.f445211g = b17;
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439911f).mo141623x754a37bb(), null, new pu.j0(cVar, null), 1, null);
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new ig0.h(b17, null), 1, null);
                }
            }
        } else {
            this.f501605e = w21.x0.g(str, "amr_");
        }
        java.lang.String str2 = this.f501605e;
        if (str2 == null || str2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Start Record DBError fileName:%s", this.f501605e);
            return false;
        }
        this.f501614n = false;
        this.f501602b = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.k0.f340635c, null);
        if (f501599w) {
            fl.c cVar2 = this.f501620t;
            cVar2.getClass();
            ym1.f.f544667h.h(cVar2, "record");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceRecorderAudioManager", "some one has been request audio to record");
            boolean b18 = an1.c.f90366a.b();
            yz5.l lVar = cVar2.f345226k;
            if (!b18 || !an1.c.f90369d) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            } else if (cVar2.k()) {
                cVar2.f345228m = true;
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                cVar2.r("record", 1);
            } else {
                cVar2.f345228m = true;
                if (cVar2.r("record", 4) != -1) {
                    cVar2.f345227l.mo50307xb9e94560(0, 1000L);
                } else {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            }
        } else {
            n();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void h(com.p314xaae8f345.mm.p944x882e457a.f1 f1Var) {
        this.f501618r = f1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public boolean i() {
        tl.d dVar = this.f501601a;
        return dVar != null && dVar.mo166724x2fe4f2e8() == 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 j() {
        return this.f501608h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int k() {
        return this.f501613m;
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "abandonFocus: ");
        if (this.f501602b != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f501602b);
            this.f501602b = null;
        }
    }

    public final boolean m() {
        return ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(this.f501604d);
    }

    public final void n() {
        if (this.f501614n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] return mHasBeginRec is true!");
            return;
        }
        this.f501614n = true;
        if (this.f501615o) {
            this.f501617q = to.c.SPEEX;
            this.f501601a = new w21.k0();
        } else {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
            wo.c cVar = wo.v1.f529356c;
            boolean z17 = cVar.f529138i != 1;
            if (!sharedPreferences.contains("settings_voicerecorder_mode")) {
                sharedPreferences.edit().putBoolean("settings_voicerecorder_mode", z17).commit();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", java.lang.Integer.valueOf(cVar.f529138i), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("settings_voicerecorder_mode", z17)));
            boolean z18 = sharedPreferences.getBoolean("settings_voicerecorder_mode", z17);
            to.c cVar2 = to.c.PCM;
            to.c cVar3 = to.c.AMR;
            this.f501617q = z18 ? cVar2 : cVar3;
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceFormat");
            java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceFormatToQQ");
            if (this.f501617q == cVar2) {
                if (4 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 4) && tl.w0.f501708b) {
                    this.f501617q = to.c.SILK;
                }
                java.lang.String str = this.f501604d;
                if (str != null && str.endsWith("@qqim")) {
                    this.f501617q = cVar3;
                }
            }
            if (this.f501617q == cVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode, still in pcm mode, force to amr mode");
                this.f501617q = cVar3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s isSilkSoLoadSuccess:%b", d17, d18, this.f501617q, java.lang.Boolean.valueOf(tl.w0.f501708b));
            this.f501601a = new w21.f1(this.f501617q);
        }
        tl.l0 l0Var = new tl.l0(this);
        tl.d dVar = this.f501601a;
        if (dVar != null) {
            dVar.b(l0Var);
        }
        tl.m0 m0Var = new tl.m0(this);
        this.f501622v = m0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(m0Var, 600L);
        this.f501603c = new tl.o0(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] mRecordStartRunnable has post! threadPool:%s", ((ku5.t0) ku5.t0.f394149e).f());
        ((ku5.t0) ku5.t0.f394148d).g(this.f501603c);
        this.f501616p = 1;
        this.f501621u.c(3000L, 3000L);
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: reset */
    public void mo47959x6761d4f() {
        tl.d dVar = this.f501601a;
        if (dVar != null) {
            dVar.mo166726xad07d6f3();
            l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Reset recorder.stopReocrd");
        }
        this.f501605e = "";
        this.f501611k = 0L;
        this.f501603c = null;
        this.f501617q = to.c.UNKNOWN;
        this.f501616p = 0;
        this.f501612l = 0L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: stop */
    public boolean mo47960x360802() {
        tl.d dVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f501621u;
        if (b4Var != null) {
            b4Var.d();
            this.f501621u.mo50302x6b17ad39(null);
        }
        if (f501599w) {
            this.f501620t.C();
        }
        int c17 = (int) c();
        this.f501613m = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "stop Record : %s, len: %s", this.f501605e, java.lang.Integer.valueOf(c17));
        if (this.f501601a != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f501605e) && !this.f501615o) {
            java.lang.String str = this.f501605e;
            long j17 = this.f501613m;
            int a17 = this.f501601a.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(j17);
            stringBuffer.append(",2,");
            stringBuffer.append(a17);
            g0Var.mo68478xbd3cda5f(10513, stringBuffer.toString());
        }
        synchronized (this) {
            dVar = this.f501601a;
            if (dVar == null) {
                dVar = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "stop synchronized Record:%s, recorder:%s, lock[%s] of stop[%s]!", this.f501605e, dVar, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this);
        if (dVar != null) {
            dVar.mo166726xad07d6f3();
        }
        l();
        boolean z17 = false;
        if (this.f501616p != 2) {
            if (!m() || this.f501606f == null) {
                w21.x0.b(this.f501605e);
            } else {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f501606f);
            }
            this.f501605e = null;
            this.f501606f = null;
            this.f501607g = null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Stop ");
            sb6.append(this.f501605e);
            sb6.append(" by not onPart: ");
            long j18 = this.f501611k;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", sb6.toString());
        } else {
            long j19 = this.f501613m;
            if (j19 < 800 || (this.f501609i && j19 < 1000)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.f501605e + " by voiceLen: " + this.f501613m);
                if (!m() || this.f501606f == null) {
                    w21.x0.b(this.f501605e);
                } else {
                    ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f501606f);
                }
                this.f501605e = "";
                this.f501606f = null;
                this.f501607g = null;
            } else {
                if (!m() || this.f501606f == null) {
                    w21.x0.t(this.f501605e, this.f501613m, 0, this.f501608h);
                    w21.p0.Bi().e();
                } else {
                    if (this.f501607g == null) {
                        cg0.d dVar2 = new cg0.d(this.f501604d, this.f501605e);
                        this.f501607g = dVar2;
                        dVar2.f122590j = this;
                        dVar2.f122589i = 0;
                    }
                    cg0.d dVar3 = this.f501607g;
                    dVar3.f122588h = this.f501613m;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f501608h;
                    if (f9Var != null) {
                        dVar3.f122591k = g45.b.f350379a.b(f9Var);
                    }
                    ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).hj(this.f501606f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "Stop file success: " + this.f501605e);
                z17 = true;
            }
            this.f501605e = "";
            this.f501606f = null;
            this.f501607g = null;
        }
        this.f501616p = -1;
        return z17;
    }
}
