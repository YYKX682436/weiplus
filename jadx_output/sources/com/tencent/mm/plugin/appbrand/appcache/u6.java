package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes12.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f75989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.v6 f75990e;

    public u6(com.tencent.mm.plugin.appbrand.appcache.v6 v6Var, yz5.a aVar) {
        this.f75990e = v6Var;
        this.f75989d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread onExecute finish");
        com.tencent.mm.plugin.appbrand.appcache.v6 v6Var = this.f75990e;
        sb6.append(v6Var.f76006a);
        com.tencent.mars.xlog.Log.i("AsyncTaskQueue", sb6.toString());
        this.f75989d.invoke();
        v6Var.f76008c.f76025h.countDown();
    }
}
