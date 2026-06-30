package sl3;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static sl3.b f490785b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f490786a = new java.util.concurrent.ConcurrentHashMap();

    public b(android.content.Context context) {
    }

    public static void a(java.lang.Class cls, sl3.a aVar) {
        if (aVar != null) {
            if (f490785b == null) {
                synchronized (sl3.b.class) {
                    if (f490785b == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                        f490785b = new sl3.b(null);
                    }
                }
            }
            f490785b.f490786a.put(cls, aVar);
        }
    }

    public static sl3.a b(java.lang.Class cls) {
        if (f490785b == null) {
            synchronized (sl3.b.class) {
                if (f490785b == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    f490785b = new sl3.b(null);
                }
            }
        }
        sl3.a aVar = (sl3.a) f490785b.f490786a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
