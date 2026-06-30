package aw0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f14475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.a f14476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aw0.f f14477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vv0.b f14478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vv0.a aVar, aw0.f fVar, vv0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14476e = aVar;
        this.f14477f = fVar;
        this.f14478g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw0.d(this.f14476e, this.f14477f, this.f14478g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f14475d;
        vv0.b bVar = this.f14478g;
        vv0.a clipData = this.f14476e;
        aw0.f fVar = this.f14477f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zu0.i iVar = clipData.f440370b;
            if (iVar != zu0.i.f475674d) {
                if (iVar == zu0.i.f475676f) {
                    fVar.getClass();
                    bVar.getClass();
                    zu0.h b17 = fVar.b(bVar);
                    kotlin.jvm.internal.o.g(clipData, "clipData");
                    zu0.h hVar = new zu0.h(vv0.c.a((vv0.c) b17.f475673a, null, null, new vv0.h(clipData), 3, null));
                    fVar.getClass();
                    fVar.f14481c.setValue(hVar);
                }
                return jz5.f0.f302826a;
            }
            fVar.getClass();
            bVar.getClass();
            zu0.h e17 = fv0.e.e(fVar.b(bVar), vv0.a.a(clipData, null, zu0.i.f475675e, 1, null));
            fVar.getClass();
            fVar.f14481c.setValue(e17);
            du0.t0 t0Var = fVar.f14479a;
            java.lang.String str = clipData.f440369a.f48224b;
            kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
            this.f14475d = 1;
            if (t0Var.S6(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fVar.getClass();
        bVar.getClass();
        zu0.h e18 = fv0.e.e(fVar.b(bVar), vv0.a.a(clipData, null, zu0.i.f475676f, 1, null));
        fVar.getClass();
        fVar.f14481c.setValue(e18);
        return jz5.f0.f302826a;
    }
}
