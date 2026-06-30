package com.p166x1da19ac6.p169x38ae70.p170xcca8366f;

/* renamed from: com.facebook.yoga.android.VirtualYogaLayout */
/* loaded from: classes15.dex */
public class C1588x4c102b05 extends android.view.ViewGroup {

    /* renamed from: mChildren */
    private final java.util.List<android.view.View> f5259x87e8058c;

    /* renamed from: mYogaNode */
    private final com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 f5260xe37ec01f;

    /* renamed from: mYogaNodes */
    private final java.util.Map<android.view.View, com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2> f5261x8c594434;

    public C1588x4c102b05(android.content.Context context) {
        super(context);
        this.f5259x87e8058c = new java.util.LinkedList();
        this.f5261x8c594434 = new java.util.HashMap();
        this.f5260xe37ec01f = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) {
            com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05 c1588x4c102b05 = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) view;
            c1588x4c102b05.m17082xe1485f0a(this);
            com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17081x3a5b5608 = c1588x4c102b05.m17081x3a5b5608();
            com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2 = this.f5260xe37ec01f;
            abstractC1575xc25b7cb2.mo16927x9e387e8e(m17081x3a5b5608, abstractC1575xc25b7cb2.mo16939x3d79f549());
            return;
        }
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17025xaf65a0fc = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.m17083x9bf7bde(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(layoutParams), m17025xaf65a0fc, view);
        m17025xaf65a0fc.mo16987x76491f2c(view);
        m17025xaf65a0fc.mo17009xf8fbaa94(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.ViewMeasureFunction());
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb22 = this.f5260xe37ec01f;
        abstractC1575xc25b7cb22.mo16927x9e387e8e(m17025xaf65a0fc, abstractC1575xc25b7cb22.mo16939x3d79f549());
        m17080xbb8aeee6(view, m17025xaf65a0fc);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getYogaNode */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17081x3a5b5608() {
        return this.f5260xe37ec01f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        throw new java.lang.RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    /* renamed from: transferChildren */
    public void m17082xe1485f0a(android.view.ViewGroup viewGroup) {
        if (viewGroup instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) {
            for (android.view.View view : this.f5259x87e8058c) {
                ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) viewGroup).m17080xbb8aeee6(view, this.f5261x8c594434.get(view));
            }
        } else {
            if (!(viewGroup instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
                throw new java.lang.RuntimeException("VirtualYogaLayout cannot transfer children to ViewGroup of type " + viewGroup.getClass().getCanonicalName() + ".  Must either be a VirtualYogaLayout or a YogaLayout.");
            }
            for (android.view.View view2 : this.f5259x87e8058c) {
                ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) viewGroup).m17087xbb8aeee6(view2, this.f5261x8c594434.get(view2));
            }
        }
        this.f5259x87e8058c.clear();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(layoutParams);
    }

    public C1588x4c102b05(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1588x4c102b05(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f5259x87e8058c = new java.util.LinkedList();
        this.f5261x8c594434 = new java.util.HashMap();
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17025xaf65a0fc = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
        this.f5260xe37ec01f = m17025xaf65a0fc;
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.m17083x9bf7bde(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(context, attributeSet), m17025xaf65a0fc, this);
    }

    /* renamed from: addView */
    public void m17080xbb8aeee6(android.view.View view, com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2) {
        this.f5259x87e8058c.add(view);
        this.f5261x8c594434.put(view, abstractC1575xc25b7cb2);
    }
}
