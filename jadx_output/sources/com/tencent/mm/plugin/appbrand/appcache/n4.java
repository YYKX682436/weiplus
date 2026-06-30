package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.o4 f75683d;

    public n4(com.tencent.mm.plugin.appbrand.appcache.o4 o4Var) {
        this.f75683d = o4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.o4 o4Var = this.f75683d;
        int incrementAndGet = o4Var.f75699d.incrementAndGet();
        o4Var.getClass();
        if (incrementAndGet == 3) {
            com.tencent.mm.plugin.appbrand.appcache.r4.q(o4Var.f75700e.f75718d, "公共库增量并发执行完成，重启确认");
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.r4 r4Var = o4Var.f75700e.f75718d;
        o4Var.getClass();
        com.tencent.mm.plugin.appbrand.appcache.r4.q(r4Var, "公共库增量" + incrementAndGet + "/3");
    }
}
