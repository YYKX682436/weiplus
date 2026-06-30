package c61;

/* loaded from: classes.dex */
public final class j7 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39064a;

    public j7(kotlin.jvm.internal.h0 h0Var) {
        this.f39064a = h0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog callback onFailed errorType=" + i17 + " errorCode=" + i18 + " errorMsg=" + str);
        kotlin.jvm.internal.h0 h0Var = this.f39064a;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, 0)));
        }
        h0Var.f310123d = null;
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog callback onSuccess");
        kotlin.jvm.internal.h0 h0Var = this.f39064a;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, 0)));
        }
        h0Var.f310123d = null;
    }
}
