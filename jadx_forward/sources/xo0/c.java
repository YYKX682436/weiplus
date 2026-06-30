package xo0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xo0.c f537276a = new xo0.c();

    public static boolean a(xo0.c cVar, android.graphics.Bitmap bm6, android.graphics.Bitmap.CompressFormat format, int i17, java.io.OutputStream stream, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            format = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        if ((i18 & 4) != 0) {
            i17 = 80;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bm6, "bm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        pm0.c cVar2 = new pm0.c("compress");
        boolean compress = bm6.compress(format, i17, stream);
        if (!compress) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DiskFunction", "compress error %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        }
        cVar2.a();
        return compress;
    }

    public final java.io.OutputStream b(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (filePath.length() == 0) {
            return null;
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(filePath)).s();
            if (s17 != null) {
                s17.J();
            }
            return com.p314xaae8f345.mm.vfs.w6.K(filePath, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DiskFunction", "obtainOutputStream:%s", e17);
            return null;
        }
    }
}
