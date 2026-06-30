package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class p1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93722d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93723e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.getF180019n()) {
            iArr[0] = i(layoutManager, view, l(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF204840r()) {
            iArr[1] = i(layoutManager, view, m(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager.getF204840r()) {
            return k(layoutManager, m(layoutManager));
        }
        if (layoutManager.getF180019n()) {
            return k(layoutManager, l(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int m8020x7e414b06;
        android.view.View f17;
        int m8032xa86cd69f;
        int i19;
        android.graphics.PointF a17;
        int i27;
        int i28;
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) || (m8020x7e414b06 = layoutManager.m8020x7e414b06()) == 0 || (f17 = f(layoutManager)) == null || (m8032xa86cd69f = layoutManager.m8032xa86cd69f(f17)) == -1 || (a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) layoutManager).a(m8020x7e414b06 - 1)) == null) {
            return -1;
        }
        if (layoutManager.getF180019n()) {
            i27 = j(layoutManager, l(layoutManager), i17, 0);
            if (a17.x < 0.0f) {
                i27 = -i27;
            }
        } else {
            i27 = 0;
        }
        if (layoutManager.getF204840r()) {
            i28 = j(layoutManager, m(layoutManager), 0, i18);
            if (a17.y < 0.0f) {
                i28 = -i28;
            }
        } else {
            i28 = 0;
        }
        if (layoutManager.getF204840r()) {
            i27 = i28;
        }
        if (i27 == 0) {
            return -1;
        }
        int i29 = m8032xa86cd69f + i27;
        int i37 = i29 >= 0 ? i29 : 0;
        return i37 >= m8020x7e414b06 ? i19 : i37;
    }

    public final int i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        return (w1Var.e(view) + (w1Var.c(view) / 2)) - (layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    public final int j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var, int i17, int i18) {
        this.f93746b.fling(0, 0, i17, i18, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f93746b.getFinalX(), this.f93746b.getFinalY()};
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        float f17 = 1.0f;
        if (m8008x3d79f549 != 0) {
            android.view.View view = null;
            int i19 = Integer.MIN_VALUE;
            int i27 = Integer.MAX_VALUE;
            android.view.View view2 = null;
            for (int i28 = 0; i28 < m8008x3d79f549; i28++) {
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i28);
                int m8032xa86cd69f = layoutManager.m8032xa86cd69f(m8007x6a486239);
                if (m8032xa86cd69f != -1) {
                    if (m8032xa86cd69f < i27) {
                        view = m8007x6a486239;
                        i27 = m8032xa86cd69f;
                    }
                    if (m8032xa86cd69f > i19) {
                        view2 = m8007x6a486239;
                        i19 = m8032xa86cd69f;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = java.lang.Math.max(w1Var.b(view), w1Var.b(view2)) - java.lang.Math.min(w1Var.e(view), w1Var.e(view2));
                if (max != 0) {
                    f17 = (max * 1.0f) / ((i19 - i27) + 1);
                }
            }
        }
        if (f17 <= 0.0f) {
            return 0;
        }
        return java.lang.Math.round((java.lang.Math.abs(iArr[0]) > java.lang.Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f17);
    }

    public final android.view.View k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 == 0) {
            return null;
        }
        int k17 = layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            int abs = java.lang.Math.abs((w1Var.e(m8007x6a486239) + (w1Var.c(m8007x6a486239) / 2)) - k17);
            if (abs < i17) {
                view = m8007x6a486239;
                i17 = abs;
            }
        }
        return view;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 l(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93723e;
        if (w1Var == null || w1Var.f93792a != layoutManager) {
            this.f93723e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        return this.f93723e;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 m(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93722d;
        if (w1Var == null || w1Var.f93792a != layoutManager) {
            this.f93722d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
        }
        return this.f93722d;
    }
}
