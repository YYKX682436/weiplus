package af1;

/* loaded from: classes15.dex */
public class n implements d9.h, d9.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f4493d;

    public n(af1.x xVar, af1.k kVar) {
        this.f4493d = xVar;
    }

    @Override // d9.h
    public void a(int i17, com.google.android.exoplayer2.Format format, int i18, java.lang.Object obj, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "[TRACE_ADAPTIVE] onDownstreamFormatChanged, trackType:%s, trackFormat:%s, mediaTimeMs:%s", java.lang.Integer.valueOf(i17), format, java.lang.Long.valueOf(j17));
        this.f4493d.F(format.f44075d);
    }

    @Override // d9.h
    public void f(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void k() {
        this.f4493d.A.getClass();
    }

    @Override // d9.u
    public void onLoadError(java.io.IOException iOException) {
        af1.x xVar = this.f4493d;
        xVar.A.onLoadError(iOException);
        int i17 = xVar.U + 1;
        xVar.U = i17;
        if (6 <= i17) {
            android.content.Context context = xVar.f4502q;
            cf1.a aVar = af1.z.f4516a;
            if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
                xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_URL, -2);
            }
        }
        xVar.T();
    }

    @Override // d9.h
    public void r(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        af1.x xVar = this.f4493d;
        xVar.A.r(nVar, i17, i18, format, i19, obj, j17, j18, j19, j27, j28, iOException, z17);
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayer", iOException, "onLoadError1, IOException, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s, loadDurationMs:%s, bytesLoaded:%s, wasCanceled:%s", nVar, java.lang.Integer.valueOf(i18), format, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Boolean.valueOf(z17));
        int i27 = xVar.U + 1;
        xVar.U = i27;
        if (6 <= i27) {
            android.content.Context context = xVar.f4502q;
            cf1.a aVar = af1.z.f4516a;
            if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
                xVar.G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_URL, -2);
            }
        }
        xVar.S();
    }

    @Override // d9.h
    public void v(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void w(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19) {
    }
}
