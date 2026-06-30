package aa4;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview f2641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview snsWeComImageBackPreview) {
        super(0);
        this.f2641d = snsWeComImageBackPreview;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f2641d.findViewById(com.tencent.mm.R.id.f483968cl2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
        return imageView;
    }
}
