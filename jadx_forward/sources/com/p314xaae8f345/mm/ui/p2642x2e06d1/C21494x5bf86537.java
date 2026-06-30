package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFrameLayout */
/* loaded from: classes4.dex */
public class C21494x5bf86537 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278918d;

    public C21494x5bf86537(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278918d = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        for (int i28 = 0; !this.f278918d && i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt != null) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.gravity == -1) {
                    layoutParams.gravity = 51;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
        this.f278918d = true;
        super.onLayout(z17, i17, i18, i19, i27);
    }
}
