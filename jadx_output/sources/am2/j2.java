package am2;

/* loaded from: classes3.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f8701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f8702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f8703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.util.Map.Entry entry, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f8702e = k0Var;
        this.f8703f = entry;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new am2.j2(this.f8702e, this.f8703f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((am2.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f8701d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.d1 d1Var = (df2.d1) this.f8702e.getController(df2.d1.class);
            if (d1Var != null) {
                r45.kv1 c17 = ((ce2.i) this.f8703f.getValue()).c1();
                this.f8701d = 1;
                if (d1Var.b7(c17, 100, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
