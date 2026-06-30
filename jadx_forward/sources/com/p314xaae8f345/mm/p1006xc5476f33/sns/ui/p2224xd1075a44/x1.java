package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class x1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f252841c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f252843e;

    /* renamed from: f, reason: collision with root package name */
    public static long f252844f;

    /* renamed from: h, reason: collision with root package name */
    public static int f252846h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f252847i;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1 f252839a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f252840b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(300);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f252842d = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f252848j = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public static final float f252845g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_emoticon_comment_detail_cgi_interval, 0.5f);

    static {
        f252841c = 1000;
        f252847i = true;
        f252847i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_emoticon_emoji_info_update_by_cgi, 1) == 1;
        f252841c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_emoticon_file_cache_limit_count, 1000);
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMemoryCache$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f252840b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMemoryCache$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return r2Var;
    }

    public final void b(long j17, r45.e86 e86Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList = f252842d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                z17 = false;
                break;
            }
            r45.z76 z76Var = (r45.z76) it.next();
            if (z76Var.f473310e == e86Var.f454665m && z76Var.f473311f == e86Var.f454670r) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                z17 = true;
                break;
            }
        }
        if (!z17) {
            r45.z76 z76Var2 = new r45.z76();
            z76Var2.f473309d = j17;
            z76Var2.f473310e = e86Var.f454665m;
            z76Var2.f473311f = e86Var.f454670r;
            z76Var2.f473312g = 0;
            arrayList.add(z76Var2);
            d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        f252846h++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        if (f252843e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        java.util.ArrayList arrayList = f252842d;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        if (f252846h <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        if (((float) (java.lang.System.currentTimeMillis() - f252844f)) < f252845g * 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        f252844f = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "batchCommentContentFromServer >> lastReqTimeStamp: " + f252844f);
        f252843e = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 9774;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnscommentdetail";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        r45.b86 b86Var = new r45.b86();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReqList", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        if (20 <= size) {
            size = 20;
        }
        java.util.Iterator it = arrayList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            arrayList2.add((r45.z76) next);
            if (arrayList2.size() == size) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReqList", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        b86Var.f452166e.addAll(arrayList2);
        b86Var.f452165d = arrayList2.size();
        lVar.f152197a = b86Var;
        lVar.f152198b = new r45.c86();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r1(b86Var), false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("timeline_emoticon_cache");
        if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            com.p314xaae8f345.mm.vfs.w6.u(c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "create dir:" + c17);
        }
        java.lang.String str2 = c17 + '/' + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return str2;
    }

    public final r45.l86 f(long j17, r45.e86 commentInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentInfo, "commentInfo");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d.n(commentInfo)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return null;
        }
        r45.l86 l86Var = (r45.l86) commentInfo.f454673u.getFirst();
        java.lang.String str = l86Var.f460763d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f252840b;
        if (r2Var.k(str)) {
            r45.m86 m86Var = (r45.m86) r2Var.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86Var);
            if (!g(m86Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> memoryCache is invalid to addBatch " + str);
                b(j17, commentInfo);
            }
            r45.l86 l86Var2 = m86Var.f461781e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return l86Var2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String e17 = e(str);
        if (com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            r45.m86 m86Var2 = new r45.m86();
            i(e17, m86Var2);
            if (g(m86Var2)) {
                r2Var.put(str, m86Var2);
                r45.l86 l86Var3 = m86Var2.f461781e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                return l86Var3;
            }
            if (m86Var2.f461781e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> file has exist but is invalid to addBatch ".concat(str));
                r2Var.put(str, m86Var2);
                b(j17, commentInfo);
                r45.l86 l86Var4 = m86Var2.f461781e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                return l86Var4;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> no cache to addBatch ".concat(str));
        b(j17, commentInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return l86Var;
    }

    public final boolean g(r45.m86 m86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m86Var, "<this>");
        r45.l86 l86Var = m86Var.f461781e;
        if (l86Var == null || l86Var.f460769m != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return false;
        }
        if (java.lang.System.currentTimeMillis() / 1000 > m86Var.f461782f + m86Var.f461781e.f460770n) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return true;
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        f252846h--;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void i(java.lang.String str, r45.m86 m86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        try {
            m86Var.mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(str, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCommentEmojiInfoCache", "safeParseCacheFile error >> " + str + " message: " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void j(long j17, r45.e86 commentInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentInfo, "commentInfo");
        if (f252847i && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d.n(commentInfo)) {
            p3325xe03a0797.p3326xc267989b.l.d(f252848j, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w1(commentInfo, j17, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }
}
