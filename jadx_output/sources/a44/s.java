package a44;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f1306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, kotlin.jvm.internal.f0 f0Var, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1305d = downloadHelper;
        this.f1306e = f0Var;
        this.f1307f = i17;
        this.f1308g = i18;
        this.f1309h = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        a44.s sVar = new a44.s(this.f1305d, this.f1306e, this.f1307f, this.f1308g, this.f1309h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        java.lang.Object invokeSuspend = ((a44.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1305d;
        j44.j c17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.c(downloadHelper);
        kotlin.jvm.internal.f0 f0Var2 = this.f1306e;
        c17.s(f0Var2.f310116d, this.f1307f);
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper.c(downloadHelper).o(new java.lang.Integer(f0Var2.f310116d), new java.lang.Integer(this.f1308g));
        a44.m.c(this.f1309h, 3, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper), null, 8, null);
        com.tencent.mm.ui.widget.dialog.u3 k17 = downloadHelper.k();
        if (k17 != null) {
            k17.dismiss();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$1");
        return f0Var;
    }
}
