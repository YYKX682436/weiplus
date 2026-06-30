package dr0;

/* loaded from: classes12.dex */
public final class d2 extends dr0.j2 {
    public d2() {
        super(2);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f323973b.a()) {
            return false;
        }
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q;
        java.lang.String str3 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
        dr0.p1 a17 = dr0.p1.f324022d.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.List<android.app.ActivityManager.RunningTaskInfo> h17 = a17.h(context);
        boolean z17 = false;
        for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "LastUI: runningTask=" + runningTaskInfo.topActivity);
            android.content.ComponentName componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(componentName);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentName.getClassName(), "com.tencent.mm.ui.LauncherUI")) {
                    z17 = true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "LastUI: getRecentScene=" + str2 + ", getVisibleScene=" + str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "LastUI: taskSize=" + h17.size() + ", launcherUiAtTop=" + z17);
        if (mm.k.j(mm.k.N, null, 1, null)) {
            dr0.t tVar = dr0.t0.f324072j;
            long j17 = dr0.t0.f324073k.f324080g;
            long max = java.lang.Math.max(3600000L, dr0.a3.f323936d.a().e() * 2 * 60000);
            if (j17 > 0 && java.lang.System.currentTimeMillis() - j17 >= max && h17.size() <= 1) {
                return true;
            }
        }
        if ((!h17.isEmpty()) && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "abort: launcherUiAtTop=false");
            return false;
        }
        if (kz5.c0.i("com.tencent.mm.ui.LauncherUI#MainUI", "com.tencent.mm.ui.LauncherUI#MvvmAddressUIFragment", "com.tencent.mm.ui.LauncherUI#FindMoreFriendsUI", "com.tencent.mm.ui.LauncherUI#MoreTabUI").contains(str3) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.ui.LauncherUI", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("?", str3))) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "abort: recentScene=" + str2 + ", visibleScene=" + str3);
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingBg");
        if (a()) {
            return dr0.a3.b(dr0.a3.f323936d.a(), this.f323982a);
        }
        return null;
    }
}
