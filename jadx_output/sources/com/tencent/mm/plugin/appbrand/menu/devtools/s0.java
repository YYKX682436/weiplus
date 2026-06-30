package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.t0 f85923d;

    public s0(com.tencent.mm.plugin.appbrand.menu.devtools.t0 t0Var) {
        this.f85923d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.Toast.makeText(this.f85923d.f85928a, "start v8 tracing...", 1).show();
        com.tencent.mars.xlog.Log.i("MiroMsg.V8Tracing", "start v8 tracing...");
    }
}
