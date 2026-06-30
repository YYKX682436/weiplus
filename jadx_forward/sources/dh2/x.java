package dh2;

/* loaded from: classes10.dex */
public final class x implements ah2.b, ah2.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f314000d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f314001e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f314002f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f314003g;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.a f314004h;

    /* renamed from: i, reason: collision with root package name */
    public final dh2.d0 f314005i;

    /* renamed from: m, reason: collision with root package name */
    public ah2.c f314006m;

    /* renamed from: n, reason: collision with root package name */
    public final dh2.w f314007n;

    /* renamed from: o, reason: collision with root package name */
    public int f314008o;

    /* renamed from: p, reason: collision with root package name */
    public long f314009p;

    /* renamed from: q, reason: collision with root package name */
    public long f314010q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f314011r;

    /* renamed from: s, reason: collision with root package name */
    public final hh2.a f314012s;

    /* renamed from: t, reason: collision with root package name */
    public final hh2.a f314013t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f314014u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f314015v;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e controllerStore, gk2.e buContext, com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 trtcCloud, p3325xe03a0797.p3326xc267989b.y0 liveScope, zh2.a singService, dh2.d0 singScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controllerStore, "controllerStore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcCloud, "trtcCloud");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveScope, "liveScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singService, "singService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singScene, "singScene");
        this.f314000d = controllerStore;
        this.f314001e = buContext;
        this.f314002f = trtcCloud;
        this.f314003g = liveScope;
        this.f314004h = singService;
        this.f314005i = singScene;
        this.f314007n = new dh2.w(this);
        hh2.a bVar = ((om2.l) buContext.a(om2.l.class)).O6() == 2 ? new ih2.b(ya.b.f77498x4b14672) : new ih2.e();
        bVar.b((om2.m) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) buContext.a(om2.e.class)).f427830p).mo144003x754a37bb());
        bVar.a(new dh2.v(this));
        this.f314012s = bVar;
        hh2.a bVar2 = ((om2.l) buContext.a(om2.l.class)).O6() == 2 ? new ih2.b("ear") : new ih2.e();
        bVar2.b((om2.m) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) buContext.a(om2.e.class)).f427830p).mo144003x754a37bb());
        this.f314013t = bVar2;
        this.f314014u = new java.util.concurrent.ConcurrentHashMap();
        this.f314015v = new java.util.concurrent.ConcurrentHashMap();
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.o(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.u(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.g(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.k(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.s(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.q(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(liveScope, null, null, new dh2.i(this, null), 3, null);
    }

    @Override // jh2.a
    public void B5(java.lang.String songUniqueId, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        c();
        if (d(songUniqueId)) {
            dh2.d0 d0Var = this.f314005i;
            java.util.Objects.toString(d0Var);
            int ordinal = d0Var.ordinal();
            gk2.e eVar = this.f314001e;
            if (ordinal == 0) {
                om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
                if (iVar != null) {
                    int i17 = (int) f17;
                    synchronized (iVar.f427857d) {
                        iVar.f427857d.f457513d = i17;
                    }
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                return;
            }
            mm2.m6 m6Var = (mm2.m6) eVar.a(mm2.m6.class);
            int i18 = (int) f17;
            m6Var.F = i18;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.G).k(java.lang.Integer.valueOf(i18));
        }
    }

    @Override // jh2.a
    public void E0(java.lang.String songUniqueId, jh2.d errorParams) {
        gh2.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorParams, "errorParams");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "notifyChorusSingError songUniqueId: ".concat(songUniqueId));
        if (d(songUniqueId)) {
            boolean e17 = e();
            zh2.a aVar = this.f314004h;
            gk2.e eVar = this.f314001e;
            if (!e17) {
                b("notifyChorusSingError");
                java.util.List list = (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.g) eVar.a(om2.g.class)).A).mo144003x754a37bb();
                if (list != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.controller.FinderLiveKTVSingController");
                    ((ch2.o2) aVar).v7(list, false);
                    return;
                }
                return;
            }
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar != null) {
                zh2.a.b3(aVar, iVar.f427854a, null, 2, null);
            }
            b("notifyChorusSingError");
            pm0.v.X(dh2.a.f313950d);
            int ordinal = errorParams.f381340a.ordinal();
            if (ordinal == 0) {
                bVar = gh2.b.f353395o;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                bVar = gh2.b.f353394n;
            }
            ((gh2.f) eVar.a(gh2.f.class)).O6(songUniqueId, bVar, new dh2.b(errorParams));
        }
    }

    @Override // jh2.a
    public void I4(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "notifyFinishSing songUniqueId: " + songUniqueId + ", role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            om2.i iVar = ((om2.g) this.f314001e.a(om2.g.class)).f427840n;
            if (iVar != null) {
                this.f314004h.x5(iVar.f427854a, null);
            }
            b("notifyFinishSing");
        }
    }

    @Override // jh2.a
    public void M4(java.lang.String songUniqueId, int i17, boolean z17, float f17) {
        om2.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        if (e()) {
            if (zl2.q4.f555466a.E()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "hitGrove , grove: " + i17 + " hit: " + z17 + " timeStamp: " + f17 + " songUniqueId: " + songUniqueId + " cur: " + c());
            }
            if (d(songUniqueId) && (iVar = ((om2.g) this.f314001e.a(om2.g.class)).f427840n) != null) {
                int i18 = (int) f17;
                synchronized (iVar.f427858e) {
                    r45.ga4 ga4Var = iVar.f427858e;
                    ga4Var.f456570d = i17;
                    ga4Var.f456571e = i18;
                    ga4Var.f456572f = 20;
                    ga4Var.f456573g = z17;
                }
                synchronized (iVar.f427857d) {
                    iVar.f427857d.f457513d = i18;
                }
            }
        }
    }

    @Override // bh2.b
    public void P1(java.lang.String songUniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onPlayBGMEnd , songUniqueId: " + songUniqueId + " errorCode: " + i17 + " cur: " + c() + " role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f314000d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
            if2.z.f372686a.i(c14197x319b1b9e, new bh2.d(c14197x319b1b9e, songUniqueId, i17));
        }
    }

    @Override // jh2.a
    public void R0(java.lang.String songUniqueId, int i17) {
        om2.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onSongInfoPaserCallback songUniqueId: " + songUniqueId + " totalSentence: " + i17 + ", role: " + this.f314011r);
        if (e() && d(songUniqueId) && (iVar = ((om2.g) this.f314001e.a(om2.g.class)).f427840n) != null) {
            iVar.f427860g = i17;
        }
    }

    public final void a() {
        ah2.c cVar = this.f314006m;
        if (!(cVar instanceof dh2.b0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("KTVSongPlayManager", "setEngineVolume: engine is not LiveKTVSingEngine");
            return;
        }
        dh2.b0 b0Var = (dh2.b0) cVar;
        java.util.Collection values = this.f314015v.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(values);
        dh2.w wVar = this.f314007n;
        int intValue = num != null ? num.intValue() : wVar.a();
        java.util.Collection values2 = this.f314014u.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        java.lang.Integer num2 = (java.lang.Integer) kz5.n0.o0(values2);
        int intValue2 = num2 != null ? num2.intValue() : wVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "setVolume playoutVolume: " + intValue + ", publishVolume: " + intValue2);
        b0Var.f313964k.d(intValue, intValue2);
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        tn0.w0 Q6;
        vn0.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onPlayBGMStart, songUniqueId: " + songUniqueId + " errorCode: " + i17 + " cur: " + c() + " role: " + this.f314011r);
        a();
        if (e() && d(songUniqueId)) {
            gk2.e eVar2 = this.f314001e;
            om2.i iVar = ((om2.g) eVar2.a(om2.g.class)).f427840n;
            if (iVar != null) {
                iVar.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            }
            om2.i iVar2 = ((om2.g) eVar2.a(om2.g.class)).f427840n;
            if (iVar2 != null) {
                iVar2.k(0, 0, 0.0f, 0);
            }
            om2.i iVar3 = ((om2.g) eVar2.a(om2.g.class)).f427840n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f314000d;
            if (iVar3 != null) {
                ch2.o2 o2Var = (ch2.o2) c14197x319b1b9e.m56798x25fe639c(ch2.o2.class);
                iVar3.h((o2Var == null || (Q6 = o2Var.Q6()) == null || (eVar = Q6.f502297m) == null) ? -1 : eVar.c());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
            if2.z.f372686a.i(c14197x319b1b9e, new bh2.g(c14197x319b1b9e, songUniqueId, i17));
        }
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "clearStates, source: " + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "destroyCurSingEngine, source: " + str);
        ah2.c cVar = this.f314006m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "stop");
            jh2.c cVar2 = b0Var.f313959f;
            if (cVar2 != null) {
                cVar2.e(null);
            }
            jh2.c cVar3 = b0Var.f313959f;
            if (cVar3 != null) {
                cVar3.j();
            }
            b0Var.f313964k.mo10546x5cd39ffa();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = b0Var.f313962i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        this.f314006m = null;
        this.f314011r = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "currChorusRole: null");
    }

    public final java.lang.String c() {
        r45.ia4 ia4Var;
        int ordinal = this.f314005i.ordinal();
        gk2.e eVar = this.f314001e;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((mm2.m6) eVar.a(mm2.m6.class)).N6();
            }
            throw new jz5.j();
        }
        om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
        if (iVar == null || (ia4Var = iVar.f427856c) == null) {
            return null;
        }
        return ia4Var.f458403e;
    }

    public final boolean d(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c(), str);
    }

    public final boolean e() {
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole = this.f314011r;
        return tXChorusRole == null || tXChorusRole == com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger;
    }

    @Override // jh2.a
    public void e4(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "notifySingSuccess songUniqueId: " + songUniqueId + ", role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            ((gh2.f) this.f314001e.a(gh2.f.class)).O6(songUniqueId, gh2.b.f353388e, new dh2.e(this));
        }
    }

    @Override // jh2.a
    public void e6(java.lang.String songUniqueId, jh2.d errorParams) {
        gh2.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorParams, "errorParams");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "notifySingError songUniqueId: ".concat(songUniqueId));
        if (d(songUniqueId)) {
            boolean e17 = e();
            zh2.a aVar = this.f314004h;
            gk2.e eVar = this.f314001e;
            if (!e17) {
                b("notifySingError");
                java.util.List list = (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.g) eVar.a(om2.g.class)).A).mo144003x754a37bb();
                if (list != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.controller.FinderLiveKTVSingController");
                    ((ch2.o2) aVar).v7(list, false);
                    return;
                }
                return;
            }
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar != null) {
                zh2.a.b3(aVar, iVar.f427854a, null, 2, null);
            }
            b("notifySingError");
            pm0.v.X(dh2.c.f313965d);
            int ordinal = errorParams.f381340a.ordinal();
            if (ordinal == 0) {
                bVar = gh2.b.f353395o;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                bVar = gh2.b.f353394n;
            }
            ((gh2.f) eVar.a(gh2.f.class)).O6(songUniqueId, bVar, new dh2.d(errorParams));
        }
    }

    public void f() {
        ah2.c cVar;
        ah2.c cVar2 = this.f314006m;
        boolean z17 = false;
        if (cVar2 != null && ((dh2.b0) cVar2).b()) {
            z17 = true;
        }
        if (!z17 || (cVar = this.f314006m) == null) {
            return;
        }
        dh2.b0 b0Var = (dh2.b0) cVar;
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f313960g) + b0Var.f313961h;
        ah2.d dVar = b0Var.f313958e;
        if (dVar != null) {
            om2.s sVar = b0Var.f313956c;
            dVar.B5(sVar != null ? sVar.a() : "", (float) currentTimeMillis);
        }
    }

    @Override // jh2.a
    public void f6(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "notifyVoiceEnd songUniqueId: " + songUniqueId + ", role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar = this.f314001e;
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar != null) {
                r45.y84 y84Var = r45.y84.LIVE_KTV_SING_STATE_END;
                java.util.List list = ((om2.g) eVar.a(om2.g.class)).f427844r;
                iVar.j(y84Var, list != null ? (r45.yx1) kz5.n0.a0(list, 1) : null);
            }
            om2.i iVar2 = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar2 != null) {
                this.f314004h.r(iVar2.f427854a, null);
            }
        }
    }

    public void g(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        if (e() && tRTCAudioFrame != null) {
            ah2.c cVar = this.f314006m;
            if (cVar != null && ((dh2.b0) cVar).b()) {
                ah2.c cVar2 = this.f314006m;
                if (cVar2 != null) {
                    dh2.b0 b0Var = (dh2.b0) cVar2;
                    com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole = b0Var.f313955b;
                    if ((tXChorusRole == null || tXChorusRole == com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger) && b0Var.b()) {
                        long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f313960g) + b0Var.f313961h;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "onScoreProcess offsetTime: " + currentTimeMillis + " localBGMProgress: " + b0Var.f313963j);
                        om2.s sVar = b0Var.f313956c;
                        if ((sVar == null || sVar.f427912b.f427902c) ? false : true) {
                            ah2.d dVar = b0Var.f313958e;
                            if (dVar != null) {
                                dVar.M4(sVar != null ? sVar.a() : "", 0, false, (float) currentTimeMillis);
                            }
                        } else {
                            jh2.c cVar3 = b0Var.f313959f;
                            if (cVar3 != null) {
                                cVar3.g(tRTCAudioFrame, currentTimeMillis, ((dh2.w) b0Var.f313954a).c());
                            }
                        }
                    }
                }
                if (this.f314007n.c()) {
                    return;
                }
                this.f314012s.c(tRTCAudioFrame);
            }
        }
    }

    @Override // bh2.b
    public void g1(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onPlayBGMPause, songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            om2.i iVar = ((om2.g) this.f314001e.a(om2.g.class)).f427840n;
            if (iVar != null) {
                iVar.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f314000d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
            if2.z.f372686a.i(c14197x319b1b9e, new bh2.e(c14197x319b1b9e, songUniqueId));
        }
    }

    public void h(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame != null) {
            long j17 = tRTCAudioFrame.f57044x3492916;
            if (j17 - this.f314009p > (zl2.q4.f555466a.E() ? 1000L : 2000L)) {
                long m94459x78c9e9fe = com.p314xaae8f345.p2926x359365.C25481x77f18081.m94459x78c9e9fe();
                r45.w74 w74Var = new r45.w74();
                hn0.u uVar = hn0.u.f363970e;
                w74Var.f470477d = 256;
                r45.ua4 ua4Var = new r45.ua4();
                ua4Var.f468699d = m94459x78c9e9fe;
                long j18 = this.f314010q;
                this.f314010q = 1 + j18;
                ua4Var.f468700e = j18;
                w74Var.f470478e = ua4Var;
                tRTCAudioFrame.f57042xf0df6fda = w74Var.mo14344x5f01b1f6();
                this.f314009p = j17;
                if (this.f314010q >= com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    this.f314010q = 0L;
                }
            }
        }
    }

    public void i(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        byte[] bArr;
        r45.ua4 ua4Var;
        if (tRTCAudioFrame == null || (bArr = tRTCAudioFrame.f57042xf0df6fda) == null) {
            return;
        }
        try {
            r45.w74 w74Var = new r45.w74();
            try {
                w74Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            int i17 = (int) w74Var.f470477d;
            hn0.u uVar = hn0.u.f363970e;
            if (!pm0.v.z(i17, 256) || (ua4Var = w74Var.f470478e) == null) {
                return;
            }
            long j17 = ua4Var.f468699d;
            if (j17 > 0) {
                long m94459x78c9e9fe = com.p314xaae8f345.p2926x359365.C25481x77f18081.m94459x78c9e9fe();
                if (m94459x78c9e9fe >= j17) {
                    long j18 = m94459x78c9e9fe - j17;
                    if (str != null) {
                        ((gh2.f) this.f314001e.a(gh2.f.class)).N6(str, j18);
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KTVSongPlayManager", "handleSeiMessage onRemoteUserAudioFrame Exception:" + e18.getMessage());
        }
    }

    public void j() {
        ah2.c cVar = this.f314006m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "pause");
            b0Var.f313964k.mo10548x65825f6();
        }
    }

    public void k(dh2.c0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "resetVolume source: " + source);
        this.f314014u.remove(source);
        this.f314015v.remove(source);
        a();
    }

    public void l() {
        ah2.c cVar = this.f314006m;
        if (cVar != null) {
            dh2.b0 b0Var = (dh2.b0) cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "resume");
            b0Var.f313964k.mo10549xc84dc82d();
        }
    }

    public final void m(int i17) {
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVoiceCaptureVolume isMute: ");
        dh2.w wVar = this.f314007n;
        sb6.append(wVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", sb6.toString());
        if (wVar.c() || (mo30282x5f1b9a9c = this.f314002f.mo30282x5f1b9a9c()) == null) {
            return;
        }
        mo30282x5f1b9a9c.mo29063x49fdc1f0(i17);
    }

    public final void n(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "setVoiceEarCaptureVolume value: " + i17 + " mute: " + this.f314007n.c());
        this.f314002f.mo30282x5f1b9a9c().mo29065x5a036f6e((int) (((float) i17) * 0.8f));
    }

    public void o(java.lang.Integer num, java.lang.Integer num2, dh2.c0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (num != null) {
            num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
        }
        a();
    }

    @Override // bh2.b
    public void o2(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onPlayBGMStop, songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f314000d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
            if2.z.f372686a.i(c14197x319b1b9e, new bh2.h(c14197x319b1b9e, songUniqueId));
        }
    }

    public void p(om2.s songInfo, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSingSong isFinish: ");
        ah2.c cVar = this.f314006m;
        jh2.c cVar2 = null;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(((dh2.b0) cVar).f313964k.c()) : null);
        sb6.append(" role: ");
        sb6.append(tXChorusRole);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", sb6.toString());
        b("startSingSong");
        this.f314011r = tXChorusRole;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "currChorusRole: " + tXChorusRole);
        ah2.c cVar3 = this.f314006m;
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = this.f314002f;
        dh2.w wVar = this.f314007n;
        if (cVar3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "startSingSong, init LiveKTVSingEngine");
            this.f314006m = new dh2.b0(abstractC26786xbe57dcc8, wVar, tXChorusRole);
            this.f314009p = 0L;
            this.f314010q = 0L;
        } else if (tXChorusRole != null && (cVar3 instanceof dh2.b0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "updateChorusRole: " + tXChorusRole);
            ah2.c cVar4 = this.f314006m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.core.LiveKTVSingEngine");
            bh2.c cVar5 = ((dh2.b0) cVar4).f313964k;
            if (cVar5 instanceof bh2.v) {
                bh2.v vVar = (bh2.v) cVar5;
                vVar.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateChorusRole role: ");
                sb7.append(tXChorusRole);
                sb7.append(" musicPlayer: ");
                com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = vVar.f102430e;
                sb7.append(abstractC26790x777b55bc);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, sb7.toString());
                vVar.f102437l = tXChorusRole;
                if (abstractC26790x777b55bc != null) {
                    abstractC26790x777b55bc.mo30456x37e4393e(tXChorusRole, vVar.f102432g);
                }
            }
        }
        bh2.w wVar2 = wVar.d() ? bh2.w.f102439e : bh2.w.f102438d;
        ah2.c cVar6 = this.f314006m;
        if (cVar6 != null) {
            dh2.b0 b0Var = (dh2.b0) cVar6;
            java.lang.String concat = "LiveKTVSingEngine_".concat(songInfo.a());
            b0Var.f313957d = concat;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(concat, "start channel: " + wVar2 + ", songData: " + songInfo);
            b0Var.f313956c = songInfo;
            if (zl2.q4.f555466a.E() && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85321k).mo141623x754a37bb()).r()).intValue() == 1) {
                r26.n0.D(songInfo.a(), "000arL322n7lX4", false, 2, null);
            }
            om2.p pVar = songInfo.f427912b;
            if (pVar.f427902c) {
                com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole2 = b0Var.f313955b;
                if (tXChorusRole2 == null || tXChorusRole2 == com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger) {
                    cVar2 = ((om2.l) ((dh2.w) b0Var.f313954a).f313999a.f314001e.a(om2.l.class)).P6() == 2 ? new kh2.r() : new kh2.l();
                    cVar2.a(new om2.u(songInfo.a(), pVar));
                }
            }
            b0Var.f313959f = cVar2;
            b0Var.f313964k.b(wVar2, songInfo);
        }
        ah2.c cVar7 = this.f314006m;
        if (cVar7 != null) {
            dh2.b0 b0Var2 = (dh2.b0) cVar7;
            b0Var2.f313958e = this;
            b0Var2.f313964k.g(new dh2.a0(this, b0Var2, new p3321xbce91901.jvm.p3324x21ffc6bd.c0()));
            jh2.c cVar8 = b0Var2.f313959f;
            if (cVar8 != null) {
                cVar8.e(new jh2.f(this));
            }
        }
        abstractC26786xbe57dcc8.mo30282x5f1b9a9c().mo29046x52f4e3f3(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) wVar.f313999a.f314001e.a(om2.e.class)).f427828n).mo144003x754a37bb()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "observeVoiceVolumeChange: " + wVar.b());
        m(wVar.b());
        n(wVar.b());
    }

    @Override // bh2.b
    public void s0(java.lang.String songUniqueId, long j17) {
        tn0.w0 Q6;
        vn0.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onPlayBGMResumed, progressMs: " + j17 + " songUniqueId: " + songUniqueId + " cur: " + c() + " role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar2 = this.f314001e;
            om2.i iVar = ((om2.g) eVar2.a(om2.g.class)).f427840n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f314000d;
            if (iVar != null) {
                ch2.o2 o2Var = (ch2.o2) c14197x319b1b9e.m56798x25fe639c(ch2.o2.class);
                iVar.f((o2Var == null || (Q6 = o2Var.Q6()) == null || (eVar = Q6.f502297m) == null) ? -1 : eVar.c());
            }
            om2.i iVar2 = ((om2.g) eVar2.a(om2.g.class)).f427840n;
            if (iVar2 != null) {
                iVar2.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
            if2.z.f372686a.i(c14197x319b1b9e, new bh2.f(c14197x319b1b9e, songUniqueId, j17));
        }
    }

    @Override // jh2.a
    public void v1(java.lang.String songUniqueId, int i17, int i18, float f17, int i19, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "scoreLineResult, songUniqueId: " + songUniqueId + " curScore: " + i17 + " totalScore: " + i18 + " avgScore: " + f17 + " sentenceIndex: " + i19 + " cur: " + c() + ", role: " + this.f314011r);
        if (e() && d(songUniqueId)) {
            gk2.e eVar = this.f314001e;
            om2.i iVar = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar != null) {
                if (i17 < 85 && 70 <= i17) {
                    iVar.f427861h++;
                } else if (i17 >= 85) {
                    iVar.f427862i++;
                }
            }
            om2.i iVar2 = ((om2.g) eVar.a(om2.g.class)).f427840n;
            if (iVar2 != null) {
                iVar2.k(i17, i18, f17, i19);
            }
        }
    }

    @Override // bh2.b
    public void y2(java.lang.String songUniqueId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        if (e() && !d(songUniqueId)) {
            c();
        }
    }
}
