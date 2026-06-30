package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f91422a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f91423b;

    /* renamed from: c, reason: collision with root package name */
    public final float f91424c;

    /* renamed from: d, reason: collision with root package name */
    public if1.r f91425d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.MotionEvent f91426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91427f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f91428g = new com.tencent.mm.plugin.appbrand.widget.input.c5(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f91429h = new com.tencent.mm.plugin.appbrand.widget.input.d5(this);

    public e5(android.widget.EditText editText) {
        this.f91422a = editText;
        this.f91423b = "MicroMsg.AppBrand.InputFakeTapEventEmitter" + java.lang.String.format(java.util.Locale.US, "[%s]", editText.toString());
        this.f91424c = (float) android.view.ViewConfiguration.get(editText.getContext()).getScaledTouchSlop();
    }

    public final boolean a(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        float x17 = motionEvent.getX(motionEvent.getActionIndex());
        float y17 = motionEvent.getY(motionEvent.getActionIndex());
        float x18 = motionEvent2.getX(motionEvent2.getActionIndex());
        float y18 = motionEvent2.getY(motionEvent2.getActionIndex());
        bl1.a.b(motionEvent);
        bl1.a.b(motionEvent2);
        float abs = java.lang.Math.abs(y18 - y17);
        float f17 = this.f91424c;
        return abs <= f17 && java.lang.Math.abs(x18 - x17) <= f17;
    }

    public final void b() {
        this.f91427f = false;
        java.lang.Runnable runnable = this.f91428g;
        android.widget.EditText editText = this.f91422a;
        editText.removeCallbacks(runnable);
        editText.removeCallbacks(this.f91429h);
        this.f91425d = null;
        android.view.MotionEvent motionEvent = this.f91426e;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f91426e = null;
        }
    }
}
