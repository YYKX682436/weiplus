package bd4;

/* loaded from: classes4.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView f19390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView improveLoadingMoreView) {
        super(0);
        this.f19390d = improveLoadingMoreView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
        com.tencent.mm.ui.EndMaskView endMaskView = (com.tencent.mm.ui.EndMaskView) this.f19390d.findViewById(com.tencent.mm.R.id.qij);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
        return endMaskView;
    }
}
