package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public final class u1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 {
    public u1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        super(layoutManager, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int b(android.view.View view) {
        return this.f93792a.m8015x62a22a5b(view) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int c(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f93792a.m8014x2ea13bdf(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int d(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return this.f93792a.m8013x8bb7462e(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int e(android.view.View view) {
        return this.f93792a.m8012x7f0ab3e8(view) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int f() {
        return this.f93792a.m8037x755bd410();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int g() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        return layoutManager.m8037x755bd410() - layoutManager.m8029x8b7f0b01();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int h() {
        return this.f93792a.m8029x8b7f0b01();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int i() {
        return this.f93792a.m8038xfc57f9d3();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int j() {
        return this.f93792a.m8019x47130b60();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int k() {
        return this.f93792a.m8028x805c2682();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int l() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        return (layoutManager.m8037x755bd410() - layoutManager.m8028x805c2682()) - layoutManager.m8029x8b7f0b01();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int n(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        android.graphics.Rect rect = this.f93794c;
        layoutManager.m8036xbfed3a72(view, true, rect);
        return rect.right;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public int o(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93792a;
        android.graphics.Rect rect = this.f93794c;
        layoutManager.m8036xbfed3a72(view, true, rect);
        return rect.left;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w1
    public void p(int i17) {
        this.f93792a.mo8054x8cefd576(i17);
    }
}
