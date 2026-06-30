package us2;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static volatile p3325xe03a0797.p3326xc267989b.y0 f512085e;

    /* renamed from: m, reason: collision with root package name */
    public static volatile vt3.p f512093m;

    /* renamed from: a, reason: collision with root package name */
    public static final us2.u f512081a = new us2.u();

    /* renamed from: b, reason: collision with root package name */
    public static final vt3.r f512082b = new vt3.r(0, "", new vt3.n(null, null, null, null, 8, null), false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f512083c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f512084d = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f512086f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f512087g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f512088h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f512089i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f512090j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f512091k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final rt3.e f512092l = new rt3.e();

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f512094n = true;

    public static final synchronized void n(int i17, boolean z17) {
        synchronized (us2.u.class) {
            boolean z18 = true;
            if (!((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true) || !py0.b.f440504a.a()) {
                z18 = false;
            }
            if (z18) {
                p3325xe03a0797.p3326xc267989b.l.d(f512081a.i(), null, null, new us2.t(9, i17, z17, null), 3, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "startPreload >> template is disabled");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:17|18))(4:19|20|51|(2:26|(1:28))(4:29|13|14|15))|12|13|14|15))|36|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "awaitTemplatePreloading "
            java.lang.String r1 = "awaitTemplatePreloading "
            java.lang.String r2 = "awaitTemplatePreloading "
            boolean r3 = r9 instanceof us2.g
            if (r3 == 0) goto L19
            r3 = r9
            us2.g r3 = (us2.g) r3
            int r4 = r3.f512018g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f512018g = r4
            goto L1e
        L19:
            us2.g r3 = new us2.g
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.f512016e
            pz5.a r4 = pz5.a.f440719d
            int r5 = r3.f512018g
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            java.lang.Object r8 = r3.f512015d
            java.lang.String r8 = (java.lang.String) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> La0
            goto L6a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> La0
            java.lang.String r9 = "ShootComposingTemplateManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r5.<init>(r2)     // Catch: java.lang.Throwable -> La0
            r5.append(r8)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r9 = us2.u.f512083c     // Catch: java.lang.Throwable -> La0
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La0
            java.util.Map r2 = us2.u.f512084d     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L9d
            kotlinx.coroutines.r2 r2 = (p3325xe03a0797.p3326xc267989b.r2) r2     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L81
            r3.f512015d = r8     // Catch: java.lang.Throwable -> La0
            r3.f512018g = r6     // Catch: java.lang.Throwable -> La0
            java.lang.Object r9 = r2.C(r3)     // Catch: java.lang.Throwable -> La0
            if (r9 != r4) goto L6a
            return r4
        L6a:
            java.lang.String r9 = "ShootComposingTemplateManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
            r0.append(r8)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = " - done"
            r0.append(r8)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> La0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8)     // Catch: java.lang.Throwable -> La0
            goto L97
        L81:
            java.lang.String r9 = "ShootComposingTemplateManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La0
            r1.append(r8)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = " - not exists"
            r1.append(r8)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> La0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8)     // Catch: java.lang.Throwable -> La0
        L97:
            jz5.f0 r8 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> La0
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)     // Catch: java.lang.Throwable -> La0
            goto Laa
        L9d:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La0
            throw r8     // Catch: java.lang.Throwable -> La0
        La0:
            r8 = move-exception
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r8 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)
        Laa:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.util.Map map) {
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (p3325xe03a0797.p3326xc267989b.r2 r2Var : ((java.util.Map) it.next()).values()) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    if (r2Var.a()) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
            }
        }
        map.clear();
    }

    public final void c(java.lang.String templateID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        synchronized (f512083c) {
            java.util.Iterator it = ((java.util.LinkedHashMap) f512084d).entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), templateID)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "cancel preload templateId:" + ((java.lang.String) entry.getKey()));
                    it.remove();
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) entry.getValue(), null, 1, null);
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(vt3.p r18, boolean r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.e(vt3.p, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object f(vt3.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTemplate id:");
        sb6.append(pVar.f521553b);
        sb6.append(" version:");
        sb6.append(pVar.f521556e);
        sb6.append(" url:");
        java.lang.String str = pVar.f521555d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17821x8c50294f = 60;
        c2CDownloadRequest.f17841x86986d5f = 60;
        c2CDownloadRequest.f17840xf3a4da4a = currentTimeMillis;
        c2CDownloadRequest.f17793xd428dad6 = 5;
        c2CDownloadRequest.f17792xcd096f43 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        c2CDownloadRequest.url = str;
        yy0.o7 o7Var = (yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class));
        java.lang.String str2 = pVar.f521553b;
        o7Var.Bi("mjpublisher_sc_download_template", str2);
        o7Var.wi(kz5.c1.k(new jz5.l("template_id", str2), new jz5.l("is_preload", "1"), new jz5.l("is_outside_preload", "1")), "mjpublisher_sc_download_template", str2);
        java.lang.String str3 = com.p314xaae8f345.mm.vfs.q7.c("MaasCache") + "/CamTemplatePreload/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        c2CDownloadRequest.m37861xfb0731c4(str3);
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37788x8bc93551(c2CDownloadRequest, new us2.j(pVar, rVar, str3)) != 0) {
            rVar.s(null, null);
        }
        rVar.m(new us2.i(pVar, c2CDownloadRequest));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:50|51))(2:52|40)|12|13|fa|42|43))|96|6|7|(0)(0)|12|13|fa) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0030, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ef, code lost:
    
        r15 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r12, int r13, vt3.n r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.g(int, int, vt3.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p3325xe03a0797.p3326xc267989b.r2 h(int i17, int i18, int i19, us2.d dVar, vt3.r rVar) {
        int i27 = i19;
        boolean z17 = dVar.f512009a == 0;
        if (!z17 && rVar == null) {
            throw new java.lang.AssertionError("getOrCreateRequestJob param set error, not reach here");
        }
        synchronized (f512086f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: scene: " + i17 + ", enterType: " + i18 + ", enterScene: " + i27 + ", cacheKey: " + dVar + ", tabItem: " + rVar);
            java.util.Map map = f512090j;
            java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            p3325xe03a0797.p3326xc267989b.r2 r2Var = map2 != null ? (p3325xe03a0797.p3326xc267989b.r2) map2.get(dVar) : null;
            if (r2Var != null && r2Var.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: job is active");
                return r2Var;
            }
            p3325xe03a0797.p3326xc267989b.y0 i28 = f512081a.i();
            if (i27 == 0) {
                i27 = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Bi();
            }
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(i28, null, null, new us2.m(z17, rVar, i17, i18, i27, dVar, null), 3, null);
            if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) == null) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), new java.util.HashMap());
            }
            java.util.Map map3 = (java.util.Map) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (map3 != null) {
            }
            return d17;
        }
    }

    public final p3325xe03a0797.p3326xc267989b.y0 i() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        synchronized (f512086f) {
            y0Var = f512085e;
            if (y0Var == null) {
                y0Var = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1)));
                f512085e = y0Var;
            }
        }
        return y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r11, vt3.n r12, boolean r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.j(int, vt3.n, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r16, vt3.r r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.k(int, vt3.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.List l(int i17, long j17) {
        java.util.List list;
        us2.a aVar;
        us2.b bVar;
        us2.a aVar2;
        us2.b bVar2;
        synchronized (f512087g) {
            vt3.n nVar = new vt3.n(null, null, null, null, 8, null);
            list = null;
            if (j17 == 0) {
                java.util.Map map = (java.util.Map) ((java.util.HashMap) f512088h).get(java.lang.Integer.valueOf(i17));
                if (map != null) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((us2.d) entry.getKey()).f512010b, nVar) || !((us2.a) entry.getValue()).f512001b.f512003b) {
                            entry = null;
                        }
                        if (entry != null) {
                            break;
                        }
                    }
                }
                entry = null;
                if (entry != null && (aVar2 = (us2.a) entry.getValue()) != null && (bVar2 = aVar2.f512001b) != null) {
                    list = bVar2.f512004c;
                }
            } else {
                us2.d dVar = new us2.d(j17, nVar);
                java.util.Map map2 = (java.util.Map) ((java.util.HashMap) f512088h).get(java.lang.Integer.valueOf(i17));
                if (map2 != null && (aVar = (us2.a) map2.get(dVar)) != null && (bVar = aVar.f512001b) != null) {
                    list = bVar.f512004c;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(7:11|12|13|14|15|1cb|27)(2:35|36))(4:37|38|39|(1:43)(2:41|42)))(3:45|85|(2:54|(2:82|83)(7:58|b3|69|(1:71)|38|39|(0)(0)))(8:84|85|86|(2:88|(1:90))|92|14|15|1cb))))|101|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0174, code lost:
    
        r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009d, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r24, vt3.r r25, int r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.u.m(int, vt3.r, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
