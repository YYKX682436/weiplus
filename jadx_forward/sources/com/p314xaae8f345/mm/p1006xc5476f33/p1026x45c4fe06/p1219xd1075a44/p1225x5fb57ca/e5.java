package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f172955a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f172956b;

    /* renamed from: c, reason: collision with root package name */
    public final float f172957c;

    /* renamed from: d, reason: collision with root package name */
    public if1.r f172958d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.MotionEvent f172959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172960f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f172961g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c5(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f172962h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d5(this);

    public e5(android.widget.EditText editText) {
        this.f172955a = editText;
        this.f172956b = "MicroMsg.AppBrand.InputFakeTapEventEmitter" + java.lang.String.format(java.util.Locale.US, "[%s]", editText.toString());
        this.f172957c = (float) android.view.ViewConfiguration.get(editText.getContext()).getScaledTouchSlop();
    }

    public final boolean a(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        float x17 = motionEvent.getX(motionEvent.getActionIndex());
        float y17 = motionEvent.getY(motionEvent.getActionIndex());
        float x18 = motionEvent2.getX(motionEvent2.getActionIndex());
        float y18 = motionEvent2.getY(motionEvent2.getActionIndex());
        bl1.a.b(motionEvent);
        bl1.a.b(motionEvent2);
        float abs = java.lang.Math.abs(y18 - y17);
        float f17 = this.f172957c;
        return abs <= f17 && java.lang.Math.abs(x18 - x17) <= f17;
    }

    public final void b() {
        this.f172960f = false;
        java.lang.Runnable runnable = this.f172961g;
        android.widget.EditText editText = this.f172955a;
        editText.removeCallbacks(runnable);
        editText.removeCallbacks(this.f172962h);
        this.f172958d = null;
        android.view.MotionEvent motionEvent = this.f172959e;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f172959e = null;
        }
    }
}
