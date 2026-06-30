package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.h f87840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.i f87841f;

    public f(com.tencent.mm.plugin.appbrand.report.i iVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.report.h hVar) {
        this.f87841f = iVar;
        this.f87839d = appBrandRuntime;
        this.f87840e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f87839d;
        if (appBrandRuntime == null || appBrandRuntime.C0() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandGameExtraConfigMgr", "hy: runtime is null!");
            com.tencent.mm.plugin.appbrand.report.h hVar = this.f87840e;
            if (hVar != null) {
                ((fa1.f) hVar).a(false, null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f87839d;
        int i17 = appBrandRuntime2 instanceof ze.n ? ((ze.n) appBrandRuntime2).u0().f47284z : 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: trigger wxa game config update, appServiceType:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.report.i iVar = this.f87841f;
        iVar.f87863c = null;
        iVar.f87864d = null;
        iVar.f87865e = null;
        iVar.f87866f = null;
        iVar.f87867g = null;
        iVar.f87869i = null;
        if (i17 == 19) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f87839d;
        iVar.getClass();
        vd.c cVar = new vd.c();
        if (appBrandRuntime3.C0().x() != null && appBrandRuntime3.C0().x().getF90658d() != null) {
            com.tencent.mm.plugin.appbrand.appcache.IPkgInfo f90658d = appBrandRuntime3.C0().x().getF90658d();
            r45.pd7 pd7Var = new r45.pd7();
            iVar.f87861a = pd7Var;
            pd7Var.f382971d = f90658d.pkgVersion();
            iVar.f87861a.f382972e = f90658d.lastModified();
            iVar.f87861a.f382973f = 0;
        }
        if (appBrandRuntime3.E0() != null && appBrandRuntime3.E0().f305852r != null) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = appBrandRuntime3.E0().f305852r;
            r45.od7 od7Var = new r45.od7();
            iVar.f87862b = od7Var;
            od7Var.f382177d = wxaPkgWrappingInfo.f75399d;
            od7Var.f382178e = wxaPkgWrappingInfo.pkgVersion;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = ((ze.n) appBrandRuntime3).l2();
            if (l27 != null) {
                r45.od7 od7Var2 = iVar.f87862b;
                od7Var2.f382179f = l27.f87790f;
                od7Var2.f382181h = l27.f87788d;
                od7Var2.f382180g = 0;
            }
        }
        int streamVolume = ((android.media.AudioManager) appBrandRuntime3.f74795d.getSystemService("audio")).getStreamVolume(3);
        r45.qd7 qd7Var = new r45.qd7();
        qd7Var.f383875d = streamVolume == 0;
        r45.ws3 ws3Var = cVar.f435361a;
        ws3Var.f389412d = appBrandRuntime3.f74803n;
        ws3Var.f389414f = iVar.f87861a;
        ws3Var.f389413e = iVar.f87862b;
        ws3Var.f389415g = qd7Var;
        com.tencent.mm.plugin.appbrand.report.e eVar = new com.tencent.mm.plugin.appbrand.report.e(this, cVar);
        nd.b a17 = nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class);
        kotlin.jvm.internal.o.d(a17);
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) a17).e1("/cgi-bin/mmgame-bin/getwxagameconfig", null, cVar.f435361a, r45.xs3.class).a(new vd.a(cVar, eVar))).s(new vd.b(eVar));
    }
}
