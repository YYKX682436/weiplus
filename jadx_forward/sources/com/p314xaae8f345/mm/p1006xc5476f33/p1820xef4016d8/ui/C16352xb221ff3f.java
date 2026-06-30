package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/HorizontalLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager */
/* loaded from: classes10.dex */
public final class C16352xb221ff3f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public int f227475v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f227476w;

    public C16352xb221ff3f(android.content.Context context) {
        super(context);
        Q(0);
        m8091xc21abdf5(true);
        this.f93414u = 4;
        this.f227476w = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int i17 = this.f227475v;
        return i17 > 0 ? i17 : super.G(state);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        if (this.f227476w) {
            return true;
        }
        return super.getF180019n();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo2418x457c9b08(z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        super.mo8069x4d79408f(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return super.mo2419x96d40915(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return super.mo7922xd8d712a7(i17, z2Var, h3Var);
    }
}
