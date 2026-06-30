package bd4;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        super(0);
        this.f19373d = improveContentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bd4.f2 n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$2");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19373d;
        int t17 = improveContentView.t();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        if (t17 >= 0 && (n17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.n(improveContentView)) != null) {
            n17.C(true, t17);
        }
        bd4.f2 n18 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.n(improveContentView);
        if (n18 != null) {
            n18.G(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$2");
        return f0Var;
    }
}
