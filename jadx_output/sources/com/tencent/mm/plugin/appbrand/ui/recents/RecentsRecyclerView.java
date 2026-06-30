package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes11.dex */
class RecentsRecyclerView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView {
    public RecentsRecyclerView(android.content.Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (getItemAnimator() == null || !getItemAnimator().o()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        return super.getChildDrawingOrder(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (getItemAnimator() == null || !getItemAnimator().o()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (getItemAnimator() != null && getItemAnimator().o()) {
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

    public RecentsRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
    }

    public RecentsRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setChildrenDrawingOrderEnabled(true);
    }
}
