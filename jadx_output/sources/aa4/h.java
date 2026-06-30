package aa4;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa4.l f2650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(aa4.l lVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f2650d = lVar;
        this.f2651e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
        this.f2650d.d().setImageBitmap(this.f2651e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
        return f0Var;
    }
}
