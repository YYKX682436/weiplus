package a44;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1254e;

    /* renamed from: f, reason: collision with root package name */
    public int f1255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f1256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1256g = mr5Var;
        this.f1257h = i17;
        this.f1258i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        a44.e eVar = new a44.e(this.f1256g, this.f1257h, this.f1258i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        java.lang.Object invokeSuspend = ((a44.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1255f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f1256g;
            int i18 = this.f1257h;
            java.lang.String str = this.f1258i;
            this.f1253d = mr5Var;
            this.f1254e = str;
            this.f1255f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            a44.c cVar = new a44.c(rVar);
            k64.h.a(mr5Var, i18, str, cVar, (r45.js5) r45.oy.class.newInstance(), true);
            rVar.m(new a44.d(cVar, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return obj;
    }
}
