package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f292451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.z2 f292452e;

    public y2(com.p314xaae8f345.mm.ui.p2740x696c9db.z2 z2Var, android.view.MotionEvent motionEvent) {
        this.f292452e = z2Var;
        this.f292451d = motionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.z2 z2Var = this.f292452e;
        if (z2Var.f292470d.f291558u) {
            android.os.Message message = new android.os.Message();
            message.what = 4661;
            message.obj = this.f292451d;
            z2Var.f292470d.f291560w.mo50308x2936bf5f(message);
            z2Var.f292470d.f291558u = false;
        }
    }
}
