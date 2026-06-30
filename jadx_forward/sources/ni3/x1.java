package ni3;

/* loaded from: classes12.dex */
public class x1 implements java.lang.Runnable {
    public x1(ni3.g2 g2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "queryStatsForPackage");
            android.app.usage.StorageStats queryStatsForPackage = ((android.app.usage.StorageStatsManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.usage.StorageStatsManager.class)).queryStatsForPackage(android.os.storage.StorageManager.UUID_DEFAULT, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), android.os.Process.myUserHandle());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("SystemGetAppBytes", queryStatsForPackage.getAppBytes());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("SystemGetDataBytes", queryStatsForPackage.getDataBytes());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("SystemGetCacheBytes", queryStatsForPackage.getCacheBytes());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "ss.getAppBytes() = " + queryStatsForPackage.getAppBytes() + ", ss.getDataBytes() = " + queryStatsForPackage.getDataBytes() + ", ss.getCacheBytes() = " + queryStatsForPackage.getCacheBytes());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreBaseMonitor", e17, "Cannot get storage stats from system.", new java.lang.Object[0]);
        }
    }
}
