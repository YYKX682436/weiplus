package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public abstract class w extends ab3.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f226442d;

    /* renamed from: e, reason: collision with root package name */
    public ab3.h f226443e;

    /* renamed from: f, reason: collision with root package name */
    public int f226444f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f226445g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f226446h = 0.0f;

    public w(android.app.Activity activity) {
        this.f226442d = activity;
    }

    @Override // ab3.e
    public boolean b(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // ab3.e
    public void d() {
    }

    @Override // ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    public android.view.View j(int i17) {
        return this.f226442d.findViewById(i17);
    }

    public android.content.Intent k() {
        return this.f226442d.getIntent();
    }

    public abstract void l(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26);

    public abstract void m();
}
