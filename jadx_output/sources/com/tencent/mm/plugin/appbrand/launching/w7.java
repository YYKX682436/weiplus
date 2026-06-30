package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f85328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f85329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.y7 f85330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.p6 f85331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.plugin.appbrand.launching.o6 o6Var, r45.y50 y50Var, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.launching.y7 y7Var, com.tencent.mm.plugin.appbrand.launching.p6 p6Var) {
        super(0);
        this.f85327d = o6Var;
        this.f85328e = y50Var;
        this.f85329f = qualitySession;
        this.f85330g = y7Var;
        this.f85331h = p6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f85329f;
        weAppPluginAutoUpdateStruct.f62336d = weAppPluginAutoUpdateStruct.b("AppId", qualitySession.f88135e, true);
        weAppPluginAutoUpdateStruct.f62337e = qualitySession.f88139i;
        int i17 = qualitySession.f88136f;
        weAppPluginAutoUpdateStruct.f62338f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.j.demo : cm.j.debug : cm.j.release;
        weAppPluginAutoUpdateStruct.f62339g = qualitySession.f88137g;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = this.f85327d;
        weAppPluginAutoUpdateStruct.f62340h = weAppPluginAutoUpdateStruct.b("PluginAppid", o6Var.f84851d, true);
        weAppPluginAutoUpdateStruct.f62341i = cm.k.release;
        weAppPluginAutoUpdateStruct.f62342j = weAppPluginAutoUpdateStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
        weAppPluginAutoUpdateStruct.f62343k = weAppPluginAutoUpdateStruct.b("InstanceId", qualitySession.f88134d, true);
        weAppPluginAutoUpdateStruct.f62344l = qualitySession.f88138h;
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        java.lang.String str = o6Var.f84851d;
        java.lang.String str2 = o6Var.f84852e;
        int i18 = o6Var.f84853f;
        int i19 = o6Var.f84854g;
        com.tencent.mm.plugin.appbrand.launching.u6 u6Var = (com.tencent.mm.plugin.appbrand.launching.u6) o6Var.f84855h;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var2 = new com.tencent.mm.plugin.appbrand.launching.o6(str, str2, i18, i19, new com.tencent.mm.plugin.appbrand.launching.u6(u6Var.f85223a, true, u6Var.f85225c), false);
        com.tencent.mm.plugin.appbrand.launching.p6 p6Var = this.f85331h;
        com.tencent.mm.plugin.appbrand.launching.y7 y7Var = this.f85330g;
        com.tencent.mm.plugin.appbrand.launching.j6.a(j6Var, o6Var2, new com.tencent.mm.plugin.appbrand.launching.u7(y7Var, o6Var, p6Var, weAppPluginAutoUpdateStruct), new com.tencent.mm.plugin.appbrand.launching.v7(y7Var, o6Var, weAppPluginAutoUpdateStruct), null, null, this.f85328e, null, null, null, qualitySession.f88134d, com.tencent.mm.plugin.appbrand.jsapi.sensor.u.CTRL_INDEX, null);
        return jz5.f0.f302826a;
    }
}
