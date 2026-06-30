package of0;

/* loaded from: classes8.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.content.ComponentName componentName;
        boolean z17 = false;
        if (((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5540xc4fec7) abstractC20979x809547d1).f135864g == null) {
            return false;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (componentName = runningTasks.get(0).baseActivity) != null && com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18739x7e7cc4db.class.getName().equals(componentName.getClassName())) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTeenModeEvent", "FinderTeenModeChangeEvent: teen mode change， isTopStoryTaskForeground: %b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            o11.g gVar = wm4.u.f528842a;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6172x8b8bc1ba c6172x8b8bc1ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6172x8b8bc1ba();
            c6172x8b8bc1ba.f136431g.f88042a = 4;
            c6172x8b8bc1ba.e();
        }
        return true;
    }
}
