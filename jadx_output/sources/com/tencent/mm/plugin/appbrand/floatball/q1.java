package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.t1 f78136d;

    public q1(com.tencent.mm.plugin.appbrand.floatball.t1 t1Var) {
        this.f78136d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.floatball.t1 t1Var = this.f78136d;
        int t07 = t1Var.t0();
        android.os.Handler handler = t1Var.f78145x;
        if (handler != null) {
            handler.post(new com.tencent.mm.plugin.appbrand.floatball.p1(this, t07));
        }
    }
}
