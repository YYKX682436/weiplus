package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.d0 f77719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.appbrand.debugger.console.d0 d0Var) {
        super(0);
        this.f77719d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.debugger.console.d0 d0Var = this.f77719d;
        return new com.tencent.mm.plugin.appbrand.debugger.console.v(context, d0Var.f77654a, d0Var.f77655b);
    }
}
