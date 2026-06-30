package ch0;

/* loaded from: classes8.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41242d;

    public m0(boolean z17) {
        this.f41242d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ch0.h hVar;
        boolean z17 = this.f41242d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
            jz5.f0 f0Var = null;
            ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
            if (zVar != null && (hVar = zVar.f41273m) != null) {
                hVar.c(z17);
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "notifyFocusChanged exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }
}
