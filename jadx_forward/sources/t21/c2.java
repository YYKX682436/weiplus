package t21;

/* loaded from: classes12.dex */
public class c2 implements t21.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f496253a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public long f496254b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f496255c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f496256d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f496257e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f496258f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f496259g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f496260h = false;

    /* renamed from: i, reason: collision with root package name */
    public t21.v0 f496261i = null;

    /* renamed from: j, reason: collision with root package name */
    public long f496262j = 0;

    public c2() {
        t21.b2 b2Var = new t21.b2(this);
        rq3.i iVar = (rq3.i) ((cc0.k) i95.n0.c(cc0.k.class));
        iVar.getClass();
        if (iVar.f480459d == null) {
            iVar.f480459d = b2Var;
        }
    }

    public static boolean b(t21.c2 c2Var, int i17, int i18) {
        java.util.Iterator it;
        c2Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        boolean z19 = i17 == 111;
        long i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PreLoadVideoExpiredTime", 1) * 86400);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d start to delete expired file limit[%d] status[%d] expiredTime[%d] isC2C[%b]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(i19), java.lang.Boolean.valueOf(z19));
        java.util.List o17 = t21.o2.Ui().o(i17, i18, i19);
        if (o17.isEmpty()) {
            return false;
        }
        java.util.Iterator it6 = o17.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            t21.v2 v2Var = (t21.v2) it6.next();
            if (v2Var != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, v2Var.d(), z18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6)) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(rj6);
                    if (r6Var.m()) {
                        long C = r6Var.C();
                        it = it6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%s file[%d %d] lastmodifytime[%d] path[%s]", v2Var.d(), java.lang.Long.valueOf(C), java.lang.Integer.valueOf(v2Var.I), java.lang.Long.valueOf(v2Var.f496546k), rj6);
                        if (C > 0 && C <= v2Var.I) {
                            r6Var.l();
                            i27++;
                        }
                        v2Var.I = 0;
                        v2Var.U = 1;
                        t21.d3.Q(v2Var);
                        it6 = it;
                        z18 = false;
                    }
                }
                it = it6;
                v2Var.I = 0;
                v2Var.U = 1;
                t21.d3.Q(v2Var);
                it6 = it;
                z18 = false;
            }
        }
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 144L, i27, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 145L, i27, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d delete expire file size %d delete count %d costTime[%d]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Integer.valueOf(((java.util.LinkedList) o17).size()), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return false;
    }

    public static boolean c(t21.c2 c2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a) {
        int i17;
        int i18;
        c2Var.getClass();
        if (f9Var == null) {
            c19762x487075a.f38859x6ac9171 = true;
        } else {
            t21.v2 h17 = t21.d3.h(f9Var.z0());
            if (h17 != null && h17.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", java.lang.Integer.valueOf(c2Var.hashCode()), h17.d());
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(h17.g(), "msg", null);
                java.lang.String str = (java.lang.String) d17.get(".msg.videomsg.$newmd5");
                java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h17.h());
                int i19 = R4 ? 2 : 1;
                long j17 = h17.f496541f;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h17.h())) {
                    rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                    java.lang.String h18 = h17.h();
                    ((c01.w1) eVar).getClass();
                    i18 = c01.v1.o(h18);
                } else {
                    i18 = 0;
                }
                c2Var.f(str, i19, j17, h17.e(), h17.h(), i18, str2, "", "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(354L, 146L, 1L, false);
                if (R4) {
                    g0Var.mo68477x336bdfd8(354L, 126L, 1L, false);
                } else {
                    g0Var.mo68477x336bdfd8(354L, 125L, 1L, false);
                }
                c19762x487075a.f38859x6ac9171 = true;
            } else if (c2Var.h(f9Var.Q0())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d use new preload strategy", java.lang.Integer.valueOf(c2Var.hashCode()));
                c19762x487075a.f38859x6ac9171 = true;
            } else {
                if (java.lang.System.currentTimeMillis() - f9Var.mo78012x3fdd41df() >= 86400000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", java.lang.Integer.valueOf(c2Var.hashCode()));
                    c19762x487075a.f38859x6ac9171 = true;
                } else if (c2Var.d(true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Long.valueOf(c2Var.f496254b));
                    c19762x487075a.f38859x6ac9171 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.G);
                    c01.ea w17 = c01.w9.w(f9Var.G);
                    if (w17 == null) {
                        c19762x487075a.f38859x6ac9171 = true;
                    } else {
                        if (c2Var.h(f9Var.Q0())) {
                            i17 = 1;
                        } else if (w17.f118694t <= 0) {
                            c19762x487075a.f38859x6ac9171 = true;
                        } else if (d11.b.a(w17.f118696v)) {
                            c19762x487075a.f38859x6ac9171 = false;
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                            i17 = w17.f118695u & 1;
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                            i17 = w17.f118695u & 2;
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                            i17 = w17.f118695u & 4;
                        } else {
                            c19762x487075a.f38859x6ac9171 = false;
                        }
                        if (i17 > 0) {
                            c19762x487075a.f38859x6ac9171 = false;
                            return true;
                        }
                        c19762x487075a.f38859x6ac9171 = false;
                    }
                }
            }
        }
        return false;
    }

    @Override // t21.u0
    public void a(t21.v0 v0Var, boolean z17, int i17, int i18) {
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        if (this.f496261i != v0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", java.lang.Integer.valueOf(hashCode()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", java.lang.Integer.valueOf(hashCode()), v0Var.c(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ((ku5.t0) ku5.t0.f394148d).g(new t21.a2(this, v0Var));
    }

    public boolean d(boolean z17) {
        int Ni;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_PRELOAD_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, -1L)).longValue();
        this.f496254b = longValue;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (java.lang.System.currentTimeMillis() - longValue >= 86400000) {
            this.f496254b = java.lang.System.currentTimeMillis();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(this.f496254b));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT, 0);
            this.f496260h = false;
            this.f496259g = false;
        }
        this.f496255c = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT, 0)).intValue();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT, 0)).intValue();
        this.f496256d = intValue;
        if (z17) {
            intValue = this.f496255c;
            Ni = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("C2CMaxPreloadVideo", 100);
        } else {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_max_preload, 1000);
        }
        int i17 = Ni > 0 ? Ni : 1000;
        boolean z19 = intValue >= i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(this.f496255c), java.lang.Integer.valueOf(this.f496256d));
        if (z19) {
            if (z17) {
                if (!this.f496259g) {
                    this.f496259g = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 127L, 1L, false);
                }
            } else if (!this.f496260h) {
                this.f496260h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 128L, 1L, false);
            }
        }
        return z19;
    }

    public void e(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT;
            this.f496255c = ((java.lang.Integer) c17.m(u3Var, 0)).intValue() + 1;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(this.f496255c));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT;
        this.f496256d = ((java.lang.Integer) c18.m(u3Var2, 0)).intValue() + 1;
        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(this.f496256d));
    }

    public void f(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        stringBuffer.append(",");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        stringBuffer.append(",0,");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(i17);
        stringBuffer.append(",0,");
        stringBuffer.append(j17);
        stringBuffer.append(",,");
        stringBuffer.append(str2);
        stringBuffer.append(",");
        stringBuffer.append(str3);
        stringBuffer.append(",");
        stringBuffer.append(i18);
        stringBuffer.append(",");
        stringBuffer.append(str4);
        stringBuffer.append(",");
        stringBuffer.append(str5);
        stringBuffer.append(",");
        stringBuffer.append(fo4.c.a(str6));
        new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6815x9275f7d5(stringBuffer.toString()).k();
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d stop download", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f394148d).g(new t21.y1(this));
    }

    public final boolean h(java.lang.String str) {
        ((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).getClass();
        oq3.i iVar = oq3.k.f428927a;
        if (str == null) {
            str = "";
        }
        return iVar.c(3, str) != 0;
    }
}
