package a44;

/* loaded from: classes4.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 f1341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1344i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k44.g f1346n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, java.lang.String str, int i17, int i18, boolean z17, k44.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1340e = downloadHelper;
        this.f1341f = j3Var;
        this.f1342g = str;
        this.f1343h = i17;
        this.f1344i = i18;
        this.f1345m = z17;
        this.f1346n = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        a44.y yVar = new a44.y(this.f1340e, this.f1341f, this.f1342g, this.f1343h, this.f1344i, this.f1345m, this.f1346n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        java.lang.Object invokeSuspend = ((a44.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1339d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            za4.k g17 = za4.k.g();
            com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1340e;
            g17.e(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), this.f1341f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDownloadExecutorService", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            ku5.f j17 = downloadHelper.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDownloadExecutorService", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            kotlin.jvm.internal.o.f(j17, "access$getMDownloadExecutorService(...)");
            oz5.l plus = new kotlinx.coroutines.g2(j17).plus(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.b(downloadHelper));
            a44.x xVar = new a44.x(this.f1342g, this.f1340e, this.f1343h, this.f1344i, this.f1345m, this.f1341f, this.f1346n, null);
            this.f1339d = 1;
            if (kotlinx.coroutines.l.g(plus, xVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1");
        return f0Var;
    }
}
