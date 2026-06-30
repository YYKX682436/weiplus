package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu f192541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar) {
        super(0);
        this.f192541d = zuVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int r19 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int r27 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsPresenter", "refreshMsgNotify commentCnt " + r17 + ", likeCnt " + r18 + " objectLikeLikeCnt " + r19 + " objectRecommendLikeCnt " + r27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f192541d;
        so2.t tVar = zuVar.f192835q;
        tVar.f492131d = r17 + r18 + r19 + r27;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        tVar.f492135h = (java.lang.String) m17;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vu(zuVar));
        return jz5.f0.f384359a;
    }
}
