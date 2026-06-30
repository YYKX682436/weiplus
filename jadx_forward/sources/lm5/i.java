package lm5;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f401142a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f401143b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f401144c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.ThreadLocal f401145d = new java.lang.ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.lang.reflect.Field f401146e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile java.lang.Boolean f401147f = java.lang.Boolean.FALSE;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f401148g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static boolean f401149h = true;

    static {
        f();
    }

    public static lm5.d a() {
        lm5.d dVar;
        java.lang.reflect.Field e17;
        java.lang.ThreadLocal threadLocal = f401145d;
        lm5.d dVar2 = (lm5.d) threadLocal.get();
        if (dVar2 != null && ((java.util.HashMap) f401143b).isEmpty()) {
            return dVar2;
        }
        synchronized (lm5.i.class) {
            dVar = (lm5.d) ((java.util.HashMap) f401143b).remove(java.lang.Thread.currentThread());
        }
        if (dVar2 != null && dVar == null) {
            return dVar2;
        }
        if (dVar != null) {
            jm5.b.b("Vending.SchedulerProvider", "Override current scheduler: %s", dVar);
            threadLocal.set(dVar);
            return dVar;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        boolean z17 = false;
        if (myLooper != null) {
            if (f401149h) {
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 30 && (e17 = e()) != null) {
                        if (!((java.lang.Boolean) e17.get(myLooper)).booleanValue()) {
                            jm5.b.b("Vending.SchedulerProvider", "Looper is not in loop by mInLooper flag: %s", myLooper);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    jm5.b.b("Vending.SchedulerProvider", "Reflect looper failed: %s, continue", th6.getMessage());
                }
                for (java.lang.StackTraceElement stackTraceElement : new java.lang.Throwable().getStackTrace()) {
                    if (!stackTraceElement.getClassName().equals("android.os.Looper") || !stackTraceElement.getMethodName().equals("loop")) {
                    }
                }
                jm5.b.b("Vending.SchedulerProvider", "Looper is not in loop: %s", myLooper);
            } else {
                jm5.b.b("Vending.SchedulerProvider", "Looper valid check disabled", new java.lang.Object[0]);
            }
            z17 = true;
            break;
        }
        if (z17) {
            dVar = new lm5.j(android.os.Looper.myLooper(), android.os.Looper.myLooper().toString());
            jm5.b.b("Vending.SchedulerProvider", "Create single scheduler: %s", dVar);
        } else if (dVar == null) {
            jm5.b.c("Vending.SchedulerProvider", "This is not a handler thread! %s", java.lang.Thread.currentThread());
            return new lm5.c();
        }
        f401145d.set(dVar);
        return dVar;
    }

    public static void b(boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "enabled" : "disabled";
        jm5.b.b("Vending.SchedulerProvider", "Looper valid check %s", objArr);
        f401149h = z17;
    }

    public static void c(java.lang.String str, lm5.d dVar) {
        iz5.a.d("Scheduler type is null", str);
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String upperCase = str.toUpperCase(locale);
        java.util.Map map = f401142a;
        if (map.containsKey(upperCase)) {
            new java.lang.IllegalStateException("Fatal error! Duplicate scheduler type " + str.toUpperCase(locale));
        }
        map.put(upperCase, dVar);
        if (dVar instanceof lm5.j) {
            synchronized (lm5.i.class) {
                f401143b.put(((lm5.j) dVar).f401151e.getThread(), dVar);
            }
        }
    }

    public static lm5.d d(java.lang.String str) {
        iz5.a.d("Scheduler type is null", str);
        java.util.Map map = f401142a;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        lm5.d dVar = (lm5.d) ((java.util.concurrent.ConcurrentHashMap) map).get(str.toUpperCase(locale));
        iz5.a.d("Scheduler type not found: " + str.toUpperCase(locale), dVar);
        return dVar;
    }

    public static java.lang.reflect.Field e() {
        java.lang.Boolean bool;
        if (f401146e == null && !f401147f.booleanValue()) {
            synchronized (f401148g) {
                if (f401146e == null && !f401147f.booleanValue()) {
                    try {
                        java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("mInLoop");
                        declaredField.setAccessible(true);
                        f401146e = declaredField;
                        bool = java.lang.Boolean.TRUE;
                    } catch (java.lang.Throwable th6) {
                        try {
                            jm5.b.b("Vending.SchedulerProvider", "Reflect looper failed: %s", th6.getMessage());
                            bool = java.lang.Boolean.TRUE;
                        } catch (java.lang.Throwable th7) {
                            f401147f = java.lang.Boolean.TRUE;
                            throw th7;
                        }
                    }
                    f401147f = bool;
                }
            }
        }
        return f401146e;
    }

    public static synchronized void f() {
        synchronized (lm5.i.class) {
            if (f401144c) {
                return;
            }
            jm5.b.b("Vending.SchedulerProvider", "SchedulerProvider provided.", new java.lang.Object[0]);
            f401144c = true;
            c("Vending.UI", lm5.d.f401133a);
            c("Vending.LOGIC", lm5.d.f401134b);
            c("Vending.HEAVY_WORK", lm5.d.f401135c);
        }
    }
}
