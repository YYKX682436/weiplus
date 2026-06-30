package n74;

/* loaded from: classes4.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f416975a = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f416976b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static /* synthetic */ java.util.Set a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return f416975a;
    }

    public static boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        boolean z17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return z17;
    }

    public static void c(java.util.LinkedList linkedList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            e((r45.g5) linkedList.get(i18), i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
            java.lang.System.currentTimeMillis();
            n74.w1.c(i17);
            l();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "checkPreloadAdResource, exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, checkPreloadAdResourceByTLObj", th6);
        }
        if (!b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "checkPreloadAdResource, network is not wifi or 4G,5G");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        f(c19807x593d1720, c17903x3b438f4, c17902x72cc1771, i17);
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x010d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(r45.g5 r13, int r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.v1.e(r45.g5, int):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:1|(3:(1:224)(1:229)|(1:226)(1:228)|227)(1:4)|5|6|(1:8)(1:222)|9|(1:12)|13|(7:15|(1:17)(1:220)|18|(1:20)(1:219)|21|(1:23)(1:218)|(1:25)(1:217))(1:221)|26|27|28|29|(2:30|31)|(2:33|34)(27:172|173|(2:178|(2:180|181)(2:182|(2:184|185)(2:186|(2:188|189)(2:190|(2:192|193)(23:194|(3:(2:197|(1:199)(4:200|201|202|203))|205|203)(1:206)|204|36|(1:38)(3:164|(2:166|(2:168|(1:170)))|171)|39|(1:163)(1:(1:162)(2:48|(1:161)(4:51|(3:53|(2:59|60)|61)|65|66)))|67|(3:69|(4:72|(2:74|75)(2:77|(2:79|(2:81|82)(1:83))(2:84|(2:86|87)(2:88|(2:90|(4:92|(1:94)|95|96)(1:97))(2:98|(2:100|(2:102|103)(1:104))(2:105|106)))))|76|70)|107)|108|(5:114|(2:117|115)|118|119|(1:125))|126|(2:128|(1:130)(2:131|(1:133)(2:134|(1:136)(1:137))))|138|139|140|(1:144)|146|(1:152)|153|(1:155)|156|157)))))|207|208|209|36|(0)(0)|39|(1:41)|163|67|(0)|108|(7:110|112|114|(1:115)|118|119|(3:121|123|125))|126|(0)|138|139|140|(2:142|144)|146|(3:148|150|152)|153|(0)|156|157)|35|36|(0)(0)|39|(0)|163|67|(0)|108|(0)|126|(0)|138|139|140|(0)|146|(0)|153|(0)|156|157|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x056c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x056d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", r0.toString());
        ca4.q.c("TimeLineAdPreloadHelper, preloadFinderFeeds", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c9 A[LOOP:2: B:115:0x04c3->B:117:0x04c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x054d A[Catch: all -> 0x056c, TryCatch #2 {all -> 0x056c, blocks: (B:140:0x0549, B:142:0x054d, B:144:0x0551), top: B:139:0x0549 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c4  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r20, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 r21, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 r22, int r23) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.v1.f(com.tencent.mm.protocal.protobuf.TimeLineObject, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.ADInfo, int):void");
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.lang.String e17 = z17 ? a84.m.e(str) : za4.t0.l("adId", str);
        if (!android.text.TextUtils.isEmpty(e17) && com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", str3 + " file exists, snsId=" + str2 + ", useCdn=" + z17 + ", filePath=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        if (z17) {
            java.util.Set set = f416976b;
            if (set.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", str3 + " [cdn] downloading, snsId=" + str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return;
            }
            set.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 34);
            a84.m.d(str, new n74.s1(str3, str2, str));
        } else {
            java.util.Set set2 = f416975a;
            if (set2.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", str3 + " [http] downloading, snsId=" + str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return;
            }
            set2.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 34);
            za4.t0.a(str, true, 41, 0, new n74.t1(str3, str2, str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        g(str, str2, str3, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        g(str, str2, str3, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.lang.String l17 = za4.t0.l("adId", str);
        if (!android.text.TextUtils.isEmpty(l17) && com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", str2 + " [landingPageImg] file exists, filePath=" + l17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.util.Set set = f416975a;
        if (!set.contains(str)) {
            set.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 34);
            za4.t0.d("adId", str, new n74.r1(str, str2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", str2 + ", [landingPageImg] downloading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean k(i64.q qVar, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || !c17903x3b438f4.m70139x9b8322ea()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        if (jj4Var == c17903x3b438f4.f38180xbeae372e.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        t74.a2 a2Var = c17903x3b438f4.f38180xbeae372e;
        a2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        r45.jj4 jj4Var2 = a2Var.f497623e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        if (jj4Var == jj4Var2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        if (jj4Var == c17903x3b438f4.f38180xbeae372e.d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPhotoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            boolean z17 = jj4Var.f459389e == 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static void l() {
        java.lang.String b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (v34.b.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            v34.a aVar = new v34.a();
            v34.a.a(aVar, true, true);
            b17 = v34.a.b(aVar);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (b17 == null) {
                b17 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", "AdDeviceInfo.preloadDeviceInfo, timeCost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", ret = " + b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void m(i64.q qVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "preloadBreakVideo, adModel = null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var = c17903x3b438f4.f38152x29dcd87f;
        if (d0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a17 = d0Var.a();
            a17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            r45.jj4 jj4Var = a17.f247448a;
            if (jj4Var != null) {
                jj4Var.N = true;
            }
            r45.jj4 a18 = d0Var.a().a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a19 = d0Var.a();
            a19.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            if (a18 != null) {
                a18.N = true;
            }
            r45.jj4 jj4Var2 = a19.f247450c;
            if (jj4Var2 != null) {
                jj4Var2.N = true;
            }
            if (d0Var.a() != null && d0Var.a().b() != null && d0Var.a().b().b() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 stateInfo = d0Var.a().b().b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateInfo, "stateInfo");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayStateInfo", "preloadIcon start");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1.f247650d;
                q1Var.b(stateInfo.a());
                q1Var.b(stateInfo.c());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                q1Var.b(stateInfo.f247663d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                q1Var.b(stateInfo.f247664e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 b17 = stateInfo.b();
                if (b17 != null) {
                    q1Var.b(b17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            }
        }
        if ((c17903x3b438f4.m70131xa5a206c0() || c17903x3b438f4.m70132x7e206751() || c17903x3b438f4.m70133x90460dcf()) && d0Var != null) {
            int c17 = d0Var.a().c();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = qVar.f370822c;
            if (c17 == 1) {
                r45.jj4 a27 = d0Var.a().a();
                if (a27 == null || !o54.p.f424693a.c(2880, 1080)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a28 = d0Var.a();
                    a28.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    r45.jj4 jj4Var3 = a28.f247450c;
                    if (jj4Var3 != null) {
                        l44.c0.c(qVar, jj4Var3, c19807x593d1720.Id);
                        v(jj4Var3, c19807x593d1720.Id, z17);
                        if (c17903x3b438f4.m70133x90460dcf()) {
                            h(jj4Var3.f459393i, c19807x593d1720.Id, "TimeLineAdPreloadHelper");
                        }
                    }
                } else {
                    l44.c0.c(qVar, a27, c19807x593d1720.Id);
                    v(a27, c19807x593d1720.Id, z17);
                    if (c17903x3b438f4.m70133x90460dcf()) {
                        h(a27.f459393i, c19807x593d1720.Id, "TimeLineAdPreloadHelper");
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a29 = d0Var.a();
                a29.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                r45.jj4 jj4Var4 = a29.f247448a;
                if (jj4Var4 != null) {
                    l44.c0.c(qVar, jj4Var4, c19807x593d1720.Id);
                    v(jj4Var4, c19807x593d1720.Id, z17);
                    if (c17903x3b438f4.m70133x90460dcf()) {
                        h(jj4Var4.f459393i, c19807x593d1720.Id, "TimeLineAdPreloadHelper");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean n(i64.q qVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || !c17903x3b438f4.m70139x9b8322ea() || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", "preloadFlipCardRes, snsId=" + str);
        try {
            java.util.List h17 = c17903x3b438f4.f38180xbeae372e.h();
            if (a84.b0.b(h17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var = (r45.jj4) it.next();
                if (jj4Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    boolean z18 = jj4Var.f459389e == 6;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    if (z18) {
                        l44.c0.c(qVar, jj4Var, str);
                        t(jj4Var, str);
                    } else {
                        u(jj4Var, str, k(qVar, jj4Var));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "preloadFlipCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preload flipCardRes exp", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
    }

    public static boolean o(i64.q qVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        r45.jj4 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || !c17903x3b438f4.m70151x59316745() || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", "preloadLookbookCardRes, snsId=" + str);
        try {
            java.util.List<v74.q> c17 = c17903x3b438f4.f38191xf4087299.c();
            if (a84.b0.b(c17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
            for (v74.q qVar2 : c17) {
                if (qVar2 != null && (b17 = qVar2.b()) != null) {
                    if (qVar2.c()) {
                        l44.c0.c(qVar, b17, str);
                        t(b17, str);
                    } else {
                        java.lang.String str2 = b17.f459393i;
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            a84.m.d(str2, new n74.q1(str2));
                        }
                    }
                }
            }
            r45.jj4 f17 = c17903x3b438f4.f38191xf4087299.f();
            if (f17 != null) {
                l44.c0.c(qVar, f17, str);
                t(f17, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "preloadLookbookCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preload lookbook cardRes exp", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
    }

    public static void p(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "onPreloadPagFile, exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, onPreloadPagFile", th6);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(za4.t0.m("adId", str))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        }
    }

    public static boolean q(i64.q qVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || c17903x3b438f4.f38210x95847c91 == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            java.util.List<s34.x0> list = c17903x3b438f4.f38210x95847c91.f76695x5800ff2c;
            if (a84.b0.b(list)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            for (s34.x0 x0Var : list) {
                if (x0Var != null) {
                    if (x0Var.a()) {
                        l44.c0.c(qVar, x0Var.f484361e, str);
                        if (n74.l0.d()) {
                            v(x0Var.f484361e, str, z17);
                        }
                        t(x0Var.f484361e, str);
                    } else {
                        za4.t0.d("adId", x0Var.f484361e.f459393i, new n74.z1(null));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "preloadSlideFullCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preloadSlideFullCardRes", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    public static boolean r(i64.q qVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || c17903x3b438f4.f38179x76826a54 == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            java.util.List list = c17903x3b438f4.f38179x76826a54.f484189f;
            if (a84.b0.b(list)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                s34.i0 i0Var = (s34.i0) it.next();
                if (i0Var != null && i0Var.a()) {
                    v(i0Var.f484200i, str, z17);
                    t(i0Var.f484200i, str);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", "preloadTopicCardRes exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preloadTopicCardRes", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    public static boolean s(r45.jj4 jj4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.J(jj4Var))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 34);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n74.u1(str, jj4Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "startPreloadBigImage, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static boolean t(r45.jj4 jj4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 34);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n74.p1(str, jj4Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "startPreloadThumb, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static boolean u(r45.jj4 jj4Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (z17) {
            boolean s17 = s(jj4Var, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return s17;
        }
        boolean t17 = t(jj4Var, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return t17;
    }

    public static boolean v(r45.jj4 jj4Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, forbidden, snsId=" + str + ", mediaId=" + jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.R(jj4Var);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n74.o1(str, jj4Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f459388d + ", filePath=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }
}
