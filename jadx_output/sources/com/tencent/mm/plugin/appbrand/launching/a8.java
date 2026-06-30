package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.d8 f84498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f84499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.p6 f84500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct f84501g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.appbrand.launching.d8 d8Var, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.p6 p6Var, com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(1);
        this.f84498d = d8Var;
        this.f84499e = o6Var;
        this.f84500f = p6Var;
        this.f84501g = weAppPluginAutoUpdateStruct;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.p6 it = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f84498d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update plugin(");
        sb6.append(this.f84499e.f84851d);
        sb6.append(") to latest succeed, version=");
        com.tencent.mm.plugin.appbrand.launching.p6 p6Var = this.f84500f;
        sb6.append(p6Var.f84892a.pkgVersion());
        sb6.append(", source=");
        sb6.append(p6Var.f84893b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f84501g;
        weAppPluginAutoUpdateStruct.f62345m = 1L;
        weAppPluginAutoUpdateStruct.k();
        return jz5.f0.f302826a;
    }
}
