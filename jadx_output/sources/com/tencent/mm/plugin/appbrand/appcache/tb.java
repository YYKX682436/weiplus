package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class tb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f75981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        super(0);
        this.f75981d = modulePkgInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.appbrand.appcache.y8(this.f75981d.pkgPath);
    }
}
