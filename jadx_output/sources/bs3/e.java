package bs3;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f23992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs3.h f23993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bs3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23993e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bs3.e(this.f23993e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bs3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f23992d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg3.o0 fj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
            kotlin.jvm.internal.o.f(fj6, "getOpLogService(...)");
            kotlinx.coroutines.flow.n2 b17 = e21.a1.b(fj6);
            if (b17 != null) {
                bs3.b bVar = new bs3.b(this.f23993e);
                this.f23992d = 1;
                java.lang.Object a17 = b17.a(new bs3.d(bVar), this);
                if (a17 != pz5.a.f359186d) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
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
