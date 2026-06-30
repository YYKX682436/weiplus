package yg;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f543628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543629f;

    public j(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        this.f543629f = abstractC4208x204d5c83;
        this.f543627d = i17;
        this.f543628e = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543629f;
        abstractC4208x204d5c83.m34783x6b2991a9(abstractC4208x204d5c83.f130110a, this.f543627d);
        android.graphics.SurfaceTexture surfaceTexture = this.f543628e;
        if (surfaceTexture == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not release. maybe released by other module", new java.lang.Object[0]);
        } else {
            surfaceTexture.release();
        }
    }
}
