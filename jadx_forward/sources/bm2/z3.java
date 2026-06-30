package bm2;

/* loaded from: classes3.dex */
public final class z3 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        dk2.u7 u7Var = dk2.u7.f315714a;
        java.util.Map map = dk2.u7.f315730q;
        java.lang.Integer num = (java.lang.Integer) map.get(((ce2.i) obj).f67814x2c488eb6);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        java.lang.Integer num2 = (java.lang.Integer) map.get(((ce2.i) obj2).f67814x2c488eb6);
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
