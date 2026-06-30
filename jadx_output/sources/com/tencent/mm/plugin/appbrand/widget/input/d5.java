package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.e5 f91401d;

    public d5(com.tencent.mm.plugin.appbrand.widget.input.e5 e5Var) {
        this.f91401d = e5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.e5 e5Var = this.f91401d;
        if (e5Var.f91427f) {
            if1.r c17 = if1.s.c(e5Var.f91422a);
            if1.r rVar = e5Var.f91425d;
            if (rVar == null || java.lang.Math.abs(rVar.f291094b - c17.f291094b) > 1.0f || java.lang.Math.abs(e5Var.f91425d.f291095c - c17.f291095c) > 1.0f) {
                java.lang.String str = e5Var.f91423b;
            } else {
                if (e5Var.f91426e == null) {
                    return;
                }
                e5Var.f91427f = false;
                e5Var.f91422a.removeCallbacks(e5Var.f91428g);
            }
        }
    }
}
