package ae1;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae1.r f3407d = new ae1.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ae1.v1[] values = ae1.v1.values();
        int d17 = kz5.b1.d(values.length);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        int length = values.length;
        for (int i17 = 0; i17 < length; i17++) {
            ae1.v1 v1Var = values[i17];
            ae1.u1[] values2 = ae1.u1.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ae1.u1 u1Var : values2) {
                if (v1Var == u1Var.f3415d) {
                    arrayList.add(u1Var);
                }
            }
            int d18 = kz5.b1.d(kz5.d0.q(arrayList, 10));
            if (d18 < 16) {
                d18 = 16;
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d18);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                linkedHashMap2.put(((ae1.u1) next).f3416e, next);
            }
            linkedHashMap.put(v1Var, linkedHashMap2);
        }
        return linkedHashMap;
    }
}
