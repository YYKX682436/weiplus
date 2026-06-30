package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class x6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.w6 f92377d;

    public x6(com.tencent.mm.plugin.appbrand.w6 w6Var) {
        this.f92377d = w6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        com.tencent.mm.plugin.appbrand.w6 w6Var = this.f92377d;
        if (mainLooper == myLooper && !android.os.Looper.myQueue().isIdle()) {
            w6Var.f90950d.o(this);
        } else {
            w6Var.f90950d.K0(true);
            w6Var.d();
        }
    }
}
