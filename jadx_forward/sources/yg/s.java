package yg;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f543651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f543655h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543656i;

    public s(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, boolean z17) {
        this.f543656i = abstractC4208x204d5c83;
        this.f543651d = surfaceTexture;
        this.f543652e = i17;
        this.f543653f = i18;
        this.f543654g = i19;
        this.f543655h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543651d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowAvailable. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543656i;
            abstractC4208x204d5c83.m34779xc8ff8659(abstractC4208x204d5c83.f130110a, this.f543652e, this.f543651d, this.f543653f, this.f543654g, this.f543655h);
        }
    }
}
