package hy4;

/* loaded from: classes8.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f367722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.s f367723e;

    public q(hy4.s sVar, android.graphics.Bitmap bitmap) {
        this.f367723e = sVar;
        this.f367722d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[3];
        hy4.s sVar = this.f367723e;
        sVar.getClass();
        if (hy4.s.f367726f == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
            sb6.append(com.p314xaae8f345.mm.vfs.q7.c("webview_temp") + "/");
            sb6.append("common/");
            java.lang.String sb7 = sb6.toString();
            hy4.s.f367726f = sb7;
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
        objArr[0] = hy4.s.f367726f;
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        android.graphics.Bitmap bitmap = this.f367722d;
        objArr[2] = java.lang.Integer.valueOf(bitmap.hashCode());
        sVar.f367729c = java.lang.String.format(locale, "%s%s_%08x", objArr);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sVar.f367729c, true);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewCaptureHelper", "saveBitmapToImage failed, " + e17.getMessage());
            sVar.f367729c = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewCaptureHelper", "bitmap recycle %s", bitmap.toString());
        bitmap.recycle();
        sVar.f367727a.mo50305x3d8a09a2(2);
    }
}
