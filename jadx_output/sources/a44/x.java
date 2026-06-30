package a44;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 f1337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k44.g f1338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str, com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, int i17, int i18, boolean z17, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, k44.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1332d = str;
        this.f1333e = downloadHelper;
        this.f1334f = i17;
        this.f1335g = i18;
        this.f1336h = z17;
        this.f1337i = j3Var;
        this.f1338m = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        a44.x xVar = new a44.x(this.f1332d, this.f1333e, this.f1334f, this.f1335g, this.f1336h, this.f1337i, this.f1338m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        a44.x xVar = (a44.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int f17 = za4.k.g().f(this.f1332d);
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doHalfScreenClick, cost time is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        int i17 = this.f1334f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1333e;
        downloadHelper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            i44.a aVar2 = new i44.a();
            java.lang.String g17 = bVar.g();
            java.lang.String i18 = bVar.i();
            java.lang.Integer e17 = bVar.e();
            aVar2.c(g17, i18, e17 != null ? e17.intValue() : 0, bVar.a(), 1, f17, i17);
            a84.t0.a(aVar2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        boolean z17 = this.f1336h;
        int i19 = this.f1335g;
        if (f17 == 1) {
            za4.k.g().n(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b());
            a44.m.b(i19, 6, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper), java.lang.Boolean.valueOf(z17));
        } else if (f17 == 2) {
            za4.k.g().v(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.d(downloadHelper), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, 2, this.f1335g), this.f1337i);
            a44.m.b(i19, 7, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper), java.lang.Boolean.valueOf(z17));
        } else if (f17 != 3) {
            h44.b e18 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
            e18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
            java.lang.Boolean bool = e18.f278915d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            za4.k g18 = za4.k.g();
            java.lang.String b17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b();
            h44.b e19 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
            e19.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
            java.lang.String str = e19.f278914c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
            java.lang.String f18 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f();
            k44.g gVar = this.f1338m;
            g18.w(b17, str, f18, gVar.c(), gVar.b(), gVar.a(), true, new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, 2, this.f1335g), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.d(downloadHelper), booleanValue, this.f1337i);
            a44.m.b(i19, 8, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper), java.lang.Boolean.valueOf(z17));
        } else {
            za4.k.g().j(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f1332d, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), false, 1, this.f1335g), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).h());
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doHalfScreenClick$1$1");
        return f0Var;
    }
}
