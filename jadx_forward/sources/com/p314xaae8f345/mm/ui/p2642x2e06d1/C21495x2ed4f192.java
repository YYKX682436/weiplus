package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMGallery */
/* loaded from: classes15.dex */
public class C21495x2ed4f192 extends android.widget.Gallery {
    public C21495x2ed4f192(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (f17 > 0.0f) {
            onKeyDown(21, null);
            return true;
        }
        onKeyDown(22, null);
        return true;
    }

    public C21495x2ed4f192(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setStaticTransformationsEnabled(true);
    }
}
