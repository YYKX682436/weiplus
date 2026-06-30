package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class d extends androidx.compose.ui.platform.b {

    /* renamed from: d, reason: collision with root package name */
    public static androidx.compose.ui.platform.d f10533d;

    /* renamed from: c, reason: collision with root package name */
    public a2.k1 f10534c;

    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i17) {
        int i18;
        if (d().length() <= 0 || i17 >= d().length()) {
            return null;
        }
        l2.e eVar = l2.e.Rtl;
        if (i17 < 0) {
            a2.k1 k1Var = this.f10534c;
            if (k1Var == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            i18 = k1Var.f(0);
        } else {
            a2.k1 k1Var2 = this.f10534c;
            if (k1Var2 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            int f17 = k1Var2.f(i17);
            i18 = e(f17, eVar) == i17 ? f17 : f17 + 1;
        }
        a2.k1 k1Var3 = this.f10534c;
        if (k1Var3 == null) {
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        if (i18 >= k1Var3.f766b.f719f) {
            return null;
        }
        return c(e(i18, eVar), e(i18, l2.e.Ltr) + 1);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i17) {
        int i18;
        if (d().length() <= 0 || i17 <= 0) {
            return null;
        }
        int length = d().length();
        l2.e eVar = l2.e.Ltr;
        if (i17 > length) {
            a2.k1 k1Var = this.f10534c;
            if (k1Var == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            i18 = k1Var.f(d().length());
        } else {
            a2.k1 k1Var2 = this.f10534c;
            if (k1Var2 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
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
        a2.k1 k1Var = this.f10534c;
        if (k1Var == null) {
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        int j17 = k1Var.j(i17);
        a2.k1 k1Var2 = this.f10534c;
        if (k1Var2 == null) {
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        if (eVar != k1Var2.m(j17)) {
            a2.k1 k1Var3 = this.f10534c;
            if (k1Var3 != null) {
                return k1Var3.j(i17);
            }
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        if (this.f10534c != null) {
            return r6.e(i17, false) - 1;
        }
        kotlin.jvm.internal.o.o("layoutResult");
        throw null;
    }
}
