package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.util.List list) {
        super(0);
        this.f75849d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l91.d dVar = (l91.d) com.tencent.mm.plugin.appbrand.app.r9.fj(l91.d.class);
        if (dVar != null) {
            java.util.List updatedList = this.f75849d;
            kotlin.jvm.internal.o.f(updatedList, "$updatedList");
            dVar.y0(updatedList);
        }
        return jz5.f0.f302826a;
    }
}
