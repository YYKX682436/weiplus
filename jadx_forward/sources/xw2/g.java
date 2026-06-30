package xw2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539224d;

    public g(xw2.s sVar) {
        this.f539224d = sVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int m176116xaecd48df;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var;
        java.lang.Object mo144003x754a37bb;
        int i39;
        int i47;
        xw2.s sVar = this.f539224d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = sVar.f539255m;
        int width = c1163xf1deaba4.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginStart = width + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        if (marginStart == sVar.f539256n) {
            return;
        }
        sVar.f539256n = marginStart;
        if (marginStart > 0) {
            int i48 = 0;
            while (true) {
                int m176117xd94b177e = sVar.m176117xd94b177e() - i48;
                float f17 = m176117xd94b177e;
                m176116xaecd48df = (int) (marginStart * (f17 / (sVar.m176116xaecd48df() + f17)));
                if (m176116xaecd48df / m176117xd94b177e < sVar.m176118x3466693d()) {
                    sVar.m176118x3466693d();
                    i48++;
                    if (i48 >= sVar.m176117xd94b177e()) {
                        break;
                    }
                } else {
                    sVar.m176118x3466693d();
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.f539249d).f216101f;
                    do {
                        h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var;
                        mo144003x754a37bb = h3Var.mo144003x754a37bb();
                        xw2.t tVar = (xw2.t) mo144003x754a37bb;
                        i39 = tVar.f539257a;
                        i47 = tVar.f539258b;
                        tVar.getClass();
                    } while (!h3Var.j(mo144003x754a37bb, new xw2.t(i39, i47, m176117xd94b177e)));
                }
            }
            int i49 = marginStart - m176116xaecd48df;
            c1163xf1deaba4.setPadding(i49, 0, i49, 0);
            android.view.ViewGroup.LayoutParams layoutParams2 = c1163xf1deaba4.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMargins(-i49, 0, 0, 0);
            c1163xf1deaba4.setLayoutParams(layoutParams2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = sVar.f539254i;
            int w17 = c1162x665295de.w();
            android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
            if ((mo7935xa188593e != null ? mo7935xa188593e.getLeft() : -1) != i49) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i49));
                arrayList.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/PagerRowView", "invalidatePageWidth", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/view/base/PagerRowView", "invalidatePageWidth", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            c1163xf1deaba4.getWidth();
            sVar.f539253h.m8146xced61ae5();
        }
    }
}
