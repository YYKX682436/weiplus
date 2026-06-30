package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class a8 implements com.tencent.mm.plugin.appbrand.l9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f74895a;

    public a8(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f74895a = o6Var;
    }

    public void a(com.tencent.mm.plugin.appbrand.x9 x9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "WorkerContainer had installed. watchAdWorkerCreate");
        com.tencent.mm.plugin.appbrand.c cVar = this.f74895a.D2;
        cVar.getClass();
        synchronized (x9Var.f92387g) {
            em1.c cVar2 = x9Var.f92386f;
            if (cVar2.f255017b != null) {
                cVar.e(cVar2);
            }
            x9Var.f92387g.add(cVar);
        }
        this.f74895a.D2.f77023i = new com.tencent.mm.plugin.appbrand.z7(this);
    }
}
