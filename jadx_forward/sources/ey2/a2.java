package ey2;

/* loaded from: classes2.dex */
public abstract class a2 {
    public static final java.lang.String a(r45.um5 um5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(um5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expose_interval=");
        sb6.append(um5Var.m75942xfb822ef2(0));
        sb6.append(" ctrl_type=");
        sb6.append(um5Var.m75939xb282bd08(1));
        sb6.append(" mention_count=");
        sb6.append(um5Var.m75942xfb822ef2(3));
        sb6.append(" bypass_info=");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = um5Var.m75934xbce7f2f(2);
        sb6.append(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a.length : -1);
        return sb6.toString();
    }

    public static final java.lang.String b(r45.ym5 ym5Var) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ym5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report_scene=");
        sb6.append(ym5Var.m75939xb282bd08(0));
        sb6.append(" contextId=");
        sb6.append(ym5Var.m75945x2fec8307(1));
        sb6.append(" leftList(");
        sb6.append(ym5Var.m75941xfb821914(6).size());
        sb6.append(")=");
        java.util.LinkedList<r45.um5> m75941xfb821914 = ym5Var.m75941xfb821914(6);
        java.util.ArrayList arrayList2 = null;
        if (m75941xfb821914 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.um5 um5Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(um5Var);
                arrayList.add(a(um5Var));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(" rightList(");
        sb6.append(ym5Var.m75941xfb821914(7).size());
        sb6.append(")=");
        java.util.LinkedList<r45.um5> m75941xfb8219142 = ym5Var.m75941xfb821914(7);
        if (m75941xfb8219142 != null) {
            arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            for (r45.um5 um5Var2 : m75941xfb8219142) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(um5Var2);
                arrayList2.add(a(um5Var2));
            }
        }
        sb6.append(arrayList2);
        sb6.append(" session_interval=");
        sb6.append(ym5Var.m75939xb282bd08(4));
        return sb6.toString();
    }
}
