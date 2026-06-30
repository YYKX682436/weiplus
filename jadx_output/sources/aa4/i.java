package aa4;

/* loaded from: classes4.dex */
public final class i implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa4.l f2655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2658g;

    public i(java.lang.String str, long j17, java.lang.String str2, aa4.l lVar, int i17, boolean z17, java.lang.String str3) {
        this.f2652a = str;
        this.f2653b = j17;
        this.f2654c = str2;
        this.f2655d = lVar;
        this.f2656e = i17;
        this.f2657f = z17;
        this.f2658g = str3;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
        if (z17) {
            com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
            java.lang.String str = this.f2652a;
            long j17 = this.f2653b;
            java.lang.String str2 = this.f2654c;
            Bj.J0(str, j17, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            this.f2655d.f(str2, this.f2656e, this.f2657f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverFadeImageView", "downloadImage error:" + this.f2658g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
    }
}
