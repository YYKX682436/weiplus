package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class la0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.eh2 f208657a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f208658b;

    public la0(r45.eh2 localPb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPb, "localPb");
        this.f208657a = localPb;
        this.f208658b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ka0(this));
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        r45.eh2 eh2Var = this.f208657a;
        int m75939xb282bd08 = eh2Var.m75939xb282bd08(0);
        r45.eh2 eh2Var2 = other.f208657a;
        if (m75939xb282bd08 != eh2Var2.m75939xb282bd08(0)) {
            return false;
        }
        java.lang.String m75945x2fec8307 = eh2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            return false;
        }
        java.lang.String m75945x2fec83072 = eh2Var.m75945x2fec8307(1);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String m75945x2fec83073 = eh2Var2.m75945x2fec8307(1);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83072, m75945x2fec83073 != null ? m75945x2fec83073 : "");
    }
}
