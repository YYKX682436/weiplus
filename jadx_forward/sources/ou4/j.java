package ou4;

/* loaded from: classes8.dex */
public final class j implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f430516d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f430517e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f430518f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f430519g;

    public j(java.lang.String containerId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerId, "containerId");
        this.f430516d = containerId;
        this.f430518f = new java.util.concurrent.ConcurrentHashMap();
        this.f430519g = new java.util.ArrayList();
    }

    public final void a() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f430518f;
        java.util.Collection values = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((ou4.c0) it.next()).getClass();
        }
        concurrentHashMap.clear();
        ((java.util.ArrayList) this.f430519g).clear();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f430517e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        this.f430517e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "flutter_container_bridge_" + this.f430516d);
        this.f430517e = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        java.util.List list = this.f430519g;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.ArrayList) list).clear();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f430517e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        this.f430517e = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "callApi")) {
            result.mo65719xbc9fa82f();
            return;
        }
        java.lang.String str = (java.lang.String) call.m138433xa13f5ebd("apiName");
        java.util.Map map = (java.util.Map) call.m138433xa13f5ebd(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (str == null || str.length() == 0) {
            result.mo65718x5c4d208("INVALID_ARGS", "apiName is required", null);
            return;
        }
        ou4.c0 c0Var = (ou4.c0) this.f430518f.get(str);
        if (c0Var == null) {
            result.mo65718x5c4d208("NOT_FOUND", "No handler for apiName: " + str, null);
            return;
        }
        try {
            c0Var.a(map, new ou4.i(result));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterApiBridge", "handleCallApi: handler error, apiName=" + str, e17);
            result.mo65718x5c4d208("HANDLER_ERROR", e17.getMessage(), null);
        }
    }
}
