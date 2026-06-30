package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class n8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75196a;

    public n8(com.tencent.mm.plugin.appbrand.app.l8 l8Var, java.lang.String str) {
        this.f75196a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        if (!gm0.j1.b().m()) {
            km5.u.b().a(new c01.c());
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent appBrandOpReportLogic$AppBrandOnOpReportStartEvent = new com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent();
        java.lang.String str = this.f75196a;
        appBrandOpReportLogic$AppBrandOnOpReportStartEvent.f82473d = str;
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str, appBrandOpReportLogic$AppBrandOnOpReportStartEvent);
        gm0.j1.n().f273288b.a(1345, new com.tencent.mm.plugin.appbrand.app.m8(this, km5.u.c()));
        return null;
    }
}
