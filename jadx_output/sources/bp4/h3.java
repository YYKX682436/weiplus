package bp4;

/* loaded from: classes10.dex */
public final class h3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23188f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.InsectRelativeLayout f23189g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.material.tabs.TabLayout f23190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23188f = parent;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.o1b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.InsectRelativeLayout insectRelativeLayout = (com.tencent.mm.ui.widget.InsectRelativeLayout) findViewById;
        this.f23189g = insectRelativeLayout;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.o1c);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) findViewById2;
        this.f23190h = tabLayout;
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateNormalModeSelectPlugin", "init tabLayout.tabCount:" + tabLayout.getTabCount());
        insectRelativeLayout.setDiscardKeyboard(true);
        int tabCount = tabLayout.getTabCount() - 1;
        for (int i17 = 0; i17 < tabCount; i17++) {
            android.view.View childAt = this.f23190h.getChildAt(0);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i65.a.h(this.f23188f.getContext(), com.tencent.mm.R.dimen.f479714d7));
            childAt2.setLayoutParams(marginLayoutParams);
        }
        this.f23190h.a(new bp4.g3(status));
        z(false);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23190h.setVisibility(i17);
    }

    public final void z(boolean z17) {
        this.f23189g.setVisibility(z17 ? 0 : 8);
    }
}
