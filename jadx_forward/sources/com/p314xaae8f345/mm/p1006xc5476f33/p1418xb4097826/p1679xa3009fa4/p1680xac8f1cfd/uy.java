package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class uy extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f217720f;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        if (this.f217720f == null) {
            this.f217720f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f217720f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
        return new int[]{w1Var.e(targetView) - targetView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 0};
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        if (this.f217720f == null) {
            this.f217720f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f217720f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
        int w17 = c1162x665295de.w();
        int x17 = c1162x665295de.x();
        int m8020x7e414b06 = c1162x665295de.m8020x7e414b06() - 1;
        if (w17 == -1) {
            return null;
        }
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
        return w1Var.b(mo7935xa188593e) < w1Var.c(mo7935xa188593e) / 2 ? c1162x665295de.mo7935xa188593e(w17 + 1) : x17 == m8020x7e414b06 ? c1162x665295de.mo7935xa188593e(m8020x7e414b06) : mo7935xa188593e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        android.view.View f17 = f(layoutManager);
        if (f17 == null) {
            return -1;
        }
        int m8032xa86cd69f = layoutManager.m8032xa86cd69f(f17);
        if (i17 >= 0) {
            int i19 = m8032xa86cd69f + 1;
            int m8020x7e414b06 = layoutManager.m8020x7e414b06() - 1;
            return i19 > m8020x7e414b06 ? m8020x7e414b06 : i19;
        }
        int i27 = m8032xa86cd69f - 1;
        if (i27 < 0) {
            return 0;
        }
        return i27;
    }
}
