package bd4;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout f19366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout) {
        super(0);
        this.f19366d = improveInteractionLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = this.f19366d;
        com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView = (com.tencent.mm.plugin.sns.ui.SnsLikesTextView) improveInteractionLayout.findViewById(com.tencent.mm.R.id.hbr);
        snsLikesTextView.setClickable(true);
        snsLikesTextView.setLikedTextTouchListener(new com.tencent.mm.plugin.sns.ui.p5());
        snsLikesTextView.setClickableCallBack(improveInteractionLayout.getCallback());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
        return snsLikesTextView;
    }
}
