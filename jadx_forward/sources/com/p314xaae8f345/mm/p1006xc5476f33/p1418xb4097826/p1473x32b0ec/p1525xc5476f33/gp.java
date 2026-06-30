package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp f194256d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp();

    public gp() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("randomCtx-animation_id:");
        java.lang.String str2 = "";
        r45.yv1 yv1Var = it.f194253a;
        if (yv1Var == null || (str = yv1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",attackCtx-animation_id:");
        r45.ov1 ov1Var = it.f194254b;
        if (ov1Var != null && (m75945x2fec8307 = ov1Var.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        sb6.append(str2);
        sb6.append(',');
        return sb6.toString();
    }
}
