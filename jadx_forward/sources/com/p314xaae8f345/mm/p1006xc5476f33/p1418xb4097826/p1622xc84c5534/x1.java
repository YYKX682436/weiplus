package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public class x1 extends fc2.o {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f206961r;

    public x1(fc2.c cVar) {
        super(cVar);
        new android.graphics.Rect();
        this.f206961r = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.y0().r()).intValue() == 1;
    }

    @Override // fc2.o
    public fc2.a c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        fc2.a h17 = h(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.base.TwoFeedFlowScrollEvent");
        fc2.y yVar = (fc2.y) h17;
        jz5.l j17 = j(recyclerView, this.f206961r);
        int intValue = ((java.lang.Number) j17.f384366d).intValue();
        int intValue2 = ((java.lang.Number) j17.f384367e).intValue();
        yVar.f342542g = intValue;
        yVar.f342543h = intValue2;
        yVar.f342545j = hc2.f1.m(recyclerView, intValue, intValue2);
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

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public fc2.y h(int i17) {
        return new fc2.y(i17);
    }

    public jz5.l j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return hc2.f1.s(recyclerView, z17);
    }
}
