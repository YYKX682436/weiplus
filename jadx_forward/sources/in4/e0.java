package in4;

/* loaded from: classes10.dex */
public abstract class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374494a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f374495b = new in4.d0(this);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.u2
    public boolean a(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 d17;
        int f17;
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f374494a.getLayoutManager();
        if (layoutManager == null || this.f374494a.mo7946xf939df19() == null) {
            return false;
        }
        int m7953x45f9d89d = this.f374494a.m7953x45f9d89d();
        if (java.lang.Math.abs(i18) <= m7953x45f9d89d && java.lang.Math.abs(i17) <= m7953x45f9d89d) {
            return false;
        }
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) || (d17 = d(layoutManager)) == null || (f17 = f(layoutManager, i17, i18)) == -1) {
            z17 = false;
        } else {
            d17.f93582a = f17;
            layoutManager.m8099x6305639d(d17);
            z17 = true;
        }
        return z17;
    }

    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f374494a;
        if (c1163xf1deaba42 == c1163xf1deaba4) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f374495b;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.V0(w2Var);
            this.f374494a.m7968x9a6969cf(null);
        }
        this.f374494a = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            if (c1163xf1deaba4.m7955x6392d05b() != null) {
                throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f374494a.i(w2Var);
            this.f374494a.m7968x9a6969cf(this);
            new android.widget.Scroller(this.f374494a.getContext(), new android.view.animation.DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view);

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager);

    public abstract android.view.View e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager);

    public abstract int f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18);

    public void g() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        android.view.View e17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374494a;
        if (c1163xf1deaba4 == null || (layoutManager = c1163xf1deaba4.getLayoutManager()) == null || (e17 = e(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, e17);
        int i17 = c17[0];
        if (i17 == 0 && c17[1] == 0) {
            return;
        }
        this.f374494a.mo7976xc291bbd2(i17, c17[1]);
    }
}
