package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f150029a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f150030b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f150031c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f150032d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f150033e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f150034f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.app.Application.ActivityLifecycleCallbacks f150035g;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        f150034f = arrayList;
        arrayList.add(new com.p314xaae8f345.mm.p815xbe0af3c9.app.a());
        arrayList.add(new com.p314xaae8f345.mm.p815xbe0af3c9.app.b());
        arrayList.add(new com.p314xaae8f345.mm.p815xbe0af3c9.app.c());
        f150035g = new com.p314xaae8f345.mm.p815xbe0af3c9.app.d();
    }

    public static java.lang.String a(android.app.Activity activity) {
        if (activity == null) {
            return "<null>";
        }
        return activity.getClass().getName().substring(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b.length()) + "@" + activity.hashCode();
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        if (f150030b == null) {
            f150030b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(f150029a);
        }
        return f150030b;
    }

    public static synchronized boolean c() {
        synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
            if (b().getInt("kLastCallOnStartClientVersion", 0) != com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) {
                return true;
            }
            return b().getInt("kLastCallOnStopClientVersion", 0) == com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        }
    }
}
