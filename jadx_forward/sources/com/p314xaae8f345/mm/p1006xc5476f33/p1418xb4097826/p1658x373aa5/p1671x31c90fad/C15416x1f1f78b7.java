package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lrx2/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager */
/* loaded from: classes10.dex */
public class C15416x1f1f78b7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 implements rx2.x {
    public yz5.p E;

    public C15416x1f1f78b7(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1
    public void O(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        super.O(i17, i18);
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.E = pVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            G(z2Var, h3Var, true);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.StaggeredGridLayoutManager", e17, "", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f539688b, "onLayoutChildren_error", false, null, null, false, false, rx2.t.f482527d, 60, null);
        } catch (java.lang.IndexOutOfBoundsException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.StaggeredGridLayoutManager", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: requestSimpleAnimationsInNextLayout */
    public void mo8088xe9400092() {
        super.mo8088xe9400092();
        try {
            java.lang.reflect.Method declaredMethod = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.class.getDeclaredMethod("G0", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            if (obj != null) {
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StaggeredGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.StaggeredGridLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        super.mo2420xc593c771(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        long currentTimeMillis = this.E == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                java.util.Objects.toString(h3Var);
            }
            return N(i17, z2Var, h3Var);
        } finally {
            yz5.p pVar = this.E;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.util.Objects.toString(h3Var);
        }
        super.mo7942xd1b4653f(c1163xf1deaba4, h3Var, i17);
    }
}
