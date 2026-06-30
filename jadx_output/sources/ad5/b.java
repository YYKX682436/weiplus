package ad5;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f3223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ad5.d f3225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.List list, com.tencent.mm.ui.widget.dialog.f4 f4Var, yz5.q qVar, ad5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f3222d = list;
        this.f3223e = f4Var;
        this.f3224f = qVar;
        this.f3225g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ad5.b(this.f3222d, this.f3223e, this.f3224f, this.f3225g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ad5.b bVar = (ad5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.tencent.mm.storage.f9> list = this.f3222d;
        for (com.tencent.mm.storage.f9 f9Var : list) {
            f9Var.Q0();
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
        }
        this.f3223e.dismiss();
        pm0.v.X(new ad5.a(this.f3224f, this.f3225g, list));
        return jz5.f0.f302826a;
    }
}
