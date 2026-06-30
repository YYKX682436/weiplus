package bn2;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f22876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bn2.o oVar) {
        super(1);
        this.f22876d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        lo0.a0 suite = (lo0.a0) obj;
        kotlin.jvm.internal.o.g(suite, "suite");
        lo0.b bVar = suite.f319957h;
        if (bVar != null) {
            bVar.d();
            dk2.d.f233301a.g(bVar);
        }
        bn2.o oVar = this.f22876d;
        oVar.getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        hn0.f fVar = w0Var != null ? w0Var.f420773t : null;
        if (fVar != null) {
            wm2.a aVar = oVar.f22878b;
            java.util.Iterator it = aVar.f447227a.f320080e.f319954e.iterator();
            while (it.hasNext()) {
                ((hn0.p) fVar).h((lo0.k) it.next(), 0.0d);
            }
            lo0.t tVar = aVar.f447227a;
            tVar.getClass();
            tVar.f320080e = suite;
            for (lo0.k kVar : suite.f319954e) {
                java.util.Iterator it6 = suite.f319955f.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    lo0.j jVar = (lo0.j) obj2;
                    java.lang.String itemId = kVar.f320018a;
                    jVar.getClass();
                    kotlin.jvm.internal.o.g(itemId, "itemId");
                    if (jVar.f320017c.containsKey(itemId)) {
                        break;
                    }
                }
                lo0.j jVar2 = (lo0.j) obj2;
                if (!(jVar2 != null) || kotlin.jvm.internal.o.b(jVar2.f320016b, kVar)) {
                    ((hn0.p) fVar).h(kVar, kVar.f320032o);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
