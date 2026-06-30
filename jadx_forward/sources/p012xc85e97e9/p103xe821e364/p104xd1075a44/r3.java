package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public abstract class r3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93745a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Scroller f93746b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f93747c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.p3(this);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.u2
    public boolean a(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d17;
        int g17;
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93745a.getLayoutManager();
        if (layoutManager == null || this.f93745a.mo7946xf939df19() == null) {
            return false;
        }
        int m7953x45f9d89d = this.f93745a.m7953x45f9d89d();
        if (java.lang.Math.abs(i18) <= m7953x45f9d89d && java.lang.Math.abs(i17) <= m7953x45f9d89d) {
            return false;
        }
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) || (d17 = d(layoutManager)) == null || (g17 = g(layoutManager, i17, i18)) == -1) {
            z17 = false;
        } else {
            d17.f93582a = g17;
            layoutManager.m8099x6305639d(d17);
            z17 = true;
        }
        return z17;
    }

    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f93745a;
        if (c1163xf1deaba42 == c1163xf1deaba4) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f93747c;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.V0(w2Var);
            this.f93745a.m7968x9a6969cf(null);
        }
        this.f93745a = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            if (c1163xf1deaba4.m7955x6392d05b() != null) {
                throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f93745a.i(w2Var);
            this.f93745a.m7968x9a6969cf(this);
            this.f93746b = new android.widget.Scroller(this.f93745a.getContext(), new android.view.animation.DecelerateInterpolator());
            h();
        }
    }

    public abstract int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view);

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.q3(this, this.f93745a.getContext());
        }
        return null;
    }

    public abstract android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager);

    public abstract int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18);

    public void h() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        android.view.View f17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93745a;
        if (c1163xf1deaba4 == null || (layoutManager = c1163xf1deaba4.getLayoutManager()) == null || (f17 = f(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, f17);
        int i17 = c17[0];
        if (i17 == 0 && c17[1] == 0) {
            return;
        }
        this.f93745a.mo7976xc291bbd2(i17, c17[1]);
    }
}
