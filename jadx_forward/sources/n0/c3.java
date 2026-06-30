package n0;

/* loaded from: classes14.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.d3 f415006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(n0.d3 d3Var) {
        super(0);
        this.f415006d = d3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = n0.e1.f415025a;
        java.util.HashMap hashMap = new java.util.HashMap();
        n0.d3 d3Var = this.f415006d;
        int size = d3Var.f415016a.size();
        for (int i17 = 0; i17 < size; i17++) {
            n0.l2 l2Var = (n0.l2) d3Var.f415016a.get(i17);
            java.lang.Object obj2 = l2Var.f415135b;
            int i18 = l2Var.f415134a;
            java.lang.Object k2Var = obj2 != null ? new n0.k2(java.lang.Integer.valueOf(i18), l2Var.f415135b) : java.lang.Integer.valueOf(i18);
            java.lang.Object obj3 = hashMap.get(k2Var);
            if (obj3 == null) {
                obj3 = new java.util.LinkedHashSet();
                hashMap.put(k2Var, obj3);
            }
            ((java.util.LinkedHashSet) obj3).add(l2Var);
        }
        return hashMap;
    }
}
