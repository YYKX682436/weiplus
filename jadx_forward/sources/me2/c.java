package me2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final me2.c f407454a = new me2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f407455b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f407456c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f407457d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f407458e = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public final boolean a(long j17) {
        java.lang.Long l17 = (java.lang.Long) f407458e.get(java.lang.Long.valueOf(j17));
        if (l17 != null) {
            return java.lang.System.currentTimeMillis() - l17.longValue() < 60000;
        }
        return true;
    }

    public final void b(long j17, me2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedDataCnl", "saveFeedData feedId: " + j17);
        java.util.Map channelMap = f407455b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channelMap, "channelMap");
        channelMap.put(java.lang.Long.valueOf(j17), data);
        java.util.Map channelSaveTimeMap = f407458e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channelSaveTimeMap, "channelSaveTimeMap");
        channelSaveTimeMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
