package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zm {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111282a;

    public zm(com.tencent.mm.ui.MMActivity context, com.tencent.mm.view.RefreshLoadMoreLayout rlLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f111282a = context;
    }

    public final void a(r45.r03 r03Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderNewsTopicHelper", "refreshHeader " + r03Var);
        if (r03Var != null) {
            r03Var.getInteger(2);
            r03Var.getInteger(5);
            com.tencent.mars.xlog.Log.i("Finder.FinderNewsTopicHelper", "setViewFollowed topicHeader null");
            com.tencent.mars.xlog.Log.i("Finder.FinderNewsTopicHelper", "setFollowView topicHeader null");
        }
        if (r03Var == null) {
            if (r03Var != null) {
                r03Var.getInteger(5);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderNewsTopicHelper", "setViewFollowed topicHeader null");
            com.tencent.mars.xlog.Log.i("Finder.FinderNewsTopicHelper", "setFollowView topicHeader null");
        }
    }
}
