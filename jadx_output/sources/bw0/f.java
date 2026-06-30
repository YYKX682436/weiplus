package bw0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f24781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.l f24782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bw0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f24782e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bw0.f(this.f24782e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bw0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f24781d;
        bw0.l lVar = this.f24782e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xw0.r l76 = lVar.l7();
            sw0.b bVar = lVar.f24792p;
            java.lang.String str = bVar != null ? bVar.f413415b : null;
            java.lang.String str2 = bVar != null ? bVar.f413416c : null;
            java.lang.String str3 = lVar.l7().f457645i.f48224b;
            this.f24781d = 1;
            if (l76.g(str, str2, str3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xw0.r l77 = lVar.l7();
        sw0.b bVar2 = lVar.f24792p;
        java.lang.String str4 = bVar2 != null ? bVar2.f413417d : null;
        this.f24781d = 2;
        if (l77.n(str4, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
