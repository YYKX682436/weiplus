package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.page.v f87153a = new com.tencent.mm.plugin.appbrand.page.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f87154b = new java.util.concurrent.ConcurrentHashMap();

    public final com.tencent.mm.plugin.appbrand.page.t a(com.tencent.mm.plugin.appbrand.task.x0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.page.t tVar = (com.tencent.mm.plugin.appbrand.page.t) f87154b.get(type);
        if (tVar != null) {
            return tVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDecorWidgetPreLoader", "obtainInstance: no preloaded, create it [%s]", type.name());
        return new com.tencent.mm.plugin.appbrand.page.t();
    }

    public final void b(com.tencent.mm.plugin.appbrand.task.x0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDecorWidgetPreLoader", "warmUpAndTryPreload type=" + type);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f87154b;
        if (concurrentHashMap.get(type) == null) {
            com.tencent.mm.plugin.appbrand.page.t tVar = new com.tencent.mm.plugin.appbrand.page.t();
            tVar.d(al1.b.class);
            tVar.d(al1.l.class);
            if (type.ordinal() == 0) {
                tVar.d(zl1.t.class);
                tVar.d(com.tencent.mm.plugin.appbrand.ui.c9.class);
                for (int i17 = 0; i17 < 5; i17++) {
                    tVar.d(com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem.class);
                }
            }
            concurrentHashMap.put(type, tVar);
        }
    }
}
