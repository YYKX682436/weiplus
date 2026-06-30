package n34;

/* loaded from: classes10.dex */
public final class h3 implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final n34.h3 f416143d = new n34.h3();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f416144e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f416145f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f416146g;

    /* renamed from: h, reason: collision with root package name */
    public static int f416147h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f416148i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f416149m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f416150n;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f416151o;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("details_finder_entry");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        f416146g = M;
        f416148i = new java.util.LinkedHashMap();
        f416149m = new java.util.LinkedHashMap();
        f416150n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_photo_count_share_finder, 0);
        f416151o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_poi_finder_post, true);
    }

    public static final void a(n34.h3 h3Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$clearSelectCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        h3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearSelectCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "clearSelectCacheData localSnsId:" + str);
        f416144e.remove(str);
        java.util.HashMap hashMap = f416145f;
        wu5.c cVar = (wu5.c) hashMap.get(str);
        if (cVar != null) {
            cVar.cancel(false);
        }
        hashMap.remove(str);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6093x27a4b8f6().e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6088x9da57c78 c6088x9da57c78 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6088x9da57c78();
        c6088x9da57c78.f136366g.f89199a = str;
        c6088x9da57c78.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearSelectCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$clearSelectCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }

    public final boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendDetailsShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.lang.String str2 = "details_sc_" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f416146g;
        boolean z17 = false;
        int i17 = o4Var.getInt(str2, 0);
        if (i17 >= f416147h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "[checkDetailsShowCount] showCount touch limit: showCount = " + i17 + ", maxCount = " + f416147h);
        } else {
            z17 = true;
            int i18 = i17 + 1;
            o4Var.putInt(str2, i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "[checkDetailsShowCount] showCount inc: showCount = " + i18 + ", maxCount = " + f416147h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendDetailsShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r13 != null ? r13.f454847g : null) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "canShowSnsPostEntrance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.SnsFinderPostManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "getFinderPostData"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            r3 = 0
            if (r13 != 0) goto L14
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            r4 = r3
            goto L1f
        L14:
            java.util.HashMap r4 = n34.h3.f416144e
            java.lang.Object r4 = r4.get(r13)
            n34.w3 r4 = (n34.w3) r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L1f:
            r2 = 0
            if (r4 != 0) goto L26
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L26:
            java.lang.Class<ra0.v> r5 = ra0.v.class
            i95.m r5 = i95.n0.c(r5)
            ra0.v r5 = (ra0.v) r5
            r5.getClass()
            java.lang.Class<w40.e> r5 = w40.e.class
            i95.m r5 = i95.n0.c(r5)
            w40.e r5 = (w40.e) r5
            java.lang.String r6 = "getType"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.SnsPostFinderData"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            n34.x3 r8 = n34.x3.f416309f
            n34.x3 r9 = r4.f416300a
            r10 = 1
            if (r9 != r8) goto L4c
            r11 = r10
            goto L4d
        L4c:
            r11 = r2
        L4d:
            qs2.q r5 = (qs2.q) r5
            boolean r5 = r5.wi(r11)
            java.lang.String r11 = "MicroMsg.SnsFinderPostManager"
            if (r5 != 0) goto L60
            java.lang.String r13 = "canShowSnsPostEntrance false by IFinderPublishFeatureService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r11, r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L60:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            if (r9 != r8) goto Ld2
            pc4.d r5 = pc4.d.f434943a
            boolean r5 = r5.C()
            if (r5 == 0) goto L74
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L74:
            java.lang.String r5 = "getPhotos"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r7)
            java.util.ArrayList r5 = r4.f416305f
            if (r5 != 0) goto L84
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L84:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L8e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L8e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "canShowSnsPostEntrance: result="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r7 = ", localSnsId="
            r6.append(r7)
            r6.append(r13)
            java.lang.String r7 = ", containData="
            r6.append(r7)
            boolean r13 = r12.e(r13)
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r13)
            int r13 = n34.h3.f416150n
            int r5 = r5.size()
            if (r13 <= r5) goto Lcd
            boolean r13 = n34.h3.f416151o
            if (r13 == 0) goto Lce
            r45.ed4 r13 = r4.a()
            if (r13 == 0) goto Lc7
            java.lang.String r3 = r13.f454847g
        Lc7:
            boolean r13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r13 != 0) goto Lce
        Lcd:
            r2 = r10
        Lce:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        Ld2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.h3.c(java.lang.String):boolean");
    }

    public final boolean d(java.lang.String str, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_details_show_finder_entry, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "canShowSnsPostEntranceInDetails entry = " + fj6 + ", isPrivate = " + z17 + ", localSnsId = " + str + ", guide = " + i17 + ", typeFlag = " + i18);
        if (!fj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return false;
        }
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(i18) || i18 == 15)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return false;
        }
        boolean z18 = (i17 & 1) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        int i19 = f416146g.getInt("details_sc_" + str, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (i19 != 0) {
            boolean b17 = b(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return b17;
        }
        if (z18) {
            b(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowSnsPostEntranceInDetails", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return z18;
    }

    public final boolean e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("contains", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        boolean containsKey = f416144e.containsKey(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("contains", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return containsKey;
    }

    public final com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 f(java.lang.String desc, long j17, long j18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        java.util.HashMap hashMap = f416144e;
        if (hashMap.get(str) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return null;
        }
        n34.w3 w3Var = (n34.w3) hashMap.get(str);
        r45.ed4 a17 = w3Var != null ? w3Var.a() : null;
        r45.ze2 ze2Var = new r45.ze2();
        if (a17 != null) {
            ze2Var.set(0, java.lang.Float.valueOf(a17.f454844d));
            ze2Var.set(1, java.lang.Float.valueOf(a17.f454845e));
            ze2Var.set(2, a17.f454846f);
            ze2Var.set(3, a17.f454847g);
            ze2Var.set(4, a17.f454848h);
            ze2Var.set(5, a17.f454849i);
            ze2Var.set(6, java.lang.Integer.valueOf(a17.f454850m));
            ze2Var.set(9, a17.f454859v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        int h17 = h(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        byte[] D = pm0.v.D(ze2Var);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209517v8).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "templateEditSelectNoTemplate: ret " + z17);
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41 c11013xe2775c41 = new com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41(desc, h17, D, j17, j18, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return c11013xe2775c41;
    }

    public final java.util.ArrayList g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.util.ArrayList arrayList = null;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return null;
        }
        n34.w3 w3Var = (n34.w3) f416144e.get(str);
        if (w3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            java.util.ArrayList<java.lang.String> arrayList2 = w3Var.f416305f;
            if (arrayList2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                for (java.lang.String str2 : arrayList2) {
                    arrayList3.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, 0L, str2, str2, ""));
                }
                arrayList = new java.util.ArrayList(arrayList3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return arrayList;
    }

    public final int h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return 4;
        }
        java.lang.Integer num = (java.lang.Integer) nu3.i.f421751a.l().b("KEY_MEDIA_SOURCE_INT", -1);
        int i17 = (num == null || num.intValue() != 1) ? (num != null && num.intValue() == 2) ? 3 : 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "[getVideoSourceScene] videoSource:" + i17 + " isFromMJ:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return i17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:155|(14:(1:157)(2:227|(1:229)(24:230|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(2:213|214)(1:174)|(1:212)(2:178|179)|180|181|182|183|(1:185)|(2:187|188)(1:190)|189))|170|171|172|(0)(0)|(1:176)|212|180|181|182|183|(0)|(0)(0)|189)|158|159|160|161|162|163|164|165|166|167|168|169|153) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:76|(1:299)(1:80)|81|(1:298)|85|(1:87)(1:297)|88|(1:90)(1:296)|91|(5:94|(1:96)(1:103)|(3:98|99|100)(1:102)|101|92)|104|105|(5:107|(4:110|(2:112|113)(2:253|254)|(3:115|116|(2:122|(5:124|(1:126)|127|(1:130)|131)))(1:252)|108)|255|256|257)(6:258|(5:261|(1:263)(1:270)|(3:265|266|267)(1:269)|268|259)|271|272|(1:274)(2:278|(2:279|(5:281|(2:283|(3:285|286|(2:288|289)(1:290)))(1:293)|291|292|(0)(0))(2:294|295)))|(1:276)(17:277|133|(5:136|(1:138)(1:144)|(2:140|141)(1:143)|142|134)|145|146|147|148|(3:152|(28:155|(1:157)(2:227|(1:229)(24:230|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(2:213|214)(1:174)|(1:212)(2:178|179)|180|181|182|183|(1:185)|(2:187|188)(1:190)|189))|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(0)(0)|(1:176)|212|180|181|182|183|(0)|(0)(0)|189|153)|231)|233|234|(2:236|(11:238|239|240|241|242|243|244|195|(5:197|(2:199|(3:203|204|(1:208)))|210|204|(2:206|208))(1:211)|209|(2:63|64)(5:65|(1:67)|68|(1:70)(1:72)|71)))|249|244|195|(0)(0)|209|(0)(0)))|132|133|(1:134)|145|146|147|148|(4:150|152|(1:153)|231)|233|234|(0)|249|244|195|(0)(0)|209|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05c3, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x05c1, code lost:
    
        r51 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05c6, code lost:
    
        r51 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x061b, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0617, code lost:
    
        r51 = r9;
        r49 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b3 A[Catch: all -> 0x0617, TryCatch #5 {all -> 0x0617, blocks: (B:148:0x049d, B:150:0x04a5, B:152:0x04a9, B:153:0x04ad, B:155:0x04b3, B:157:0x04be, B:159:0x04cc, B:229:0x04c5), top: B:147:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0593 A[Catch: all -> 0x0612, TryCatch #1 {all -> 0x0612, blocks: (B:183:0x058a, B:185:0x0593, B:187:0x0598, B:233:0x05c9, B:236:0x05d9), top: B:182:0x058a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0598 A[Catch: all -> 0x0612, TryCatch #1 {all -> 0x0612, blocks: (B:183:0x058a, B:185:0x0593, B:187:0x0598, B:233:0x05c9, B:236:0x05d9), top: B:182:0x058a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0543 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05d9 A[Catch: all -> 0x0612, TryCatch #1 {all -> 0x0612, blocks: (B:183:0x058a, B:185:0x0593, B:187:0x0598, B:233:0x05c9, B:236:0x05d9), top: B:182:0x058a }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[LOOP:6: B:279:0x03ec->B:290:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0774  */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r54v0, types: [android.content.Context, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r54, java.lang.String r55, java.lang.String r56, long r57, long r59, r45.ib6 r61, boolean r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.h3.i(android.content.Context, java.lang.String, java.lang.String, long, long, r45.ib6, boolean, boolean):boolean");
    }

    public final boolean j(android.content.Context context, java.lang.String desc, long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2 = "postSnsPhotos";
        java.lang.String str3 = "com.tencent.mm.plugin.sns.SnsFinderPostManager";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        java.util.HashMap hashMap = f416144e;
        if (hashMap.get(str) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return false;
        }
        n34.w3 w3Var = (n34.w3) hashMap.get(str);
        if (w3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            java.util.ArrayList arrayList = w3Var.f416305f;
            if (arrayList != null) {
                n34.w3 w3Var2 = (n34.w3) hashMap.get(str);
                r45.ed4 a17 = w3Var2 != null ? w3Var2.a() : null;
                r45.ze2 ze2Var = new r45.ze2();
                if (a17 != null) {
                    ze2Var.set(0, java.lang.Float.valueOf(a17.f454844d));
                    ze2Var.set(1, java.lang.Float.valueOf(a17.f454845e));
                    ze2Var.set(2, a17.f454846f);
                    ze2Var.set(3, a17.f454847g);
                    ze2Var.set(4, a17.f454848h);
                    ze2Var.set(5, a17.f454849i);
                    ze2Var.set(6, java.lang.Integer.valueOf(a17.f454850m));
                    ze2Var.set(9, a17.f454859v);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                int h17 = h(false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    java.lang.Object obj = arrayList.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    java.lang.String str4 = (java.lang.String) obj;
                    com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str4);
                    int i18 = size;
                    java.lang.String str5 = a18.f294812f;
                    java.lang.String str6 = str2;
                    java.lang.String str7 = str3;
                    if (str5 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                        if (!str5.equals(l17)) {
                            a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsFinderPostManager", "mediaPath = %s, isExist = %s", str4, java.lang.Boolean.valueOf(!m17.a() ? false : m17.f294799a.F(m17.f294800b)));
                    i17++;
                    size = i18;
                    str2 = str6;
                    str3 = str7;
                }
                java.lang.String str8 = str2;
                java.lang.String str9 = str3;
                qs2.q qVar = (qs2.q) ((w40.e) i95.n0.c(w40.e.class));
                qVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postSnsPhotos: imagePathSize=");
                sb6.append(arrayList.size());
                sb6.append(", desc=");
                sb6.append(desc);
                sb6.append(" videoSource=");
                sb6.append(h17);
                sb6.append(", location=");
                java.lang.String m75945x2fec8307 = ze2Var.m75945x2fec8307(3);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                sb6.append(m75945x2fec8307);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", sb6.toString());
                android.content.Intent intent = new android.content.Intent();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 29, 74, intent);
                intent.putExtra("key_finder_sns_post_type", 4);
                intent.putExtra("key_finder_post_router", 6);
                intent.putExtra("key_finder_post_from", 20);
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                int i19 = 0;
                for (java.lang.Object obj2 : arrayList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str10 = (java.lang.String) obj2;
                    java.lang.String c17 = q75.g.c(str10);
                    arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, i19, str10, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) ? "" : c17));
                    i19 = i27;
                }
                intent.putParcelableArrayListExtra("key_finder_post_sns_photo_path_list", arrayList2);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(gm0.j1.b().j());
                sb7.append('_');
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb7.append(java.lang.System.currentTimeMillis());
                java.lang.String sb8 = sb7.toString();
                intent.putExtra("post_id", sb8);
                intent.putExtra("edit_id", sb8);
                intent.putExtra("saveDesc", desc);
                intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
                intent.putExtra("KEY_SNS_SERVER_FEED_ID", j17);
                intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j18);
                qVar.Ui(intent, ze2Var);
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                    p2Var.W(p2Var.i(context, 27, false));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                    p2Var2.W(p2Var2.i(context, 16, false));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.B(4);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, intent);
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                qVar.wj(true, j17, Ri == null ? "" : Ri, j18, true, z18);
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap).remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "[postSnsPhotos] skipCheck = " + z17);
                if (!z17) {
                    b(str);
                }
                if (sb8 != null) {
                    java.util.Map map = f416149m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    map.put(sb8, str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str8, str9);
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return false;
    }

    public final int k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resize2Even", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (i17 % 2 != 0) {
            i17--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resize2Even", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return i17;
    }

    public final void l(java.lang.String str, r45.ed4 ed4Var, android.content.Intent intent, boolean z17) {
        byte[] byteArray;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        int h17 = h(z17);
        if (intent.hasExtra("key_composition_info")) {
            byteArray = intent.getByteArrayExtra("key_composition_info");
        } else {
            android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
            byteArray = bundleExtra != null ? bundleExtra.getByteArray("key_composition_info") : null;
        }
        if (byteArray != null) {
            r45.h70 h70Var = new r45.h70();
            h70Var.mo11468x92b714fd(byteArray);
            long j17 = h70Var.f457432f - h70Var.f457431e;
            if (!((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ai(j17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "saveFinderPostData: localSnsId=" + str + ", durationMs=" + j17 + ", video duration is too short, 1");
                f416144e.remove(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                return;
            }
            java.util.HashMap hashMap = f416144e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newVideoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
            str2 = "saveFinderPostData";
            n34.w3 w3Var = new n34.w3(n34.x3.f416308e, h70Var.mo14344x5f01b1f6(), null, ed4Var, h17, null, 36, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newVideoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
            hashMap.put(str, w3Var);
            if (pc4.d.f434943a.C()) {
                wa4.b0.f525736a.a(str, new wa4.f0(wa4.d0.f525750f, null, new wa4.e0(null, h17, h70Var.mo14344x5f01b1f6(), 1, null), ed4Var, false, 18, null));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveFinderPostData with composition info localSnsId=");
            sb6.append(str);
            sb6.append(" videoSource:");
            sb6.append(h17);
            sb6.append(" location:");
            sb6.append(ed4Var != null ? ed4Var.f454847g : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", sb6.toString());
            ((ku5.t0) ku5.t0.f394148d).g(new n34.c3(h70Var));
        } else {
            str2 = "saveFinderPostData";
            if (intent.hasExtra("KSightPath")) {
                java.lang.String stringExtra = intent.getStringExtra("KSightPath");
                boolean booleanExtra = intent.getBooleanExtra("intent_skip_video_duration_check", false);
                dw3.h.d(dw3.h.f325744a, null, null, 3, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(stringExtra, true);
                int i17 = d17 != null ? d17.f243915a : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "saveFinderPostData: skipCheck = " + booleanExtra + " path:" + stringExtra + " length:" + com.p314xaae8f345.mm.vfs.w6.k(stringExtra));
                if (!booleanExtra) {
                    if (!((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ai(i17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "saveFinderPostData: localSnsId=" + str + ", durationMs=" + i17 + ", video duration is too short, 2");
                        f416144e.remove(str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                        return;
                    }
                }
                if (stringExtra == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                    return;
                }
                java.util.HashMap hashMap2 = f416144e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newVideoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
                str2 = str2;
                n34.w3 w3Var2 = new n34.w3(n34.x3.f416307d, null, stringExtra, ed4Var, h17, null, 34, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newVideoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
                hashMap2.put(str, w3Var2);
                if (pc4.d.f434943a.C()) {
                    wa4.b0.f525736a.a(str, new wa4.f0(wa4.d0.f525749e, null, new wa4.e0(stringExtra, h17, null, 4, null), ed4Var, false, 18, null));
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("saveFinderPostData with video path:");
                sb7.append(stringExtra);
                sb7.append(" localSnsId=");
                sb7.append(str);
                sb7.append(" videoSource:");
                sb7.append(h17);
                sb7.append(" location:");
                sb7.append(ed4Var != null ? ed4Var.f454847g : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", sb7.toString());
                ((ku5.t0) ku5.t0.f394148d).g(new n34.d3(stringExtra, str));
            }
        }
        if (!pc4.d.f434943a.E()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            n34.e3 e3Var = new n34.e3(str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            wu5.c z18 = t0Var.z(e3Var, 300000L, false);
            java.util.HashMap hashMap3 = f416145f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z18);
            hashMap3.put(str, z18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }

    public final void m(java.lang.String str, r45.ed4 ed4Var, java.util.ArrayList photos, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photos, "photos");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        pc4.d dVar = pc4.d.f434943a;
        if (dVar.C()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        java.util.HashMap hashMap = f416144e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newPhotoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
        n34.w3 w3Var = new n34.w3(n34.x3.f416309f, null, null, ed4Var, 0, photos, 22, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newPhotoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
        hashMap.put(str, w3Var);
        if (!dVar.E()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            n34.f3 f3Var = new n34.f3(str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            wu5.c z18 = t0Var.z(f3Var, 300000L, false);
            java.util.HashMap hashMap2 = f416145f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z18);
            hashMap2.put(str, z18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }

    @Override // mv2.w0
    /* renamed from: onPrePostEvent */
    public void mo56230x6f338df6(java.lang.String postId, mv2.g0 event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrePostEvent", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postId, "postId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Map map = f416149m;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(postId);
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrePostEvent", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        java.util.Map map2 = f416148i;
        yz5.l lVar = (yz5.l) ((java.util.LinkedHashMap) map2).get(str);
        if (lVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrePostEvent", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        lVar.mo146xb9724478(java.lang.Boolean.valueOf(event == mv2.g0.f413103e));
        map2.remove(str);
        map.remove(postId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrePostEvent", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }
}
