package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class m1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478 f242841d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478 activityC17372xbab57478) {
        this.f242841d = activityC17372xbab57478;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478.f241674p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478 activityC17372xbab57478 = this.f242841d;
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) activityC17372xbab57478.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "process %s, %s", runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    i17 = runningAppProcessInfo.pid;
                    break;
                }
            }
        } catch (java.lang.Error e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Error: " + e17.toString());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Exception: " + e18.toString());
        }
        i17 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "oldPid %d, mm pid %d", java.lang.Integer.valueOf(activityC17372xbab57478.f241680i), java.lang.Integer.valueOf(i17));
        int i19 = activityC17372xbab57478.f241680i;
        if (i19 == 0 || i17 == 0 || i19 == i17) {
            int i27 = activityC17372xbab57478.f241682n + 1;
            activityC17372xbab57478.f241682n = i27;
            if (i27 <= 20) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478.T6(activityC17372xbab57478);
            return false;
        }
        int i28 = activityC17372xbab57478.f241682n;
        if (i28 < 1) {
            activityC17372xbab57478.f241682n = i28 + 1;
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478.T6(activityC17372xbab57478);
        return false;
    }
}
