package com.tencent.mm.plugin.address.ui;

/* loaded from: classes9.dex */
public class MMScrollView extends android.widget.ScrollView implements android.view.View.OnFocusChangeListener {
    public MMScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(android.view.ViewGroup viewGroup, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.address.ui.AddrItemView) {
                childAt.setOnFocusChangeListener(onFocusChangeListener);
            } else if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt, onFocusChangeListener);
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            postDelayed(new com.tencent.mm.plugin.address.ui.l0(this, view), 200L);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setOnSizeChangeListener(com.tencent.mm.plugin.address.ui.m0 m0Var) {
    }

    public MMScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
