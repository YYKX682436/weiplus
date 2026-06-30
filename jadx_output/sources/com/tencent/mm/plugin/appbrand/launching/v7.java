package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.y7 f85265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct f85267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.tencent.mm.plugin.appbrand.launching.y7 y7Var, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(2);
        this.f85265d = y7Var;
        this.f85266e = o6Var;
        this.f85267f = weAppPluginAutoUpdateStruct;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 err = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        kotlin.jvm.internal.o.g(err, "err");
        this.f85265d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "update plugin(" + this.f85266e.f84851d + ") to latest failed, ERROR(" + err + ") errMsg(" + ((java.lang.String) obj2) + ')');
        com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f85267f;
        weAppPluginAutoUpdateStruct.f62345m = 2L;
        weAppPluginAutoUpdateStruct.k();
        return jz5.f0.f302826a;
    }
}
