package ai3;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f5104a = new java.util.concurrent.ConcurrentSkipListSet();

    public static synchronized boolean a(long j17) {
        boolean contains;
        synchronized (ai3.a.class) {
            try {
                contains = f5104a.contains(java.lang.Long.valueOf(j17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "isMsgRemuxing error: %s", e17.getMessage());
                return false;
            }
        }
        return contains;
    }
}
