package aa4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa4.l f2646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.graphics.Bitmap bitmap, aa4.l lVar, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f2645d = bitmap;
        this.f2646e = lVar;
        this.f2647f = bitmap2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        aa4.l lVar = this.f2646e;
        android.graphics.Bitmap bitmap = this.f2645d;
        if (bitmap != null) {
            lVar.d().setImageBitmap(bitmap);
        } else {
            lVar.d().setImageBitmap(this.f2647f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        return f0Var;
    }
}
