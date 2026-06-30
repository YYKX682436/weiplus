package b16;

/* loaded from: classes16.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f17262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b16.e0 e0Var) {
        super(0);
        this.f17262d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Collection c17 = ((u06.x) this.f17262d.f17152o).c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (((u06.d0) ((e16.n) obj)).f423495a.isEnumConstant()) {
                arrayList.add(obj);
            }
        }
        int d17 = kz5.b1.d(kz5.d0.q(arrayList, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            linkedHashMap.put(((u06.f0) ((e16.n) next)).d(), next);
        }
        return linkedHashMap;
    }
}
