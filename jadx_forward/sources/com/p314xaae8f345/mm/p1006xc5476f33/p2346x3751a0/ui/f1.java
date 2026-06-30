package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes3.dex */
public final class f1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f258484a;

    public f1(float f17) {
        this.f258484a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view != null) {
            view.getDrawingRect(rect);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, (rect.right - rect.left) - 0, (rect.bottom - rect.top) - 0);
        if (outline != null) {
            outline.setRoundRect(rect2, this.f258484a);
        }
    }
}
