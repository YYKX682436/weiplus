package cj5;

/* loaded from: classes.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.list.SelectContactMvvmList f42082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.i0 f42084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.ui.mvvm.list.SelectContactMvvmList selectContactMvvmList, cj5.l2 l2Var, wi5.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42082e = selectContactMvvmList;
        this.f42083f = l2Var;
        this.f42084g = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj5.c2(this.f42082e, this.f42083f, this.f42084g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((cj5.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42081d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.n2 n2Var = this.f42082e.f152072v;
            cj5.b2 b2Var = new cj5.b2(this.f42083f, this.f42084g);
            this.f42081d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) n2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, b2Var, this) == aVar) {
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
