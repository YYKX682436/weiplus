package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z0 f295994a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f295995b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final long f295996c = 120;

    /* renamed from: d, reason: collision with root package name */
    public final long f295997d = 120;

    /* renamed from: e, reason: collision with root package name */
    public final long f295998e = 250;

    /* renamed from: f, reason: collision with root package name */
    public final long f295999f = 250;

    public static int b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        int i17 = y1Var.f296245p & 14;
        if (y1Var.j()) {
            return 4;
        }
        if ((i17 & 4) != 0) {
            return i17;
        }
        int i18 = y1Var.f296239g;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = y1Var.f296253x;
        int I = c22949xf1deaba4 == null ? -1 : c22949xf1deaba4.I(y1Var);
        return (i18 == -1 || I == -1 || i18 == I) ? i17 : i17 | 2048;
    }

    public abstract boolean a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var2, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var2);

    public final void c(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z0 z0Var = this.f295994a;
        if (z0Var != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c1 c1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c1) z0Var;
            boolean z17 = true;
            y1Var.x(true);
            if (y1Var.f296243n != null && y1Var.f296244o == null) {
                y1Var.f296243n = null;
            }
            y1Var.f296244o = null;
            if ((y1Var.f296245p & 16) != 0) {
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = c1Var.f296019a;
            c22949xf1deaba4.f0();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f fVar = c22949xf1deaba4.f295935i;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) fVar.f296040a;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = r0Var.f296156a;
            android.view.View view = y1Var.f296236d;
            int indexOfChild = c22949xf1deaba42.indexOfChild(view);
            if (indexOfChild == -1) {
                fVar.k(view);
            } else {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = fVar.f296041b;
                if (dVar.d(indexOfChild)) {
                    dVar.f(indexOfChild);
                    fVar.k(view);
                    r0Var.b(indexOfChild);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba4.f295932f;
                n1Var.k(K);
                n1Var.h(K);
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    java.util.Objects.toString(view);
                    c22949xf1deaba4.toString();
                }
            }
            c22949xf1deaba4.g0(!z17);
            if (z17 || !y1Var.s()) {
                return;
            }
            c22949xf1deaba4.removeDetachedView(view, false);
        }
    }

    public abstract void d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var);

    public abstract void e();

    public abstract boolean f();
}
