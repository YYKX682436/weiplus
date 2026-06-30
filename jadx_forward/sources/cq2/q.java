package cq2;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static long f302965e;

    /* renamed from: f, reason: collision with root package name */
    public static r45.wo1 f302966f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g f302967g;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f302970j;

    /* renamed from: k, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f302971k;

    /* renamed from: l, reason: collision with root package name */
    public static r45.rk0 f302972l;

    /* renamed from: m, reason: collision with root package name */
    public static int f302973m;

    /* renamed from: n, reason: collision with root package name */
    public static int f302974n;

    /* renamed from: o, reason: collision with root package name */
    public static int f302975o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f302976p;

    /* renamed from: a, reason: collision with root package name */
    public static final cq2.q f302961a = new cq2.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f302962b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f302963c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f302964d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f302968h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f302969i = "";

    public static final void a(cq2.q qVar, ys5.e eVar) {
        zy2.fa nk6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0;
        qVar.getClass();
        if (eVar == ys5.e.f546793h || (L0 = (nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk()).L0("FinderLiveEntrance")) == null || L0.I0("FinderLiveEntrance") == null || L0.m55856xfb85f7b0() != 16) {
            return;
        }
        nk6.a0(L0);
    }

    public final void b(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearNewEntranceCache: source=");
        sb6.append(source);
        sb6.append(", curPreloadJob=");
        sb6.append(f302971k);
        sb6.append(", isActive=");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = f302971k;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = f302971k;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        f302971k = null;
        aq2.i iVar = aq2.k.f94673l;
        by1.b bVar = by1.c.f117886b;
        by1.d a17 = bVar.a().a(iVar.a("default"));
        aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearNewEntranceCache: source=");
        sb7.append(source);
        sb7.append(", cache=");
        sb7.append(kVar);
        sb7.append(" data=");
        sb7.append(kVar != null ? (com.p314xaae8f345.mm.p944x882e457a.f) kVar.f117894b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb7.toString());
        if ((kVar != null ? (com.p314xaae8f345.mm.p944x882e457a.f) kVar.f117894b : null) != null) {
            by1.d a18 = bVar.a().a(iVar.a("default"));
            aq2.k kVar2 = a18 instanceof aq2.k ? (aq2.k) a18 : null;
            if (kVar2 != null) {
                kVar2.g();
            }
        }
        sp2.b.f492505a.d(iVar.a("default"), 0);
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g c() {
        if (f302967g == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_MORE_LIVE_OBJECTS_BUFFER_STRING, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17);
            f302967g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h17, 0, h17.length);
        }
        return f302967g;
    }

    public final r45.wo1 d() {
        if (f302966f == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_NO_REDDOT_PRELOAD_CONFIG_STRING, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            try {
                r45.wo1 wo1Var = new r45.wo1();
                wo1Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
                f302966f = wo1Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("NewSquarePreloadUtil", e17, "get noRedDotPreloadConfig", new java.lang.Object[0]);
            }
        }
        return f302966f;
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        r45.xs2 xs2Var = jbVar != null ? jbVar.N : null;
        java.lang.String str = jbVar != null ? jbVar.f65880x11c19d58 : null;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(xs2Var != null ? xs2Var.m75945x2fec8307(0) : null);
        sb6.append('_');
        sb6.append(xs2Var != null ? java.lang.Long.valueOf(xs2Var.m75942xfb822ef2(3)) : null);
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(r45.qt2 r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.q.f(r45.qt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String g(r45.wo1 wo1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wo1Var, "<this>");
        return "refresh_preload_config: " + wo1Var.m75933x41a8a7f2(0) + ", preload_control_flag: " + wo1Var.m75942xfb822ef2(1) + ", preload_feed_effective_time: " + wo1Var.m75939xb282bd08(2) + ", preload_config_effective_unix_time: " + wo1Var.m75942xfb822ef2(3) + ", preload_freq_limit_retry_delay_time: " + wo1Var.m75939xb282bd08(4) + ", request_preload_buff: " + wo1Var.m75934xbce7f2f(5) + " preload_feed_refresh_time=" + wo1Var.m75939xb282bd08(10);
    }

    public final void h(java.lang.String source, r45.wo1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "updateNoRedDotPreloadConfig: source=" + source + ", switch=" + config.m75939xb282bd08(7));
        if (config.m75939xb282bd08(7) == 0) {
            return;
        }
        f302966f = config;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_NO_REDDOT_PRELOAD_CONFIG_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(config.mo14344x5f01b1f6()));
    }

    public final void i(java.lang.String source, r45.dk2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "updatePreloadControlConfig: source=".concat(source));
        r45.wo1 wo1Var = (r45.wo1) resp.m75936x14adae67(18);
        cq2.q qVar = f302961a;
        if (wo1Var != null) {
            r45.bk2 bk2Var = (r45.bk2) resp.m75936x14adae67(16);
            if (bk2Var != null) {
                wo1Var.set(8, java.lang.Integer.valueOf(bk2Var.m75939xb282bd08(11)));
            }
            qVar.h(source, wo1Var);
        }
        r45.bk2 bk2Var2 = (r45.bk2) resp.m75936x14adae67(16);
        if (bk2Var2 != null) {
            if (bk2Var2.m75939xb282bd08(13) == 1 || bk2Var2.m75939xb282bd08(12) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "update preload config, disable red dot preload");
                java.util.Iterator it = f302962b.entrySet().iterator();
                while (it.hasNext()) {
                    r45.wo1 wo1Var2 = (r45.wo1) ((java.util.Map.Entry) it.next()).getValue();
                    if (wo1Var2 != null) {
                        wo1Var2.set(1, 0L);
                    }
                }
            }
            if (bk2Var2.m75939xb282bd08(13) == 1 || bk2Var2.m75939xb282bd08(10) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "update preload config, disable no red dot preload");
                r45.wo1 d17 = qVar.d();
                if (d17 != null) {
                    d17.set(7, 1);
                    qVar.h("disablePreload", d17);
                    return;
                }
                return;
            }
            if (bk2Var2.m75939xb282bd08(6) == 1) {
                r45.wo1 d18 = qVar.d();
                boolean z17 = false;
                if (d18 != null && d18.m75939xb282bd08(7) == 5) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "update preload config, disable no red dot client model preload");
                    r45.wo1 d19 = qVar.d();
                    if (d19 != null) {
                        d19.set(7, 1);
                        qVar.h("disableClientModel", d19);
                    }
                }
            }
        }
    }
}
