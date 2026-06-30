package bf3;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.o f19643a = new bf3.o();

    public final boolean a(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails = new com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails();
        int nativeCheckBitmapIsBlank = com.tencent.mm.appbrand.commonjni.BitmapUtilsJni.nativeCheckBitmapIsBlank(bitmap, 0.95f, checkBitmapIsBlankResultDetails);
        if (nativeCheckBitmapIsBlank != 1) {
            if (nativeCheckBitmapIsBlank == 2) {
                return false;
            }
            throw new java.io.IOException("BitmapUtilsJni check failed:" + nativeCheckBitmapIsBlank);
        }
        int i17 = (checkBitmapIsBlankResultDetails.majorColor >> 24) & 255;
        com.tencent.mars.xlog.Log.i("MicroMsg.MBBitmapUtil", "hy: pure color, alpha is " + i17);
        return i17 == 0;
    }
}
