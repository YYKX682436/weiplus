package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z1 f184275a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y1 f184276b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f184277c;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y1(1253L, 37L, "Finder_UploadBigFileConfig");
        f184276b = y1Var;
        f184277c = kz5.b0.c(y1Var);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = config.f184239c;
        L.putLong(str, currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCrashChecker", "mark " + str);
    }
}
