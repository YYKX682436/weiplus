package m44;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final m44.a f404991a = new m44.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f404992b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static /* synthetic */ java.lang.String b(m44.a aVar, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendAvifFlag$default", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        java.lang.String a17 = aVar.a(str, z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAvifFlag$default", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return a17;
    }

    public static final void c(java.lang.String str, android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if (!n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAvifDecodeFailed, imageUrl is ");
        sb6.append(str);
        sb6.append(", options is ");
        sb6.append(options);
        sb6.append(", bitmap is null? == ");
        sb6.append(bitmap == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", sb6.toString());
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        if (!r26.n0.D(str, "svp_use_avif_flag=1", false, 2, null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        java.util.Set set = f404992b;
        if (set.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkAvifDecodeFailed and decodeAvifFailedSet contains this imageUrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        if (options != null) {
            java.lang.String str2 = options.outMimeType;
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String str3 = options.outMimeType;
                if (!(str3 != null && str3.equals("image/avif"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdAvifHelper", "checkAvifDecodeFailed, non-avif image but there is avif flag in image url");
                } else if (bitmap == null) {
                    set.add(str);
                    m44.d.a(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "checkAvifDecodeFailed, avif bitmap decode not success");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkAvifDecodeFailed, avif bitmap decode success");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkAvifDecodeFailed, which scene options is null?");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAvifDecodeFailed", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
    }

    public static final java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if (!n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkDownloadNewImgNeedFallbackAvif, imageUrl is " + str);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (!r26.n0.D(str, "svp_use_avif_flag=1", false, 2, null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (!f404992b.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkDownloadNewImgNeedFallbackAvif, decodeAvifFailedSet not contains this imageUrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 17L);
        java.lang.String h17 = f404991a.h(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadNewImgNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return h17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[Catch: all -> 0x009d, LOOP:0: B:20:0x005b->B:22:0x0061, LOOP_END, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x0014, B:5:0x0020, B:8:0x0024, B:10:0x0037, B:12:0x003d, B:15:0x004f, B:17:0x0053, B:19:0x0057, B:20:0x005b, B:22:0x0061, B:24:0x0070, B:25:0x0073), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "AdAvifHelper"
            java.lang.String r1 = "checkModifyAdSnsInfoForAvif"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.lang.String r3 = "adSnsInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r3)
            java.lang.String r3 = "logTag"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r3)
            long r3 = r11.f67610x29d1292e     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = ca4.z0.t0(r3)     // Catch: java.lang.Throwable -> L9d
            boolean r4 = m()     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L24
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)     // Catch: java.lang.Throwable -> L9d
            return
        L24:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9d
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r11.m70311x485d7()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "getTimeLine(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)     // Catch: java.lang.Throwable -> L9d
            boolean r7 = o()     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L4e
            boolean r7 = k()     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto L4e
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r11.m70300x74235b3e()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = "getAdXml(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)     // Catch: java.lang.Throwable -> L9d
            boolean r7 = i(r7)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L4e
            r7 = 1
            goto L4f
        L4e:
            r7 = 0
        L4f:
            r45.a90 r8 = r6.f39014x86965dde     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L73
            java.util.LinkedList r8 = r8.f451373h     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L73
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L9d
        L5b:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L70
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L9d
            r45.jj4 r9 = (r45.jj4) r9     // Catch: java.lang.Throwable -> L9d
            m44.a r10 = m44.a.f404991a     // Catch: java.lang.Throwable -> L9d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)     // Catch: java.lang.Throwable -> L9d
            r10.q(r9, r7)     // Catch: java.lang.Throwable -> L9d
            goto L5b
        L70:
            r11.m70330xfabce6e3(r6)     // Catch: java.lang.Throwable -> L9d
        L73:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r11.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = "checkModifyAdSnsInfoForAvif, snsId="
            r11.append(r6)     // Catch: java.lang.Throwable -> L9d
            r11.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = ", logTag=\""
            r11.append(r3)     // Catch: java.lang.Throwable -> L9d
            r11.append(r12)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r12 = "\", cost="
            r11.append(r12)     // Catch: java.lang.Throwable -> L9d
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9d
            long r6 = r6 - r4
            r11.append(r6)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L9d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)     // Catch: java.lang.Throwable -> L9d
            goto Laf
        L9d:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "checkModifyAdSnsInfoForAvif, exp="
            r12.<init>(r3)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r11)
        Laf:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m44.a.e(com.tencent.mm.plugin.sns.storage.AdSnsInfo, java.lang.String):void");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String snsId) {
        java.util.List h17;
        r45.jj4 b17;
        java.util.List<s34.x0> list;
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkModifyAdXmlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "checkModifyAdXmlForAvif, exp=" + th6);
        }
        if (m() && c17903x3b438f4 != null) {
            java.lang.System.currentTimeMillis();
            boolean z17 = o() && !k() && i(c17903x3b438f4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = c17903x3b438f4.f38162xfb2a357c;
            m44.a aVar = f404991a;
            if (m0Var != null && (c17 = m0Var.c()) != null) {
                java.util.Iterator it = c17.iterator();
                while (it.hasNext()) {
                    r45.jj4 b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g1) it.next()).b();
                    if (b18 != null) {
                        aVar.q(b18, z17);
                    }
                }
            }
            s34.a1 a1Var = c17903x3b438f4.f38210x95847c91;
            if (a1Var != null && (list = a1Var.f76695x5800ff2c) != null) {
                java.util.Iterator<s34.x0> it6 = list.iterator();
                while (it6.hasNext()) {
                    r45.jj4 jj4Var = it6.next().f484361e;
                    if (jj4Var != null) {
                        aVar.q(jj4Var, z17);
                    }
                }
            }
            v74.m mVar = c17903x3b438f4.f38191xf4087299;
            if (mVar != null) {
                for (v74.q qVar : mVar.c()) {
                    if (qVar != null && (b17 = qVar.b()) != null) {
                        aVar.q(b17, z17);
                    }
                }
            }
            t74.a2 a2Var = c17903x3b438f4.f38180xbeae372e;
            if (a2Var != null && (h17 = a2Var.h()) != null) {
                java.util.Iterator it7 = ((java.util.ArrayList) h17).iterator();
                while (it7.hasNext()) {
                    r45.jj4 jj4Var2 = (r45.jj4) it7.next();
                    if (jj4Var2 != null) {
                        aVar.q(jj4Var2, z17);
                    }
                }
            }
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkModifyAdXmlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return c17903x3b438f4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkModifyAdXmlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return c17903x3b438f4;
    }

    public static final void g(r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        if (!n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        java.lang.String str = media.f459393i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkSnsThumbNeedFallbackAvif, imageUrl is " + str);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (!r26.n0.B(str, "svp_use_avif_flag=1", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        if (!f404992b.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "checkSnsThumbNeedFallbackAvif, decodeAvifFailedSet not contains this imageUrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 17L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fallbackMediaObjAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "fallbackMediaObjAvif, media.type=" + media.f459389e + ", mediaType=" + media.S);
        int i17 = media.f459389e;
        m44.a aVar = f404991a;
        if (i17 == 6 || i17 == 4) {
            media.f459393i = aVar.h(media.f459393i);
        } else {
            media.f459391g = aVar.h(media.f459391g);
            media.f459393i = aVar.h(media.f459393i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fallbackMediaObjAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
    }

    public static final boolean i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 adXml) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdSupportAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adXml, "adXml");
        boolean z17 = false;
        boolean z18 = adXml.f38254x1acd443e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, z18 ? 5L : 6L);
        if (ca4.m0.d0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19906x5f4b0b2e());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            if (h17 == 1) {
                z17 = true;
            } else if (h17 != 2) {
                z17 = z18;
            }
            z18 = z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSupportAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return z18;
    }

    public static final boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptDeviceDisable", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_device_disable_avif, 0) > 0;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 9L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptDeviceDisable", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "isExptDeviceDisableAvif, exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptDeviceDisable", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return false;
        }
    }

    public static final boolean l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptEnableAdLandingPageAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_enable_avif, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, z17 ? 14L : 15L);
            if (ca4.m0.d0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19907x41cd2495());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                z17 = h17 != 1 ? h17 != 2 ? z17 : false : true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAdLandingPageAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "isExptEnableAdLandingPageAvif, exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAdLandingPageAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return false;
        }
    }

    public static final boolean m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptEnableAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_enable_avif, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, z17 ? 7L : 8L);
            if (ca4.m0.d0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19906x5f4b0b2e());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                z17 = h17 != 1 ? h17 != 2 ? z17 : false : true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "isExptEnableAvif, exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return false;
        }
    }

    public static final boolean n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptEnableAvifFallback", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_enable_fallback_avif, 0) > 0;
            if (ca4.m0.d0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdEnableAvifFallbackRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19914x5b6a9053());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdEnableAvifFallbackRepairerConfigInt", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                z17 = h17 != 1 ? h17 != 2 ? z17 : false : true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAvifFallback", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifHelper", "isExptEnableAvifFallback, exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptEnableAvifFallback", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return false;
        }
    }

    public static final boolean o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSysSupportAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        boolean z17 = android.os.Build.VERSION.SDK_INT >= 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, z17 ? 10L : 11L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return z17;
    }

    public static final java.lang.String p(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("modifyImageUrlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        boolean z18 = false;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("modifyImageUrlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (!l()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("modifyImageUrlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (o() && !k() && z17) {
            z18 = true;
        }
        java.lang.String d17 = d(f404991a.a(str, z18, true));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("modifyImageUrlForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return d17;
    }

    public final java.lang.String a(java.lang.String str, boolean z17, boolean z18) {
        java.lang.String t17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendAvifFlag", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAvifFlag", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (z18) {
            if (!l()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAvifFlag", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
                return str;
            }
        } else if (!m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAvifFlag", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        if (r26.n0.D(str, "svp_use_avif_flag", false, 2, null)) {
            t17 = z17 ? r26.i0.t(str, "svp_use_avif_flag=0", "svp_use_avif_flag=1", false) : r26.i0.t(str, "svp_use_avif_flag=1", "svp_use_avif_flag=0", false);
        } else {
            t17 = ca4.z0.d(str, "svp_use_avif_flag", z17 ? "1" : "0");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "appendAvifFlag, ret=" + t17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAvifFlag", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return t17;
    }

    public final java.lang.String h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return str;
        }
        java.lang.String d17 = !r26.n0.D(str, "svp_use_avif_flag", false, 2, null) ? ca4.z0.d(str, "svp_use_avif_flag", "0") : r26.i0.t(str, "svp_use_avif_flag=1", "svp_use_avif_flag=0", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAvifHelper", "fallback, ret=" + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fallbackAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return d17;
    }

    public final boolean j(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAvifImageFile", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean z17 = false;
        if (!o()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAvifImageFile", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.d(path, options);
        java.lang.String str = options.outMimeType;
        if (str != null && str.equals("image/avif")) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAvifImageFile", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        return z17;
    }

    public final void q(r45.jj4 jj4Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("modifyMediaObjForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
        if (jj4Var != null) {
            int i17 = jj4Var.f459389e;
            m44.a aVar = f404991a;
            if (i17 == 6 || i17 == 4) {
                jj4Var.f459393i = b(aVar, jj4Var.f459393i, z17, false, 4, null);
            } else {
                jj4Var.f459391g = b(aVar, jj4Var.f459391g, z17, false, 4, null);
                jj4Var.f459393i = b(aVar, jj4Var.f459393i, z17, false, 4, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("modifyMediaObjForAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifHelper");
    }
}
