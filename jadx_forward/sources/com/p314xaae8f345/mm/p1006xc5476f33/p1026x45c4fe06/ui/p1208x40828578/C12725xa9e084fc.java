package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.RecentsRecyclerView */
/* loaded from: classes11.dex */
class C12725xa9e084fc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f {
    public C12725xa9e084fc(android.content.Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (m7949x5701d990() == null || !m7949x5701d990().o()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        return super.getChildDrawingOrder(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (m7949x5701d990() == null || !m7949x5701d990().o()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (m7949x5701d990() != null && m7949x5701d990().o()) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            return super.onTouchEvent(obtain);
        }
    }

    public C12725xa9e084fc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
    }

    public C12725xa9e084fc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setChildrenDrawingOrderEnabled(true);
    }
}
