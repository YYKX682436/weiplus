package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f84808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.tencent.mm.plugin.appbrand.launching.o6 o6Var) {
        super(0);
        this.f84808d = o6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = this.f84808d;
        sb6.append(o6Var.h().toString());
        sb6.append("|ver:");
        sb6.append(o6Var.f84855h);
        return sb6.toString();
    }
}
