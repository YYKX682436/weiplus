package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j7 f88686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.w f88687e;

    public i7(com.tencent.mm.plugin.appbrand.service.j7 j7Var, com.tencent.mm.plugin.appbrand.jsruntime.w wVar) {
        this.f88686d = j7Var;
        this.f88687e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.service.j7 j7Var = this.f88686d;
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni g17 = j7Var.g();
        kotlin.jvm.internal.o.d(g17);
        g17.startInspectorOnJS(j7Var.f88701b);
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = this.f88687e;
        if (wVar != null) {
            final cl.a aVar = (cl.a) ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).c0();
            aVar.f42569b.n(new java.lang.Runnable() { // from class: cl.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    cl.a aVar2 = cl.a.this;
                    aVar2.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "blockJsThread");
                    synchronized (aVar2.f42590w) {
                        aVar2.f42590w[0] = true;
                        while (true) {
                            boolean[] zArr = aVar2.f42590w;
                            if (zArr[0]) {
                                try {
                                    zArr.wait();
                                } catch (java.lang.InterruptedException e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbstractJSRuntime", e17, "blockJsThread, interrupted", new java.lang.Object[0]);
                                }
                            }
                        }
                    }
                }
            }, true);
        }
    }
}
