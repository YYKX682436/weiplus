package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.f3 f230854d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.f3 f3Var) {
        this.f230854d = f3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "onTextureUpdate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.f3 f3Var = this.f230854d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = f3Var.f230864d.f230868d.H;
        if (c19745xad58a1a4 == null) {
            return;
        }
        c19745xad58a1a4.setAlpha(1.0f);
        f3Var.f230864d.f230868d.i7(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.V6(f3Var.f230864d.f230868d);
    }
}
