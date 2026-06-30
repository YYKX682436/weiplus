package wi4;

/* loaded from: classes10.dex */
public abstract class f {
    public static final boolean a(java.util.List list, java.util.List list2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        if (list2 == null || list.size() != list2.size()) {
            return false;
        }
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (!b((pj4.j0) obj, (pj4.j0) list2.get(i17))) {
                return false;
            }
            i17 = i18;
        }
        return true;
    }

    public static final boolean b(pj4.j0 j0Var, pj4.j0 j0Var2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j0Var, "<this>");
        if (j0Var2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, j0Var2.f436672d)) {
            return false;
        }
        java.lang.String str = j0Var.f436675g;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = j0Var2.f436675g;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2 != null ? str2 : "");
    }
}
