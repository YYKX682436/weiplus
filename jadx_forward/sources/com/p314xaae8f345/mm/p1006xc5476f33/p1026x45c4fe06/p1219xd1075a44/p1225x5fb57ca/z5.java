package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes15.dex */
public class z5 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f173270d = android.view.ViewConfiguration.getLongPressTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f173271a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x5(this, android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public boolean f173272b = false;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y5 f173273c;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y5 y5Var) {
        this.f173273c = y5Var;
    }

    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.os.Handler handler = this.f173271a;
        if (actionMasked == 0) {
            view.setPressed(true);
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 1), f173270d);
            motionEvent.getX();
            motionEvent.getY();
        } else if (actionMasked == 1) {
            if (!this.f173272b && handler.hasMessages(1)) {
                this.f173273c.a();
            }
            view.setPressed(false);
            this.f173272b = false;
            handler.removeMessages(1);
            handler.removeMessages(2);
        } else if (actionMasked == 2) {
            int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = -scaledTouchSlop;
            if (f17 > x17 || x17 > view.getWidth() + scaledTouchSlop || f17 > y17 || y17 > view.getHeight() + scaledTouchSlop) {
                this.f173272b = true;
            }
        } else if (actionMasked == 3) {
            view.setPressed(false);
            this.f173272b = false;
            handler.removeMessages(1);
            handler.removeMessages(2);
        }
        return true;
    }
}
