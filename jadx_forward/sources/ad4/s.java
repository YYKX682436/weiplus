package ad4;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f84733d;

    public s(xc4.p pVar) {
        this.f84733d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveInteractionUtil", "click spring comment ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f84739d;
        android.view.View contentView = popupWindow != null ? popupWindow.getContentView() : null;
        if (contentView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        } else {
            contentView.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeSpringCommentLikeStatus: curFlag=");
            xc4.p pVar = this.f84733d;
            sb6.append(pVar.m125475xbd8ebd19());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveInteractionUtil", sb6.toString());
            android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.r1z);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) contentView.findViewById(com.p314xaae8f345.mm.R.id.r1x);
            if (pVar.m125475xbd8ebd19() == 0) {
                android.os.StrictMode.allowThreadDiskReads();
                pVar.m125486xb8471e25(1);
                pVar.c1().m70448xb8471e25(1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.d(pVar.e1(), pVar.c1());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.n(pVar.c1(), 1, null, 0);
                xa4.g gVar = xa4.g.f534363d;
                ad4.m mVar = new ad4.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshSpringLikedView$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                gVar.F(c22699x3dcdb352, textView, mVar, 100L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSpringLikedView$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            } else {
                pVar.m125486xb8471e25(0);
                pVar.c1().m70448xb8471e25(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.d(pVar.e1(), pVar.c1());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.a(pVar.e1());
                xa4.g.l(c22699x3dcdb352, textView, pVar.m175345x507e494d());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                pm0.v.X(new ad4.n(true));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$4");
    }
}
