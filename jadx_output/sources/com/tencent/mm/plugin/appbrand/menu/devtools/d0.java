package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.e0 f85889d;

    public d0(com.tencent.mm.plugin.appbrand.menu.devtools.e0 e0Var) {
        this.f85889d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f85889d.f85893a, "start cpu profiling...", 1).show();
        com.tencent.mars.xlog.Log.i("MiroMsg.GameCpuProfile", "start cpu profiling...");
    }
}
