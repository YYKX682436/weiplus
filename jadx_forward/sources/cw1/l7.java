package cw1;

/* loaded from: classes12.dex */
public final class l7 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final cw1.l7 f304656d = new cw1.l7();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.app.usage.StorageStats queryStatsForPackage = ((android.app.usage.StorageStatsManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.usage.StorageStatsManager.class)).queryStatsForPackage(android.os.storage.StorageManager.UUID_DEFAULT, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), android.os.Process.myUserHandle());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryStatsForPackage, "queryStatsForPackage(...)");
        return java.lang.Long.valueOf(queryStatsForPackage.getDataBytes());
    }
}
