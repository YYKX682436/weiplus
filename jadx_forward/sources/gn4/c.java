package gn4;

/* loaded from: classes10.dex */
public class c extends in4.e0 {

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f355126c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f355127d;

    @Override // in4.e0
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.getF180019n()) {
            iArr[0] = h(layoutManager, view, k(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF204840r()) {
            iArr[1] = h(layoutManager, view, l(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // in4.e0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) {
            return new gn4.b(this, this.f374494a.getContext());
        }
        return null;
    }

    @Override // in4.e0
    public android.view.View e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager.getF204840r()) {
            return i(layoutManager, l(layoutManager));
        }
        if (layoutManager.getF180019n()) {
            return i(layoutManager, k(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in4.e0
    public int f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int m8020x7e414b06;
        int m8032xa86cd69f;
        android.graphics.PointF a17;
        if (java.lang.Math.abs(i18) <= 500 || java.lang.Math.abs(i17) >= java.lang.Math.abs(i18) || (m8020x7e414b06 = layoutManager.m8020x7e414b06()) == 0) {
            return -1;
        }
        android.view.View j17 = layoutManager.getF204840r() ? j(layoutManager, l(layoutManager)) : layoutManager.getF180019n() ? j(layoutManager, k(layoutManager)) : null;
        if (j17 == null || (m8032xa86cd69f = layoutManager.m8032xa86cd69f(j17)) == -1) {
            return -1;
        }
        boolean z17 = false;
        boolean z18 = !layoutManager.getF180019n() ? i18 <= 0 : i17 <= 0;
        if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) && (a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) layoutManager).a(m8020x7e414b06 - 1)) != null && (a17.x < 0.0f || a17.y < 0.0f)) {
            z17 = true;
        }
        return z17 ? z18 ? m8032xa86cd69f - 1 : m8032xa86cd69f : z18 ? m8032xa86cd69f + 1 : m8032xa86cd69f;
    }

    public final int h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        return (w1Var.e(view) + (w1Var.c(view) / 2)) - (layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    public final android.view.View i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
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

    public final android.view.View j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 == 0) {
            return null;
        }
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            int e17 = w1Var.e(m8007x6a486239);
            if (e17 < i17) {
                view = m8007x6a486239;
                i17 = e17;
            }
        }
        return view;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f355127d;
        if (w1Var == null || w1Var.f93792a != layoutManager) {
            this.f355127d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        return this.f355127d;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 l(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f355126c;
        if (w1Var == null || w1Var.f93792a != layoutManager) {
            this.f355126c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
        }
        return this.f355126c;
    }
}
