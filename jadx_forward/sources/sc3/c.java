package sc3;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sc3.k1 k1Var) {
        super(0);
        this.f487965d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc3.k1 k1Var = this.f487965d;
        jc3.n nVar = k1Var.f488016o;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mbAdaptor");
            throw null;
        }
        java.util.Collection y17 = nVar.y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = k1Var.f488015n;
        if (c16416x87606a7b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c16416x87606a7b.f229350d) {
            if (!((java.lang.Boolean) ((jz5.l) obj).f384367e).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((jz5.l) it.next()).f384366d);
        }
        java.util.List t07 = kz5.n0.t0(y17, arrayList2);
        java.util.Map map = k1Var.M;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            if (!((lc3.c0) entry.getValue()).g()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList3.add((java.lang.String) ((java.util.Map.Entry) it6.next()).getKey());
        }
        return (java.lang.String[]) ((java.util.ArrayList) kz5.n0.t0(t07, arrayList3)).toArray(new java.lang.String[0]);
    }
}
