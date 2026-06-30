package bd4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19346d;

    public g(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19346d = improveCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$3");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView = this.f19346d;
        improveCommentView.requestLayout();
        improveCommentView.invalidate();
        int height = improveCommentView.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFoldShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        improveCommentView.D = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFoldShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$3");
    }
}
