package af1;

/* loaded from: classes15.dex */
public class n implements d9.h, d9.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f86026d;

    public n(af1.x xVar, af1.k kVar) {
        this.f86026d = xVar;
    }

    @Override // d9.h
    public void a(int i17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i18, java.lang.Object obj, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "[TRACE_ADAPTIVE] onDownstreamFormatChanged, trackType:%s, trackFormat:%s, mediaTimeMs:%s", java.lang.Integer.valueOf(i17), c1601x7dc4e417, java.lang.Long.valueOf(j17));
        this.f86026d.F(c1601x7dc4e417.f125608d);
    }

    @Override // d9.h
    public void f(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void k() {
        this.f86026d.A.getClass();
    }

    @Override // d9.u
    /* renamed from: onLoadError */
    public void mo1838x4f8e79a3(java.io.IOException iOException) {
        af1.x xVar = this.f86026d;
        xVar.A.mo1838x4f8e79a3(iOException);
        int i17 = xVar.U + 1;
        xVar.U = i17;
        if (6 <= i17) {
            android.content.Context context = xVar.f86035q;
            cf1.a aVar = af1.z.f86049a;
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
                xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14393xa0320ed6, -2);
            }
        }
        xVar.T();
    }

    @Override // d9.h
    public void r(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        af1.x xVar = this.f86026d;
        xVar.A.r(nVar, i17, i18, c1601x7dc4e417, i19, obj, j17, j18, j19, j27, j28, iOException, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoMediaPlayer", iOException, "onLoadError1, IOException, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s, loadDurationMs:%s, bytesLoaded:%s, wasCanceled:%s", nVar, java.lang.Integer.valueOf(i18), c1601x7dc4e417, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Boolean.valueOf(z17));
        int i27 = xVar.U + 1;
        xVar.U = i27;
        if (6 <= i27) {
            android.content.Context context = xVar.f86035q;
            cf1.a aVar = af1.z.f86049a;
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
                xVar.G(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14393xa0320ed6, -2);
            }
        }
        xVar.S();
    }

    @Override // d9.h
    public void v(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void w(r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19) {
    }
}
