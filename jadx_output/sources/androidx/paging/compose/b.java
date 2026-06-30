package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f11711d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f11713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.paging.compose.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f11713f = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        androidx.paging.compose.b bVar = new androidx.paging.compose.b(this.f11713f, continuation);
        bVar.f11712e = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.paging.compose.b) create((g4.j3) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f11711d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.j3 j3Var = (g4.j3) this.f11712e;
            androidx.paging.compose.d dVar = this.f11713f.f11718c;
            this.f11711d = 1;
            dVar.getClass();
            java.lang.Object a17 = dVar.f268515e.a(0, new g4.o3(dVar, j3Var, null), this);
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
