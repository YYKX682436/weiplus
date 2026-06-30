package aa4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa4.l f2659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aa4.l lVar, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f2659d = lVar;
        this.f2660e = bitmap;
        this.f2661f = bitmap2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCoverBlurOptimization$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        aa4.l lVar = this.f2659d;
        boolean z17 = lVar.f2669i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCoverBlurOptimization$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            yz5.l lVar2 = lVar.f2665e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (lVar2 != null) {
                lVar2.invoke(this.f2660e);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            yz5.l lVar3 = lVar.f2665e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (lVar3 != null) {
                lVar3.invoke(this.f2661f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
        return f0Var;
    }
}
