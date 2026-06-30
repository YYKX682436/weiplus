package cf5;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41013d = j17;
        this.f41014e = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cf5.o(this.f41013d, this.f41014e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cf5.o oVar = (cf5.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Map map = cf5.t.f41031e;
        long j17 = this.f41013d;
        java.lang.Long l17 = new java.lang.Long(j17);
        java.lang.Long l18 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(new java.lang.Long(j17));
        ((java.util.concurrent.ConcurrentHashMap) map).put(l17, new java.lang.Long((l18 != null ? l18.longValue() : 0L) + this.f41014e));
        return jz5.f0.f302826a;
    }
}
