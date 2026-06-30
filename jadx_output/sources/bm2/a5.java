package bm2;

/* loaded from: classes.dex */
public final class a5 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.mt3 mt3Var = (r45.mt3) obj2;
        float integer = mt3Var.getInteger(1);
        r45.kv1 kv1Var = (r45.kv1) mt3Var.getCustom(0);
        java.lang.Float valueOf = java.lang.Float.valueOf(integer * (kv1Var != null ? kv1Var.getFloat(9) : 0.0f));
        r45.mt3 mt3Var2 = (r45.mt3) obj;
        float integer2 = mt3Var2.getInteger(1);
        r45.kv1 kv1Var2 = (r45.kv1) mt3Var2.getCustom(0);
        return mz5.a.b(valueOf, java.lang.Float.valueOf(integer2 * (kv1Var2 != null ? kv1Var2.getFloat(9) : 0.0f)));
    }
}
