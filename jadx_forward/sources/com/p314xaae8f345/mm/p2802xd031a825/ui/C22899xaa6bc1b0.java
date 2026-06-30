package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* renamed from: com.tencent.mm.wallet_core.ui.CustomerScrollView */
/* loaded from: classes3.dex */
public class C22899xaa6bc1b0 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public float f295599d;

    /* renamed from: e, reason: collision with root package name */
    public float f295600e;

    /* renamed from: f, reason: collision with root package name */
    public float f295601f;

    /* renamed from: g, reason: collision with root package name */
    public float f295602g;

    public C22899xaa6bc1b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f295600e = 0.0f;
            this.f295599d = 0.0f;
            this.f295601f = motionEvent.getX();
            this.f295602g = motionEvent.getY();
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f295599d += java.lang.Math.abs(x17 - this.f295601f);
            float abs = this.f295600e + java.lang.Math.abs(y17 - this.f295602g);
            this.f295600e = abs;
            this.f295601f = x17;
            this.f295602g = y17;
            if (this.f295599d > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C22899xaa6bc1b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
