package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes5.dex */
public class TouchInterceptorListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f97884d;

    public TouchInterceptorListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.Rect();
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        android.content.res.Resources resources = getResources();
        int dimensionPixelSize = (resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480362vt) + 1) / 2;
        resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480367vy);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setDragListener(com.tencent.mm.plugin.emoji.ui.g6 g6Var) {
    }

    public void setDropListener(com.tencent.mm.plugin.emoji.ui.h6 h6Var) {
    }

    public void setRemoveListener(com.tencent.mm.plugin.emoji.ui.i6 i6Var) {
    }

    public void setTrashcan(android.graphics.drawable.Drawable drawable) {
        this.f97884d = drawable;
    }
}
