package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class n implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        kh.r1 r1Var = (kh.r1) obj2;
        long longValue = r1Var.f389437f.f477085a.longValue();
        java.lang.Number number = r1Var.f389436e.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        int intValue = number.intValue();
        if (intValue < 1) {
            intValue = 1;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(longValue / intValue);
        kh.r1 r1Var2 = (kh.r1) obj;
        long longValue2 = r1Var2.f389437f.f477085a.longValue();
        java.lang.Number number2 = r1Var2.f389436e.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
        return mz5.a.b(valueOf, java.lang.Long.valueOf(longValue2 / (number2.intValue() >= 1 ? r7 : 1)));
    }
}
