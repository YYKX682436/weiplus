package ch0;

/* loaded from: classes8.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41230e;

    public j0(int i17, boolean z17) {
        this.f41229d = i17;
        this.f41230e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        int i17 = this.f41229d;
        boolean z17 = this.f41230e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Bi(i17, z17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "createPlatformView exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }
}
