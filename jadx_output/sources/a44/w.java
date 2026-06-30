package a44;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 f1326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ca4.d f1327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1328h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1329i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k44.g f1331n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, ca4.d dVar, int i17, int i18, java.lang.String str, k44.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1325e = downloadHelper;
        this.f1326f = j3Var;
        this.f1327g = dVar;
        this.f1328h = i17;
        this.f1329i = i18;
        this.f1330m = str;
        this.f1331n = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        a44.w wVar = new a44.w(this.f1325e, this.f1326f, this.f1327g, this.f1328h, this.f1329i, this.f1330m, this.f1331n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        java.lang.Object invokeSuspend = ((a44.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0121  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
