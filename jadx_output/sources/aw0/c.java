package aw0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f14472d;

    /* renamed from: e, reason: collision with root package name */
    public int f14473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aw0.f f14474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aw0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14474f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw0.c(this.f14474f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        aw0.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f14473e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vv0.b bVar = vv0.b.f440371d;
            aw0.f fVar2 = this.f14474f;
            this.f14472d = fVar2;
            this.f14473e = 1;
            obj = aw0.f.a(fVar2, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (aw0.f) this.f14472d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zu0.k kVar = (zu0.k) obj;
        fVar.getClass();
        if (kVar.f475681a == 5) {
            fVar.f14481c.setValue(kVar.f475682b);
        }
        return jz5.f0.f302826a;
    }
}
