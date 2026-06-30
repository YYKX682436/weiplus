package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class v8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w8 f90279d;

    public v8(com.tencent.mm.plugin.appbrand.ui.w8 w8Var) {
        this.f90279d = w8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            android.util.Log.getStackTraceString(new java.lang.Throwable());
        }
        this.f90279d.f90311e = false;
    }
}
