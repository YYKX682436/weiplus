package at0;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f95115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(at0.n nVar, long j17, yz5.l lVar) {
        super(1);
        this.f95114d = nVar;
        this.f95115e = j17;
        this.f95116f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int e17 = this.f95114d.f95127b.e();
        long j17 = this.f95115e;
        if (e17 == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesBack " + elapsedRealtime);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 25L, elapsedRealtime);
        } else {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesFront " + elapsedRealtime2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 24L, elapsedRealtime2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "take photo use image frame cost1 " + (android.os.SystemClock.elapsedRealtime() - j17));
        this.f95116f.mo146xb9724478(it);
        return jz5.f0.f384359a;
    }
}
