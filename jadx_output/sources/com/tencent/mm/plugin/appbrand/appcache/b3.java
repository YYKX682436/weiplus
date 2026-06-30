package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(java.util.List list) {
        super(1);
        this.f75452d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.a3 it = (com.tencent.mm.plugin.appbrand.appcache.a3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f75452d.contains(it.f75413a));
    }
}
