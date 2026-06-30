package bp5;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f23456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bp5.f f23457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bp5.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23457e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp5.e(this.f23457e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((bp5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f23456d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bp5.f fVar = this.f23457e;
            kotlinx.coroutines.flow.f3 b17 = kotlinx.coroutines.flow.l.b(((uo5.l) fVar.f23459e).f429727d);
            bp5.d dVar = new bp5.d(fVar);
            this.f23456d = 1;
            if (((kotlinx.coroutines.flow.l2) b17).a(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
