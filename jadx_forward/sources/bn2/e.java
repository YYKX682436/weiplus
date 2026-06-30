package bn2;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f104387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bn2.i iVar) {
        super(2);
        this.f104387d = iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        lo0.k item = (lo0.k) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.f401565o = doubleValue;
        bn2.i iVar = this.f104387d;
        iVar.f104393c.mo152xb9724478();
        java.util.Iterator it = iVar.f104392b.f401488f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            lo0.j jVar = (lo0.j) obj3;
            jVar.getClass();
            java.lang.String itemId = item.f401551a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemId, "itemId");
            if (jVar.f401550c.containsKey(itemId)) {
                break;
            }
        }
        lo0.j jVar2 = (lo0.j) obj3;
        if (!(jVar2 != null) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar2.f401549b, item)) {
            tn0.w0 w0Var = dk2.ef.f314911d;
            hn0.f fVar = w0Var != null ? w0Var.f502306t : null;
            if (fVar != null) {
                ((hn0.p) fVar).h(item, doubleValue);
            }
        }
        return jz5.f0.f384359a;
    }
}
