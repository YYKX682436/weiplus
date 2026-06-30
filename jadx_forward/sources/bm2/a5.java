package bm2;

/* loaded from: classes.dex */
public final class a5 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.mt3 mt3Var = (r45.mt3) obj2;
        float m75939xb282bd08 = mt3Var.m75939xb282bd08(1);
        r45.kv1 kv1Var = (r45.kv1) mt3Var.m75936x14adae67(0);
        java.lang.Float valueOf = java.lang.Float.valueOf(m75939xb282bd08 * (kv1Var != null ? kv1Var.m75938x746dc8a6(9) : 0.0f));
        r45.mt3 mt3Var2 = (r45.mt3) obj;
        float m75939xb282bd082 = mt3Var2.m75939xb282bd08(1);
        r45.kv1 kv1Var2 = (r45.kv1) mt3Var2.m75936x14adae67(0);
        return mz5.a.b(valueOf, java.lang.Float.valueOf(m75939xb282bd082 * (kv1Var2 != null ? kv1Var2.m75938x746dc8a6(9) : 0.0f)));
    }
}
