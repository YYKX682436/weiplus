package a84;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.o0 f83877a = new a84.o0();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.r0 f83878b;

    /* renamed from: c, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.y0 f83879c;

    static {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        f83878b = new a84.n0(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "checkShouldUseDynamicXml"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 0
            if (r4 != 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        Le:
            if (r5 != 0) goto L14
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L14:
            boolean r3 = d()
            if (r3 == 0) goto L37
            java.lang.String r3 = ".adxml.canvasShareInfo.canvasId"
            java.lang.String r4 = c(r4, r5, r3)
            r5 = 1
            if (r4 == 0) goto L30
            int r4 = r4.length()
            if (r4 <= 0) goto L2b
            r4 = r5
            goto L2c
        L2b:
            r4 = r2
        L2c:
            if (r4 != r5) goto L30
            r4 = r5
            goto L31
        L30:
            r4 = r2
        L31:
            if (r4 == 0) goto L37
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        L37:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.a(java.lang.String, java.lang.String):boolean");
    }

    public static final void b(long j17, int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.lang.String str3, yz5.l onFetchValid, yz5.l onInValid) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFetchValid, "onFetchValid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onInValid, "onInValid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenAdCanvasHelper", "commonJumpDynamicAdCanvas() called with: pageId = " + j17 + ", fromSource = " + i17 + ", uxInfo = " + str + ", canvasDynamicInfo = " + str2 + ", activity = " + activity);
        za4.a aVar = new za4.a();
        aVar.f552589d = false;
        java.lang.String c17 = za4.s1.b().c(j17, 0, 0, 0, i17, str, str2, aVar);
        if (!(c17 == null || r26.n0.N(c17)) && za4.z0.u(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenAdCanvasHelper", "commonJumpDynamicAdCanvas() , use cache xml!");
            java.lang.String h17 = h(c17, str3);
            if (h17 == null) {
                h17 = str3;
            }
            if (za4.z0.u(h17)) {
                if (h17 == null) {
                    h17 = "";
                }
                onFetchValid.mo146xb9724478(h17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1967, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(activity);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(f83878b), null, new a84.h0(h0Var, activity, j17, i17, str, str2, aVar, str3, onFetchValid, onInValid, null), 2, null)).p(new a84.i0(h0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
    }

    public static final java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return "";
        }
        try {
            java.lang.String str4 = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, str2, null).get(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenAdCanvasHelper", "getXmlValueByTag exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d() {
        /*
            java.lang.String r0 = "OpenAdCanvasHelper"
            java.lang.String r1 = "isEnableDynamicXmlInShare called "
            java.lang.String r2 = "isEnableDynamicXmlInShare"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L30
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L30
            e42.d0 r6 = e42.d0.clicfg_ad_enable_share_use_dynamic_xml_cfg_android     // Catch: java.lang.Throwable -> L30
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L30
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r1 = move-exception
            goto L32
        L30:
            r1 = move-exception
            r5 = r4
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isEnableDynamicXmlInShare, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L44:
            if (r5 <= 0) goto L47
            r4 = 1
        L47:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.d():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        if (r29 != 27) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r21, int r22, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r23, i64.b1 r24, int r25, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r26, android.view.View r27, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 r28, int r29, int r30, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad r31, w64.x r32) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.e(java.lang.String, int, com.tencent.mm.plugin.sns.storage.SnsInfo, i64.b1, int, com.tencent.mm.ui.MMActivity, android.view.View, com.tencent.mm.plugin.sns.model.k4, int, int, com.tencent.mm.modelsns.SnsAdClick, w64.x):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(s64.b r21, int r22, android.content.Context r23, java.lang.Long r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.f(s64.b, int, android.content.Context, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static final java.lang.String g(java.lang.String str, java.lang.String str2) {
        a84.z0 f17;
        a84.z0 f18;
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        if (str == null || (f17 = a84.e1.f(str)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        }
        if (str2 == null || (f18 = a84.e1.f(str2)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        }
        a84.z0 b17 = a84.e1.b(f18);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        }
        a84.z0 c18 = a84.e1.c(b17, ".adxml.adCanvasInfo");
        if (c18 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        }
        a84.z0 c19 = a84.e1.c(f17, ".adxml.adCanvasInfo");
        if (c19 == null || (c17 = c19.c()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        }
        c18.d(kz5.n0.V0(c17));
        java.lang.String h17 = a84.e1.h(f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        return h17 == null ? str2 : h17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10.b(), "giveHBCardInfo") == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String h(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.h(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(long r29, int r31, java.lang.String r32, java.lang.String r33, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r34, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r35, i64.b1 r36, int r37, android.view.View r38, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 r39, int r40, int r41, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad r42, w64.x r43) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.o0.i(long, int, java.lang.String, java.lang.String, com.tencent.mm.ui.MMActivity, com.tencent.mm.plugin.sns.storage.SnsInfo, i64.b1, int, android.view.View, com.tencent.mm.plugin.sns.model.k4, int, int, com.tencent.mm.modelsns.SnsAdClick, w64.x):void");
    }

    public final java.lang.Object j(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar, im5.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAdCanvasXmlByNet", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenAdCanvasHelper", "requestAdCanvasXml() called with: pageId = " + j17 + ", preload = " + i17 + ", preloadInnerRes = " + i18 + ", source = " + i19 + ", uxInfo = " + str + ", canvasDynamicInfo = " + str2 + ", adCanvasParams = " + aVar + ", keeper = " + bVar);
        java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.a4.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, new a84.m0(j17, i17, i18, i19, str, str2, aVar, bVar, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAdCanvasXmlByNet", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        return c17;
    }
}
