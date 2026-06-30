package az0;

/* loaded from: classes5.dex */
public final class n7 {

    /* renamed from: a */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 f97275a;

    /* renamed from: b */
    public final dz0.h f97276b;

    /* renamed from: c */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b f97277c;

    /* renamed from: d */
    public final jz5.g f97278d;

    /* renamed from: e */
    public final p3325xe03a0797.p3326xc267989b.y0 f97279e;

    /* renamed from: f */
    public p3325xe03a0797.p3326xc267989b.r2 f97280f;

    public n7(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 movieSession, dz0.h initialPatams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(movieSession, "movieSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialPatams, "initialPatams");
        this.f97275a = movieSession;
        this.f97276b = initialPatams;
        movieSession.m33445x72e675d5(az0.l5.f97196a);
        this.f97277c = d(initialPatams.f326389b, initialPatams.f326390c);
        this.f97278d = jz5.h.b(az0.t5.f97449d);
        this.f97279e = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public static final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 a(az0.n7 n7Var) {
        return (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306) ((jz5.n) n7Var.f97278d).mo141623x754a37bb();
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(az0.n7 n7Var, az0.b0 b0Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 exportSettings, boolean z17) {
        n7Var.getClass();
        java.lang.String str = b0Var.f96871a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "retry export");
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
            if (r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "delete previous video file");
                r6Var.l();
            }
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
        if (i17 == null) {
            i17 = str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        bz0.f fVar = bz0.f.f118268a;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83 = n7Var.f97275a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 m33395x7a30592b = c4079x793f83.m33395x7a30592b();
        java.lang.String m33907x3bfa570b = m33395x7a30592b != null ? m33395x7a30592b.m33907x3bfa570b() : null;
        if (m33907x3bfa570b == null) {
            m33907x3bfa570b = "";
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33391x2f60e70 = c4079x793f83.m33391x2f60e70();
        java.lang.String m33856x92013dca = m33391x2f60e70 != null ? m33391x2f60e70.m33856x92013dca() : null;
        java.lang.String str2 = m33856x92013dca != null ? m33856x92013dca : "";
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b movieOption = n7Var.f97277c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(movieOption, "movieOption");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportSettings, "exportSettings");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e = bz0.f.f118270c;
        c6707xf4fd108e.f140472n = c6707xf4fd108e.b("exportTemplateId", r26.i0.t(m33907x3bfa570b, ",", ";", false), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e2 = bz0.f.f118270c;
        c6707xf4fd108e2.f140473o = c6707xf4fd108e2.b("exportMusicId", r26.i0.t(str2, ",", ";", false), true);
        bz0.f.f118270c.f140468j = (movieOption.m33203xc89e6ccd() ? 0 : 4) | (movieOption.m33205x95ca6785() ? 0 : 2) | 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e3 = bz0.f.f118270c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd m33182x1fea5d37 = exportSettings.m33182x1fea5d37();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33182x1fea5d37, "getFrameRate(...)");
        int m33774x31e6d4eb = m33182x1fea5d37.m33770xfb85f7b0().m33774x31e6d4eb();
        jSONObject.put("f", m33774x31e6d4eb != 5 ? m33774x31e6d4eb != 8 ? 1 : 60 : 30);
        int m33186x1cc564db = exportSettings.m33186x1cc564db();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd m33182x1fea5d372 = exportSettings.m33182x1fea5d37();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33182x1fea5d372, "getFrameRate(...)");
        int m33774x31e6d4eb2 = m33182x1fea5d372.m33770xfb85f7b0().m33774x31e6d4eb();
        jSONObject.put("vb", m33186x1cc564db * (m33774x31e6d4eb2 != 5 ? m33774x31e6d4eb2 != 8 ? 1 : 60 : 30));
        jSONObject.put("ab", exportSettings.m33175xd21dda5e());
        jSONObject.put("maxgop", exportSettings.m33183x7daa7a1());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6707xf4fd108e3.f140474p = c6707xf4fd108e3.b("exportParams", r26.i0.t(jSONObject2, ",", ";", false), true);
        return az0.rc.b(!z17 ? "260" : "261", new az0.c6(str, i17, exportSettings, n7Var, b0Var, java.lang.System.currentTimeMillis()), new az0.f6(n7Var), false);
    }

    public static /* synthetic */ java.lang.Object p(az0.n7 n7Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        }
        if ((i17 & 2) != 0) {
            c4129xdee64553 = null;
        }
        return n7Var.o(ZeroTime, c4129xdee64553, interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if ((r2.m33393xb7d72d0e() == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Recreating) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof az0.m5
            if (r0 == 0) goto L13
            r0 = r10
            az0.m5 r0 = (az0.m5) r0
            int r1 = r0.f97240i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97240i = r1
            goto L18
        L13:
            az0.m5 r0 = new az0.m5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f97238g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97240i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r9 = r0.f97237f
            java.lang.Object r2 = r0.f97236e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.f97235d
            az0.n7 r5 = (az0.n7) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
            r9 = r2
            goto L82
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r5 = r8
            r10 = r3
        L41:
            com.tencent.maas.instamovie.MJMovieSession r2 = r5.f97275a
            com.tencent.maas.instamovie.MJMovieSessionState r2 = r2.m33393xb7d72d0e()
            com.tencent.maas.instamovie.MJMovieSessionState r6 = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Updating
            if (r2 != r6) goto L4d
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r2 != 0) goto L6c
            com.tencent.maas.instamovie.MJMovieSession r2 = r5.f97275a
            com.tencent.maas.instamovie.MJMovieSessionState r6 = r2.m33393xb7d72d0e()
            com.tencent.maas.instamovie.MJMovieSessionState r7 = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Switching
            if (r6 != r7) goto L5c
            r6 = r4
            goto L5d
        L5c:
            r6 = r3
        L5d:
            if (r6 != 0) goto L6c
            com.tencent.maas.instamovie.MJMovieSessionState r2 = r2.m33393xb7d72d0e()
            com.tencent.maas.instamovie.MJMovieSessionState r6 = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Recreating
            if (r2 != r6) goto L69
            r2 = r4
            goto L6a
        L69:
            r2 = r3
        L6a:
            if (r2 == 0) goto L9e
        L6c:
            r2 = 5
            if (r10 >= r2) goto L9e
            int r10 = r10 + 1
            r0.f97235d = r5
            r0.f97236e = r9
            r0.f97237f = r10
            r0.f97240i = r4
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r0)
            if (r2 != r1) goto L82
            return r1
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "awaitSessionStateToEnterSwitch: force delay "
            r2.<init>(r6)
            r2.append(r9)
            java.lang.String r6 = ", delayCount:"
            r2.append(r6)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "MicroMsg.MaasMovieSessionManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)
            goto L41
        L9e:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.d(boolean, boolean):com.tencent.maas.instamovie.MJMovieOptions");
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maas_");
        gm0.m b17 = gm0.j1.b();
        sb6.append(kk.v.a(b17 != null ? b17.h() : 0));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }

    public final ig.n f() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(ig.n.m135944x92b714fd(this.f97275a.m33408xa77264c8()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        return (ig.n) m143895xf1229813;
    }

    public final boolean g() {
        return this.f97275a.m33393xb7d72d0e() == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Playing;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[PHI: r8
  0x007b: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0078, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof az0.z5
            if (r0 == 0) goto L13
            r0 = r8
            az0.z5 r0 = (az0.z5) r0
            int r1 = r0.f97638h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97638h = r1
            goto L18
        L13:
            az0.z5 r0 = new az0.z5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f97636f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97638h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L7b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f97635e
            com.tencent.maas.model.MJTemplateBuildResult r7 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274) r7
            java.lang.Object r2 = r0.f97634d
            az0.n7 r2 = (az0.n7) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L66
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.String r8 = r7.m33880x3bfa572b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "switchTemplateWithV2: start "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.MaasMovieSessionManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2)
            r0.f97634d = r6
            r0.f97635e = r7
            r0.f97638h = r4
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r2 = r6
        L66:
            az0.a6 r8 = new az0.a6
            r8.<init>(r2, r7)
            r7 = 0
            r0.f97634d = r7
            r0.f97635e = r7
            r0.f97638h = r3
            java.lang.String r7 = "226"
            java.lang.Object r8 = az0.rc.h(r7, r8, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.h(com.tencent.maas.model.MJTemplateBuildResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean i() {
        return this.f97275a.m33393xb7d72d0e() == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Ready;
    }

    public final java.lang.Object j(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        int m33431x1807aa93 = this.f97275a.m33431x1807aa93(str, this.f97276b.f326397j, kz5.c0.j(str2), new az0.h6(rVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "recommendNext: reqRecommend " + str + ", " + m33431x1807aa93);
        if (m33431x1807aa93 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMovieSessionManager", "recommendNext: req recommend error");
        }
        rVar.m(new az0.g6(m33431x1807aa93, this));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "release");
        az0.i5 i5Var = az0.i5.f97090a;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 movieSession = this.f97275a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(movieSession, "movieSession");
        az0.i5.f97102m = p3325xe03a0797.p3326xc267989b.l.d(az0.i5.f97101l, null, null, new az0.z4(movieSession, null), 3, null);
    }

    public final void l(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "setMovieOption() called with: musicMuted = " + z17 + ", originMuted = " + z18);
        this.f97277c = d(z17, z18);
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j m(java.lang.String templateId, java.lang.String str, java.lang.String str2, java.util.List mediaInfo, boolean z17, long j17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onRecommendReady) {
        java.lang.String str3;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRecommendReady, "onRecommendReady");
        java.lang.String value = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + value + ", field: " + bz0.a.f118255a);
        bz0.a.f118255a = value;
        bz0.f fVar = bz0.f.f118268a;
        bz0.f.f118271d = p3325xe03a0797.p3326xc267989b.l.d(bz0.f.f118269b, null, null, new bz0.d(bz0.f.f118271d, mediaInfo, null), 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mediaInfo, 10));
        java.util.Iterator it = mediaInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
            qg.c cVar = qg.c.Video;
            qg.c cVar2 = qg.c.Image;
            qg.a aVar = qg.a.Filepath;
            if (mo63659xfb85f7b0 == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078;
                if (c15632xfc4fd0d0.H == 1 && c15632xfc4fd0d0.A != 2) {
                    java.lang.String wi6 = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f445742f, java.lang.String.valueOf(abstractC15633xee433078.f219967i));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "mediaId: " + abstractC15633xee433078.f219967i + " originalPath: " + c15632xfc4fd0d0.f219963e + " destPath: " + wi6 + " isParsed: " + c15632xfc4fd0d0.G);
                    if (c15632xfc4fd0d0.G != 1) {
                        i95.m c17 = i95.n0.c(qk.r7.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        qk.r7 r7Var = (qk.r7) c17;
                        long j18 = abstractC15633xee433078.f219967i;
                        java.lang.String o17 = c15632xfc4fd0d0.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getThumbPath(...)");
                        aq.s0 s0Var = qk.r7.ui(r7Var, j18, wi6, o17, 0L, 8, null).f94508a;
                        boolean z18 = s0Var.f94493a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "livePhoto is no parse >> parse result : " + s0Var.f94493a + " errCode: " + s0Var.f94494b);
                        r3 = z18;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "copy result >> " + com.p314xaae8f345.mm.vfs.w6.d(c15632xfc4fd0d0.f219963e, wi6, false));
                    }
                    if (r3) {
                        abstractC15633xee433078.f219963e = wi6;
                        c4094x2bd762a1 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, wi6, cVar, qg.b.Video);
                    } else {
                        abstractC15633xee433078.f219963e = c15632xfc4fd0d0.o();
                        c4094x2bd762a1 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, c15632xfc4fd0d0.o(), cVar2);
                    }
                    arrayList.add(c4094x2bd762a1);
                }
            }
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 6) {
                str3 = abstractC15633xee433078.o();
                abstractC15633xee433078.f219963e = str3;
            } else {
                str3 = abstractC15633xee433078.f219963e;
            }
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 1 || abstractC15633xee433078.mo63659xfb85f7b0() == 6) {
                cVar = cVar2;
            }
            c4094x2bd762a1 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, str3, cVar);
            arrayList.add(c4094x2bd762a1);
        }
        az0.z6 z6Var = new az0.z6(java.lang.System.currentTimeMillis(), onRecommendReady);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.Foreground;
        if (templateId.length() > 0) {
            if (z17) {
                h0Var.f391656d = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.Background;
            } else {
                h0Var.f391656d = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.None;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "startMovieCreation: mode:" + h0Var.f391656d);
        return az0.rc.b("200", new az0.v6(templateId, str2, str, j17, this, arrayList, h0Var, z6Var), new az0.y6(this), false);
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j n(java.util.List mediaInfo, java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onRecommendReady) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRecommendReady, "onRecommendReady");
        java.lang.String value = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + value + ", field: " + bz0.a.f118255a);
        bz0.a.f118255a = value;
        bz0.f fVar = bz0.f.f118268a;
        bz0.f.f118271d = p3325xe03a0797.p3326xc267989b.l.d(bz0.f.f118269b, null, null, new bz0.d(bz0.f.f118271d, mediaInfo, null), 3, null);
        return az0.rc.b("202", new az0.e7(mediaInfo, z17, z17 ? com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.Background : com.p314xaae8f345.p457x3304c6.p470x35bb6d35.c.None, this, str, new az0.i7(java.lang.System.currentTimeMillis(), onRecommendReady)), new az0.h7(this), false);
    }

    public final java.lang.Object o(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99;
        boolean g17 = g();
        boolean i17 = i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay, isPlaying: ");
        sb6.append(g17);
        sb6.append(" ready: ");
        sb6.append(i17);
        sb6.append(", startTime:");
        sb6.append(c4128x879fba0a.m33988x124aa384());
        sb6.append(", timeRangeForPlay:[");
        java.lang.Double d17 = null;
        sb6.append((c4129xdee64553 == null || (m34009x8082fb99 = c4129xdee64553.m34009x8082fb99()) == null) ? null : new java.lang.Double(m34009x8082fb99.m33988x124aa384()));
        sb6.append(',');
        if (c4129xdee64553 != null && (m34007xde00a612 = c4129xdee64553.m34007xde00a612()) != null) {
            d17 = new java.lang.Double(m34007xde00a612.m33988x124aa384());
        }
        sb6.append(d17);
        sb6.append("], playbackDuration:");
        sb6.append(this.f97275a.m33398xebfaa445());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        return (g17 || !i17) ? java.lang.Boolean.FALSE : az0.rc.d("241", new az0.j7(c4129xdee64553, this, c4128x879fba0a), interfaceC29045xdcb5ca57);
    }

    public final java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (this.f97275a.m33393xb7d72d0e() == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Initial) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "cur state is initial, no need to stop");
            return java.lang.Boolean.TRUE;
        }
        boolean g17 = g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "stopPlay, isPlaying: " + g17);
        return g17 ? az0.rc.d("242", new az0.k7(this), interfaceC29045xdcb5ca57) : java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(boolean r5, boolean r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof az0.l7
            if (r0 == 0) goto L13
            r0 = r7
            az0.l7 r0 = (az0.l7) r0
            int r1 = r0.f97202h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97202h = r1
            goto L18
        L13:
            az0.l7 r0 = new az0.l7
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f97200f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97202h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f97199e
            com.tencent.maas.instamovie.MJMovieOptions r5 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b) r5
            java.lang.Object r6 = r0.f97198d
            az0.n7 r6 = (az0.n7) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.maas.instamovie.MJMovieOptions r5 = r4.d(r5, r6)
            az0.m7 r6 = new az0.m7
            r6.<init>(r4, r5)
            r0.f97198d = r4
            r0.f97199e = r5
            r0.f97202h = r3
            java.lang.String r7 = "240"
            java.lang.Object r7 = az0.rc.d(r7, r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r4
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            r6.f97277c = r5
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.r(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
