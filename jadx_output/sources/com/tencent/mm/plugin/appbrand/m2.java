package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class m2 extends java.util.concurrent.ConcurrentLinkedDeque {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f85695d;

    public m2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f85695d = appBrandRuntime;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var = (com.tencent.mm.plugin.appbrand.jsapi.g0) obj;
        boolean add = super.add(g0Var);
        if (g0Var instanceof k91.z0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "mConfigs.add(AppBrandSysConfig[%s]) appId[%s], ret[%b]", g0Var.getClass().getName(), this.f85695d.f74803n, java.lang.Boolean.valueOf(add));
            com.tencent.mm.plugin.appbrand.appcache.la.o(this.f85695d, true);
        }
        return add;
    }
}
