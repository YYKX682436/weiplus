package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f68496a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f68497b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f68498c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f68499d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f68500e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f68501f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.app.Application.ActivityLifecycleCallbacks f68502g;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        f68501f = arrayList;
        arrayList.add(new com.tencent.mm.legacy.app.a());
        arrayList.add(new com.tencent.mm.legacy.app.b());
        arrayList.add(new com.tencent.mm.legacy.app.c());
        f68502g = new com.tencent.mm.legacy.app.d();
    }

    public static java.lang.String a(android.app.Activity activity) {
        if (activity == null) {
            return "<null>";
        }
        return activity.getClass().getName().substring(com.tencent.mm.sdk.platformtools.x2.f193072b.length()) + "@" + activity.hashCode();
    }

    public static com.tencent.mm.sdk.platformtools.o4 b() {
        if (f68497b == null) {
            f68497b = com.tencent.mm.sdk.platformtools.o4.R(f68496a);
        }
        return f68497b;
    }

    public static synchronized boolean c() {
        synchronized (com.tencent.mm.legacy.app.g.class) {
            if (b().getInt("kLastCallOnStartClientVersion", 0) != com.tencent.mm.sdk.platformtools.z.f193112h) {
                return true;
            }
            return b().getInt("kLastCallOnStopClientVersion", 0) == com.tencent.mm.sdk.platformtools.z.f193112h;
        }
    }
}
