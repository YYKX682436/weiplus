package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.m implements yz5.l {
    public f0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.class, "openCommentInputFooter", "openCommentInputFooter(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.y0 p07 = (so2.y0) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = (com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI) this.receiver;
        finderCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = finderCommentImageFlowUI.C;
        if (finderCommentFooter == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageFlowUI", "openCommentInputFooter footer is null");
        } else {
            finderCommentFooter.setFeedObj(finderCommentImageFlowUI.d7().O6());
            com.tencent.mm.plugin.finder.feed.ui.commentimage.m0 m0Var = new com.tencent.mm.plugin.finder.feed.ui.commentimage.m0(finderCommentFooter, finderCommentImageFlowUI);
            finderCommentFooter.getReplyBtn().setOnClickListener(m0Var);
            finderCommentFooter.getSecondaryReplyBtn().setOnClickListener(m0Var);
            finderCommentFooter.l();
            finderCommentFooter.setFooterMode(0);
            finderCommentFooter.setScene(finderCommentImageFlowUI.d7().f109822f);
            com.tencent.mm.plugin.finder.view.FinderCommentFooter.v(finderCommentFooter, true, false, 2, null);
            android.view.View view = finderCommentImageFlowUI.B;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "openCommentInputFooter", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "openCommentInputFooter", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.tools.f5 f5Var = finderCommentImageFlowUI.f109781y;
            if (f5Var != null) {
                f5Var.f();
            }
            finderCommentFooter.post(new com.tencent.mm.plugin.finder.feed.ui.commentimage.j0(finderCommentFooter, finderCommentImageFlowUI, p07));
        }
        return jz5.f0.f302826a;
    }
}
