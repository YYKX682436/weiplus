package b16;

/* loaded from: classes16.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f17266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b16.f1 f1Var) {
        super(1);
        this.f17266d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        kotlin.jvm.internal.o.g(name, "name");
        b16.f1 f1Var = this.f17266d;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet((java.util.Collection) ((e26.r) f1Var.f17167f).invoke(name));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : linkedHashSet) {
            java.lang.String a17 = g16.w0.a((o06.v1) obj2, false, false, 2, null);
            java.lang.Object obj3 = linkedHashMap.get(a17);
            if (obj3 == null) {
                obj3 = new java.util.ArrayList();
                linkedHashMap.put(a17, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        for (java.util.List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                java.util.Collection a18 = r16.b0.a(list, b16.e1.f17159d);
                linkedHashSet.removeAll(list);
                linkedHashSet.addAll(a18);
            }
        }
        f1Var.m(linkedHashSet, name);
        a16.l lVar = f1Var.f17163b;
        return kz5.n0.S0(lVar.f649a.f632r.c(lVar, linkedHashSet));
    }
}
