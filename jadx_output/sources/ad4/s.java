package ad4;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f3200d;

    public s(xc4.p pVar) {
        this.f3200d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveInteractionUtil", "click spring comment ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f3206d;
        android.view.View contentView = popupWindow != null ? popupWindow.getContentView() : null;
        if (contentView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        } else {
            contentView.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeSpringCommentLikeStatus: curFlag=");
            xc4.p pVar = this.f3200d;
            sb6.append(pVar.getLikeFlag());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveInteractionUtil", sb6.toString());
            android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.r1z);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.r1x);
            if (pVar.getLikeFlag() == 0) {
                android.os.StrictMode.allowThreadDiskReads();
                pVar.setLikeFlag(1);
                pVar.c1().setLikeFlag(1);
                com.tencent.mm.plugin.sns.storage.l1.d(pVar.e1(), pVar.c1());
                com.tencent.mm.plugin.sns.model.d6.n(pVar.c1(), 1, null, 0);
                xa4.g gVar = xa4.g.f452830d;
                ad4.m mVar = new ad4.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSpringLikedView$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                gVar.F(weImageView, textView, mVar, 100L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpringLikedView$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            } else {
                pVar.setLikeFlag(0);
                pVar.c1().setLikeFlag(0);
                com.tencent.mm.plugin.sns.storage.l1.d(pVar.e1(), pVar.c1());
                com.tencent.mm.plugin.sns.model.d6.a(pVar.e1());
                xa4.g.l(weImageView, textView, pVar.isInValid());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                pm0.v.X(new ad4.n(true));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeSpringCommentLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$4");
    }
}
