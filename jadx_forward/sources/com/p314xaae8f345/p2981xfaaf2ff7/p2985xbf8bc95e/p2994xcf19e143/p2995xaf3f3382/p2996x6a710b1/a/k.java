package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes5.dex */
public class k extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f296938a;

    public k(android.content.Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        int i17 = this.f296938a;
        if (i17 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i17 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i17 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f296938a;
        if (i19 != 1 && i19 != 3) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, i18);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: setViewRotation */
    public void m100097x8327c6c5(int i17) {
        this.f296938a = ((i17 + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 90;
    }
}
