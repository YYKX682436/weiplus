package l44;

/* loaded from: classes4.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f397570a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:38:0x0032, B:13:0x0040, B:28:0x0049, B:32:0x0075, B:33:0x007c), top: B:37:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:38:0x0032, B:13:0x0040, B:28:0x0049, B:32:0x0075, B:33:0x007c), top: B:37:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r13, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.b0.a(java.lang.String, com.tencent.mm.plugin.sns.storage.ADInfo):boolean");
    }

    public static boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("disableClickTimeCheck", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_timeline_click_expire_time_disabled, 0) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("disableClickTimeCheck", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return z17;
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        java.lang.String t07;
        int e17;
        boolean m70315x5f796633;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e67;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        int i18;
        boolean z17;
        boolean z18;
        long j17;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        try {
            t07 = ca4.z0.t0(c17932x22276883.f67610x29d1292e);
            e17 = c01.id.e();
            m70315x5f796633 = c17932x22276883.m70315x5f796633();
            m70299x10413e67 = c17932x22276883.m70299x10413e67();
            i17 = m70299x10413e67.f38090x97d9bbb3;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_isAdExpired", th6);
        }
        if (i17 > 0 && i17 < e17 && !m70315x5f796633) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExpireDeleteHelper", "contract ad expired, snsId=" + t07);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = c17932x22276883.m70300x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
        if (m70300x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
            str = "ad expired, snsId=";
            str2 = "isAdExpired, check clickTime not expired, snsId=";
            i18 = e17;
            z17 = m70315x5f796633;
            z18 = false;
        } else {
            str = "ad expired, snsId=";
            if (m70300x74235b3e.f38267xb3033354 == 1) {
                z17 = m70315x5f796633;
                if (m70300x74235b3e.f38266x44a6aaa > 0) {
                    i18 = e17;
                    str2 = "isAdExpired, check clickTime not expired, snsId=";
                    if (c01.id.e() >= m70300x74235b3e.f38266x44a6aaa) {
                        z18 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
                    }
                } else {
                    i18 = e17;
                    str2 = "isAdExpired, check clickTime not expired, snsId=";
                }
            } else {
                str2 = "isAdExpired, check clickTime not expired, snsId=";
                i18 = e17;
                z17 = m70315x5f796633;
            }
            z18 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExpireDeleteHelper", "Preview ad expired, snsId=" + t07);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return true;
        }
        if (!a(t07, m70299x10413e67)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExpireDeleteHelper", str2 + t07);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        if (z17) {
            j17 = m70299x10413e67.f38093x3d6e00aa * 60;
            i19 = c17932x22276883.f67600xa9e31799;
        } else {
            j17 = m70299x10413e67.f38098xe3b5494 * 60;
            i19 = c17932x22276883.f67597x480f98d1;
        }
        if (i18 - i19 >= j17) {
            java.lang.String r17 = c01.z1.r();
            boolean U = ca4.m0.U(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17932x22276883.m70298xd15b2ed8()), r17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExpireDeleteHelper", str + t07 + ", hasCommentOrLike=" + U + ", isExposure=" + z17 + ", userName=" + r17);
            if (!U) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return false;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return null;
        }
        java.lang.String t07 = ca4.z0.t0(c17932x22276883.f67610x29d1292e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExpireDeleteHelper", "resetAdExposureInfo, snsId=" + t07 + ", exposureTime=" + c17932x22276883.f67600xa9e31799 + ", exposureCount=" + i64.z0.a(c17932x22276883) + ", isExposured=" + c17932x22276883.m70315x5f796633());
        c17932x22276883.f67600xa9e31799 = 0;
        c17932x22276883.f67599x919325c3 = 0;
        c17932x22276883.m70326xb6afa42c();
        i64.z0.b(t07);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return c17932x22276883;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0063, B:13:0x0071, B:16:0x007b), top: B:18:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0063, B:13:0x0071, B:16:0x007b), top: B:18:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r14) {
        /*
            java.lang.String r0 = "updateAdClickFlagInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = b()
            java.lang.String r3 = "AdExpireDeleteHelper"
            if (r2 == 0) goto L1a
            java.lang.String r14 = "updateAdClickFlagInfo, disableClickTimeCheck"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L1a:
            if (r14 != 0) goto L26
            java.lang.String r14 = "updateAdClickFlagInfo, snsInfo is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r14)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L26:
            long r4 = r14.f68891x29d1292e
            java.lang.String r14 = ca4.z0.t0(r4)
            com.tencent.mm.plugin.sns.storage.j0 r2 = new com.tencent.mm.plugin.sns.storage.j0
            r2.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r2.f247557a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "updateAdClickFlagInfo, adClickFlagInfoJson is "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = ", snsId is "
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
            java.lang.String r3 = "saveAdClickFlagInfo, key is "
            java.lang.String r4 = "saveAdClickFlagInfo"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdClickStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            java.lang.String r6 = "AdClickStorage"
            if (r14 == 0) goto L6e
            int r7 = r14.length()     // Catch: java.lang.Throwable -> L6c
            if (r7 != 0) goto L6a
            goto L6e
        L6a:
            r7 = 0
            goto L6f
        L6c:
            r14 = move-exception
            goto Lbd
        L6e:
            r7 = 1
        L6f:
            if (r7 == 0) goto L7b
            java.lang.String r14 = "saveAdClickFlagInfo, snsId is null or empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r14)     // Catch: java.lang.Throwable -> L6c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)     // Catch: java.lang.Throwable -> L6c
            goto Lc3
        L7b:
            com.tencent.mm.plugin.sns.storage.l0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l0.f247576a     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r7.a(r14)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "toJson"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.AdClickFlagInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r8, r9)     // Catch: java.lang.Throwable -> L6c
            cl0.g r10 = new cl0.g     // Catch: java.lang.Throwable -> L6c
            r10.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r11 = "clickTime"
            long r12 = r2.f247557a     // Catch: java.lang.Throwable -> L6c
            r10.p(r11, r12)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r10 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r10)     // Catch: java.lang.Throwable -> L6c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r8, r9)     // Catch: java.lang.Throwable -> L6c
            p34.o.h(r14, r7, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            r14.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = ", ret is "
            r14.append(r3)     // Catch: java.lang.Throwable -> L6c
            r14.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L6c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r14)     // Catch: java.lang.Throwable -> L6c
            goto Lc0
        Lbd:
            ca4.q.c(r6, r14)
        Lc0:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
        Lc3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.b0.e(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public static boolean f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        boolean z17 = false;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        long j17 = c17933xe8d1b226.f68891x29d1292e;
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2.f245881h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.List list2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2.f245881h;
        if (list2.contains(valueOf)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        } else {
            list2.add(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2(j17, 1, c17933xe8d1b226.m70346x10413e67().f38081xedaa190c);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(k2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return true;
    }
}
