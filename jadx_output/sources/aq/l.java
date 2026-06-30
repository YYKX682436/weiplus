package aq;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12896d = arrayList;
        this.f12897e = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.l(this.f12896d, this.f12897e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq.l lVar = (aq.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = this.f12897e;
        java.util.ArrayList arrayList2 = this.f12896d;
        arrayList2.addAll(arrayList);
        f65.p.f259941h = arrayList2.size();
        aq.r0.f12940a.j(arrayList2);
        return jz5.f0.f302826a;
    }
}
