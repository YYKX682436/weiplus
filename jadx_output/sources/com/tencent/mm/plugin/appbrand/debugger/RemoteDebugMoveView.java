package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class RemoteDebugMoveView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f77587d;

    /* renamed from: e, reason: collision with root package name */
    public int f77588e;

    /* renamed from: f, reason: collision with root package name */
    public float f77589f;

    /* renamed from: g, reason: collision with root package name */
    public float f77590g;

    /* renamed from: h, reason: collision with root package name */
    public float f77591h;

    /* renamed from: i, reason: collision with root package name */
    public float f77592i;

    public RemoteDebugMoveView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.debugger.l1(this));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f77589f = motionEvent.getRawX();
            this.f77590g = motionEvent.getRawY();
            return true;
        }
        if (action != 2) {
            return true;
        }
        this.f77591h = motionEvent.getRawX();
        this.f77592i = motionEvent.getRawY();
        float x17 = getX() + (this.f77591h - this.f77589f);
        if (0.0f < x17 && x17 < this.f77587d - getWidth()) {
            setX(x17);
        }
        float f17 = this.f77592i - this.f77590g;
        float height = this.f77588e - getHeight();
        float y17 = getY() + f17;
        if (0.0f < y17 && y17 < height) {
            setY(y17);
        } else if ((y17 <= 0.0f && f17 > 0.0f) || (y17 >= height && f17 < 0.0f)) {
            setY(y17);
        }
        this.f77589f = this.f77591h;
        this.f77590g = this.f77592i;
        return true;
    }

    public RemoteDebugMoveView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
