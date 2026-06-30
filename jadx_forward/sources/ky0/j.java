package ky0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.j f395016a = new ky0.j();

    public final java.lang.String a(java.lang.String str, android.graphics.Bitmap bitmap, ly0.p pVar) {
        java.lang.String c17 = dw3.h.f325744a.c(pVar.toString(), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, c17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AITemplateSizeUtils", "path:" + str + " makeImageValid result:" + D0 + " tempPath:" + c17);
        return D0 ? c17 : str;
    }
}
