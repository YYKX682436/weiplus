package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class d extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b {

    /* renamed from: d, reason: collision with root package name */
    public static p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.d f92066d;

    /* renamed from: c, reason: collision with root package name */
    public a2.k1 f92067c;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g
    public int[] a(int i17) {
        int i18;
        if (d().length() <= 0 || i17 >= d().length()) {
            return null;
        }
        l2.e eVar = l2.e.Rtl;
        if (i17 < 0) {
            a2.k1 k1Var = this.f92067c;
            if (k1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
                throw null;
            }
            i18 = k1Var.f(0);
        } else {
            a2.k1 k1Var2 = this.f92067c;
            if (k1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
                throw null;
            }
            int f17 = k1Var2.f(i17);
            i18 = e(f17, eVar) == i17 ? f17 : f17 + 1;
        }
        a2.k1 k1Var3 = this.f92067c;
        if (k1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
            throw null;
        }
        if (i18 >= k1Var3.f82299b.f82252f) {
            return null;
        }
        return c(e(i18, eVar), e(i18, l2.e.Ltr) + 1);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g
    public int[] b(int i17) {
        int i18;
        if (d().length() <= 0 || i17 <= 0) {
            return null;
        }
        int length = d().length();
        l2.e eVar = l2.e.Ltr;
        if (i17 > length) {
            a2.k1 k1Var = this.f92067c;
            if (k1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
                throw null;
            }
            i18 = k1Var.f(d().length());
        } else {
            a2.k1 k1Var2 = this.f92067c;
            if (k1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
                throw null;
            }
            int f17 = k1Var2.f(i17);
            i18 = e(f17, eVar) + 1 == i17 ? f17 : f17 - 1;
        }
        if (i18 < 0) {
            return null;
        }
        return c(e(i18, l2.e.Rtl), e(i18, eVar) + 1);
    }

    public final int e(int i17, l2.e eVar) {
        a2.k1 k1Var = this.f92067c;
        if (k1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
            throw null;
        }
        int j17 = k1Var.j(i17);
        a2.k1 k1Var2 = this.f92067c;
        if (k1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
            throw null;
        }
        if (eVar != k1Var2.m(j17)) {
            a2.k1 k1Var3 = this.f92067c;
            if (k1Var3 != null) {
                return k1Var3.j(i17);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
            throw null;
        }
        if (this.f92067c != null) {
            return r6.e(i17, false) - 1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutResult");
        throw null;
    }
}
