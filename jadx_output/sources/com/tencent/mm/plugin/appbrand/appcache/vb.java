package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo f76013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        super(0);
        this.f76013d = wxaPluginPkgInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.appbrand.appcache.y8(this.f76013d.pkgPath);
    }
}
