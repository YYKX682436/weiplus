package bb2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f18843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(bb2.w1 w1Var, long j17, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18841d = w1Var;
        this.f18842e = j17;
        this.f18843f = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bb2.d1(this.f18841d, this.f18842e, this.f18843f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bb2.d1 d1Var = (bb2.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bb2.w1 w1Var = (bb2.w1) new java.lang.ref.WeakReference(this.f18841d).get();
        if (w1Var != null) {
            long id6 = w1Var.e().getFeedObject().getId();
            int b17 = a06.d.b(w1Var.f() * 100);
            java.lang.String u17 = pm0.v.u(this.f18842e);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = w1Var.f19053r;
            java.util.Map t17 = kz5.c1.t(this.f18843f);
            t17.put("feed_id", pm0.v.u(id6));
            t17.put("playpercent", new java.lang.Integer(b17));
            concurrentHashMap.put(u17, t17);
        }
        return jz5.f0.f302826a;
    }
}
