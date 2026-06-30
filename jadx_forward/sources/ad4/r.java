package ad4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f84732d;

    public r(xc4.p pVar) {
        this.f84732d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View contentView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ad4.w wVar = ad4.w.f84736a;
        xc4.p pVar = this.f84732d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        try {
            android.widget.PopupWindow popupWindow = ad4.w.f84739d;
            contentView = popupWindow != null ? popupWindow.getContentView() : null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onLikeClick and exp is " + th6);
        }
        if (contentView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
        }
        android.content.Context context = contentView.getContext();
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.f564404qe);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) contentView.findViewById(com.p314xaae8f345.mm.R.id.f564402qc);
        if (pVar.m125475xbd8ebd19() == 0) {
            android.os.StrictMode.allowThreadDiskReads();
            pVar.m125486xb8471e25(1);
            pVar.c1().m70448xb8471e25(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.d(pVar.e1(), pVar.c1());
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            textView.setImportantForAccessibility(2);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jam);
            textView.announceForAccessibility(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5n));
            textView.setImportantForAccessibility(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.n(pVar.c1(), 1, null, 0);
            android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.f564403qd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            wVar.a((android.widget.LinearLayout) findViewById, pVar.c1());
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "like_feed_count", pVar.a1());
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "CommentOrLikeFeedCount", pVar.a1());
        } else {
            pVar.m125486xb8471e25(0);
            pVar.c1().m70448xb8471e25(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.d(pVar.e1(), pVar.c1());
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setImportantForAccessibility(2);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jc8);
            textView.announceForAccessibility(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5p));
            textView.setImportantForAccessibility(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.a(pVar.e1());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            pm0.v.X(new ad4.n(true));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
    }
}
