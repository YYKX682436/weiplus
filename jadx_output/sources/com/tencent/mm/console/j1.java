package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.h1 f64813d;

    public j1(com.tencent.mm.console.h1 h1Var) {
        this.f64813d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f64813d.f64804d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
