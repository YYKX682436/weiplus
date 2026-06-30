package bm5;

/* loaded from: classes11.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b5 f22536a = new com.tencent.mm.sdk.platformtools.b5("MissingMessageListenerRpt", java.util.concurrent.TimeUnit.HOURS.toMillis(48), false, true);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f22537b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f22538c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f22539d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f22540e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f22541f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f22542g;

    static {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        f22541f = reentrantReadWriteLock.readLock();
        f22542g = reentrantReadWriteLock.writeLock();
    }

    public static boolean a(java.lang.Object obj) {
        return "NewXmlShowChatRoomAnnouncement".equals(obj) || "RecommendEmotion".equals(obj) || "SafeModuleCfg".equals(obj) || "voipmt_not_friend".equals(obj) || "ShareExtensionSendImgResp".equals(obj) || "ShareExtensionSendAppMsgResp".equals(obj);
    }

    public static void b(java.lang.String str, java.lang.Object obj) {
        if (obj == null || a(obj)) {
            return;
        }
        try {
            java.util.Set set = f22538c;
            if (((java.util.HashSet) set).contains(obj)) {
                return;
            }
            synchronized (set) {
                if (((java.util.HashSet) set).contains(obj)) {
                    return;
                }
                try {
                    java.util.concurrent.locks.Lock lock = f22542g;
                    lock.lock();
                    ((java.util.HashSet) set).add(obj);
                    lock.unlock();
                } catch (java.lang.Throwable th6) {
                    f22542g.unlock();
                    throw th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th7, "fail to call reportMissingINewXmlReceived(%s,%s)", str, obj);
        }
    }

    public static void c(java.lang.String str, java.lang.Object obj) {
        if (obj == null || a(obj)) {
            return;
        }
        try {
            java.util.Set set = f22539d;
            if (((java.util.HashSet) set).contains(obj)) {
                return;
            }
            synchronized (set) {
                if (((java.util.HashSet) set).contains(obj)) {
                    return;
                }
                ((java.util.HashSet) set).add(obj);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th6, "fail to call reportMissingISysCmdMsgNewXmlListener(%s,%s)", str, obj);
        }
    }
}
