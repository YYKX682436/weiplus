package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MMImageView */
/* loaded from: classes9.dex */
public class C21405x85fc1ce0 extends android.widget.ImageView {
    public C21405x85fc1ce0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getContentDescription() != null || isClickable()) {
            return;
        }
        setImportantForAccessibility(2);
    }

    public C21405x85fc1ce0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
