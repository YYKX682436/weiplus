package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f11722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f11723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.paging.compose.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f11723e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new androidx.paging.compose.g(this.f11723e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.paging.compose.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f11722d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f11722d = 1;
            androidx.paging.compose.e eVar = this.f11723e;
            java.lang.Object a17 = ((kotlinx.coroutines.flow.h3) eVar.f11718c.f268519i).a(new androidx.paging.compose.a(eVar), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
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
