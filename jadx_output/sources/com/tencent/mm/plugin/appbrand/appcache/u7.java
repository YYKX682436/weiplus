package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f75991d;

    public u7(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        this.f75991d = iCommLibReader;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f312615d).b(this, "MicroMsg.AppBrand.WxaCommLibPreloadNotify");
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f75991d;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = com.tencent.mm.plugin.appbrand.appcache.e8.f75515a;
        synchronized (com.tencent.mm.plugin.appbrand.appcache.e8.class) {
            if (com.tencent.mm.plugin.appbrand.appcache.e8.f75515a == null || iCommLibReader.compareTo(com.tencent.mm.plugin.appbrand.appcache.e8.f75515a) != 0) {
                com.tencent.mm.plugin.appbrand.appcache.e8.f75515a = iCommLibReader;
                z17 = true;
            } else {
                z17 = false;
            }
        }
        int c17 = com.tencent.mm.plugin.appbrand.l.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke() waitForPreloaded entered, process[%s], pkgInfo[%s], globalReaderUpdated[%b], runningRuntimeCount[%d]", bm5.f1.a(), this.f75991d, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(c17));
        if (!z17 || c17 > 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.P;
        com.tencent.mm.plugin.appbrand.task.b0 b0Var = com.tencent.mm.plugin.appbrand.task.r.f89160a;
        synchronized (com.tencent.mm.plugin.appbrand.task.r.class) {
            for (com.tencent.mm.plugin.appbrand.task.x0 x0Var : com.tencent.mm.plugin.appbrand.task.r.e()) {
                if (com.tencent.mm.plugin.appbrand.task.r.m(x0Var)) {
                    java.util.Queue queue = (java.util.Queue) com.tencent.mm.plugin.appbrand.task.r.f89163d.get(x0Var);
                    if (queue != null) {
                        java.util.Iterator it = queue.iterator();
                        while (it.hasNext()) {
                            ((com.tencent.mm.plugin.appbrand.e9) it.next()).h();
                        }
                    }
                    java.util.Queue queue2 = (java.util.Queue) com.tencent.mm.plugin.appbrand.task.r.f89162c.get(x0Var);
                    if (queue2 != null) {
                        java.util.Iterator it6 = queue2.iterator();
                        while (it6.hasNext()) {
                            ((com.tencent.mm.plugin.appbrand.page.n7) it6.next()).h();
                        }
                    }
                    com.tencent.mm.plugin.appbrand.task.r.j(x0Var, null, true, null, x6Var, 2);
                }
            }
        }
    }
}
