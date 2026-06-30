package bn2;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f22846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bn2.i iVar) {
        super(1);
        this.f22846d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        lo0.k item = (lo0.k) obj;
        kotlin.jvm.internal.o.g(item, "item");
        lo0.b bVar = item.f320031n;
        if (bVar != null) {
            bVar.d();
            dk2.d.f233301a.g(bVar);
        }
        java.util.Iterator it = this.f22846d.f22859b.f319955f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            lo0.j jVar = (lo0.j) obj2;
            jVar.getClass();
            java.lang.String itemId = item.f320018a;
            kotlin.jvm.internal.o.g(itemId, "itemId");
            if (jVar.f320017c.containsKey(itemId)) {
                break;
            }
        }
        lo0.j jVar2 = (lo0.j) obj2;
        if (!(jVar2 == null)) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            hn0.f fVar = w0Var != null ? w0Var.f420773t : null;
            if (fVar != null) {
                lo0.k kVar = jVar2.f320016b;
                if (kVar != null) {
                    ((hn0.p) fVar).h(kVar, 0.0d);
                }
                jVar2.f320016b = item;
                ((hn0.p) fVar).h(item, item.f320032o);
            }
        }
        return jz5.f0.f302826a;
    }
}
