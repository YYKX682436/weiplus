package bd4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        super(0);
        this.f19368d = improveContentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$1");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19368d;
        bd4.f2 n17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.n(improveContentView);
        if (n17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            n17.C(false, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        bd4.f2 n18 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.n(improveContentView);
        if (n18 != null) {
            n18.G(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$changeContentState$1");
        return f0Var;
    }
}
