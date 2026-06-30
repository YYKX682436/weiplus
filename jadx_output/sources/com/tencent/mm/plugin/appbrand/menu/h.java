package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.jsapi.s1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f85953a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f85954b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.n7 f85955c;

    public h(com.tencent.mm.plugin.appbrand.menu.g gVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.s1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_CopyShortLink", "onReturnUrl %s", str);
        com.tencent.mm.plugin.appbrand.report.v0.e(this.f85953a, this.f85954b, 47, "", com.tencent.mm.sdk.platformtools.t8.i1(), str.isEmpty() ? 2 : 1, 0);
        com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.c(com.tencent.mm.plugin.appbrand.jsapi.d1.f80731d, this);
        if (str.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.n7 pageView = this.f85955c;
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new kj1.k0(pageView, str, null), 2, null);
    }
}
