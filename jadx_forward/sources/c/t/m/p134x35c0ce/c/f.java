package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static dalvik.system.DexClassLoader f118420a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f118421b;

    /* renamed from: c, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.f f118422c;

    public f(android.content.Context context) {
        f118421b = context;
        c.t.m.p134x35c0ce.c.m.a(context).a();
    }

    public static c.t.m.p134x35c0ce.c.f a(android.content.Context context) {
        if (f118422c == null) {
            synchronized (c.t.m.p134x35c0ce.c.f.class) {
                if (f118422c == null) {
                    f118422c = new c.t.m.p134x35c0ce.c.f(context);
                }
            }
        }
        return f118422c;
    }

    public void b() {
        try {
            new java.lang.Thread(new c.t.m.p134x35c0ce.c.h(f118421b, c.t.m.p134x35c0ce.c.q.d(c.t.m.p134x35c0ce.c.q.c(f118421b, "__SP_Tencent_Loc_COMP_INFO__sapp_", "")), false)).start();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void c() {
        f118422c = null;
        f118420a = null;
    }

    public synchronized dalvik.system.DexClassLoader a() {
        dalvik.system.DexClassLoader dexClassLoader = f118420a;
        if (dexClassLoader != null) {
            return dexClassLoader;
        }
        android.content.Context context = f118421b;
        if (context == null) {
            return null;
        }
        c.t.m.p134x35c0ce.c.d.a(context).b("load_sapp");
        c.t.m.p134x35c0ce.c.q.f118452e = java.lang.System.currentTimeMillis();
        dalvik.system.DexClassLoader b17 = c.t.m.p134x35c0ce.c.g.a(f118421b).b();
        f118420a = b17;
        if (b17 != null) {
            c.t.m.p134x35c0ce.c.e.a(f118421b).a();
        }
        b();
        c.t.m.p134x35c0ce.c.d.a(f118421b).c("load_sapp");
        return f118420a;
    }
}
