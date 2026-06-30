package id2;

/* loaded from: classes3.dex */
public final class g0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372115d;

    public g0(id2.v1 v1Var) {
        this.f372115d = v1Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int m75938x746dc8a6;
        float m75938x746dc8a62;
        r45.n30 n30Var = (r45.n30) obj;
        r45.n30 n30Var2 = (r45.n30) obj2;
        int m75939xb282bd08 = n30Var.m75939xb282bd08(1);
        id2.v1 v1Var = this.f372115d;
        int i17 = 0;
        if (m75939xb282bd08 > 0 && n30Var2.m75939xb282bd08(1) > 0) {
            r45.kv1 kv1Var = (r45.kv1) v1Var.E.get(n30Var2.m75945x2fec8307(0));
            m75938x746dc8a6 = kv1Var != null ? (int) kv1Var.m75938x746dc8a6(9) : 0;
            r45.kv1 kv1Var2 = (r45.kv1) v1Var.E.get(n30Var.m75945x2fec8307(0));
            if (kv1Var2 != null) {
                m75938x746dc8a62 = kv1Var2.m75938x746dc8a6(9);
                i17 = (int) m75938x746dc8a62;
            }
            return m75938x746dc8a6 - i17;
        }
        if (n30Var.m75939xb282bd08(1) != 0 || n30Var2.m75939xb282bd08(1) != 0) {
            return n30Var2.m75939xb282bd08(1) - n30Var.m75939xb282bd08(1);
        }
        r45.kv1 kv1Var3 = (r45.kv1) v1Var.E.get(n30Var2.m75945x2fec8307(0));
        m75938x746dc8a6 = kv1Var3 != null ? (int) kv1Var3.m75938x746dc8a6(9) : 0;
        r45.kv1 kv1Var4 = (r45.kv1) v1Var.E.get(n30Var.m75945x2fec8307(0));
        if (kv1Var4 != null) {
            m75938x746dc8a62 = kv1Var4.m75938x746dc8a6(9);
            i17 = (int) m75938x746dc8a62;
        }
        return m75938x746dc8a6 - i17;
    }
}
