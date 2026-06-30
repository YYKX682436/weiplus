package rh;

/* loaded from: classes12.dex */
public final class m1 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.n1 f476992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(rh.n1 n1Var, rh.n1 n1Var2, rh.d3 d3Var, rh.d3 d3Var2) {
        super(d3Var, d3Var2);
        this.f476992e = n1Var2;
    }

    @Override // rh.o2
    public rh.d3 a() {
        rh.n1 n1Var = new rh.n1(null);
        int i17 = 0;
        for (java.lang.Object obj : ((rh.n1) this.f477018b).b()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                long longValue = ((java.lang.Number) entry.getValue()).longValue();
                rh.n1 n1Var2 = this.f476992e;
                if (((java.util.Map) n1Var2.b().get(i17)).containsKey(str)) {
                    java.lang.Object obj2 = ((java.util.Map) n1Var2.b().get(i17)).get(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                    long longValue2 = longValue - ((java.lang.Number) obj2).longValue();
                    if (longValue2 < 0) {
                        longValue2 = 0;
                    }
                    linkedHashMap.put(str, java.lang.Long.valueOf(longValue2));
                }
            }
            n1Var.b().add(linkedHashMap);
            i17 = i18;
        }
        return n1Var;
    }
}
