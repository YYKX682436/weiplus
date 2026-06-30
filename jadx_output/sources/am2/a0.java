package am2;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f8624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am2.s0 f8625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f8626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.wy f8627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(am2.s0 s0Var, dk2.u4 u4Var, df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f8625e = s0Var;
        this.f8626f = u4Var;
        this.f8627g = wyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new am2.a0(this.f8625e, this.f8626f, this.f8627g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((am2.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<km2.k> list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f8624d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            am2.s0 s0Var = this.f8625e;
            boolean z17 = !s0Var.f8744d.isEmpty();
            df2.wy wyVar = this.f8627g;
            if (!z17) {
                wyVar.f231744u = false;
                return jz5.f0.f302826a;
            }
            r45.ja0 ja0Var = (r45.ja0) kz5.h0.C(s0Var.f8744d);
            dk2.u4 u4Var = this.f8626f;
            if (u4Var != null && (list = u4Var.f234159f) != null) {
                for (km2.k kVar : list) {
                    kVar.f309120g = 12345L;
                    kVar.f309119f = ja0Var;
                }
            }
            if (u4Var != null) {
                r45.gd2 gd2Var = new r45.gd2();
                gd2Var.set(4, java.lang.Long.valueOf(c01.id.e()));
                u4Var.f234164k = gd2Var;
            }
            wyVar.b7(u4Var);
            this.f8624d = 1;
        } while (kotlinx.coroutines.k1.b(5000L, this) != aVar);
        return aVar;
    }
}
