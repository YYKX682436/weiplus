package bd4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        super(0);
        this.f19305d = improveCommentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) this.f19305d.findViewById(com.tencent.mm.R.id.c6p);
        improveTextView.setLineSpacing(i65.a.a(r2.getContext(), 4.5f), 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$contentTv$2");
        return improveTextView;
    }
}
