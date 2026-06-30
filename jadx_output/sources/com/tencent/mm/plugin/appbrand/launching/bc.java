package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class bc implements k91.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.vb f84529a;

    public bc(com.tencent.mm.plugin.appbrand.launching.vb vbVar, com.tencent.mm.plugin.appbrand.launching.yb ybVar) {
        this.f84529a = vbVar;
    }

    @Override // k91.g5
    public void a() {
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer;
        com.tencent.mm.plugin.appbrand.launching.vb vbVar = this.f84529a;
        k91.g5 g5Var = vbVar.G;
        if (g5Var != null) {
            g5Var.a();
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(vbVar.f85288q)) {
            com.tencent.mm.plugin.appbrand.appcache.x5.b();
            com.tencent.mars.xlog.Log.i(vbVar.f85282h, "beforeSync: sync contact[username(%s) appId(%s)], process preload cgi, is open = [%b]", vbVar.f85283i, vbVar.f85284m, java.lang.Boolean.TRUE);
            af.d dVar = af.d.f4444a;
            ug1.c cVar = new ug1.c();
            java.lang.String id6 = vbVar.D;
            kotlin.jvm.internal.o.g(id6, "id");
            if (((af.c) af.d.f4445b.put(id6, cVar)) != null) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandParallelTasksManager", "add duplicate collection id = [%s]", id6);
            }
            af.c b17 = dVar.b(vbVar.D, true);
            java.util.Objects.requireNonNull(b17);
            java.lang.String str = vbVar.f85283i;
            int i17 = vbVar.f85288q;
            int i18 = vbVar.f85290s;
            b17.a(new ug1.h(str, i17, i18, vbVar.f85291t, vbVar.f85292u, vbVar.f85293v, vbVar.f85284m, (i18 != 1162 || (appBrandLaunchFromNotifyReferrer = vbVar.H) == null) ? null : appBrandLaunchFromNotifyReferrer.f77317g, vbVar.I, vbVar.f85294w, vbVar.D, vbVar.f85281J));
            b17.a(new ug1.g(vbVar.f85291t, vbVar.f85283i, vbVar.f85284m, vbVar.D));
            ug1.b.a(0);
            com.tencent.mm.plugin.appbrand.keylogger.w.g(vbVar.f85284m, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_CGI);
        }
    }
}
