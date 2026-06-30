package aa4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview f2681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview) {
        super(0);
        this.f2681d = snsImageBackPreview;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView snsCoverFadeImageView = (com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView) this.f2681d.findViewById(com.tencent.mm.R.id.n7m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
        return snsCoverFadeImageView;
    }
}
