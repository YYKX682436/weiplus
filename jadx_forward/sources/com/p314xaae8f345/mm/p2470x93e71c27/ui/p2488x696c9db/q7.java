package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f273388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 f273389e;

    public q7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4, android.view.Surface surface) {
        this.f273389e = c19745xad58a1a4;
        this.f273388d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273389e;
        android.view.Surface surface = this.f273388d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19745xad58a1a4.f272981h, "%d release surface [%d]", java.lang.Integer.valueOf(c19745xad58a1a4.hashCode()), java.lang.Integer.valueOf(surface.hashCode()));
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(c19745xad58a1a4.f272981h, e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
