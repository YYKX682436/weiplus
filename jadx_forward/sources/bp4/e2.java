package bp4;

/* loaded from: classes5.dex */
public final class e2 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f104684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f104685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.q f104686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104687d;

    public e2(long j17, bp4.k2 k2Var, yz5.q qVar, boolean z17) {
        this.f104684a = j17;
        this.f104685b = k2Var;
        this.f104686c = qVar;
        this.f104687d = z17;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f104684a;
        sb6.append(elapsedRealtime - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 128L, android.os.SystemClock.elapsedRealtime() - j17, false);
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            nu3.i iVar = nu3.i.f421751a;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(bitmap.getHeight()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(dw3.c0.f325715a.n());
            sb7.append(bitmap.hashCode());
            java.lang.String sb8 = sb7.toString();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb8, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "saveBitmapToImage  cost:" + (android.os.SystemClock.elapsedRealtime() - j17) + "  path:" + sb8);
            this.f104685b.getClass();
            android.os.SystemClock.elapsedRealtime();
            this.f104686c.mo147xb9724478(java.lang.Boolean.TRUE, sb8, java.lang.Boolean.valueOf(this.f104687d));
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiPhotoEditContainerPlugin", "photoEditor onError: %s", e17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 125L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f104684a, false);
        this.f104685b.getClass();
        this.f104686c.mo147xb9724478(java.lang.Boolean.FALSE, null, java.lang.Boolean.valueOf(this.f104687d));
    }
}
