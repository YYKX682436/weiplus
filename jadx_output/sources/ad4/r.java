package ad4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f3199d;

    public r(xc4.p pVar) {
        this.f3199d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View contentView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ad4.w wVar = ad4.w.f3203a;
        xc4.p pVar = this.f3199d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        try {
            android.widget.PopupWindow popupWindow = ad4.w.f3206d;
            contentView = popupWindow != null ? popupWindow.getContentView() : null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onLikeClick and exp is " + th6);
        }
        if (contentView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
        }
        android.content.Context context = contentView.getContext();
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.f482871qe);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.f482869qc);
        if (pVar.getLikeFlag() == 0) {
            android.os.StrictMode.allowThreadDiskReads();
            pVar.setLikeFlag(1);
            pVar.c1().setLikeFlag(1);
            com.tencent.mm.plugin.sns.storage.l1.d(pVar.e1(), pVar.c1());
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            textView.setImportantForAccessibility(2);
            textView.setText(com.tencent.mm.R.string.jam);
            textView.announceForAccessibility(context.getResources().getString(com.tencent.mm.R.string.j5n));
            textView.setImportantForAccessibility(1);
            com.tencent.mm.plugin.sns.model.d6.n(pVar.c1(), 1, null, 0);
            android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.f482870qd);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            wVar.a((android.widget.LinearLayout) findViewById, pVar.c1());
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "like_feed_count", pVar.a1());
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "CommentOrLikeFeedCount", pVar.a1());
        } else {
            pVar.setLikeFlag(0);
            pVar.c1().setLikeFlag(0);
            com.tencent.mm.plugin.sns.storage.l1.d(pVar.e1(), pVar.c1());
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView.setImportantForAccessibility(2);
            textView.setText(com.tencent.mm.R.string.jc8);
            textView.announceForAccessibility(context.getResources().getString(com.tencent.mm.R.string.j5p));
            textView.setImportantForAccessibility(1);
            com.tencent.mm.plugin.sns.model.d6.a(pVar.e1());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            pm0.v.X(new ad4.n(true));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
    }
}
