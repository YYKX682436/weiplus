package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f11720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f11721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.paging.compose.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f11721e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new androidx.paging.compose.f(this.f11721e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.paging.compose.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f11720d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f11720d = 1;
            androidx.paging.compose.e eVar = this.f11721e;
            eVar.getClass();
            java.lang.Object f17 = kotlinx.coroutines.flow.l.f(eVar.f11716a, new androidx.paging.compose.b(eVar, null), this);
            if (f17 != aVar) {
                f17 = f0Var;
            }
            if (f17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
