package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j9 implements com.tencent.mm.plugin.appbrand.page.eb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.l2 f86795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.k9 f86796b;

    public j9(com.tencent.mm.plugin.appbrand.page.k9 k9Var, com.tencent.xweb.l2 l2Var) {
        this.f86796b = k9Var;
        this.f86795a = l2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.eb
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "getImageFromDiskCache release, url = %s", this.f86796b.f86836b);
        this.f86795a.d();
    }
}
