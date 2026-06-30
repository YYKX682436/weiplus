package e32;

/* loaded from: classes10.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f328636f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f328637g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f328638h;

    /* renamed from: i, reason: collision with root package name */
    public e32.c f328639i;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.b(c1163xf1deaba4);
        this.f328636f = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3)) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f328636f;
        return new e32.d(this, c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null);
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
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f328638h;
            if (w1Var2 == null || w1Var2.f93792a != layoutManager) {
                this.f328638h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
            }
            w1Var = this.f328638h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var3 = this.f328637g;
            if (w1Var3 == null || w1Var3.f93792a != layoutManager) {
                this.f328637g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            w1Var = this.f328637g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
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
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        e32.c cVar = this.f328639i;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = ((a32.w) cVar).f82580a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13394xa8c361b5.f180199d, "onPageSelected: " + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5.b(c13394xa8c361b5, a17);
        }
        return view;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int g17 = super.g(layoutManager, i17, i18);
        e32.c cVar = this.f328639i;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = ((a32.w) cVar).f82580a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13394xa8c361b5.f180199d, "onPageSelected: " + g17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5.b(c13394xa8c361b5, g17);
        }
        return g17;
    }
}
