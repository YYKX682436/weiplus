package bd4;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19311d;

    public e(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19311d = improveCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        this.f19311d.r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$1");
    }
}
