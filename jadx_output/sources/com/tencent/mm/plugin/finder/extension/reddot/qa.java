package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public abstract class qa {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f105791a;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f105791a = z65.c.a();
    }

    public static final r45.f90 a(r45.at2 at2Var, int i17, int i18) {
        kotlin.jvm.internal.o.g(at2Var, "<this>");
        java.lang.Object obj = null;
        java.util.Iterator it = d(at2Var, i17, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            boolean z17 = false;
            if (((r45.f90) next).getInteger(0) >= i18) {
                z17 = true;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        return (r45.f90) obj;
    }

    public static final jz5.o b(r45.at2 at2Var, com.tencent.mm.plugin.finder.extension.reddot.pb exposeModel) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(at2Var, "<this>");
        kotlin.jvm.internal.o.g(exposeModel, "exposeModel");
        r45.vb4 vb4Var = exposeModel.field_exposeCnt;
        int integer = vb4Var != null ? vb4Var.getInteger(0) : 0;
        r45.vb4 vb4Var2 = exposeModel.field_banCnt;
        int integer2 = vb4Var2 != null ? vb4Var2.getInteger(0) : 0;
        java.util.Iterator it = d(at2Var, exposeModel.field_businessType, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.f90) obj).getInteger(0) == integer) {
                break;
            }
        }
        r45.f90 f90Var = (r45.f90) obj;
        if (f90Var == null) {
            return null;
        }
        return new jz5.o(java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(integer2), f90Var);
    }

    public static final java.util.LinkedList c(r45.at2 at2Var, int i17, java.util.LinkedList defaultValue) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(at2Var, "<this>");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        if (i17 == 0) {
            return defaultValue;
        }
        java.util.LinkedList list = at2Var.getList(4);
        kotlin.jvm.internal.o.f(list, "getBiz_control_items(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.gk) obj).getInteger(2) == i17) {
                break;
            }
        }
        r45.gk gkVar = (r45.gk) obj;
        java.util.LinkedList<r45.f90> list2 = gkVar != null ? gkVar.getList(1) : null;
        boolean z17 = list2 == null || list2.isEmpty();
        boolean z18 = f105791a;
        if (z17) {
            if (!z18) {
                return defaultValue;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(defaultValue, 10));
            java.util.Iterator it6 = defaultValue.iterator();
            while (it6.hasNext()) {
                r45.f90 f90Var = (r45.f90) it6.next();
                arrayList.add("(n:" + f90Var.getInteger(0) + " m:" + f90Var.getInteger(1) + ')');
            }
            arrayList.toString();
            return defaultValue;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getControlItems businessType=");
            sb6.append(i17);
            sb6.append(", biz controlItems=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.f90 f90Var2 : list2) {
                arrayList2.add("(n:" + f90Var2.getInteger(0) + " m:" + f90Var2.getInteger(1));
            }
            sb6.append(arrayList2);
            sb6.append(')');
            com.tencent.mars.xlog.Log.i("FinderReddotFreqConfigExt", sb6.toString());
        }
        return list2;
    }

    public static java.util.LinkedList d(r45.at2 at2Var, int i17, java.util.LinkedList linkedList, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            linkedList = at2Var.getList(0);
            kotlin.jvm.internal.o.f(linkedList, "getControl_items(...)");
        }
        return c(at2Var, i17, linkedList);
    }

    public static final java.lang.String e(r45.sw3 sw3Var) {
        kotlin.jvm.internal.o.g(sw3Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(sw3Var.getInteger(0));
        sb6.append(": ");
        java.util.LinkedList<r45.tw3> list = sw3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getRecord_items(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.tw3 tw3Var : list) {
            kotlin.jvm.internal.o.d(tw3Var);
            arrayList.add("(" + tw3Var.getInteger(0) + ',' + tw3Var.getInteger(1) + ',' + tw3Var.getInteger(2) + ')');
        }
        sb6.append(arrayList);
        sb6.append('\n');
        return sb6.toString();
    }

    public static final boolean f(r45.at2 at2Var, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(at2Var, "<this>");
        java.lang.Object obj = null;
        java.util.Iterator it = d(at2Var, i17, null, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.f90) next).getInteger(0) == i18) {
                obj = next;
                break;
            }
        }
        r45.f90 f90Var = (r45.f90) obj;
        return f90Var != null && i19 < f90Var.getInteger(1);
    }

    public static final void g(r45.vb4 vb4Var, int i17, r45.at2 freqConfig, int i18) {
        r45.f90 a17;
        int integer;
        kotlin.jvm.internal.o.g(vb4Var, "<this>");
        kotlin.jvm.internal.o.g(freqConfig, "freqConfig");
        if (vb4Var.getInteger(0) > 0 || f(freqConfig, i17, i18, vb4Var.getInteger(0))) {
            a17 = a(freqConfig, i17, i18);
            integer = (a17 != null ? a17.getInteger(1) : 0) - vb4Var.getInteger(0);
        } else {
            a17 = null;
            integer = 0;
        }
        vb4Var.set(3, java.lang.Integer.valueOf(integer));
        if (f105791a) {
            vb4Var.getInteger(0);
            vb4Var.getInteger(3);
            if (a17 != null) {
                a17.getInteger(0);
            }
            if (a17 != null) {
                a17.getInteger(1);
            }
        }
    }
}
