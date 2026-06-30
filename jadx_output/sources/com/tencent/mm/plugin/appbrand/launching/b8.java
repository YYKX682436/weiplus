package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.d8 f84521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f84522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f84524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct f84526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(com.tencent.mm.plugin.appbrand.launching.d8 d8Var, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference atomicReference, com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(2);
        this.f84521d = d8Var;
        this.f84522e = o6Var;
        this.f84523f = str;
        this.f84524g = atomicInteger;
        this.f84525h = atomicReference;
        this.f84526i = weAppPluginAutoUpdateStruct;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 err = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        kotlin.jvm.internal.o.g(err, "err");
        this.f84521d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update plugin(");
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = this.f84522e;
        sb6.append(o6Var.f84851d);
        sb6.append(") to latest failed, ERROR(");
        sb6.append(err);
        sb6.append(") errMsg(");
        sb6.append((java.lang.String) obj2);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", sb6.toString());
        com.tencent.mm.plugin.appbrand.launching.h0 h0Var = com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage.f84357n;
        java.lang.String instanceId = this.f84523f;
        kotlin.jvm.internal.o.f(instanceId, "$instanceId");
        h0Var.a(instanceId, ne1.j.UPDATE_FAILED, o6Var.f84851d, this.f84524g.get(), (java.lang.String) this.f84525h.get());
        com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f84526i;
        weAppPluginAutoUpdateStruct.f62345m = 2L;
        weAppPluginAutoUpdateStruct.k();
        return jz5.f0.f302826a;
    }
}
