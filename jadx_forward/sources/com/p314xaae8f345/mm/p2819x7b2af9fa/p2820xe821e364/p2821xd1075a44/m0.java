package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class m0 extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d2 {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 f296111c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 f296112d;

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d2
    public int[] a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var, android.view.View view) {
        int[] iArr = new int[2];
        if (g1Var.b()) {
            iArr[0] = d(view, f(g1Var));
        } else {
            iArr[0] = 0;
        }
        if (g1Var.c()) {
            iArr[1] = d(view, g(g1Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int d(android.view.View view, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var) {
        return (k0Var.d(view) + (k0Var.b(view) / 2)) - (k0Var.i() + (k0Var.j() / 2));
    }

    public final android.view.View e(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var) {
        int h17 = g1Var.h();
        android.view.View view = null;
        if (h17 == 0) {
            return null;
        }
        int i17 = k0Var.i() + (k0Var.j() / 2);
        int i18 = Integer.MAX_VALUE;
        for (int i19 = 0; i19 < h17; i19++) {
            android.view.View g17 = g1Var.g(i19);
            int abs = java.lang.Math.abs((k0Var.d(g17) + (k0Var.b(g17) / 2)) - i17);
            if (abs < i18) {
                view = g17;
                i18 = abs;
            }
        }
        return view;
    }

    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 f(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f296112d;
        if (k0Var == null || k0Var.f296091a != g1Var) {
            this.f296112d = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i0(g1Var);
        }
        return this.f296112d;
    }

    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 g(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f296111c;
        if (k0Var == null || k0Var.f296091a != g1Var) {
            this.f296111c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j0(g1Var);
        }
        return this.f296111c;
    }
}
