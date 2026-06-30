package ch0;

/* loaded from: classes8.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch0.n0 f41237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f41238f;

    public l0(boolean z17, ch0.n0 n0Var, long j17) {
        this.f41236d = z17;
        this.f41237e = n0Var;
        this.f41238f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ch0.h hVar;
        boolean z17 = this.f41236d;
        ch0.n0 n0Var = this.f41237e;
        long j17 = this.f41238f;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
            jz5.f0 f0Var = null;
            ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
            if (zVar != null && (hVar = zVar.f41273m) != null) {
                java.lang.String content = "flutter filter click, show: " + z17;
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
                hVar.g(z17 ? 8 : 0);
            }
            com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback callback = n0Var.f41244a;
            if (callback != null) {
                callback.onNotifyFilterShowOrHideComplete(j17, 0);
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content2 = "notifyFilterShowOrHideAsync exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content2, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
    }
}
