package com.tencent.mm.memory;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.memory.m f68966a = new com.tencent.mm.memory.m();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.memory.p f68967b = new com.tencent.mm.memory.p();

    /* renamed from: c, reason: collision with root package name */
    public static int f68968c = -1;

    public static boolean a() {
        boolean c17 = fp.h.c(19);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String property = java.lang.System.getProperty("java.vm.version");
        com.tencent.mars.xlog.Log.i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", java.lang.Boolean.valueOf(c17), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(property) && property.startsWith("2")), java.lang.Boolean.valueOf(c17));
        return c17;
    }

    public static com.tencent.mm.memory.o c() {
        if (f68968c == -1) {
            if (a()) {
                f68968c = 1;
            } else {
                f68968c = 2;
            }
        }
        return f68968c != 1 ? f68967b : f68966a;
    }

    public abstract android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options);

    public abstract void d(android.graphics.Bitmap bitmap);

    public abstract android.graphics.Bitmap e(java.lang.String str, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    public void f(java.io.InputStream inputStream) {
        try {
            inputStream.reset();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PlatformBitmapFactory", e17, "reset stream error: %s", e17.getMessage());
        }
    }
}
