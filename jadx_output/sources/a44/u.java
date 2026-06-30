package a44;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.d f1311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f1313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ca4.d dVar, com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, kotlin.jvm.internal.f0 f0Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1311d = dVar;
        this.f1312e = downloadHelper;
        this.f1313f = f0Var;
        this.f1314g = i17;
        this.f1315h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        a44.u uVar = new a44.u(this.f1311d, this.f1312e, this.f1313f, this.f1314g, this.f1315h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        java.lang.Object invokeSuspend = ((a44.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ca4.d dVar = this.f1311d;
        l44.z.o(dVar);
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1312e;
        j44.j c17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.c(downloadHelper);
        kotlin.jvm.internal.f0 f0Var = this.f1313f;
        c17.s(f0Var.f310116d, this.f1314g);
        jz5.f0 f0Var2 = null;
        j44.j.p(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.c(downloadHelper), new java.lang.Integer(f0Var.f310116d), null, 2, null);
        dVar.f39859i = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
        l44.z.p(dVar);
        a44.m.c(this.f1315h, 5, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper), null, 8, null);
        com.tencent.mm.ui.widget.dialog.u3 k17 = downloadHelper.k();
        if (k17 != null) {
            k17.dismiss();
            f0Var2 = jz5.f0.f302826a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3$3");
        return f0Var2;
    }
}
