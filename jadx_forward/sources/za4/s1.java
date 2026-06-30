package za4;

/* loaded from: classes4.dex */
public class s1 {

    /* renamed from: f, reason: collision with root package name */
    public static final za4.s1 f552723f = new za4.s1();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h0 f552724a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f0 f552725b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f552726c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b3 f552727d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f552728e;

    public s1() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245950p == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245950p = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245950p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f552724a = h0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCanvasCacheInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245952r == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245952r = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f0 f0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245952r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCanvasCacheInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f552725b = f0Var;
        this.f552726c = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245951q == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245951q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zi().f245951q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f552727d = b3Var;
        this.f552728e = new java.util.HashMap();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("OpenCanvasMgr").mo50297x7c4d7ca2(new za4.n1(this), 5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static final java.lang.String a(long j17, java.lang.String str, int i17, java.lang.String str2, za4.a aVar) {
        ?? r76;
        ?? r57;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCanvasCacheKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        if (aVar == null || !aVar.f552589d) {
            r57 = d11.s.Di(6);
            r76 = m11.n1.g();
        } else {
            r57 = 0;
            r76 = 0;
        }
        ?? sb8 = new java.lang.StringBuilder("getAdCanvasCacheKey, supportH265 is ");
        sb8.append(r57);
        sb8.append(", supportWebP is ");
        sb8.append(r76);
        sb8.append(", adCanvasParams is ");
        sb8.append(aVar != null ? aVar.m178625x9616526c() : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenCanvasMgr", sb8.toString());
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((sb7 + r57) + r76);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCanvasCacheKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return a17;
    }

    public static za4.s1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return f552723f;
    }

    public static void e(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, za4.a aVar, za4.r1 r1Var, im5.b bVar) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        try {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.e93();
            lVar.f152198b = new r45.f93();
            lVar.f152199c = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
            lVar.f152200d = cc1.r.f4286x366c91de;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.e93 e93Var = (r45.e93) a17.f152243a.f152217a;
            e93Var.f454685d = j17;
            e93Var.f454686e = str;
            e93Var.f454687f = i19;
            e93Var.f454688g = str2;
            if (l44.h3.e() && (aVar == null || !aVar.f552589d)) {
                e93Var.f454691m = l44.e.b();
            }
            if (aVar == null || android.text.TextUtils.isEmpty(aVar.f552590e)) {
                e93Var.f454692n = m54.j.e();
            } else {
                java.lang.String str8 = aVar.f552590e;
                if (str8 == null) {
                    str8 = "";
                }
                e93Var.f454692n = str8;
            }
            if (aVar != null && (i27 = aVar.f552591f) > 0) {
                e93Var.f454693o = i27;
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                e93Var.f454694p = str3;
            }
            java.lang.String str9 = e93Var.f454692n;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestAdCanvasXmlFromNet, pageId=");
            sb6.append(j17);
            sb6.append(", preload=");
            sb6.append(i17);
            sb6.append(", source=");
            sb6.append(i19);
            sb6.append(", canvasDynamicInfo=");
            sb6.append(str2);
            sb6.append(", uxInfo=");
            sb6.append(str);
            sb6.append(", canvasDynamicLoadExtInfo=");
            sb6.append(str3);
            sb6.append(", SupportCapability = ");
            sb6.append(e93Var.f454691m);
            sb6.append(", adCanvasParams = ");
            sb6.append(aVar == null ? "" : aVar.m178625x9616526c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenCanvasMgr", sb6.toString());
            str7 = "OpenCanvasMgr";
            str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr";
            str5 = "requestAdCanvasXmlFromNet";
            str6 = "requestAdCanvasXmlFromNet, pageId=";
            try {
                com.p314xaae8f345.mm.p944x882e457a.z2.e(a17, new za4.o1(j17, r1Var, str2, str, str9, str3, i17, i18, i19, aVar), false, bVar);
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str7, str6 + j17 + ", exp=" + th.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr";
            str5 = "requestAdCanvasXmlFromNet";
            str6 = "requestAdCanvasXmlFromNet, pageId=";
            str7 = "OpenCanvasMgr";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
    }

    public static void f(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar, za4.r1 r1Var, im5.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        e(j17, i17, i18, i19, str, str2, "", aVar, r1Var, bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17, za4.q1 q1Var, im5.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestUxCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nj3();
        lVar.f152198b = new r45.oj3();
        lVar.f152199c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
        lVar.f152200d = 1890;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.nj3 nj3Var = (r45.nj3) a17.f152243a.f152217a;
        nj3Var.f462974d = str;
        nj3Var.f462975e = str2;
        com.p314xaae8f345.mm.p944x882e457a.z2.e(a17, new za4.p1(str, i17, q1Var, str2), false, bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestUxCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCanvasXmlFromCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(long r19, int r21, int r22, int r23, int r24, java.lang.String r25, java.lang.String r26, za4.a r27) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.s1.c(long, int, int, int, int, java.lang.String, java.lang.String, za4.a):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d(java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "openForUx"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11, r2}
            java.lang.String r3 = "OpenCanvasMgr"
            java.lang.String r4 = "open pageId %s, canvasExt %s, preLoad %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            java.lang.String r3 = ""
            if (r2 == 0) goto L24
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L24:
            r2 = 1
            if (r13 == r2) goto L83
            java.lang.String r13 = "getUxXmlFromCache"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r1)
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r4 != 0) goto L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            goto L43
        L42:
            r4 = r10
        L43:
            java.util.Map r5 = r9.f552728e
            java.util.HashMap r5 = (java.util.HashMap) r5
            boolean r6 = r5.containsKey(r4)
            if (r6 == 0) goto L57
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r1)
            goto L84
        L57:
            com.tencent.mm.plugin.sns.storage.a3 r6 = new com.tencent.mm.plugin.sns.storage.a3
            r6.<init>()
            r6.f67959x17759238 = r10
            r6.f67958xd73ca8a4 = r11
            java.lang.String r7 = "canvasId"
            java.lang.String r8 = "canvasExt"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            com.tencent.mm.plugin.sns.storage.b3 r8 = r9.f552727d
            r8.get(r6, r7)
            java.lang.String r7 = r6.f67960xd73cee9a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L80
            java.lang.String r7 = r6.f67960xd73cee9a
            r5.put(r4, r7)
            java.lang.String r4 = r6.f67960xd73cee9a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r1)
            goto L84
        L80:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r1)
        L83:
            r4 = r3
        L84:
            if (r12 == r2) goto L8a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        L8a:
            boolean r13 = android.text.TextUtils.isEmpty(r4)
            if (r13 == 0) goto L98
            r13 = 0
            g(r10, r11, r12, r13, r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L98:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.s1.d(java.lang.String, java.lang.String, int, int):java.lang.String");
    }

    public final java.lang.String h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        if (e0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
            return "";
        }
        java.lang.String str = "canvasId=" + e0Var.f66571x17759238 + ", source=" + e0Var.f66575x10639700 + ", createTime=" + e0Var.f66573xac3be4e + ", dynamicInfo=" + e0Var.f66574x5c4f59c8 + ", uxInfo=" + e0Var.f66576x14380cd6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return str;
    }
}
