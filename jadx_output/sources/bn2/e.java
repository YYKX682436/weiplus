package bn2;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f22854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bn2.i iVar) {
        super(2);
        this.f22854d = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        lo0.k item = (lo0.k) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        kotlin.jvm.internal.o.g(item, "item");
        item.f320032o = doubleValue;
        bn2.i iVar = this.f22854d;
        iVar.f22860c.invoke();
        java.util.Iterator it = iVar.f22859b.f319955f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            lo0.j jVar = (lo0.j) obj3;
            jVar.getClass();
            java.lang.String itemId = item.f320018a;
            kotlin.jvm.internal.o.g(itemId, "itemId");
            if (jVar.f320017c.containsKey(itemId)) {
                break;
            }
        }
        lo0.j jVar2 = (lo0.j) obj3;
        if (!(jVar2 != null) || kotlin.jvm.internal.o.b(jVar2.f320016b, item)) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            hn0.f fVar = w0Var != null ? w0Var.f420773t : null;
            if (fVar != null) {
                ((hn0.p) fVar).h(item, doubleValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
