package d44;

/* loaded from: classes4.dex */
public abstract class i {
    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, v64.d dVar) {
        ya2.e1 e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        boolean z17 = false;
        if (context != null) {
            try {
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderTopicRequest", "the enterTopicProfileUI has something wrong!!!");
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
                    e1Var = ya2.e1.f542005a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    e1Var = null;
                }
                if (e1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FinderTopicRequest", "the IFinderUtilApi object is null!!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    return z17;
                }
                java.lang.String b17 = b(c17933xe8d1b226, dVar);
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Di(context, str, str2, b17, i17, "", "", "", 0, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                return z17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FinderTopicRequest", "the encryptedTopicId or topicName is empty or context is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        return z17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r9, v64.d r10) {
        /*
            java.lang.String r0 = "makeSnsAdExtraString"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            if (r9 == 0) goto L6e
            if (r10 == 0) goto L6e
            java.lang.String r2 = "snsAdClick"
            r3 = 0
            java.lang.Object r10 = r10.a(r2, r3)
            com.tencent.mm.modelsns.SnsAdClick r10 = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) r10
            r2 = 0
            if (r10 == 0) goto L4a
            int r10 = r10.f153002g
            java.lang.String r3 = "convertClickPosToFinderFromScene"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            r5 = 1
            if (r10 == r5) goto L46
            r6 = 2
            if (r10 == r6) goto L46
            r7 = 3
            if (r10 == r7) goto L44
            r8 = 19
            if (r10 == r8) goto L44
            r8 = 59
            if (r10 == r8) goto L42
            switch(r10) {
                case 21: goto L42;
                case 22: goto L42;
                case 23: goto L44;
                default: goto L36;
            }
        L36:
            switch(r10) {
                case 25: goto L42;
                case 26: goto L3d;
                case 27: goto L46;
                case 28: goto L42;
                case 29: goto L42;
                default: goto L39;
            }
        L39:
            switch(r10) {
                case 32: goto L42;
                case 33: goto L40;
                case 34: goto L42;
                case 35: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L47
        L3d:
            r10 = 4
        L3e:
            r2 = r10
            goto L47
        L40:
            r10 = 6
            goto L3e
        L42:
            r2 = r7
            goto L47
        L44:
            r2 = r6
            goto L47
        L46:
            r2 = r5
        L47:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
        L4a:
            java.lang.String r10 = ca4.z0.T(r9)
            java.lang.String r9 = r9.m70375x338a8cc7()
            java.lang.String r9 = l44.s4.m(r9, r10, r2)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "makeSnsAdExtraString, snsAdInfo is "
            r10.<init>(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "SnsAd.FinderTopicRequest"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r9
        L6e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d44.i.b(com.tencent.mm.plugin.sns.storage.SnsInfo, v64.d):java.lang.String");
    }
}
