package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView */
/* loaded from: classes7.dex */
public class C11848x16ccb2c3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f159120d;

    /* renamed from: e, reason: collision with root package name */
    public int f159121e;

    /* renamed from: f, reason: collision with root package name */
    public float f159122f;

    /* renamed from: g, reason: collision with root package name */
    public float f159123g;

    /* renamed from: h, reason: collision with root package name */
    public float f159124h;

    /* renamed from: i, reason: collision with root package name */
    public float f159125i;

    public C11848x16ccb2c3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l1(this));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f159122f = motionEvent.getRawX();
            this.f159123g = motionEvent.getRawY();
            return true;
        }
        if (action != 2) {
            return true;
        }
        this.f159124h = motionEvent.getRawX();
        this.f159125i = motionEvent.getRawY();
        float x17 = getX() + (this.f159124h - this.f159122f);
        if (0.0f < x17 && x17 < this.f159120d - getWidth()) {
            setX(x17);
        }
        float f17 = this.f159125i - this.f159123g;
        float height = this.f159121e - getHeight();
        float y17 = getY() + f17;
        if (0.0f < y17 && y17 < height) {
            setY(y17);
        } else if ((y17 <= 0.0f && f17 > 0.0f) || (y17 >= height && f17 < 0.0f)) {
            setY(y17);
        }
        this.f159122f = this.f159124h;
        this.f159123g = this.f159125i;
        return true;
    }

    public C11848x16ccb2c3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
