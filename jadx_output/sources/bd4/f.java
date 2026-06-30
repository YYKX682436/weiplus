package bd4;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19316d;

    public f(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19316d = improveCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView = this.f19316d;
        improveCommentView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        try {
            android.content.Intent intent = new android.content.Intent();
            r45.e86 e86Var = improveCommentView.f169115s;
            intent.putExtra("sns_text_show", e86Var != null ? e86Var.f373130h : null);
            intent.putExtra("sns_local_id", improveCommentView.f169117u);
            r45.e86 e86Var2 = improveCommentView.f169115s;
            intent.putExtra("sns_comment_buf", e86Var2 != null ? e86Var2.toByteArray() : null);
            intent.putExtra("sns_content_source", 2);
            intent.setClass(improveCommentView.getContext(), com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.class);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentView", "jumpToCommentDetailUI:" + improveCommentView.f169117u);
            android.content.Context context = improveCommentView.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Improve.CommentView", e17, "commentCollapse click exception.", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
    }
}
