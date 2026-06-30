package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public abstract class qa {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f187324a;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f187324a = z65.c.a();
    }

    public static final r45.f90 a(r45.at2 at2Var, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(at2Var, "<this>");
        java.lang.Object obj = null;
        java.util.Iterator it = d(at2Var, i17, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            boolean z17 = false;
            if (((r45.f90) next).m75939xb282bd08(0) >= i18) {
                z17 = true;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        return (r45.f90) obj;
    }

    public static final jz5.o b(r45.at2 at2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb exposeModel) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(at2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeModel, "exposeModel");
        r45.vb4 vb4Var = exposeModel.f69356xb3d25a00;
        int m75939xb282bd08 = vb4Var != null ? vb4Var.m75939xb282bd08(0) : 0;
        r45.vb4 vb4Var2 = exposeModel.f69352xf2980dbf;
        int m75939xb282bd082 = vb4Var2 != null ? vb4Var2.m75939xb282bd08(0) : 0;
        java.util.Iterator it = d(at2Var, exposeModel.f69353xe412923f, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.f90) obj).m75939xb282bd08(0) == m75939xb282bd08) {
                break;
            }
        }
        r45.f90 f90Var = (r45.f90) obj;
        if (f90Var == null) {
            return null;
        }
        return new jz5.o(java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Integer.valueOf(m75939xb282bd082), f90Var);
    }

    public static final java.util.LinkedList c(r45.at2 at2Var, int i17, java.util.LinkedList defaultValue) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(at2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        if (i17 == 0) {
            return defaultValue;
        }
        java.util.LinkedList m75941xfb821914 = at2Var.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getBiz_control_items(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.gk) obj).m75939xb282bd08(2) == i17) {
                break;
            }
        }
        r45.gk gkVar = (r45.gk) obj;
        java.util.LinkedList<r45.f90> m75941xfb8219142 = gkVar != null ? gkVar.m75941xfb821914(1) : null;
        boolean z17 = m75941xfb8219142 == null || m75941xfb8219142.isEmpty();
        boolean z18 = f187324a;
        if (z17) {
            if (!z18) {
                return defaultValue;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(defaultValue, 10));
            java.util.Iterator it6 = defaultValue.iterator();
            while (it6.hasNext()) {
                r45.f90 f90Var = (r45.f90) it6.next();
                arrayList.add("(n:" + f90Var.m75939xb282bd08(0) + " m:" + f90Var.m75939xb282bd08(1) + ')');
            }
            arrayList.toString();
            return defaultValue;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getControlItems businessType=");
            sb6.append(i17);
            sb6.append(", biz controlItems=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            for (r45.f90 f90Var2 : m75941xfb8219142) {
                arrayList2.add("(n:" + f90Var2.m75939xb282bd08(0) + " m:" + f90Var2.m75939xb282bd08(1));
            }
            sb6.append(arrayList2);
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReddotFreqConfigExt", sb6.toString());
        }
        return m75941xfb8219142;
    }

    public static java.util.LinkedList d(r45.at2 at2Var, int i17, java.util.LinkedList linkedList, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            linkedList = at2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getControl_items(...)");
        }
        return c(at2Var, i17, linkedList);
    }

    public static final java.lang.String e(r45.sw3 sw3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sw3Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(sw3Var.m75939xb282bd08(0));
        sb6.append(": ");
        java.util.LinkedList<r45.tw3> m75941xfb821914 = sw3Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRecord_items(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.tw3 tw3Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tw3Var);
            arrayList.add("(" + tw3Var.m75939xb282bd08(0) + ',' + tw3Var.m75939xb282bd08(1) + ',' + tw3Var.m75939xb282bd08(2) + ')');
        }
        sb6.append(arrayList);
        sb6.append('\n');
        return sb6.toString();
    }

    public static final boolean f(r45.at2 at2Var, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(at2Var, "<this>");
        java.lang.Object obj = null;
        java.util.Iterator it = d(at2Var, i17, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.f90) next).m75939xb282bd08(0) == i18) {
                obj = next;
                break;
            }
        }
        r45.f90 f90Var = (r45.f90) obj;
        return f90Var != null && i19 < f90Var.m75939xb282bd08(1);
    }

    public static final void g(r45.vb4 vb4Var, int i17, r45.at2 freqConfig, int i18) {
        r45.f90 a17;
        int m75939xb282bd08;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vb4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freqConfig, "freqConfig");
        if (vb4Var.m75939xb282bd08(0) > 0 || f(freqConfig, i17, i18, vb4Var.m75939xb282bd08(0))) {
            a17 = a(freqConfig, i17, i18);
            m75939xb282bd08 = (a17 != null ? a17.m75939xb282bd08(1) : 0) - vb4Var.m75939xb282bd08(0);
        } else {
            a17 = null;
            m75939xb282bd08 = 0;
        }
        vb4Var.set(3, java.lang.Integer.valueOf(m75939xb282bd08));
        if (f187324a) {
            vb4Var.m75939xb282bd08(0);
            vb4Var.m75939xb282bd08(3);
            if (a17 != null) {
                a17.m75939xb282bd08(0);
            }
            if (a17 != null) {
                a17.m75939xb282bd08(1);
            }
        }
    }
}
