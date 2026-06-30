package androidx.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/v;", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f11594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f11595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.n f11596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f11597g;

    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1(kotlinx.coroutines.q qVar, androidx.lifecycle.o oVar, androidx.lifecycle.n nVar, yz5.a aVar, boolean z17, kotlinx.coroutines.p0 p0Var) {
        this.f11594d = qVar;
        this.f11595e = oVar;
        this.f11596f = nVar;
        this.f11597g = aVar;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = androidx.lifecycle.l.f11634a[this.f11596f.ordinal()];
        androidx.lifecycle.m mVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : androidx.lifecycle.m.ON_RESUME : androidx.lifecycle.m.ON_START : androidx.lifecycle.m.ON_CREATE;
        kotlinx.coroutines.q qVar = this.f11594d;
        androidx.lifecycle.o oVar = this.f11595e;
        if (event != mVar) {
            if (event == androidx.lifecycle.m.ON_DESTROY) {
                oVar.c(this);
                androidx.lifecycle.s sVar = new androidx.lifecycle.s();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(sVar)));
                return;
            }
            return;
        }
        oVar.c(this);
        yz5.a aVar = this.f11597g;
        try {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(aVar.invoke());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        ((kotlinx.coroutines.r) qVar).resumeWith(m521constructorimpl);
    }
}
