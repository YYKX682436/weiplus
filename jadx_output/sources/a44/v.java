package a44;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 f1320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k44.g f1321i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ca4.d f1323n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, int i17, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, k44.g gVar, int i18, ca4.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1317e = str;
        this.f1318f = downloadHelper;
        this.f1319g = i17;
        this.f1320h = j3Var;
        this.f1321i = gVar;
        this.f1322m = i18;
        this.f1323n = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        a44.v vVar = new a44.v(this.f1317e, this.f1318f, this.f1319g, this.f1320h, this.f1321i, this.f1322m, this.f1323n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        java.lang.Object invokeSuspend = ((a44.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.Object g17;
        java.lang.Object g18;
        java.lang.Object g19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1316d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0 i18 = com.tencent.mm.plugin.downloader.model.r0.i();
            java.lang.String str = this.f1317e;
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = i18.q(str);
            if (q17 != null && q17.f96961d >= 0) {
                java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
                kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
                callbackIds.put(str, new java.lang.Long(q17.f96961d));
            }
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            if (q17 != null) {
                if (q17.f96963f == 3 && !android.text.TextUtils.isEmpty(q17.f96964g) && com.tencent.mm.vfs.w6.j(q17.f96964g)) {
                    f0Var2.f310116d = 3;
                } else {
                    int i19 = q17.f96963f;
                    if (i19 == 1) {
                        f0Var2.f310116d = 1;
                    } else if (i19 == 2) {
                        f0Var2.f310116d = 2;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doExternalClick, cost time is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            int i27 = f0Var2.f310116d;
            com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1318f;
            downloadHelper.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExternalClickDownloadStatus", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            downloadHelper.f162651r = i27;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExternalClickDownloadStatus", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            int i28 = f0Var2.f310116d;
            f0Var = jz5.f0.f302826a;
            int i29 = this.f1319g;
            if (i28 == 1) {
                za4.k.g().v(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.d(downloadHelper), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, 2, this.f1319g), this.f1320h);
                a44.m.a(i29, 1);
            } else if (i28 != 2) {
                if (i28 == 3) {
                    za4.k.g().j(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f1317e, com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), false, 1, this.f1319g), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).h());
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    oz5.l plus = kotlinx.coroutines.internal.b0.f310484a.plus(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.b(downloadHelper));
                    a44.t tVar = new a44.t(downloadHelper, null);
                    this.f1316d = 2;
                    g18 = kotlinx.coroutines.l.g(plus, tVar, this);
                    if (g18 == aVar) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
                        return aVar;
                    }
                    f0Var = (jz5.f0) g18;
                } else if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).j(), java.lang.Boolean.TRUE)) {
                    h44.b e17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
                    e17.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.Boolean bool = e17.f278915d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    za4.k g27 = za4.k.g();
                    java.lang.String b17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b();
                    h44.b e18 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
                    e18.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.String str2 = e18.f278914c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.String f17 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f();
                    k44.g gVar = this.f1321i;
                    g27.w(b17, str2, f17, gVar.c(), gVar.b(), gVar.a(), true, new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, 2, this.f1319g), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.d(downloadHelper), booleanValue, this.f1320h);
                    a44.m.a(i29, 4);
                } else {
                    kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                    oz5.l plus2 = kotlinx.coroutines.internal.b0.f310484a.plus(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.b(downloadHelper));
                    a44.u uVar = new a44.u(this.f1323n, this.f1318f, f0Var2, this.f1322m, this.f1319g, null);
                    this.f1316d = 3;
                    g19 = kotlinx.coroutines.l.g(plus2, uVar, this);
                    if (g19 == aVar) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
                        return aVar;
                    }
                    f0Var = (jz5.f0) g19;
                }
            } else if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).j(), java.lang.Boolean.TRUE)) {
                za4.k.g().v(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.d(downloadHelper), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, new a44.l(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b(), com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).f(), true, 2, this.f1319g), this.f1320h);
                a44.m.a(i29, 2);
            } else {
                int i37 = za4.k.g().i(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper).b());
                com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "paused and progress is " + i37);
                kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
                oz5.l plus3 = kotlinx.coroutines.internal.b0.f310484a.plus(com.tencent.mm.plugin.sns.ad.download.DownloadHelper.b(downloadHelper));
                a44.s sVar = new a44.s(this.f1318f, f0Var2, this.f1322m, i37, this.f1319g, null);
                this.f1316d = 1;
                g17 = kotlinx.coroutines.l.g(plus3, sVar, this);
                if (g17 == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
                    return aVar;
                }
                f0Var = (jz5.f0) g17;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            f0Var = (jz5.f0) g17;
        } else if (i17 == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
            g18 = obj;
            f0Var = (jz5.f0) g18;
        } else {
            if (i17 != 3) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g19 = obj;
            f0Var = (jz5.f0) g19;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$3");
        return f0Var;
    }
}
