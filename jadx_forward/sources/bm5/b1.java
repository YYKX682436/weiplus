package bm5;

/* loaded from: classes11.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b5 f104069a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b5("MissingMessageListenerRpt", java.util.concurrent.TimeUnit.HOURS.toMillis(48), false, true);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f104070b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f104071c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f104072d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f104073e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f104074f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f104075g;

    static {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        f104074f = reentrantReadWriteLock.readLock();
        f104075g = reentrantReadWriteLock.writeLock();
    }

    public static boolean a(java.lang.Object obj) {
        return "NewXmlShowChatRoomAnnouncement".equals(obj) || "RecommendEmotion".equals(obj) || "SafeModuleCfg".equals(obj) || "voipmt_not_friend".equals(obj) || "ShareExtensionSendImgResp".equals(obj) || "ShareExtensionSendAppMsgResp".equals(obj);
    }

    public static void b(java.lang.String str, java.lang.Object obj) {
        if (obj == null || a(obj)) {
            return;
        }
        try {
            java.util.Set set = f104071c;
            if (((java.util.HashSet) set).contains(obj)) {
                return;
            }
            synchronized (set) {
                if (((java.util.HashSet) set).contains(obj)) {
                    return;
                }
                try {
                    java.util.concurrent.locks.Lock lock = f104075g;
                    lock.lock();
                    ((java.util.HashSet) set).add(obj);
                    lock.unlock();
                } catch (java.lang.Throwable th6) {
                    f104075g.unlock();
                    throw th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MissingMessageListenerReporter", th7, "fail to call reportMissingINewXmlReceived(%s,%s)", str, obj);
        }
    }

    public static void c(java.lang.String str, java.lang.Object obj) {
        if (obj == null || a(obj)) {
            return;
        }
        try {
            java.util.Set set = f104072d;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MissingMessageListenerReporter", th6, "fail to call reportMissingISysCmdMsgNewXmlListener(%s,%s)", str, obj);
        }
    }
}
