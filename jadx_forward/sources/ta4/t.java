package ta4;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f498363a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f498364b;

    /* renamed from: c, reason: collision with root package name */
    public r45.e86 f498365c;

    /* renamed from: d, reason: collision with root package name */
    public int f498366d;

    /* renamed from: e, reason: collision with root package name */
    public ta4.s f498367e = ta4.s.f498351e;

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLogId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        return 36244;
    }

    public final void b(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComment", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f498365c = e86Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComment", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfo", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f498364b = c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfo", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsScene", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f498363a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsScene", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final java.util.Map e() {
        java.lang.String snsAlbumSessionId;
        java.lang.String valueOf;
        java.util.LinkedList linkedList;
        r45.d86 d86Var;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toDictionary", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f498364b;
        linkedHashMap.put("sns_feed_id", c17933xe8d1b226 != null ? ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e) : null);
        int i17 = this.f498363a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        if (i17 == ta4.z0.f498402f.h()) {
            snsAlbumSessionId = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsAlbumSessionId, "requestSessionId(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            java.lang.String snsAlbumSessionId2 = ca4.z0.f121604d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsAlbumSessionId2, "snsAlbumSessionId");
            if (snsAlbumSessionId2.length() > 0) {
                snsAlbumSessionId = ca4.z0.f121604d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsAlbumSessionId, "snsAlbumSessionId");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            } else {
                snsAlbumSessionId = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsAlbumSessionId, "requestSessionId(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            }
        }
        linkedHashMap.put("sessionid_sns", snsAlbumSessionId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f498364b;
        if (c17933xe8d1b2262 == null || !c17933xe8d1b2262.m70377x3172ed()) {
            r45.e86 e86Var = this.f498365c;
            valueOf = java.lang.String.valueOf(e86Var != null ? java.lang.Integer.valueOf(e86Var.f454665m) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            r45.e86 e86Var2 = this.f498365c;
            valueOf = java.lang.String.valueOf(e86Var2 != null ? java.lang.Long.valueOf(e86Var2.f454670r) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        }
        linkedHashMap.put("sns_cmt_id", valueOf);
        r45.e86 e86Var3 = this.f498365c;
        if (e86Var3 != null) {
            java.lang.Integer valueOf2 = (e86Var3 == null || (linkedList2 = e86Var3.A) == null) ? null : java.lang.Integer.valueOf(linkedList2.size());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
            if (valueOf2.intValue() > 0) {
                r45.e86 e86Var4 = this.f498365c;
                linkedHashMap.put("pic_md5", (e86Var4 == null || (linkedList = e86Var4.A) == null || (d86Var = (r45.d86) kz5.n0.X(linkedList)) == null) ? null : d86Var.f453773u);
            }
        }
        linkedHashMap.put("sns_scene", java.lang.Integer.valueOf(this.f498363a));
        int i18 = this.f498366d;
        if ((i18 > 0 ? linkedHashMap : null) != null) {
            linkedHashMap.put("cmt_pic_cnt", java.lang.Integer.valueOf(i18));
        }
        ta4.s sVar = this.f498367e;
        if ((sVar != ta4.s.f498351e ? linkedHashMap : null) != null) {
            sVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValue", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValue", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
            linkedHashMap.put("pic_exp_type", java.lang.Integer.valueOf(sVar.f498356d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toDictionary", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        return linkedHashMap;
    }
}
