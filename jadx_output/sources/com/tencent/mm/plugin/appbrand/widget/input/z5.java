package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes15.dex */
public class z5 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f91737d = android.view.ViewConfiguration.getLongPressTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f91738a = new com.tencent.mm.plugin.appbrand.widget.input.x5(this, android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public boolean f91739b = false;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.y5 f91740c;

    public z5(com.tencent.mm.plugin.appbrand.widget.input.y5 y5Var) {
        this.f91740c = y5Var;
    }

    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.os.Handler handler = this.f91738a;
        if (actionMasked == 0) {
            view.setPressed(true);
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 1), f91737d);
            motionEvent.getX();
            motionEvent.getY();
        } else if (actionMasked == 1) {
            if (!this.f91739b && handler.hasMessages(1)) {
                this.f91740c.a();
            }
            view.setPressed(false);
            this.f91739b = false;
            handler.removeMessages(1);
            handler.removeMessages(2);
        } else if (actionMasked == 2) {
            int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = -scaledTouchSlop;
            if (f17 > x17 || x17 > view.getWidth() + scaledTouchSlop || f17 > y17 || y17 > view.getHeight() + scaledTouchSlop) {
                this.f91739b = true;
            }
        } else if (actionMasked == 3) {
            view.setPressed(false);
            this.f91739b = false;
            handler.removeMessages(1);
            handler.removeMessages(2);
        }
        return true;
    }
}
