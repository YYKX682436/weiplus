package up3;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {
    public z(up3.d0 d0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = up3.d0.f511356d;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir(), tp3.b.a("¢´½¾\u0098¤¨£¤"));
            if (r6Var.m()) {
                java.util.HashSet hashSet = new java.util.HashSet(16);
                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
                int myUid = android.os.Process.myUid();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.uid == myUid) {
                        hashSet.add(java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    }
                }
                com.p314xaae8f345.mm.vfs.r6[] H = r6Var.H(new up3.y());
                if (H == null) {
                    return;
                }
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : H) {
                    try {
                        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r6Var2.m82467xfb82e301().split("\\.")[1], 0);
                        if (D1 != 0 && !hashSet.contains(java.lang.Integer.valueOf(D1))) {
                            r6Var2.l();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "Explained by code.", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th7, "Explained by code.", new java.lang.Object[0]);
        }
    }
}
