package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 f272629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f272630e;

    public r2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32, android.view.MotionEvent motionEvent) {
        this.f272629d = c19651x7fe9d32;
        this.f272630e = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = this.f272629d;
        if (c19651x7fe9d32.f271366r) {
            c19651x7fe9d32.f271367s = true;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.w2 w2Var = c19651x7fe9d32.f271364p;
            if (w2Var != null) {
                android.view.MotionEvent motionEvent = this.f272630e;
                w2Var.c(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }
    }
}
