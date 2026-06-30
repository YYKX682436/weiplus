package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class z8 extends com.tencent.mm.pluginsdk.res.downloader.model.b0 {
    public z8() {
        super("WxaPkgDownload", new com.tencent.mm.plugin.appbrand.appcache.c9());
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.b0
    public int g(com.tencent.mm.pluginsdk.res.downloader.model.u uVar) {
        int g17 = super.g(uVar);
        if (g17 != 1) {
            return g17;
        }
        f(uVar);
        return 2;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.b0, com.tencent.mm.pluginsdk.res.downloader.model.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.pluginsdk.res.downloader.model.m e(com.tencent.mm.pluginsdk.res.downloader.model.u uVar) {
        com.tencent.mm.plugin.appbrand.appcache.a9 a9Var = new com.tencent.mm.plugin.appbrand.appcache.a9((m81.b) uVar);
        a9Var.f189736g = this.f189666d;
        return a9Var;
    }
}
