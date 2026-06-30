package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 f175978a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f175979b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f175980c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f175981d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f175982e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f175983f;

    static {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c3.a(), 43200L);
        f175979b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c3.a(), 604800L);
        f175980c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c3.a(), 86400L);
        f175981d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c3.a(), 604800L);
        f175982e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.s2.f175963d);
        f175983f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m2.f175893d);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var, java.lang.String str, java.lang.String str2, ts1.o oVar, int i17, java.util.Map map, nu4.a aVar) {
        t2Var.getClass();
        boolean a17 = us1.c.a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) ((jz5.n) oVar.f503142v).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "fetchContent businessData: " + x51.j1.b(gVar) + ", enableFetchByTransfer: " + a17);
        us1.b bVar = new us1.b(str, oVar, str2, map);
        java.lang.String b17 = x51.j1.b(gVar);
        if (b17 == null) {
            b17 = "";
        }
        bVar.f511997e = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h2(str, oVar, str2, map, aVar);
        java.util.Iterator it = ((java.util.ArrayList) us1.c.f511999b).iterator();
        while (it.hasNext()) {
            vs1.e eVar = (vs1.e) it.next();
            if (eVar.b(bVar) && eVar.a(bVar, h2Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherContentManager", "fetchContent by " + eVar.mo172601x337a8b() + ", url: %s", bVar.f511993a);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:175|176|17|18|19|20|21|(7:23|24|25|26|27|28|29)(1:276)|30|(1:32)(1:269)|33) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:23|24|25|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x1271, code lost:
    
        r29 = r29;
        r11 = r23;
        r8 = r8;
        r23 = r74;
        r10 = r24;
        r13 = r6;
        r30 = r12;
        r24 = r32;
        r2 = r25;
        r6 = r27;
        r3 = r31;
        r4 = r72;
        r14 = r7;
        r7 = r27;
        r15 = r11;
        r11 = r75;
        r16 = r0;
        r0 = r71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x1329, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, "Report Error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x12bd, code lost:
    
        r73 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x12c0, code lost:
    
        r72 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x1326, code lost:
    
        r71 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0037. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0e3a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0f1d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x1208  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1038  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1064  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1094  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x12aa A[Catch: Exception -> 0x12c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x12c0, blocks: (B:21:0x129d, B:23:0x12aa), top: B:20:0x129d }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x139b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x1312 A[Catch: Exception -> 0x1329, TRY_LEAVE, TryCatch #2 {Exception -> 0x1329, blocks: (B:29:0x12b6, B:30:0x12da, B:32:0x1303, B:269:0x1312, B:276:0x12c3), top: B:28:0x12b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x12c3 A[Catch: Exception -> 0x1329, TryCatch #2 {Exception -> 0x1329, blocks: (B:29:0x12b6, B:30:0x12da, B:32:0x1303, B:269:0x1312, B:276:0x12c3), top: B:28:0x12b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x1222  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x1303 A[Catch: Exception -> 0x1329, TryCatch #2 {Exception -> 0x1329, blocks: (B:29:0x12b6, B:30:0x12da, B:32:0x1303, B:269:0x1312, B:276:0x12c3), top: B:28:0x12b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x11e9 -> B:12:0x1200). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 r71, r45.q83 r72, long r73, r45.o83 r75, java.util.List r76, java.util.HashMap r77, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r78) {
        /*
            Method dump skipped, instructions count: 5278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2, r45.q83, long, r45.o83, java.util.List, java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1.equals("application/x-javascript") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1.equals("text/javascript") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r1.equals("application/javascript") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2 e(java.lang.String r1) {
        /*
            java.lang.String r0 = "contentType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1347062799: goto L52;
                case -1082243251: goto L45;
                case -1004747231: goto L38;
                case -723118015: goto L2c;
                case 168355044: goto L20;
                case 1440428940: goto L17;
                case 2132236175: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L5e
        Ld:
            java.lang.String r0 = "text/javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            goto L5e
        L17:
            java.lang.String r0 = "application/javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            goto L5e
        L20:
            java.lang.String r0 = "application/wxprefetcher"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            goto L5e
        L29:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175757i
            goto L60
        L2c:
            java.lang.String r0 = "application/x-javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            goto L5e
        L35:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175753e
            goto L60
        L38:
            java.lang.String r0 = "text/css"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            goto L5e
        L42:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175754f
            goto L60
        L45:
            java.lang.String r0 = "text/html"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4f
            goto L5e
        L4f:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175755g
            goto L60
        L52:
            java.lang.String r0 = "application/wspkg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5b
            goto L5e
        L5b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175756h
            goto L60
        L5e:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175758m
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.e(java.lang.String):com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2 f(java.util.HashMap headers) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        java.util.List list = (java.util.List) headers.get("content-type");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return e(lowerCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.h(java.lang.String):boolean");
    }

    public static void j(java.lang.String url, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, long j17, java.lang.String str5, int i19, java.lang.Object obj) {
        java.util.HashMap hashMap;
        java.lang.String appId = (i19 & 2) != 0 ? "" : str;
        java.lang.String title = (i19 & 4) != 0 ? "" : str2;
        java.lang.String desc = (i19 & 8) != 0 ? "" : str3;
        java.lang.String from = (i19 & 16) != 0 ? "" : str4;
        int i27 = (i19 & 32) != 0 ? -1 : i17;
        int i28 = (i19 & 64) == 0 ? i18 : -1;
        long j18 = (i19 & 128) != 0 ? 1000L : j17;
        java.lang.String str6 = (i19 & 256) != 0 ? null : str5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "preAuth: " + title + " prefetchId: " + str6 + ", " + url);
        long j19 = j18;
        ys1.b bVar = new ys1.b(url, appId, title, desc, from, i28, i27, 0, null, null, str6, ce1.h.f4368x366c91de, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = f175978a;
        java.lang.String str7 = ys1.b.class.getCanonicalName() + "_addToPreload";
        synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a) {
            hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(str7);
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            java.util.HashMap hashMap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            if (!hashMap2.containsKey(str7)) {
                hashMap2.put(str7, new java.util.LinkedList());
            }
            java.lang.Object obj2 = hashMap2.get(str7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda$1$lambda$0>");
            ((java.util.LinkedList) obj2).add(bVar);
        }
        hashMap.put(str7, p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j2(j19, str7, null, t2Var), 2, null));
    }

    public static final void k(long j17, java.util.List auths) {
        java.lang.String str;
        long j18 = j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(auths, "auths");
        if (auths.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "preAuths, session:" + j18 + ", size:" + auths.size());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = ts1.u.f503151a;
        ((ku5.t0) ku5.t0.f394148d).b(new ts1.t(auths), "MicroMsg.WebPrefetcherUrlQueryManager");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = auths.iterator();
        while (true) {
            str = "url";
            if (!it.hasNext()) {
                break;
            }
            zq1.i0 i0Var = (zq1.i0) it.next();
            java.lang.String url = i0Var.f556516a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
            if (r26.i0.y(url, "http", false)) {
                java.lang.String a17 = ts1.u.a(i0Var.f556516a);
                java.lang.String b17 = ts1.u.b(a17, i0Var);
                if (a17.length() > 0) {
                    if (b17.length() > 0) {
                        hashMap.put(a17, b17);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = f175978a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(auths, 10));
        java.util.Iterator it6 = auths.iterator();
        while (it6.hasNext()) {
            zq1.i0 i0Var2 = (zq1.i0) it6.next();
            java.lang.String str2 = i0Var2.f556516a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, str);
            java.lang.String str3 = i0Var2.f556520e;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = i0Var2.f556521f;
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = i0Var2.f556522g;
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = i0Var2.f556523h;
            arrayList.add(new ys1.b(str2, str4, str6, str8, str9 == null ? "" : str9, i0Var2.f556519d, i0Var2.f556518c, i0Var2.f556525j, null, i0Var2.f556524i, i0Var2.f556517b, 256, null));
            j18 = j17;
            it6 = it6;
            str = str;
        }
        t2Var.o(arrayList, j18, hashMap);
    }

    public final xs1.d c(java.lang.String url, ts1.o target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        nu4.b bVar = target.f503123c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        xs1.d dVar = new xs1.d(url, bVar.Q(target.d()));
        boolean m17 = dVar.f537830b.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "fetchContent request savedFileExist: " + m17 + ", eTag: " + target.i() + ", wxETag: " + target.v());
        if (m17) {
            dVar.f537832d = target.i();
            dVar.f537833e = target.v();
        }
        return dVar;
    }

    public final java.lang.Object d(nu4.a aVar, r45.o97 o97Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        java.lang.String ManifestUrl = aVar.f421767b.f461764e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ManifestUrl, "ManifestUrl");
        java.lang.String a17 = nu4.d0.a(ManifestUrl);
        nu4.k kVar = nu4.b0.f421774J;
        nu4.b bVar = nu4.b0.R;
        boolean O = bVar.O(a17);
        r45.l83 l83Var = aVar.f421766a;
        r45.m83 m83Var = aVar.f421767b;
        if (O) {
            zw4.g.a(zw4.e.f558443e, zw4.f.f558448e, l83Var.f460759d, o97Var.f463604x, aVar.f421769d, aVar.f421770e, "", m83Var.f461764e);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a.a()) {
                java.lang.String ManifestUrl2 = m83Var.f461764e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ManifestUrl2, "ManifestUrl");
                if (r26.i0.y(ManifestUrl2, "file://", false)) {
                    long d17 = com.p314xaae8f345.mm.vfs.w6.d(m83Var.f461764e, bVar.Q(a17).o(), false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "fetchManifest from local file: %s, size: %d", m83Var.f461764e, new java.lang.Long(bVar.Q(a17).C()));
                    if (d17 > 0) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                    }
                }
            }
            zw4.g.a(zw4.e.f558445g, zw4.f.f558448e, l83Var.f460759d, o97Var.f463604x, aVar.f421769d, aVar.f421770e, "", m83Var.f461764e);
            java.lang.String ManifestUrl3 = m83Var.f461764e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ManifestUrl3, "ManifestUrl");
            ws1.d.a(new xs1.d(ManifestUrl3, bVar.Q(a17)), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i2(o97Var, aVar, a17, nVar));
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return a18;
    }

    public final java.util.List g(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "getUrlCookie: ".concat(url));
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url, false);
        nu4.k kVar = nu4.b0.f421774J;
        java.util.List list = (java.util.List) new ts1.o(url, i17, nu4.b0.P, f175980c, null, null, null, null, false, null, null, 2032, null).l().get("x-wx-prefetch-pkg-cookie");
        boolean z17 = true;
        if (!(list == null || list.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "getUrlCookie from x-wx-prefetch-pkg-cookie, cookie: " + list);
            return list;
        }
        java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.d.g().a(url);
        if (a17 != null && a17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "getUrlCookie from cookie manager, cookie: " + a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return kz5.b0.c(a17);
    }

    public final nu4.a i(java.lang.String str, java.util.List list) {
        android.net.Uri parse = android.net.Uri.parse(str);
        nu4.a c17 = nu4.b0.f421774J.c(parse.getHost());
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "matchManifest debug");
            return c17;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.l83 l83Var = (r45.l83) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getHost(), l83Var.f460759d)) {
                java.util.LinkedList<r45.m83> ResInfos = l83Var.f460761f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ResInfos, "ResInfos");
                for (r45.m83 m83Var : ResInfos) {
                    java.lang.String path = parse.getPath();
                    boolean z17 = false;
                    if (path != null) {
                        java.lang.String Path = m83Var.f461763d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Path, "Path");
                        if (nf.e.d(path, Path, false, 2, null)) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m83Var);
                        return new nu4.a(l83Var, m83Var, null, 0, 0, false, null, 124, null);
                    }
                }
            }
        }
        return null;
    }

    public final void l(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String host = android.net.Uri.parse((java.lang.String) it.next()).getHost();
            if (host == null) {
                host = "";
            }
            arrayList.add(host);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            java.lang.String str = (java.lang.String) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (!r26.n0.N(str)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 a3Var = yq1.z.f546029g;
                if (!yq1.z.f546031i.m(str)) {
                    r2 = true;
                }
            }
            if (r2) {
                arrayList2.add(next);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList2);
        if (Q.isEmpty()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k2(Q));
    }

    public final void m(long j17, java.lang.String url, java.lang.String prefetchUrl, java.lang.String str, boolean z17, java.util.Map map, int i17, int i18, int i19, nu4.a aVar, boolean z18, boolean z19) {
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefetchUrl, "prefetchUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(url), url, prefetchUrl, z17, map, 0, 32, null);
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2.class.getCanonicalName() + "_batch";
        synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a) {
            hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(str2);
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            java.util.HashMap hashMap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            if (!hashMap2.containsKey(str2)) {
                hashMap2.put(str2, new java.util.LinkedList());
            }
            java.lang.Object obj = hashMap2.get(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda$1$lambda$0>");
            ((java.util.LinkedList) obj).add(d2Var);
        }
        hashMap.put(str2, p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l2(50L, str2, null, str, aVar, z18, z19, i19, i17, i18, prefetchUrl, j17, url), 2, null));
    }

    public final void n(r45.o97 o97Var) {
        java.lang.String url = o97Var.f463587d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
        java.lang.String webId = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url, false);
        java.lang.String str = o97Var.f463603w;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            ts1.q qVar = ts1.q.f503147a;
            java.lang.String url2 = o97Var.f463587d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url2, "url");
            o97Var.f463603w = qVar.b(url2, o97Var.f463605y, false);
        }
        java.lang.String fullUrl = o97Var.f463592i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fullUrl, "fullUrl");
        o97Var.f463593m = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(fullUrl, true);
        java.lang.String str2 = o97Var.f463603w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webId, "webId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = ts1.p.f503146b;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).H(webId, o97Var.mo14344x5f01b1f6());
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(webId, str2)) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).D(str2, webId);
        }
        java.lang.String url3 = o97Var.f463587d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url3, "url");
        int i17 = o97Var.f463604x;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var2 = at1.a.f95164a;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) at1.a.f95164a.i()).A(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url3, false), i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save preauth webid:");
        sb6.append(webId);
        sb6.append(" bizId: ");
        sb6.append(o97Var.f463593m);
        sb6.append(" prefetchId: ");
        sb6.append(o97Var.f463603w);
        sb6.append(", prefetch:");
        sb6.append(o97Var.f463594n);
        sb6.append(", authorized:");
        sb6.append(o97Var.f463590g);
        sb6.append(", antispam:");
        sb6.append(o97Var.f463589f);
        sb6.append(", lastModify:");
        sb6.append(o97Var.f463588e);
        sb6.append(", appId: ");
        sb6.append(o97Var.f463598r);
        sb6.append(", pkgFileKey: ");
        sb6.append(o97Var.f463601u);
        sb6.append(", jsapiControlBytes: ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = o97Var.f463600t;
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f273689a.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "save preauth url: %s", o97Var.f463587d);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.util.List r28, long r29, java.util.HashMap r31) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.o(java.util.List, long, java.util.HashMap):void");
    }
}
