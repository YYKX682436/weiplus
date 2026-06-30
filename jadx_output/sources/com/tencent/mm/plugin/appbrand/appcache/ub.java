package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo f76002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        super(1);
        this.f76002d = wxaPluginPkgInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.x3 it = (com.tencent.mm.plugin.appbrand.appcache.x3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = this.f76002d;
        it.f76040a = wxaPluginPkgInfo.provider;
        it.f76041b = wxaPluginPkgInfo.pkgVersion();
        it.f76042c = wxaPluginPkgInfo.checksumMd5();
        return jz5.f0.f302826a;
    }
}
