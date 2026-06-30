package mx0;

/* loaded from: classes10.dex */
public final class aa extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f413372f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f413373g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f413374h;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.b(c1163xf1deaba4);
        this.f413372f = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3)) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f413372f;
        return new mx0.z9(this, c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var;
        android.view.View view;
        int top;
        int measuredHeight;
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.getF180019n()) {
            w1Var = this.f413374h;
            if (w1Var == null || w1Var.f93792a != layoutManager) {
                w1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
                this.f413374h = w1Var;
            }
        } else {
            w1Var = this.f413373g;
            if (w1Var == null || w1Var.f93792a != layoutManager) {
                w1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
                this.f413373g = w1Var;
            }
        }
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        if (m8008x3d79f549 == 0) {
            view = null;
        } else {
            int k17 = layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
            int i17 = Integer.MAX_VALUE;
            view = null;
            for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
                if (m8007x6a486239 != null) {
                    if (layoutManager.getF180019n()) {
                        top = m8007x6a486239.getLeft();
                        measuredHeight = m8007x6a486239.getMeasuredWidth() / 2;
                    } else {
                        top = m8007x6a486239.getTop();
                        measuredHeight = m8007x6a486239.getMeasuredHeight() / 2;
                    }
                    int abs = java.lang.Math.abs((top + measuredHeight) - k17);
                    if (abs < i17) {
                        view = m8007x6a486239;
                        i17 = abs;
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.a();
        }
        return view;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        return super.g(layoutManager, i17, i18);
    }
}
