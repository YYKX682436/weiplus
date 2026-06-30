package yg;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f543664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543668h;

    public u(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        this.f543668h = abstractC4208x204d5c83;
        this.f543664d = surfaceTexture;
        this.f543665e = i17;
        this.f543666f = i18;
        this.f543667g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543664d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543668h;
            abstractC4208x204d5c83.m34781x8c330244(abstractC4208x204d5c83.f130110a, this.f543665e, this.f543664d, this.f543666f, this.f543667g);
        }
    }
}
