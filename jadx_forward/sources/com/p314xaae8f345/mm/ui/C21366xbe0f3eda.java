package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.ForceInvalidateImageView */
/* loaded from: classes4.dex */
public class C21366xbe0f3eda extends android.widget.ImageView {
    public C21366xbe0f3eda(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        if (i17 == 0) {
            invalidate();
        }
        super.onVisibilityChanged(view, i17);
    }

    public C21366xbe0f3eda(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
