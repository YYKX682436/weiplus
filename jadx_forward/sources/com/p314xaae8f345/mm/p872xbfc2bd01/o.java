package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p872xbfc2bd01.m f150499a = new com.p314xaae8f345.mm.p872xbfc2bd01.m();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p872xbfc2bd01.p f150500b = new com.p314xaae8f345.mm.p872xbfc2bd01.p();

    /* renamed from: c, reason: collision with root package name */
    public static int f150501c = -1;

    public static boolean a() {
        boolean c17 = fp.h.c(19);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String property = java.lang.System.getProperty("java.vm.version");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", java.lang.Boolean.valueOf(c17), java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property) && property.startsWith("2")), java.lang.Boolean.valueOf(c17));
        return c17;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.o c() {
        if (f150501c == -1) {
            if (a()) {
                f150501c = 1;
            } else {
                f150501c = 2;
            }
        }
        return f150501c != 1 ? f150500b : f150499a;
    }

    public abstract android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options);

    public abstract void d(android.graphics.Bitmap bitmap);

    public abstract android.graphics.Bitmap e(java.lang.String str, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    public void f(java.io.InputStream inputStream) {
        try {
            inputStream.reset();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlatformBitmapFactory", e17, "reset stream error: %s", e17.getMessage());
        }
    }
}
