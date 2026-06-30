package at0;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(at0.n nVar, long j17, yz5.l lVar) {
        super(1);
        this.f13581d = nVar;
        this.f13582e = j17;
        this.f13583f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int e17 = this.f13581d.f13594b.e();
        long j17 = this.f13582e;
        if (e17 == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesBack " + elapsedRealtime);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 25L, elapsedRealtime);
        } else {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesFront " + elapsedRealtime2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 24L, elapsedRealtime2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "take photo use image frame cost1 " + (android.os.SystemClock.elapsedRealtime() - j17));
        this.f13583f.invoke(it);
        return jz5.f0.f302826a;
    }
}
