package androidx.compose.ui.platform;

/* loaded from: classes10.dex */
public final class l1 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f10622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f10623e;

    public l1(kotlinx.coroutines.q qVar, androidx.compose.ui.platform.m1 m1Var, yz5.l lVar) {
        this.f10622d = qVar;
        this.f10623e = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        java.lang.Object m521constructorimpl;
        yz5.l lVar = this.f10623e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(lVar.invoke(java.lang.Long.valueOf(j17)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        ((kotlinx.coroutines.r) this.f10622d).resumeWith(m521constructorimpl);
    }
}
