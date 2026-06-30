package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes7.dex */
public class g implements ph1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.game.preload.i f78207b;

    public g(com.tencent.mm.plugin.appbrand.game.preload.i iVar, java.lang.String str) {
        this.f78207b = iVar;
        this.f78206a = str;
    }

    @Override // ph1.p
    public void a(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "hy: on load module progress %s", wxaPkgLoadProgress);
    }

    @Override // ph1.p
    public void b(boolean z17, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "onLoad, module:%s, succeed:%b", this.f78206a, java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f78207b.f78221k.addAndGet(1);
        }
    }
}
