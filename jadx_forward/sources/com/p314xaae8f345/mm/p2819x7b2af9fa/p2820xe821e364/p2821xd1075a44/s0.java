package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class s0 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296164a;

    public s0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296164a = c22949xf1deaba4;
    }

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar) {
        int i17 = bVar.f295986a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296164a;
        if (i17 == 1) {
            c22949xf1deaba4.f295946t.getClass();
            return;
        }
        if (i17 == 2) {
            c22949xf1deaba4.f295946t.getClass();
        } else if (i17 == 4) {
            c22949xf1deaba4.f295946t.getClass();
        } else {
            if (i17 != 8) {
                return;
            }
            c22949xf1deaba4.f295946t.getClass();
        }
    }

    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 b(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296164a;
        int h17 = c22949xf1deaba4.f295935i.h();
        int i18 = 0;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = null;
        while (true) {
            if (i18 >= h17) {
                break;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(c22949xf1deaba4.f295935i.g(i18));
            if (K != null && !K.m() && K.f296238f == i17) {
                if (!c22949xf1deaba4.f295935i.j(K.f296236d)) {
                    y1Var = K;
                    break;
                }
                y1Var = K;
            }
            i18++;
        }
        if (y1Var == null) {
            return null;
        }
        if (!c22949xf1deaba4.f295935i.j(y1Var.f296236d)) {
            return y1Var;
        }
        boolean z17 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1;
        return null;
    }

    public void c(int i17, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296164a;
        int h17 = c22949xf1deaba4.f295935i.h();
        int i28 = i18 + i17;
        for (int i29 = 0; i29 < h17; i29++) {
            android.view.View g17 = c22949xf1deaba4.f295935i.g(i29);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(g17);
            if (K != null && !K.y() && (i27 = K.f296238f) >= i17 && i27 < i28) {
                K.c(2);
                K.b(obj);
                ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) g17.getLayoutParams()).f295960c = true;
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba4.f295932f;
        java.util.ArrayList arrayList = n1Var.f296123c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                c22949xf1deaba4.J1 = true;
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(size);
            if (y1Var != null && (i19 = y1Var.f296238f) >= i17 && i19 < i28) {
                y1Var.c(2);
                n1Var.f(size);
            }
        }
    }

    public void d(int i17, int i18) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296164a;
        int h17 = c22949xf1deaba4.f295935i.h();
        for (int i19 = 0; i19 < h17; i19++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(c22949xf1deaba4.f295935i.g(i19));
            if (K != null && !K.y() && K.f296238f >= i17) {
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    K.m83643x9616526c();
                }
                K.v(i18, false);
                c22949xf1deaba4.F1.f296184f = true;
            }
        }
        java.util.ArrayList arrayList = c22949xf1deaba4.f295932f.f296123c;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(i27);
            if (y1Var != null && y1Var.f296238f >= i17) {
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    y1Var.m83643x9616526c();
                }
                y1Var.v(i18, false);
            }
        }
        c22949xf1deaba4.requestLayout();
        c22949xf1deaba4.I1 = true;
    }

    public void e(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296164a;
        int h17 = c22949xf1deaba4.f295935i.h();
        int i47 = -1;
        if (i17 < i18) {
            i27 = i17;
            i19 = i18;
            i28 = -1;
        } else {
            i19 = i17;
            i27 = i18;
            i28 = 1;
        }
        for (int i48 = 0; i48 < h17; i48++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(c22949xf1deaba4.f295935i.g(i48));
            if (K != null && (i39 = K.f296238f) >= i27 && i39 <= i19) {
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    K.m83643x9616526c();
                }
                if (K.f296238f == i17) {
                    K.v(i18 - i17, false);
                } else {
                    K.v(i28, false);
                }
                c22949xf1deaba4.F1.f296184f = true;
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba4.f295932f;
        n1Var.getClass();
        if (i17 < i18) {
            i37 = i17;
            i29 = i18;
        } else {
            i29 = i17;
            i37 = i18;
            i47 = 1;
        }
        java.util.ArrayList arrayList = n1Var.f296123c;
        int size = arrayList.size();
        for (int i49 = 0; i49 < size; i49++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(i49);
            if (y1Var != null && (i38 = y1Var.f296238f) >= i37 && i38 <= i29) {
                if (i38 == i17) {
                    y1Var.v(i18 - i17, false);
                } else {
                    y1Var.v(i47, false);
                }
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                    y1Var.m83643x9616526c();
                }
            }
        }
        c22949xf1deaba4.requestLayout();
        c22949xf1deaba4.I1 = true;
    }
}
