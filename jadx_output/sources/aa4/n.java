package aa4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview f2674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview) {
        super(0);
        this.f2674d = snsImageBackPreview;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f2674d.findViewById(com.tencent.mm.R.id.f483968cl2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
        return imageView;
    }
}
