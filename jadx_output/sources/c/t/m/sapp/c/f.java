package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static dalvik.system.DexClassLoader f36887a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f36888b;

    /* renamed from: c, reason: collision with root package name */
    public static c.t.m.sapp.c.f f36889c;

    public f(android.content.Context context) {
        f36888b = context;
        c.t.m.sapp.c.m.a(context).a();
    }

    public static c.t.m.sapp.c.f a(android.content.Context context) {
        if (f36889c == null) {
            synchronized (c.t.m.sapp.c.f.class) {
                if (f36889c == null) {
                    f36889c = new c.t.m.sapp.c.f(context);
                }
            }
        }
        return f36889c;
    }

    public void b() {
        try {
            new java.lang.Thread(new c.t.m.sapp.c.h(f36888b, c.t.m.sapp.c.q.d(c.t.m.sapp.c.q.c(f36888b, "__SP_Tencent_Loc_COMP_INFO__sapp_", "")), false)).start();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void c() {
        f36889c = null;
        f36887a = null;
    }

    public synchronized dalvik.system.DexClassLoader a() {
        dalvik.system.DexClassLoader dexClassLoader = f36887a;
        if (dexClassLoader != null) {
            return dexClassLoader;
        }
        android.content.Context context = f36888b;
        if (context == null) {
            return null;
        }
        c.t.m.sapp.c.d.a(context).b("load_sapp");
        c.t.m.sapp.c.q.f36919e = java.lang.System.currentTimeMillis();
        dalvik.system.DexClassLoader b17 = c.t.m.sapp.c.g.a(f36888b).b();
        f36887a = b17;
        if (b17 != null) {
            c.t.m.sapp.c.e.a(f36888b).a();
        }
        b();
        c.t.m.sapp.c.d.a(f36888b).c("load_sapp");
        return f36887a;
    }
}
