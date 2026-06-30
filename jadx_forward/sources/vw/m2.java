package vw;

@j95.b
/* loaded from: classes11.dex */
public final class m2 extends i95.w implements rv.k3 {

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f522219f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f522220g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f522221h;

    /* renamed from: i, reason: collision with root package name */
    public long f522222i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f522223m;

    /* renamed from: w, reason: collision with root package name */
    public long f522233w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f522217d = "MicroMsg.FlutterBizFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f522218e = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f522224n = jz5.h.b(new vw.y1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f522225o = jz5.h.b(new vw.l2(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f522226p = jz5.h.b(new vw.a1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f522227q = jz5.h.b(new vw.z0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f522228r = jz5.h.b(new vw.j1(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f522229s = jz5.h.b(vw.i2.f522196d);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f522230t = jz5.h.b(new vw.x1(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f522231u = jz5.h.b(vw.l1.f522211d);

    /* renamed from: v, reason: collision with root package name */
    public final long f522232v = 15000;

    public static final void wi(vw.m2 m2Var) {
        m2Var.getClass();
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32266, new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17 = yw.q3.f547970a.c();
            if (c17 != null) {
                c17.s(vw.i1.f522195a);
            }
        }
    }

    public rv.l3 Ai() {
        long j17;
        java.lang.String str;
        java.lang.String str2;
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("FinderMyTab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        r45.f03 I0 = nk6.I0("FinderMyTab");
        java.util.Objects.toString(vs2Var);
        java.util.Objects.toString(I0);
        boolean z17 = (vs2Var == null || I0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(I0.f455422f)) ? false : true;
        if (!z17 || vs2Var == null) {
            j17 = 0;
        } else {
            java.lang.String str3 = vs2Var.f470023h;
            j17 = str3 != null && r26.i0.y(str3, "BizPhotoLocal_", false) ? 10L : 20L;
        }
        java.lang.String str4 = "";
        if (I0 == null || (str = I0.f455422f) == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", ";", false);
        if (vs2Var != null && (str2 = vs2Var.f470032t) != null) {
            str4 = str2;
        }
        java.lang.String t18 = r26.i0.t(str4, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "collectRedDotInfo result: hasRedDot=" + z17 + ", redDotType=" + j17 + ", redDotContent=" + t17 + ", redDotId=" + t18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = nk6.L0("FinderMentionMyTab");
        return new rv.l3(z17, j17, t17, t18, (L02 != null ? L02.f65874xb5f7102a : null) != null, nk6.I0("FinderMentionMyTab") != null ? r0.f455421e : 0L);
    }

    public void Bi(android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, boolean z17, rv.f3 f3Var, rv.i3 i3Var) {
        ij();
        p3325xe03a0797.p3326xc267989b.l.d(this.f522218e, null, null, new vw.d1(context, i3Var, i17, i18, str, str2, i19, z17, f3Var, null), 3, null);
    }

    public boolean Di() {
        boolean z17;
        synchronized (yw.q3.f547970a) {
            z17 = yw.q3.f547973d;
        }
        return z17;
    }

    public void Ni() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3 n3Var = null;
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            if (Zi()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").getLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
                yw.q3 q3Var = yw.q3.f547970a;
                if (gm0.j1.a() && (c17 = q3Var.c()) != null) {
                    n3Var = c17.g();
                }
                boolean z17 = currentTimeMillis > ((long) (n3Var != null ? n3Var.f299911f : Integer.MAX_VALUE));
                r45.dn c18 = eVar.c();
                boolean z18 = (c18 != null ? c18.f454120n : 0) == 1;
                if (z18 && z17 && yw.h1.f547865a.n()) {
                    ur1.j jVar = ur1.j.f511887a;
                    if (ur1.n.f511894a.a()) {
                        jVar.a().n(true);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").putLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "[onBizMainCellExpose] requestCreationCenterInfo  reachTime=" + z17 + " personalCenterFeatureOn=" + z18);
                yw.w1.f548020a.a("mainCellExpose");
                ij();
                pm0.v.X(vw.q1.f522253d);
                ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).ij("brandServiceBoxExpose");
                if (yw.h1.f547865a.b()) {
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.F(vw.r1.f522257a);
                    return;
                }
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        java.lang.String str = i0Var.f540828d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBizMainCellExpose");
        if (i0Var.Di()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").getLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p2 f17 = (gm0.j1.a() && (a17 = a50.e1.f83004a.a()) != null) ? a17.f() : null;
            boolean z19 = currentTimeMillis2 > ((long) (f17 != null ? f17.f301267f : Integer.MAX_VALUE));
            r45.dn c19 = eVar2.c();
            boolean z27 = (c19 != null ? c19.f454120n : 0) == 1;
            if (z27 && z19 && yw.h1.f547865a.n()) {
                ur1.j jVar2 = ur1.j.f511887a;
                if (ur1.n.f511894a.a()) {
                    jVar2.a().n(true);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").putLong("k_LastPullCreationCenterInfoTime", java.lang.System.currentTimeMillis());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onBizMainCellExpose] requestCreationCenterInfo  reachTime=" + z19 + " personalCenterFeatureOn=" + z27);
            a50.v0.f83077a.a("mainCellExpose");
            boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
            if ((!i0Var.f540832h && !Vi) || (!Vi && ((java.lang.Boolean) ((jz5.n) i0Var.f540838q).mo141623x754a37bb()).booleanValue())) {
                yw.y1.f548046c = true;
                com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23428x781e6345 c23428x781e6345 = yw.y1.f548045b;
                yw.y1.f548045b = c23428x781e6345 != null ? c23428x781e6345.m86311x2eaf75((r44 & 1) != 0 ? c23428x781e6345.enterSource : null, (r44 & 2) != 0 ? c23428x781e6345.openArticleFromScene : null, (r44 & 4) != 0 ? c23428x781e6345.isTeenMode : null, (r44 & 8) != 0 ? c23428x781e6345.redDotCount : null, (r44 & 16) != 0 ? c23428x781e6345.pos : null, (r44 & 32) != 0 ? c23428x781e6345.finderLiveRedDotType : null, (r44 & 64) != 0 ? c23428x781e6345.finderFeedExportId : null, (r44 & 128) != 0 ? c23428x781e6345.exposeMsgType : null, (r44 & 256) != 0 ? c23428x781e6345.exposeUserName : null, (r44 & 512) != 0 ? c23428x781e6345.lastExposeId : null, (r44 & 1024) != 0 ? c23428x781e6345.lastExposeMsgId : null, (r44 & 2048) != 0 ? c23428x781e6345.lastExposeMid : null, (r44 & 4096) != 0 ? c23428x781e6345.sessionId : null, (r44 & 8192) != 0 ? c23428x781e6345.enterTime : null, (r44 & 16384) != 0 ? c23428x781e6345.netType : null, (r44 & 32768) != 0 ? c23428x781e6345.isHeadsetOn : null, (r44 & 65536) != 0 ? c23428x781e6345.redDotReportItem : null, (r44 & 131072) != 0 ? c23428x781e6345.createEngineGroup : java.lang.Boolean.TRUE, (r44 & 262144) != 0 ? c23428x781e6345.createEngine : null, (r44 & 524288) != 0 ? c23428x781e6345.startOpenTime : null, (r44 & 1048576) != 0 ? c23428x781e6345.endOnEnterTime : null, (r44 & 2097152) != 0 ? c23428x781e6345.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? c23428x781e6345.startCreateEngineTime : null, (r44 & 8388608) != 0 ? c23428x781e6345.startShowFlutterPageTime : null, (r44 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? c23428x781e6345.firstGroupMsgCount : null, (r44 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? c23428x781e6345.reddotReportInfo : null) : null;
                i0Var.f540832h = true;
                p3325xe03a0797.p3326xc267989b.l.d(i0Var.f540829e, null, null, new y40.a0(null), 3, null);
            }
            pm0.v.X(y40.p.f540858d);
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).ij("brandServiceBoxExpose");
            if (yw.h1.f547865a.b()) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b.z(y40.q.f540859a);
            }
        }
    }

    public void Ri(rv.g3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "onMainTabDisappeared, reason: " + reason);
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
            if (aj()) {
                ((ku5.t0) ku5.t0.f394148d).h(new vw.t1(reason), "onMainTabDisappeared");
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f540828d, "onMainTabDisappeared, reason: " + reason);
        if (i0Var.Ni()) {
            ((ku5.t0) ku5.t0.f394148d).h(new y40.t(reason), "onMainTabDisappeared");
        }
    }

    public void Ui(rv.g3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "onMainTabExposed, reason: " + reason);
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
            if (aj()) {
                ((ku5.t0) ku5.t0.f394148d).h(new vw.v1(reason), "onMainTabExposed");
                return;
            }
            return;
        }
        y40.i0 i0Var = (y40.i0) z40.e.get();
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f540828d, "onMainTabExposed, reason: " + reason);
        if (i0Var.Ni()) {
            ((ku5.t0) ku5.t0.f394148d).h(new y40.v(reason), "onMainTabExposed");
        }
    }

    public boolean Vi(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - this.f522233w);
        java.lang.String str = this.f522217d;
        if (abs < 1000) {
            jx3.f.INSTANCE.w(1971L, 7L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openBizTimeLineWithFlutter click in 1000ms");
            return false;
        }
        if (this.f522219f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "current job not finish, return (lastClickTime=" + this.f522233w + "  current=" + currentTimeMillis + ')');
            return false;
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428858v);
        eq1.j.f337354a.j();
        this.f522233w = currentTimeMillis;
        this.f522222i = currentTimeMillis;
        this.f522219f = p3325xe03a0797.p3326xc267989b.l.d(this.f522218e, null, null, new vw.w1(currentTimeMillis, intent, this, context, null), 3, null);
        return true;
    }

    public boolean Zi() {
        int i17 = yw.h1.f547869e;
        if (((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f522225o).mo141623x754a37bb()).booleanValue()) && !yw.q3.f547975f) {
            return false;
        }
        yw.h1 h1Var = yw.h1.f547865a;
        int i18 = yw.h1.f547868d;
        return (i18 == 1 || i18 != 0) && ((java.lang.Boolean) ((jz5.n) this.f522224n).mo141623x754a37bb()).booleanValue();
    }

    public boolean aj() {
        int i17 = yw.h1.f547869e;
        boolean z17 = ((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f522225o).mo141623x754a37bb()).booleanValue()) && yw.q3.f547975f && Zi();
        synchronized (yw.q3.f547970a) {
            if (yw.q3.f547976g == null) {
                jz5.g gVar = yw.q3.f547971b;
                boolean i18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).i("openAff", false);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).G("openAff", z17);
                if (i18 == z17 || !z17) {
                    yw.q3.f547976g = java.lang.Boolean.FALSE;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMsgBridge", "resetData");
                    yw.q3.f547976g = java.lang.Boolean.TRUE;
                }
            }
        }
        return z17;
    }

    public boolean bj(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vw.a2(i17, context, null), 3, null);
        return true;
    }

    public boolean cj(android.content.Context context, rv.l3 redDotReportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotReportInfo, "redDotReportInfo");
        ij();
        lr1.k.a();
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vw.e2(this, context, redDotReportInfo, null), 3, null);
        return true;
    }

    public boolean fj(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vw.f2(i17, i18, context, null), 3, null);
        return true;
    }

    public boolean hj(android.content.Context context, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2 b2Var, rv.e3 e3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (b2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f522217d, "publish launch info is null");
            return false;
        }
        if (e3Var == null) {
            yw.x1.f548040a = null;
        } else {
            yw.x1.f548040a = e3Var;
        }
        ij();
        p3325xe03a0797.p3326xc267989b.l.d(this.f522218e, null, null, new vw.g2(b2Var, context, null), 3, null);
        return true;
    }

    public final void ij() {
        boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
        if ((this.f522221h || Vi) && (Vi || !((java.lang.Boolean) ((jz5.n) this.f522227q).mo141623x754a37bb()).booleanValue())) {
            return;
        }
        yw.y1.f548046c = true;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23428x781e6345 c23428x781e6345 = yw.y1.f548045b;
        yw.y1.f548045b = c23428x781e6345 != null ? c23428x781e6345.m86311x2eaf75((r44 & 1) != 0 ? c23428x781e6345.enterSource : null, (r44 & 2) != 0 ? c23428x781e6345.openArticleFromScene : null, (r44 & 4) != 0 ? c23428x781e6345.isTeenMode : null, (r44 & 8) != 0 ? c23428x781e6345.redDotCount : null, (r44 & 16) != 0 ? c23428x781e6345.pos : null, (r44 & 32) != 0 ? c23428x781e6345.finderLiveRedDotType : null, (r44 & 64) != 0 ? c23428x781e6345.finderFeedExportId : null, (r44 & 128) != 0 ? c23428x781e6345.exposeMsgType : null, (r44 & 256) != 0 ? c23428x781e6345.exposeUserName : null, (r44 & 512) != 0 ? c23428x781e6345.lastExposeId : null, (r44 & 1024) != 0 ? c23428x781e6345.lastExposeMsgId : null, (r44 & 2048) != 0 ? c23428x781e6345.lastExposeMid : null, (r44 & 4096) != 0 ? c23428x781e6345.sessionId : null, (r44 & 8192) != 0 ? c23428x781e6345.enterTime : null, (r44 & 16384) != 0 ? c23428x781e6345.netType : null, (r44 & 32768) != 0 ? c23428x781e6345.isHeadsetOn : null, (r44 & 65536) != 0 ? c23428x781e6345.redDotReportItem : null, (r44 & 131072) != 0 ? c23428x781e6345.createEngineGroup : true, (r44 & 262144) != 0 ? c23428x781e6345.createEngine : null, (r44 & 524288) != 0 ? c23428x781e6345.startOpenTime : null, (r44 & 1048576) != 0 ? c23428x781e6345.endOnEnterTime : null, (r44 & 2097152) != 0 ? c23428x781e6345.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? c23428x781e6345.startCreateEngineTime : null, (r44 & 8388608) != 0 ? c23428x781e6345.startShowFlutterPageTime : null, (r44 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? c23428x781e6345.firstGroupMsgCount : null, (r44 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? c23428x781e6345.reddotReportInfo : null) : null;
        this.f522221h = true;
        p3325xe03a0797.p3326xc267989b.l.d(this.f522218e, null, null, new vw.h2(null), 3, null);
    }

    public void mj() {
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3 h3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3();
            h3Var.f299670e = "get_close_appmsglist";
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q0.f299304b.a(h3Var, new vw.k2(this));
        } else {
            y40.i0 i0Var = (y40.i0) z40.e.get();
            i0Var.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2 j2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2();
            j2Var.f301081e = "get_close_appmsglist";
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.m.f299379b.a(j2Var, new y40.g0(i0Var));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "onAccountInitialized");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd>(a0Var) { // from class: com.tencent.mm.feature.brandservice.FlutterBizFeatureService$onAccountInitialized$1
            {
                this.f39173x3fe91575 = 915464157;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd c5213x5fcd2dcd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd event = c5213x5fcd2dcd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vw.m2.this.f522217d, "receive reliable notify");
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.x(event.f135549g.f88260a, vw.m1.f522216a);
                return true;
            }
        };
        this.f522223m = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522217d, "onAccountReleased");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f522223m;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f522223m = null;
    }
}
