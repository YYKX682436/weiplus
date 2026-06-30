package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.g0 f76170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var) {
        super(2);
        this.f76170d = g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        java.lang.String value = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        this.f76170d.f76184e.putString(key, value);
        return jz5.f0.f302826a;
    }
}
