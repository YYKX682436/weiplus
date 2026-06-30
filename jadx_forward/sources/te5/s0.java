package te5;

/* loaded from: classes9.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f500278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f500279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(rd5.d dVar, yb5.d dVar2) {
        super(0);
        this.f500278d = dVar;
        this.f500279e = dVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list;
        java.lang.String b17 = ic5.f.f371970c.b(this.f500278d.f475787d.f526833b);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 v4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) ((sb5.b0) this.f500279e.f542241c.a(sb5.b0.class));
        v4Var.getClass();
        java.util.Map map = v4Var.f281647f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4 p4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) ((java.util.LinkedHashMap) map).get(b17);
        if (p4Var == null || (list = p4Var.f281206b) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(v4Var.f280113d.u().d1(), ((java.lang.Number) it.next()).longValue());
            if (k17 != null) {
                arrayList.add(k17);
            }
        }
        return arrayList;
    }
}
