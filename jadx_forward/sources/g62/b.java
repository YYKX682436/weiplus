package g62;

@j95.b
/* loaded from: classes11.dex */
public class b extends i95.w implements e42.a0, android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f350607d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f350608e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f350609f = new java.util.HashMap();

    public static g62.b wi() {
        return (g62.b) i95.n0.c(g62.b.class);
    }

    public void Ai(int i17, int i18, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f350607d))) {
            g62.i iVar = new g62.i();
            iVar.f350624h = str;
            iVar.f350621e = 10006;
            iVar.f350623g = i18;
            iVar.f350622f = i17;
            gm0.j1.d().g(iVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportService", "[sendDebugInfo] key : %d, content : %s", java.lang.Integer.valueOf(i18), str);
        }
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.KvInfoUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Di(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith(":exptdebug/")) {
            java.lang.String substring = str.substring(11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportService", "%d sendStartMonitor [%s]", java.lang.Integer.valueOf(hashCode()), substring);
            this.f350607d = substring;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                g62.i iVar = new g62.i();
                iVar.f350624h = substring;
                iVar.f350621e = 10000;
                iVar.f350623g = 1;
                gm0.j1.d().g(iVar);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237 c6119x892f1237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237();
            c6119x892f1237.f136393g.f89286a = substring;
            c6119x892f1237.e();
            this.f350608e = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportService", "start expt Debug tools cost time [%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void Ni() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportService", "%d sendStopMonitor [%s]", java.lang.Integer.valueOf(hashCode()), this.f350607d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f350607d)) {
            g62.i iVar = new g62.i();
            iVar.f350624h = this.f350607d;
            iVar.f350621e = 10000;
            iVar.f350623g = 2;
            gm0.j1.d().g(iVar);
        }
        this.f350607d = null;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237 c6119x892f1237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237();
        c6119x892f1237.f136393g.f89286a = "";
        c6119x892f1237.e();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        Ni();
        java.util.HashMap hashMap = this.f350609f;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f350608e = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        java.lang.String className = activity.getComponentName().getClassName();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f350607d))) {
            g62.i iVar = new g62.i();
            iVar.f350624h = className;
            iVar.f350621e = 10002;
            iVar.f350623g = 2;
            gm0.j1.d().g(iVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.String className = activity.getComponentName().getClassName();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f350607d))) {
            g62.i iVar = new g62.i();
            iVar.f350624h = className;
            iVar.f350621e = 10002;
            iVar.f350623g = 1;
            gm0.j1.d().g(iVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
