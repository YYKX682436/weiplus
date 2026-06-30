package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* renamed from: com.tencent.mm.wallet_core.ui.MMScrollView */
/* loaded from: classes9.dex */
public class ViewOnFocusChangeListenerC22901x93fec4d2 extends android.widget.ScrollView implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p f295623d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.o f295624e;

    public ViewOnFocusChangeListenerC22901x93fec4d2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(android.view.ViewGroup viewGroup, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if ((childAt instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) || (childAt instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14)) {
                childAt.setOnFocusChangeListener(onFocusChangeListener);
            } else if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt, onFocusChangeListener);
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            postDelayed(new com.p314xaae8f345.mm.p2802xd031a825.ui.n(this, view), 200L);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p2802xd031a825.ui.o oVar = this.f295624e;
        if (oVar != null) {
            oVar.mo27091x2d3d645c(this, i17, i18, i19, i27);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p pVar = this.f295623d;
        if (pVar != null && i18 != i27) {
            boolean z17 = i18 < i27;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u2 u2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u2) pVar;
            u2Var.getClass();
            u2Var.f262166a.f261492y.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t2(u2Var, z17 ? 8 : 0));
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    /* renamed from: setOnScrollListener */
    public void m83082x1a2696e2(com.p314xaae8f345.mm.p2802xd031a825.ui.o oVar) {
        this.f295624e = oVar;
    }

    /* renamed from: setOnSizeChangeListener */
    public void m83083xbe0c3ea6(com.p314xaae8f345.mm.p2802xd031a825.ui.p pVar) {
        if (pVar != null) {
            this.f295623d = pVar;
        }
    }

    public ViewOnFocusChangeListenerC22901x93fec4d2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
