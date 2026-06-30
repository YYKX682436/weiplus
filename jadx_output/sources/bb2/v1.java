package bb2;

/* loaded from: classes.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f19023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(java.util.List list, java.util.List list2, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19021d = list;
        this.f19022e = list2;
        this.f19023f = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bb2.v1(this.f19021d, this.f19022e, this.f19023f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bb2.v1 v1Var = (bb2.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = kz5.n0.N(this.f19021d, 100).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f19023f;
            if (!hasNext) {
                break;
            }
            java.util.List list = (java.util.List) it.next();
            java.util.Map t17 = kz5.c1.t(map);
            t17.put("bs_list", list.toString());
            i95.m c17 = i95.n0.c(dy1.r.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((cy1.a) ((dy1.r) c17)).Bj("finder_barrage_comments", "view_exp", t17, 1, false);
        }
        for (java.util.Map map2 : this.f19022e) {
            kotlin.jvm.internal.o.d(map2);
            java.util.Map t18 = kz5.c1.t(map2);
            t18.putAll(map);
            i95.m c18 = i95.n0.c(dy1.r.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((cy1.a) ((dy1.r) c18)).Bj("finder_barrage_comments_add_one", "view_exp", t18, 1, false);
        }
        return jz5.f0.f302826a;
    }
}
