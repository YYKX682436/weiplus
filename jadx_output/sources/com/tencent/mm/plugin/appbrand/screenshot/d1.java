package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.e1 f88472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88473e;

    public d1(com.tencent.mm.plugin.appbrand.screenshot.e1 e1Var, java.lang.String str) {
        this.f88472d = e1Var;
        this.f88473e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f88472d.f88481d;
        java.lang.String str = this.f88473e;
        if (((java.lang.Long) concurrentHashMap.remove(str)) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PosterGeneratorRegistry", "poster generation timeout, posterTaskId=" + str);
        }
    }
}
