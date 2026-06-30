package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22387xac19ab7c f289035d;

    public e0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22387xac19ab7c c22387xac19ab7c) {
        this.f289035d = c22387xac19ab7c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22387xac19ab7c c22387xac19ab7c = this.f289035d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var = c22387xac19ab7c.f289022d;
        java.lang.String str = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0.G;
        android.content.Context context = (android.content.Context) k0Var.f484375g.get();
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s1.a(context)) {
            try {
                java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getAppTasks();
                if (appTasks != null && appTasks.size() > 0) {
                    java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
                    if (it.hasNext()) {
                        android.content.ComponentName componentName = it.next().getTaskInfo().topActivity;
                        str2 = componentName == null ? null : componentName.getClassName();
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String message = e17.getMessage();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GreenManUtil", "getTopActivityName Exception:%s stack:%s", message, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetWarnView", "curr top activity is: %s", str2);
        if (str2.endsWith("NetworkDiagnoseAllInOneUI")) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var2 = c22387xac19ab7c.f289022d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0.l(k0Var2, k0Var2.f289072z ? 2 : k0Var2.A ? 4 : k0Var2.B ? 5 : 3);
    }
}
