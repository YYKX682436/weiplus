package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.utils.c implements com.tencent.mm.plugin.appbrand.jsapi.auth.h {

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f79535g;

    static {
        new com.tencent.mm.plugin.appbrand.jsapi.auth.c(null);
        f79535g = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.auth.b.f79412d);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.h
    public void b(com.tencent.mm.plugin.appbrand.jsapi.auth.n0 api, com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name[");
        sb6.append(api.k());
        sb6.append("], callbackId[");
        sb6.append(invokeContext.f81016e);
        sb6.append("], appId[");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = invokeContext.f81013b;
        sb6.append(lVar.getAppId());
        sb6.append("] component[");
        sb6.append(lVar.getComponentId());
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        int size = this.f90394e.size();
        int i17 = this.f90395f.get();
        org.json.JSONObject jSONObject = invokeContext.f81014c;
        long optLong = jSONObject.optLong("timeout", -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dispatch " + sb7 + ", queueLength:" + size + ", inFlightTasksCount:" + i17 + ", timeout:" + optLong);
        jSONObject.put("queueLength", size);
        a(new com.tencent.mm.plugin.appbrand.jsapi.auth.d(api, invokeContext, sb7, new com.tencent.mm.plugin.appbrand.jsapi.auth.n(api, invokeContext, optLong)));
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public boolean c(com.tencent.mm.plugin.appbrand.utils.a aVar) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.jsapi.auth.d task = (com.tencent.mm.plugin.appbrand.jsapi.auth.d) aVar;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar = task.f79431g;
        synchronized (nVar) {
            z17 = nVar.f79645h;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public void e(com.tencent.mm.plugin.appbrand.utils.a aVar, yz5.a onEnd) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.d task = (com.tencent.mm.plugin.appbrand.jsapi.auth.d) aVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var = task.f79428d;
        com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = task.f79429e;
        java.lang.String str = task.f79430f;
        com.tencent.mm.plugin.appbrand.jsapi.auth.n nVar = task.f79431g;
        com.tencent.mm.plugin.appbrand.jsapi.auth.a aVar2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.e(str, onEnd));
        synchronized (nVar) {
            nVar.f79644g = aVar2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "runTask " + str);
        if (ffVar.f81013b.isRunning()) {
            n0Var.C(ffVar, task.f79431g);
        } else {
            onEnd.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.h
    public void h() {
        this.f90394e.clear();
    }
}
