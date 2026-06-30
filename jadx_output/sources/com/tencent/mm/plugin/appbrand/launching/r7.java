package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f85105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(java.util.HashMap hashMap) {
        super(0);
        this.f85105d = hashMap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Set<com.tencent.mm.plugin.appbrand.launching.z6> keySet = this.f85105d.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        for (com.tencent.mm.plugin.appbrand.launching.z6 z6Var : keySet) {
            com.tencent.mm.plugin.appbrand.launching.x5 x5Var = com.tencent.mm.plugin.appbrand.launching.x5.f85410a;
            kotlin.jvm.internal.o.d(z6Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "removePreGetDownloadUrlResult " + z6Var);
            com.tencent.mm.plugin.appbrand.launching.x5.f85411b.remove(z6Var);
        }
        return jz5.f0.f302826a;
    }
}
