package bn2;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f104409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bn2.o oVar) {
        super(1);
        this.f104409d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        lo0.a0 suite = (lo0.a0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suite, "suite");
        lo0.b bVar = suite.f401490h;
        if (bVar != null) {
            bVar.d();
            dk2.d.f314834a.g(bVar);
        }
        bn2.o oVar = this.f104409d;
        oVar.getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        hn0.f fVar = w0Var != null ? w0Var.f502306t : null;
        if (fVar != null) {
            wm2.a aVar = oVar.f104411b;
            java.util.Iterator it = aVar.f528760a.f401613e.f401487e.iterator();
            while (it.hasNext()) {
                ((hn0.p) fVar).h((lo0.k) it.next(), 0.0d);
            }
            lo0.t tVar = aVar.f528760a;
            tVar.getClass();
            tVar.f401613e = suite;
            for (lo0.k kVar : suite.f401487e) {
                java.util.Iterator it6 = suite.f401488f.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    lo0.j jVar = (lo0.j) obj2;
                    java.lang.String itemId = kVar.f401551a;
                    jVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemId, "itemId");
                    if (jVar.f401550c.containsKey(itemId)) {
                        break;
                    }
                }
                lo0.j jVar2 = (lo0.j) obj2;
                if (!(jVar2 != null) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar2.f401549b, kVar)) {
                    ((hn0.p) fVar).h(kVar, kVar.f401565o);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
