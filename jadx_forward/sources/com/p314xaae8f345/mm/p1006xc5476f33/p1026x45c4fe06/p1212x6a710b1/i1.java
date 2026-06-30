package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes.dex */
public abstract class i1 {
    public static final java.lang.String a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        if (!r26.n0.B(str, ",", false)) {
            return str;
        }
        java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        return b17 == null ? "" : b17;
    }
}
