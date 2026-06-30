package bd4;

/* loaded from: classes4.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19412d;

    public y(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19412d = improveContentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setText$1$1");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.p(this.f19412d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setText$1$1");
    }
}
