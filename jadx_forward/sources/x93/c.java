package x93;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f534256a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q f534257b;

    public static final synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q a(long j17) {
        synchronized (x93.c.class) {
            if (f534256a != j17) {
                if (f534257b != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenshotShareConfigManager", "getConfig: pageId mismatch (stored=" + f534256a + ", current=" + j17 + "), clearing config");
                    f534256a = -1L;
                    f534257b = null;
                }
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q qVar = f534257b;
            if (qVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ScreenshotShareConfigManager", "getConfig: no config for pageId=" + j17);
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenshotShareConfigManager", "getConfig: found config for pageId=" + j17);
            return qVar;
        }
    }
}
