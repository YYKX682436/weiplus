package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2 f296077a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g2 f296078b = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g2();

    public i2(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2 h2Var) {
        this.f296077a = h2Var;
    }

    public android.view.View a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2 h2Var = this.f296077a;
        int a17 = h2Var.a();
        int b17 = h2Var.b();
        int i28 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        while (i17 != i18) {
            android.view.View mo83633x6a486239 = h2Var.mo83633x6a486239(i17);
            int c17 = h2Var.c(mo83633x6a486239);
            int d17 = h2Var.d(mo83633x6a486239);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g2 g2Var = this.f296078b;
            g2Var.f296068b = a17;
            g2Var.f296069c = b17;
            g2Var.f296070d = c17;
            g2Var.f296071e = d17;
            if (i19 != 0) {
                g2Var.f296067a = i19 | 0;
                if (g2Var.a()) {
                    return mo83633x6a486239;
                }
            }
            if (i27 != 0) {
                g2Var.f296067a = i27 | 0;
                if (g2Var.a()) {
                    view = mo83633x6a486239;
                }
            }
            i17 += i28;
        }
        return view;
    }
}
