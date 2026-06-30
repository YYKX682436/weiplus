package gh4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gh4.l0 f353471a = new gh4.l0();

    public final boolean a(android.graphics.Bitmap bmp, java.lang.String src, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bmp, "bmp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        java.lang.String concat = destPath.concat("_temp");
        boolean z17 = false;
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bmp, 100, android.graphics.Bitmap.CompressFormat.JPEG, concat, false);
        if (!D0) {
            return D0;
        }
        try {
            boolean z18 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(concat, destPath, 0) == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarLogic", "nativePic2Wxam ret:%b", java.lang.Boolean.valueOf(z18));
            z17 = z18;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskBarLogic", "convertBmp2Wxam bmp OutOfMemoryError!");
        }
        com.p314xaae8f345.mm.vfs.w6.h(concat);
        return z17;
    }

    public final java.lang.String b(java.lang.String path, o11.g imageLoaderOptions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoaderOptions, "imageLoaderOptions");
        if (imageLoaderOptions.f423657v) {
            path = path + "round" + imageLoaderOptions.f423658w;
        }
        java.lang.String str = imageLoaderOptions.f423655t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            path = path + str;
        }
        return path + "size" + imageLoaderOptions.f423644i + imageLoaderOptions.f423645j;
    }

    public final java.lang.String c(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = gh4.m0.f353472a;
        sb6.append(gh4.m0.f353473b);
        sb6.append(id6);
        return sb6.toString();
    }
}
