package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.z1 f102742a = new com.tencent.mm.plugin.finder.assist.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.y1 f102743b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f102744c;

    static {
        com.tencent.mm.plugin.finder.assist.y1 y1Var = new com.tencent.mm.plugin.finder.assist.y1(1253L, 37L, "Finder_UploadBigFileConfig");
        f102743b = y1Var;
        f102744c = kz5.b0.c(y1Var);
    }

    public final void a(com.tencent.mm.plugin.finder.assist.y1 config) {
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        kotlin.jvm.internal.o.d(L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = config.f102706c;
        L.putLong(str, currentTimeMillis);
        com.tencent.mars.xlog.Log.i("Finder.FinderCrashChecker", "mark " + str);
    }
}
