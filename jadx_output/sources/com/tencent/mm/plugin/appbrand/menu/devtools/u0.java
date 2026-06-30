package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.v0 f85932e;

    public u0(com.tencent.mm.plugin.appbrand.menu.devtools.v0 v0Var, java.lang.String str) {
        this.f85932e = v0Var;
        this.f85931d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f85932e.f85939a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop v8 tracing: ");
        java.lang.String str = this.f85931d;
        sb6.append(str);
        android.widget.Toast.makeText(context, sb6.toString(), 1).show();
        com.tencent.mars.xlog.Log.i("MiroMsg.V8Tracing", "stop v8 tracing: " + str);
    }
}
