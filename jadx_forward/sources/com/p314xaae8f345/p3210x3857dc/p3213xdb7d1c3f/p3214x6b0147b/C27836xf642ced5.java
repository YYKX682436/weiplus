package com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b;

/* renamed from: com.tencent.xweb.extension.video.ClickableFrameLayout */
/* loaded from: classes4.dex */
public class C27836xf642ced5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f301798d;

    public C27836xf642ced5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f301798d != null;
    }

    /* renamed from: setGestureDetector */
    public void m120243x96eaeb6d(android.view.GestureDetector gestureDetector) {
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f301798d = onClickListener;
    }

    public C27836xf642ced5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
