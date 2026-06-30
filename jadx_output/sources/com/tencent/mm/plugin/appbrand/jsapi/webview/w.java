package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f83896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f83897e;

    public w(com.tencent.mm.plugin.appbrand.jsapi.webview.u uVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var, boolean z17) {
        this.f83896d = n7Var;
        this.f83897e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f83896d;
        if (n7Var instanceof pa1.o) {
            return;
        }
        if (this.f83897e) {
            k91.f M1 = n7Var.M1();
            java.util.Objects.requireNonNull(M1);
            xi1.o[] oVarArr = xi1.o.f454710n;
            java.lang.String str = M1.f305724m;
            if (u46.a.b(oVarArr, xi1.o.d(str))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiInsertHTMLWebView", "inflateView enableCustomNavigationForLandscape works for appId:%s, url%s, config:%s", n7Var.getAppId(), n7Var.X1(), str);
                return;
            }
        }
        ni1.h hVar = (ni1.h) n7Var.B1(ni1.h.class);
        if (hVar != null) {
            hVar.f(true);
            hVar.c(false);
        } else if (n7Var.a0()) {
            iz5.a.h("AppBrandPageViewPullDownExtension is null");
            throw null;
        }
        n7Var.k3();
        al1.b r17 = n7Var.r1();
        r17.E.add(new com.tencent.mm.plugin.appbrand.jsapi.webview.v(this));
        r17.g(com.tencent.mm.plugin.appbrand.utils.d.f90400e.isEnable(), r17.getMainTitle());
    }
}
