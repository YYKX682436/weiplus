package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class w1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x1 {
    public w1(fc2.c cVar) {
        super(cVar);
        new android.graphics.Rect();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x1, fc2.o
    public fc2.a c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        fc2.y yVar = (fc2.y) super.c(recyclerView, i17);
        yVar.f342545j = hc2.f1.m(recyclerView, yVar.f342542g, yVar.f342543h);
        int i19 = this.f342493e;
        int i27 = yVar.f342542g;
        if (i19 != i27 || this.f342494f != yVar.f342543h) {
            if (i19 == Integer.MAX_VALUE || (i18 = this.f342494f) == Integer.MAX_VALUE) {
                i18 = yVar.f342543h;
            } else {
                if (i27 < i19) {
                    i19 = i27;
                }
                int i28 = yVar.f342543h;
                if (i28 > i18) {
                    i18 = i28;
                }
                i27 = i19;
            }
            yVar.f342544i = hc2.f1.m(recyclerView, i27, i18);
        }
        this.f342493e = yVar.f342542g;
        this.f342494f = yVar.f342543h;
        return yVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x1
    public fc2.a h(int i17) {
        return new fc2.y(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x1
    /* renamed from: i */
    public fc2.y h(int i17) {
        return new fc2.y(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x1
    public jz5.l j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, boolean z17) {
        int w17;
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
            int[] u17 = c1164x587b7ff1.u(null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = u17.length;
            y17 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = u17[i17];
                if (i18 >= 0) {
                    arrayList.add(java.lang.Integer.valueOf(i18));
                }
            }
            java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(arrayList);
            w17 = num != null ? num.intValue() : 0;
            java.lang.Integer h07 = kz5.z.h0(c1164x587b7ff1.v(null));
            if (h07 != null) {
                y17 = h07.intValue();
            }
        } else {
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                return new jz5.l(-1, -1);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            w17 = c1162x665295de.w();
            y17 = c1162x665295de.y();
        }
        return new jz5.l(java.lang.Integer.valueOf(k(recyclerView, z17, w17, 1)), java.lang.Integer.valueOf(k(recyclerView, z17, y17, -1)));
    }

    public final int k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17, int i17, int i18) {
        if (i17 < 0) {
            return i17;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        boolean z18 = false;
        if (i17 >= (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) || !z17) {
            return i17;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(i17, false);
        android.view.View view = q07 != null ? q07.f3639x46306858 : null;
        if (view != null && view.getGlobalVisibleRect(rect)) {
            z18 = true;
        }
        return (!z18 || rect.height() < view.getHeight() / 2) ? k(c1163xf1deaba4, z17, i17 + i18, i18) : i17;
    }
}
