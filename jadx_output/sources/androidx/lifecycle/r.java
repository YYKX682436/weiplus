package androidx.lifecycle;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl f11650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f11650e = lifecycleCoroutineScopeImpl;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        androidx.lifecycle.r rVar = new androidx.lifecycle.r(this.f11650e, completion);
        rVar.f11649d = obj;
        return rVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        androidx.lifecycle.r rVar = (androidx.lifecycle.r) create(obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f11649d;
        androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f11650e;
        if (lifecycleCoroutineScopeImpl.f11581d.b().compareTo(androidx.lifecycle.n.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f11581d.a(lifecycleCoroutineScopeImpl);
        } else {
            kotlinx.coroutines.v2.c(y0Var.getF11582e(), null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
