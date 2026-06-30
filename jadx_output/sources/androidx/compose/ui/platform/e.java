package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class e extends androidx.compose.ui.platform.b {

    /* renamed from: e, reason: collision with root package name */
    public static androidx.compose.ui.platform.e f10542e;

    /* renamed from: c, reason: collision with root package name */
    public a2.k1 f10543c;

    /* renamed from: d, reason: collision with root package name */
    public y1.y f10544d;

    public e(kotlin.jvm.internal.i iVar) {
        new android.graphics.Rect();
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i17) {
        int i18;
        if (d().length() <= 0 || i17 >= d().length()) {
            return null;
        }
        try {
            y1.y yVar = this.f10544d;
            if (yVar == null) {
                kotlin.jvm.internal.o.o("node");
                throw null;
            }
            d1.g d17 = yVar.d();
            int b17 = a06.d.b(d17.f225632d - d17.f225630b);
            if (i17 <= 0) {
                i17 = 0;
            }
            a2.k1 k1Var = this.f10543c;
            if (k1Var == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            int f17 = k1Var.f(i17);
            a2.k1 k1Var2 = this.f10543c;
            if (k1Var2 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            float k17 = k1Var2.k(f17) + b17;
            a2.k1 k1Var3 = this.f10543c;
            if (k1Var3 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            if (k1Var3 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            if (k17 < k1Var3.k(k1Var3.f766b.f719f - 1)) {
                a2.k1 k1Var4 = this.f10543c;
                if (k1Var4 == null) {
                    kotlin.jvm.internal.o.o("layoutResult");
                    throw null;
                }
                i18 = k1Var4.g(k17);
            } else {
                a2.k1 k1Var5 = this.f10543c;
                if (k1Var5 == null) {
                    kotlin.jvm.internal.o.o("layoutResult");
                    throw null;
                }
                i18 = k1Var5.f766b.f719f;
            }
            return c(i17, e(i18 - 1, l2.e.Ltr) + 1);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i17) {
        int i18;
        if (d().length() <= 0 || i17 <= 0) {
            return null;
        }
        try {
            y1.y yVar = this.f10544d;
            if (yVar == null) {
                kotlin.jvm.internal.o.o("node");
                throw null;
            }
            d1.g d17 = yVar.d();
            int b17 = a06.d.b(d17.f225632d - d17.f225630b);
            int length = d().length();
            if (length <= i17) {
                i17 = length;
            }
            a2.k1 k1Var = this.f10543c;
            if (k1Var == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            int f17 = k1Var.f(i17);
            a2.k1 k1Var2 = this.f10543c;
            if (k1Var2 == null) {
                kotlin.jvm.internal.o.o("layoutResult");
                throw null;
            }
            float k17 = k1Var2.k(f17) - b17;
            if (k17 > 0.0f) {
                a2.k1 k1Var3 = this.f10543c;
                if (k1Var3 == null) {
                    kotlin.jvm.internal.o.o("layoutResult");
                    throw null;
                }
                i18 = k1Var3.g(k17);
            } else {
                i18 = 0;
            }
            if (i17 == d().length() && i18 < f17) {
                i18++;
            }
            return c(e(i18, l2.e.Rtl), i17);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i17, l2.e eVar) {
        a2.k1 k1Var = this.f10543c;
        if (k1Var == null) {
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        int j17 = k1Var.j(i17);
        a2.k1 k1Var2 = this.f10543c;
        if (k1Var2 == null) {
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        if (eVar != k1Var2.m(j17)) {
            a2.k1 k1Var3 = this.f10543c;
            if (k1Var3 != null) {
                return k1Var3.j(i17);
            }
            kotlin.jvm.internal.o.o("layoutResult");
            throw null;
        }
        if (this.f10543c != null) {
            return r6.e(i17, false) - 1;
        }
        kotlin.jvm.internal.o.o("layoutResult");
        throw null;
    }
}
