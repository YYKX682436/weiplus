package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/minusscreen/MinusScreenGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager */
/* loaded from: classes10.dex */
public class C16610x601b3a01 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d {
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 D;
    public float E;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e17, "", new java.lang.Object[0]);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.D;
        float translationY = c1163xf1deaba4 != null ? c1163xf1deaba4.getTranslationY() : 0.0f;
        if (!(translationY == 0.0f) && this.E * translationY >= 0.0f) {
            this.E = translationY;
            return 0;
        }
        if (translationY == 0.0f) {
            this.E = 0.0f;
        } else if (this.E * translationY < 0.0f) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.D;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.setTranslationY(0.0f);
            }
            this.E = translationY;
        }
        return super.mo7922xd8d712a7(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        super.mo7942xd1b4653f(c1163xf1deaba4, h3Var, i17);
    }
}
