package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yc0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yc0 f196718d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yc0();

    public yc0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.a84 a84Var = (r45.a84) obj;
        r45.a84 a84Var2 = (r45.a84) obj2;
        boolean z17 = false;
        java.lang.String str = null;
        java.lang.String m75945x2fec8307 = a84Var != null ? a84Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = a84Var2 != null ? a84Var2.m75945x2fec8307(0) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String g07 = (a84Var == null || (m75941xfb8219142 = a84Var.m75941xfb821914(1)) == null) ? null : kz5.n0.g0(m75941xfb8219142, "|", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xc0.f196605d, 30, null);
        if (g07 == null) {
            g07 = "";
        }
        if (a84Var2 != null && (m75941xfb821914 = a84Var2.m75941xfb821914(1)) != null) {
            str = kz5.n0.g0(m75941xfb821914, "|", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wc0.f196451d, 30, null);
        }
        java.lang.String str2 = str != null ? str : "";
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, m75945x2fec83072) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g07, str2)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
