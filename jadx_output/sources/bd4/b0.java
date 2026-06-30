package bd4;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19296d;

    public b0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19296d = improveContentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkActionTask$1");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19296d;
        java.lang.String str = improveContentView.f169124p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        bd4.a0 a0Var = new bd4.a0(improveContentView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        improveContentView.u(a0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkActionTask$1");
    }
}
