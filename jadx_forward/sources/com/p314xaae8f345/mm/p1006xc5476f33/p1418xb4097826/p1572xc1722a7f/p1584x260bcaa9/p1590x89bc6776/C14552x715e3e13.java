package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/LiveVerticalStaggeredGridLayoutManager;", "Lcom/tencent/mm/plugin/finder/view/manager/FinderStaggeredGridLayoutManager;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.LiveVerticalStaggeredGridLayoutManager */
/* loaded from: classes2.dex */
public final class C14552x715e3e13 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14552x715e3e13(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 parent) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.F = parent;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: addDisappearingView */
    public void mo7987x9bd66365(android.view.View view) {
        try {
            super.mo7987x9bd66365(view);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveVerticalStaggeredGridLayoutManager", "addDisappearingView e", e17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        if (!this.G) {
            return super.getF204840r();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a g17 = c14595xffb7e034.g1();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = c14595xffb7e034.f203772o2;
        atomicBoolean.get();
        if (g17 != null) {
            g17.g1();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return atomicBoolean.get() || g17 == null || g17.g1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveVerticalStaggeredGridLayoutManager", "onLayoutChildren e", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveVerticalStaggeredGridLayoutManager", "scrollVerticallyBy e", e17);
            return 0;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        if (this.G) {
            return false;
        }
        return super.mo7924x9f0306c5();
    }
}
