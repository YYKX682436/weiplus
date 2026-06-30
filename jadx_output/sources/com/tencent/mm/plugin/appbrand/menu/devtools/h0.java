package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.i0 f85904d;

    public h0(com.tencent.mm.plugin.appbrand.menu.devtools.i0 i0Var) {
        this.f85904d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.menu.devtools.i0 i0Var = this.f85904d;
        dp.a.makeText(i0Var.f85905a, i0Var.f85906b + " exported.", 1).show();
        com.tencent.mars.xlog.Log.i("MiroMsg.GameHeapProfile", "v8DumpSnapshot to :%s", i0Var.f85906b);
    }
}
