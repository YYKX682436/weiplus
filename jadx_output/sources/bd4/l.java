package bd4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19363d;

    public l(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19363d = improveCommentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$spreadContent$1");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView = this.f19363d;
        improveCommentView.requestLayout();
        improveCommentView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$spreadContent$1");
    }
}
