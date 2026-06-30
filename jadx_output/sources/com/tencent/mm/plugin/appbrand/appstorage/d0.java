package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.g0 f76157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var) {
        super(1);
        this.f76157d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String key = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String string = this.f76157d.f76184e.getString(key, "");
        return string == null ? "" : string;
    }
}
