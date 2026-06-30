package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class uv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f110836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(com.tencent.mm.plugin.finder.feed.xv xvVar) {
        super(0);
        this.f110836d = xvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int r19 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int r27 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        int r28 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        int r29 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("Finder.TimelineMachinePresenter", "refreshMsgNotify commentCnt " + r17 + ", likeCnt " + r18 + " objectLikeLikeCnt " + r19 + " objectRecommendLikeCnt " + r27 + " friendRecommendCnt：" + r29);
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f110836d;
        so2.t tVar = xvVar.f111118t;
        tVar.f410598d = r17 + r18 + r19 + r27 + r28 + r29;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        tVar.f410602h = (java.lang.String) m17;
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.tv(xvVar));
        return jz5.f0.f302826a;
    }
}
