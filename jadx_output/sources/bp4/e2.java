package bp4;

/* loaded from: classes5.dex */
public final class e2 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f23152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.q f23153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23154d;

    public e2(long j17, bp4.k2 k2Var, yz5.q qVar, boolean z17) {
        this.f23151a = j17;
        this.f23152b = k2Var;
        this.f23153c = qVar;
        this.f23154d = z17;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f23151a;
        sb6.append(elapsedRealtime - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - j17, false);
        if (bitmap == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(bitmap.getHeight()));
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(dw3.c0.f244182a.n());
            sb7.append(bitmap.hashCode());
            java.lang.String sb8 = sb7.toString();
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb8, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "saveBitmapToImage  cost:" + (android.os.SystemClock.elapsedRealtime() - j17) + "  path:" + sb8);
            this.f23152b.getClass();
            android.os.SystemClock.elapsedRealtime();
            this.f23153c.invoke(java.lang.Boolean.TRUE, sb8, java.lang.Boolean.valueOf(this.f23154d));
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiPhotoEditContainerPlugin", "photoEditor onError: %s", e17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 125L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f23151a, false);
        this.f23152b.getClass();
        this.f23153c.invoke(java.lang.Boolean.FALSE, null, java.lang.Boolean.valueOf(this.f23154d));
    }
}
