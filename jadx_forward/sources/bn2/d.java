package bn2;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f104379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bn2.i iVar) {
        super(1);
        this.f104379d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        lo0.k item = (lo0.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        lo0.b bVar = item.f401564n;
        if (bVar != null) {
            bVar.d();
            dk2.d.f314834a.g(bVar);
        }
        java.util.Iterator it = this.f104379d.f104392b.f401488f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            lo0.j jVar = (lo0.j) obj2;
            jVar.getClass();
            java.lang.String itemId = item.f401551a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemId, "itemId");
            if (jVar.f401550c.containsKey(itemId)) {
                break;
            }
        }
        lo0.j jVar2 = (lo0.j) obj2;
        if (!(jVar2 == null)) {
            tn0.w0 w0Var = dk2.ef.f314911d;
            hn0.f fVar = w0Var != null ? w0Var.f502306t : null;
            if (fVar != null) {
                lo0.k kVar = jVar2.f401549b;
                if (kVar != null) {
                    ((hn0.p) fVar).h(kVar, 0.0d);
                }
                jVar2.f401549b = item;
                ((hn0.p) fVar).h(item, item.f401565o);
            }
        }
        return jz5.f0.f384359a;
    }
}
