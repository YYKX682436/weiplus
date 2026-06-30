package rh;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f477028d;

    public q(rh.w wVar) {
        this.f477028d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        rh.w wVar = this.f477028d;
        android.content.Context d17 = wVar.f476827a.d();
        java.lang.String packageName = d17.getPackageName();
        if (packageName.contains(":")) {
            packageName = packageName.substring(0, packageName.indexOf(":"));
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) d17.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.startsWith(packageName)) {
                if (wVar.f477059c > runningAppProcessInfo.importance) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "update global importance: " + wVar.f477059c + " > " + runningAppProcessInfo.importance + ", reason = " + runningAppProcessInfo.importanceReasonComponent, new java.lang.Object[0]);
                    wVar.f477059c = runningAppProcessInfo.importance;
                }
                if (runningAppProcessInfo.processName.equals(d17.getPackageName()) && wVar.f477058b > runningAppProcessInfo.importance) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "update app importance: " + wVar.f477058b + " > " + runningAppProcessInfo.importance + ", reason = " + runningAppProcessInfo.importanceReasonComponent, new java.lang.Object[0]);
                    wVar.f477058b = runningAppProcessInfo.importance;
                }
            }
        }
    }
}
