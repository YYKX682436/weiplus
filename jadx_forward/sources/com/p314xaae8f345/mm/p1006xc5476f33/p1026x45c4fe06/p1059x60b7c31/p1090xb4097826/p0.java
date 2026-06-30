package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f162749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ot0.q qVar, java.lang.String str) {
        super(1);
        this.f162749d = qVar;
        this.f162750e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.qc5 qc5Var;
        r45.qc5 qc5Var2;
        r45.be0 be0Var;
        r45.ub7 ub7Var;
        r45.be0 be0Var2;
        r45.ub7 ub7Var2;
        java.util.LinkedList m75941xfb821914;
        java.lang.String sb6;
        r45.kd5 kd5Var;
        r45.gh7 gh7Var;
        r45.be0 be0Var3;
        r45.ub7 ub7Var3;
        r45.lg0 lg0Var = (r45.lg0) obj;
        zy2.j jVar = new zy2.j();
        r45.ng0 ng0Var = lg0Var != null ? (r45.ng0) lg0Var.m75936x14adae67(1) : null;
        r45.un2 un2Var = new r45.un2();
        un2Var.set(6, (ng0Var == null || (be0Var3 = (r45.be0) ng0Var.m75936x14adae67(7)) == null || (ub7Var3 = (r45.ub7) be0Var3.m75936x14adae67(0)) == null) ? null : ub7Var3.m75945x2fec8307(1));
        un2Var.set(0, ng0Var != null ? ng0Var.m75945x2fec8307(0) : null);
        java.lang.String str2 = "";
        if (ng0Var == null || (m75941xfb821914 = ng0Var.m75941xfb821914(2)) == null) {
            str = "";
        } else {
            int i17 = 0;
            java.lang.String str3 = "";
            str = str3;
            for (java.lang.Object obj2 : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.jd5 jd5Var = (r45.jd5) obj2;
                if (i17 < (ng0Var.m75941xfb821914(2) != null ? r16.size() : 0) - 1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str3);
                    r45.kd5 kd5Var2 = (r45.kd5) jd5Var.m75936x14adae67(0);
                    sb7.append(kd5Var2 != null ? kd5Var2.m75945x2fec8307(2) : null);
                    sb7.append((char) 12289);
                    sb6 = sb7.toString();
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(str3);
                    r45.kd5 kd5Var3 = (r45.kd5) jd5Var.m75936x14adae67(0);
                    sb8.append(kd5Var3 != null ? kd5Var3.m75945x2fec8307(2) : null);
                    sb6 = sb8.toString();
                }
                str3 = sb6;
                if (str.length() == 0) {
                    str = (jd5Var == null || (kd5Var = (r45.kd5) jd5Var.m75936x14adae67(0)) == null || (gh7Var = (r45.gh7) kd5Var.m75936x14adae67(5)) == null) ? null : gh7Var.m75945x2fec8307(1);
                    if (str == null) {
                        str = "";
                    }
                }
                i17 = i18;
            }
            str2 = str3;
        }
        un2Var.set(1, str2);
        un2Var.set(5, str);
        un2Var.set(7, (ng0Var == null || (be0Var2 = (r45.be0) ng0Var.m75936x14adae67(7)) == null || (ub7Var2 = (r45.ub7) be0Var2.m75936x14adae67(0)) == null) ? null : ub7Var2.m75945x2fec8307(0));
        un2Var.set(6, (ng0Var == null || (be0Var = (r45.be0) ng0Var.m75936x14adae67(7)) == null || (ub7Var = (r45.ub7) be0Var.m75936x14adae67(0)) == null) ? null : ub7Var.m75945x2fec8307(1));
        un2Var.set(4, ng0Var != null ? ng0Var.m75945x2fec8307(6) : null);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append((ng0Var == null || (qc5Var2 = (r45.qc5) ng0Var.m75936x14adae67(4)) == null) ? null : qc5Var2.m75945x2fec8307(2));
        sb9.append((ng0Var == null || (qc5Var = (r45.qc5) ng0Var.m75936x14adae67(4)) == null) ? null : qc5Var.m75945x2fec8307(1));
        un2Var.set(3, sb9.toString());
        un2Var.set(1, str2);
        un2Var.set(2, java.lang.Integer.valueOf(ng0Var != null ? ng0Var.m75939xb282bd08(3) : 0));
        un2Var.set(8, java.lang.Integer.valueOf(ng0Var != null ? ng0Var.m75939xb282bd08(8) : 0));
        un2Var.set(9, ng0Var != null ? ng0Var.m75945x2fec8307(9) : null);
        un2Var.set(10, ng0Var != null ? ng0Var.m75945x2fec8307(10) : null);
        un2Var.set(11, java.lang.Integer.valueOf(ng0Var != null ? ng0Var.m75939xb282bd08(11) : 0));
        jVar.f558959b = un2Var;
        this.f162749d.f(jVar);
        ((ez.w0) ot0.j1.a()).wi(this.f162749d, "", "", this.f162750e, "", null, false);
        return jz5.f0.f384359a;
    }
}
