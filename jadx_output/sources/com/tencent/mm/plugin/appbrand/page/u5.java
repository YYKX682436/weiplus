package com.tencent.mm.plugin.appbrand.page;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/u5;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class u5 implements com.tencent.mm.plugin.appbrand.jsapi.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f87138d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.y3 f87139e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f87140f;

    public u5(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.appcache.y3 wxaPkgFileProvider) {
        kotlin.jvm.internal.o.g(wxaPkgFileProvider, "wxaPkgFileProvider");
        this.f87138d = iCommLibReader;
        this.f87139e = wxaPkgFileProvider;
        this.f87140f = jz5.h.b(new com.tencent.mm.plugin.appbrand.page.t5(this));
    }

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) this.f87140f).getValue()).booleanValue();
    }
}
