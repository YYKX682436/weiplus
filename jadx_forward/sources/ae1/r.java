package ae1;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae1.r f84940d = new ae1.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ae1.v1[] m1183xcee59d22 = ae1.v1.m1183xcee59d22();
        int d17 = kz5.b1.d(m1183xcee59d22.length);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        int length = m1183xcee59d22.length;
        for (int i17 = 0; i17 < length; i17++) {
            ae1.v1 v1Var = m1183xcee59d22[i17];
            ae1.u1[] m1180xcee59d22 = ae1.u1.m1180xcee59d22();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ae1.u1 u1Var : m1180xcee59d22) {
                if (v1Var == u1Var.f84948d) {
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
                linkedHashMap2.put(((ae1.u1) next).f84949e, next);
            }
            linkedHashMap.put(v1Var, linkedHashMap2);
        }
        return linkedHashMap;
    }
}
