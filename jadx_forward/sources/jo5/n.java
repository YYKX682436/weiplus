package jo5;

/* loaded from: classes14.dex */
public final class n implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 f382501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f382502e;

    public n(com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79, long j17) {
        this.f382501d = c22889xa2f9dd79;
        this.f382502e = j17;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.o oVar = this.f382501d.f295315a;
        if (oVar != null) {
            oVar.y0(this.f382502e);
        }
    }
}
