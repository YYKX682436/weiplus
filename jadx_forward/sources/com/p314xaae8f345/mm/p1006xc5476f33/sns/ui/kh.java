package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class kh extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 f251166d;

    public kh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116) {
        this.f251166d = activityC18049x9dc71116;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = this.f251166d;
        if (i17 == 0) {
            int y76 = activityC18049x9dc71116.y7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i18 = activityC18049x9dc71116.G1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (y76 < i18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh v76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.v7(activityC18049x9dc71116);
                if (v76 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj = v76.N6().get(y76);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                activityC18049x9dc71116.C7((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) obj, ta4.s.f498353g);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh v77 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.v7(activityC18049x9dc71116);
                if (v77 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj2 = v77.N6().get(y76);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                activityC18049x9dc71116.C7((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) obj2, ta4.s.f498354h);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            activityC18049x9dc71116.G1 = y76;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (y76 >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh v78 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.v7(activityC18049x9dc71116);
                if (v78 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                    throw null;
                }
                if (y76 < v78.N6().size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh v79 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.v7(activityC18049x9dc71116);
                    if (v79 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) v79.N6().get(y76)).c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    activityC18049x9dc71116.f248343o = c17;
                    activityC18049x9dc71116.k7(c17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    if (y76 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e mo70578x3219b31c = c17.mo70578x3219b31c();
                        mo70578x3219b31c.m79168x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vg(activityC18049x9dc71116, c17, mo70578x3219b31c));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    }
                }
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.I1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            boolean x76 = activityC18049x9dc71116.x7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (x76) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                activityC18049x9dc71116.A7();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
    }
}
