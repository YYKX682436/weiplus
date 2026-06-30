package bk4;

/* loaded from: classes11.dex */
public abstract class g0 {
    public static final float a(pj4.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        pj4.x c17 = mj4.d.c(o0Var);
        pj4.g0 g17 = c17 != null ? g(c17) : null;
        return (o0Var.f355225s != 0 || (g17 != null ? j(g17) : false)) ? 1.0f : 0.3f;
    }

    public static final java.lang.String b(java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.Iterator it = linkedList.iterator();
        java.lang.String text = "";
        while (it.hasNext()) {
            pj4.f0 f0Var = (pj4.f0) it.next();
            if (kotlin.jvm.internal.o.b(f0Var.f355037d, "en")) {
                text = f0Var.f355038e;
                kotlin.jvm.internal.o.f(text, "text");
            }
            if (kotlin.jvm.internal.o.b(f0Var.f355037d, f17)) {
                return f0Var.f355038e;
            }
        }
        return text;
    }

    public static final java.lang.String c(pj4.o1 o1Var) {
        java.util.LinkedList linkedList;
        java.lang.String b17;
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        pj4.g0 h17 = h(o1Var);
        return (h17 == null || (linkedList = h17.f355048f) == null || (b17 = b(linkedList)) == null) ? "" : b17;
    }

    public static final pj4.o1 d(pj4.p1 p1Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(p1Var, "<this>");
        java.util.Iterator it = p1Var.f355254g.iterator();
        while (it.hasNext()) {
            pj4.o1 o1Var = (pj4.o1) it.next();
            if (kotlin.jvm.internal.o.b(o1Var.f355228d, str) && h(o1Var) != null) {
                return o1Var;
            }
        }
        return null;
    }

    public static final pj4.g0 e(pj4.o1 o1Var, boolean z17) {
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        if (z17 && o1Var.f355229e != 0) {
            return null;
        }
        java.util.Iterator it = o1Var.f355230f.iterator();
        while (it.hasNext()) {
            pj4.g0 g0Var = (pj4.g0) it.next();
            kotlin.jvm.internal.o.d(g0Var);
            int i17 = g0Var.f355050h;
            if (i17 < 0) {
                i17 = 0;
            }
            int i18 = g0Var.f355051i;
            if (i18 <= 0 || i18 <= i17) {
                i18 = Integer.MAX_VALUE;
            }
            if (k(g0Var, i17, i18)) {
                return g0Var;
            }
        }
        return null;
    }

    public static final pj4.g0 f(java.util.List list) {
        int i17;
        int i18;
        int i19;
        int i27;
        kotlin.jvm.internal.o.g(list, "<this>");
        java.util.Iterator it = list.iterator();
        pj4.g0 g0Var = null;
        while (it.hasNext()) {
            pj4.g0 g0Var2 = (pj4.g0) it.next();
            kotlin.jvm.internal.o.g(g0Var2, "<this>");
            int i28 = g0Var2.f355050h;
            if (i28 < 0) {
                i28 = 0;
            }
            if (k(g0Var2, i28, Integer.MAX_VALUE) && (g0Var == null || (i17 = g0Var.f355050h) < (i18 = g0Var2.f355050h) || (i17 == i18 && ((i19 = g0Var.f355051i) == (i27 = g0Var2.f355051i) || i27 == 0 || (i19 != 0 && i19 < i27))))) {
                g0Var = g0Var2;
            }
        }
        return g0Var;
    }

    public static final pj4.g0 g(pj4.x xVar) {
        kotlin.jvm.internal.o.g(xVar, "<this>");
        java.util.LinkedList iconActions = xVar.f355323e;
        kotlin.jvm.internal.o.f(iconActions, "iconActions");
        return f(iconActions);
    }

    public static final pj4.g0 h(pj4.o1 o1Var) {
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        java.util.LinkedList actions = o1Var.f355230f;
        kotlin.jvm.internal.o.f(actions, "actions");
        return f(actions);
    }

    public static final boolean i(pj4.p1 p1Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(p1Var, "<this>");
        java.util.Iterator it = p1Var.f355254g.iterator();
        while (it.hasNext()) {
            pj4.o1 o1Var = (pj4.o1) it.next();
            if (kotlin.jvm.internal.o.b(o1Var.f355228d, str) && h(o1Var) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(pj4.g0 g0Var) {
        kotlin.jvm.internal.o.g(g0Var, "<this>");
        return (g0Var.f355047e & 1) != 0;
    }

    public static final boolean k(pj4.g0 g0Var, int i17, int i18) {
        kotlin.jvm.internal.o.g(g0Var, "<this>");
        int e17 = c01.id.e();
        if (i17 <= e17 && e17 <= i18) {
            java.lang.String str = g0Var.f355046d;
            if (!(str == null || r26.n0.N(str))) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String l(pj4.p1 p1Var) {
        kotlin.jvm.internal.o.g(p1Var, "<this>");
        return "key:" + p1Var.f355251d + " cid:" + p1Var.f355252e + " }";
    }
}
