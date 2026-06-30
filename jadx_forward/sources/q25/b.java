package q25;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f441355a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f441356b;

    static {
        new java.util.HashMap();
        f441356b = java.util.regex.Pattern.compile(" +");
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        q25.a aVar;
        java.lang.String[] split = f441356b.split(str);
        java.util.HashMap hashMap = f441355a;
        synchronized (hashMap) {
            aVar = (q25.a) hashMap.get(split[0]);
        }
        if (aVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnifiedCommandProcessor", "Command: %s", split[0]);
        return aVar.a(context, split, str2);
    }

    public static void b(q25.a aVar, java.lang.String... strArr) {
        synchronized (f441355a) {
            for (java.lang.String str : strArr) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnifiedCommandProcessor", "Registered command: %s", str);
            }
        }
    }

    public static void c(java.lang.String... strArr) {
        synchronized (f441355a) {
            for (java.lang.String str : strArr) {
                f441355a.remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnifiedCommandProcessor", "Unregistered command: %s", str);
            }
        }
    }
}
