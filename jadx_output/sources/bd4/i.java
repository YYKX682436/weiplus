package bd4;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19355d;

    public i(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19355d = improveCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$shrinkActionTask$1");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        this.f19355d.q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$shrinkActionTask$1");
    }
}
