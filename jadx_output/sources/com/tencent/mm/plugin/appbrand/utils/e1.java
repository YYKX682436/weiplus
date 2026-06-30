package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class e1 extends k75.k {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.d1 f90409g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.c1 f90410h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f90411i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Queue f90412m;

    public e1(java.lang.String str, android.os.Looper looper) {
        super(str, looper);
        com.tencent.mm.plugin.appbrand.utils.d1 d1Var = new com.tencent.mm.plugin.appbrand.utils.d1(this, null);
        this.f90409g = d1Var;
        com.tencent.mm.plugin.appbrand.utils.c1 c1Var = new com.tencent.mm.plugin.appbrand.utils.c1(this, null);
        this.f90410h = c1Var;
        this.f90412m = new java.util.LinkedList();
        this.f90411i = str;
        c(d1Var);
        c(c1Var);
        m(d1Var);
        n();
    }

    public static void q(com.tencent.mm.plugin.appbrand.utils.e1 e1Var) {
        java.lang.Object poll;
        synchronized (e1Var.f90412m) {
            poll = ((java.util.LinkedList) e1Var.f90412m).poll();
        }
        if (poll != null) {
            e1Var.o(e1Var.f90410h);
            com.tencent.mm.plugin.appbrand.jsapi.auth.j jVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.j) poll;
            jVar.toString();
            com.tencent.mm.plugin.appbrand.jsapi.auth.i iVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.i) jVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthJsApiQueue", "about to call AuthInvoke, api[%s]", iVar.f79581e.f304846d);
            boolean isRunning = iVar.f79577a.isRunning();
            com.tencent.mm.plugin.appbrand.jsapi.auth.l lVar = iVar.f79579c;
            com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var = iVar.f79578b;
            if (isRunning) {
                n0Var.C(iVar.f79580d, new com.tencent.mm.plugin.appbrand.jsapi.auth.a(lVar));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthJsApiQueue", "doAuth but component not running, api = %s", n0Var.k());
                lVar.l(2);
            }
        }
    }

    @Override // k75.k
    public void i() {
        synchronized (this.f90412m) {
            ((java.util.LinkedList) this.f90412m).clear();
        }
    }
}
