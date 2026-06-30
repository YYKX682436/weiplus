package ch0;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41234d;

    public k0(int i17) {
        this.f41234d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ch0.h hVar;
        int i17 = this.f41234d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ch0.z zVar = (ch0.z) ((java.util.LinkedHashMap) ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).f462231e.f41191a).get(java.lang.Integer.valueOf(i17));
            if (!(zVar instanceof ch0.z)) {
                zVar = null;
            }
            if (zVar != null && (hVar = zVar.f41273m) != null) {
                hVar.a();
            }
            if (zVar != null) {
                zVar.f41273m = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "dispose exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }
}
