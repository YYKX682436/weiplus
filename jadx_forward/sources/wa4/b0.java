package wa4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wa4.b0 f525736a = new wa4.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f525737b = new java.util.LinkedHashMap();

    public final void a(java.lang.String localId, wa4.f0 postInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPostingItem", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        f525737b.put(localId, postInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPostingItem", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
    }

    public final wa4.f0 b(java.lang.String localId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findPostInfoByLocalId", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        wa4.f0 f0Var = (wa4.f0) ((java.util.LinkedHashMap) f525737b).get(localId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findPostInfoByLocalId", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        return f0Var;
    }
}
