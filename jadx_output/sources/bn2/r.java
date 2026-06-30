package bn2;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.t f22888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bn2.t tVar) {
        super(1);
        this.f22888d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hn0.f fVar;
        lo0.b0 item = (lo0.b0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        lo0.b bVar = item.f319973g;
        if (bVar != null) {
            bVar.d();
            ko0.c0.f309825a.e(bVar);
        }
        lo0.g0 g0Var = this.f22888d.f22891b.f447231e;
        g0Var.getClass();
        g0Var.f319996e = item;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            if (item.f319968b) {
                hn0.f.a(fVar, 0.0d, true, false, 4, null);
            } else {
                hn0.p pVar = fVar instanceof hn0.p ? (hn0.p) fVar : null;
                ((hn0.p) fVar).e(pVar != null ? pVar.f282404f : 0.0d, false, false);
            }
            go0.f0 f0Var = ((hn0.p) fVar).f282400b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, item));
        }
        return jz5.f0.f302826a;
    }
}
