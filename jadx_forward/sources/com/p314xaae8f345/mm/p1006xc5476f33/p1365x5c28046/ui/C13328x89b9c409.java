package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView */
/* loaded from: classes5.dex */
public class C13328x89b9c409 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f179417d;

    public C13328x89b9c409(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.Rect();
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        android.content.res.Resources resources = getResources();
        int dimensionPixelSize = (resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561895vt) + 1) / 2;
        resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561900vy);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setDragListener */
    public void m54794x71eb6f8a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g6 g6Var) {
    }

    /* renamed from: setDropListener */
    public void m54795x4578645(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h6 h6Var) {
    }

    /* renamed from: setRemoveListener */
    public void m54796xa7c1925a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i6 i6Var) {
    }

    /* renamed from: setTrashcan */
    public void m54797xc32cc01a(android.graphics.drawable.Drawable drawable) {
        this.f179417d = drawable;
    }
}
