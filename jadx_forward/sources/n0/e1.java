package n0;

/* loaded from: classes14.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f415025a = new n0.y2("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f415026b = new n0.y2("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f415027c = new n0.y2("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f415028d = new n0.y2("providerValues");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f415029e = new n0.y2("providers");

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f415030f = new n0.y2("reference");

    public static final void a(java.util.List list, int i17, int i18) {
        int d17 = d(list, i17);
        if (d17 < 0) {
            d17 = -(d17 + 1);
        }
        while (d17 < list.size() && ((n0.i2) list.get(d17)).f415071b < i18) {
            list.remove(d17);
        }
    }

    public static final void b(n0.j4 j4Var, java.util.List list, int i17) {
        if (j4Var.h(i17)) {
            list.add(j4Var.i(i17));
            return;
        }
        int i18 = i17 + 1;
        int g17 = i17 + j4Var.g(i17);
        while (i18 < g17) {
            b(j4Var, list, i18);
            i18 += j4Var.g(i18);
        }
    }

    public static final java.lang.Void c(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        throw new java.lang.IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    public static final int d(java.util.List list, int i17) {
        int size = list.size() - 1;
        int i18 = 0;
        while (i18 <= size) {
            int i19 = (i18 + size) >>> 1;
            int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(((n0.i2) list.get(i19)).f415071b, i17);
            if (i27 < 0) {
                i18 = i19 + 1;
            } else {
                if (i27 <= 0) {
                    return i19;
                }
                size = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public static final void e(n0.o4 o4Var, n0.d4 rememberManager) {
        n0.l3 l3Var;
        n0.j1 j1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rememberManager, "rememberManager");
        int f17 = o4Var.f(o4Var.f415177b, o4Var.m(o4Var.f415193r));
        int[] iArr = o4Var.f415177b;
        int i17 = o4Var.f415193r;
        n0.n4 n4Var = new n0.n4(f17, o4Var.f(iArr, o4Var.m(i17 + o4Var.n(i17))), o4Var);
        while (n4Var.hasNext()) {
            java.lang.Object next = n4Var.next();
            if (next instanceof n0.e4) {
                ((n0.i1) rememberManager).c((n0.e4) next);
            } else if ((next instanceof n0.l3) && (j1Var = (l3Var = (n0.l3) next).f415138a) != null) {
                j1Var.f415092t = true;
                l3Var.f415138a = null;
            }
        }
        o4Var.z();
    }

    public static final void f(boolean z17) {
        if (z17) {
            return;
        }
        c("Check failed".toString());
        throw null;
    }
}
