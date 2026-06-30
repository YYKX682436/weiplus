package bd4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f19302e;

    public c0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView, yz5.a aVar) {
        this.f19301d = improveContentView;
        this.f19302e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19301d;
        int height = improveContentView.getContentTv().getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        improveContentView.A = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        yz5.a aVar = this.f19302e;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
    }
}
