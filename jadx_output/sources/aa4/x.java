package aa4;

/* loaded from: classes15.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview f2686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview) {
        super(0);
        this.f2686d = snsVideoBackPreview;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverNoFadeImageView snsCoverNoFadeImageView = (com.tencent.mm.plugin.sns.cover.preview.SnsCoverNoFadeImageView) this.f2686d.findViewById(com.tencent.mm.R.id.oyc);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
        return snsCoverNoFadeImageView;
    }
}
