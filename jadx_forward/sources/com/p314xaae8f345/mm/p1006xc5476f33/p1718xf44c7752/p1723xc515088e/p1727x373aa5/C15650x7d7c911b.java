package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.TouchCoordinatorLayout */
/* loaded from: classes5.dex */
public class C15650x7d7c911b extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a {
    public android.view.View.OnTouchListener D;

    public C15650x7d7c911b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.D;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: setTouchListener */
    public void m63693xce6c7bd1(android.view.View.OnTouchListener onTouchListener) {
        this.D = onTouchListener;
    }

    public C15650x7d7c911b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
