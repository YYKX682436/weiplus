package bn2;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.t f104421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bn2.t tVar) {
        super(1);
        this.f104421d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hn0.f fVar;
        lo0.b0 item = (lo0.b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        lo0.b bVar = item.f401506g;
        if (bVar != null) {
            bVar.d();
            ko0.c0.f391358a.e(bVar);
        }
        lo0.g0 g0Var = this.f104421d.f104424b.f528764e;
        g0Var.getClass();
        g0Var.f401529e = item;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && (fVar = w0Var.f502306t) != null) {
            if (item.f401501b) {
                hn0.f.a(fVar, 0.0d, true, false, 4, null);
            } else {
                hn0.p pVar = fVar instanceof hn0.p ? (hn0.p) fVar : null;
                ((hn0.p) fVar).e(pVar != null ? pVar.f363937f : 0.0d, false, false);
            }
            go0.f0 f0Var = ((hn0.p) fVar).f363933b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, item));
        }
        return jz5.f0.f384359a;
    }
}
