package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class g6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d6 {

    /* renamed from: h, reason: collision with root package name */
    public qb2.i0 f206588h;

    public g6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b();
        bVar.f206491c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f6();
        this.f206535g = bVar;
    }

    public final boolean a() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f206532d;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                int w17 = c1162x665295de.w();
                if (w17 <= 0) {
                    w17 = 0;
                }
                this.f206533e = w17;
                int y17 = c1162x665295de.y();
                if (y17 <= 0) {
                    y17 = 0;
                }
                this.f206534f = y17;
                int i17 = this.f206533e;
                if (i17 <= y17) {
                    while (true) {
                        qb2.i0 i0Var = this.f206588h;
                        qb2.t L = i0Var != null ? (i17 < 0 || i17 >= i0Var.K()) ? (qb2.t) i0Var.f442705n.get(i17 - i0Var.K()) : i0Var.L(i17) : null;
                        if (L != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L.f65866xbed8694c, "finder_system_message")) {
                            return true;
                        }
                        if (i17 == y17) {
                            break;
                        }
                        i17++;
                    }
                }
            }
        }
        return false;
    }
}
