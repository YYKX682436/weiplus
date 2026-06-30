package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public final class v1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 {
    public v1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        super(layoutManager, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int b(android.view.View view) {
        return this.f93792a.m8010xd6b039cc(view) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int c(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f93792a.m8013x8bb7462e(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int d(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f93792a.m8014x2ea13bdf(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int e(android.view.View view) {
        return this.f93792a.m8016xfbd72d54(view) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int f() {
        return this.f93792a.m8018x1c4fb41d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int g() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        return layoutManager.m8018x1c4fb41d() - layoutManager.m8026xc96f6de6();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int h() {
        return this.f93792a.m8026xc96f6de6();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int i() {
        return this.f93792a.m8019x47130b60();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int j() {
        return this.f93792a.m8038xfc57f9d3();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int k() {
        return this.f93792a.m8031xf39fff7a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int l() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        return (layoutManager.m8018x1c4fb41d() - layoutManager.m8031xf39fff7a()) - layoutManager.m8026xc96f6de6();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int n(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        android.graphics.Rect rect = this.f93794c;
        layoutManager.m8036xbfed3a72(view, true, rect);
        return rect.bottom;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int o(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        android.graphics.Rect rect = this.f93794c;
        layoutManager.m8036xbfed3a72(view, true, rect);
        return rect.top;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public void p(int i17) {
        this.f93792a.mo8055xe23cdd48(i17);
    }
}
