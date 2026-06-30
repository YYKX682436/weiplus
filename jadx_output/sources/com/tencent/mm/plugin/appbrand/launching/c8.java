package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f84545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f84547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.d8 f84549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.p6 f84550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, r45.y50 y50Var, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.d8 d8Var, com.tencent.mm.plugin.appbrand.launching.p6 p6Var) {
        super(0);
        this.f84545d = o6Var;
        this.f84546e = qualitySession;
        this.f84547f = y50Var;
        this.f84548g = str;
        this.f84549h = d8Var;
        this.f84550i = p6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f84546e;
        weAppPluginAutoUpdateStruct.f62336d = weAppPluginAutoUpdateStruct.b("AppId", qualitySession.f88135e, true);
        weAppPluginAutoUpdateStruct.f62337e = qualitySession.f88139i;
        int i17 = qualitySession.f88136f;
        weAppPluginAutoUpdateStruct.f62338f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.j.demo : cm.j.debug : cm.j.release;
        weAppPluginAutoUpdateStruct.f62339g = qualitySession.f88137g;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = this.f84545d;
        weAppPluginAutoUpdateStruct.f62340h = weAppPluginAutoUpdateStruct.b("PluginAppid", o6Var.f84851d, true);
        weAppPluginAutoUpdateStruct.f62341i = cm.k.release;
        weAppPluginAutoUpdateStruct.f62342j = weAppPluginAutoUpdateStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
        weAppPluginAutoUpdateStruct.f62343k = weAppPluginAutoUpdateStruct.b("InstanceId", this.f84548g, true);
        weAppPluginAutoUpdateStruct.f62344l = qualitySession.f88138h;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        java.lang.String str = o6Var.f84851d;
        java.lang.String str2 = o6Var.f84852e;
        int i18 = o6Var.f84853f;
        int i19 = o6Var.f84854g;
        com.tencent.mm.plugin.appbrand.launching.u6 u6Var = (com.tencent.mm.plugin.appbrand.launching.u6) o6Var.f84855h;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var2 = new com.tencent.mm.plugin.appbrand.launching.o6(str, str2, i18, i19, new com.tencent.mm.plugin.appbrand.launching.u6(u6Var.f85223a, true, u6Var.f85225c), false);
        java.lang.String str3 = this.f84548g;
        com.tencent.mm.plugin.appbrand.launching.z7 z7Var = new com.tencent.mm.plugin.appbrand.launching.z7(str3, atomicInteger, atomicReference);
        java.lang.String str4 = qualitySession.f88134d;
        com.tencent.mm.plugin.appbrand.launching.d8 d8Var = this.f84549h;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var3 = this.f84545d;
        com.tencent.mm.plugin.appbrand.launching.j6.a(j6Var, o6Var2, new com.tencent.mm.plugin.appbrand.launching.a8(d8Var, o6Var3, this.f84550i, weAppPluginAutoUpdateStruct), new com.tencent.mm.plugin.appbrand.launching.b8(d8Var, o6Var3, str3, atomicInteger, atomicReference, weAppPluginAutoUpdateStruct), null, null, this.f84547f, null, z7Var, null, str4, 344, null);
        return jz5.f0.f302826a;
    }
}
