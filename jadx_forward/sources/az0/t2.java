package az0;

/* loaded from: classes14.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.w2 f97445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f97447f;

    public t2(az0.w2 w2Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f97445d = w2Var;
        this.f97446e = z17;
        this.f97447f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f97524d;
        az0.w2.f97528h = new is0.c(false, 24L);
        is0.c cVar = az0.w2.f97528h;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar != null ? cVar.f375928e : 0);
        az0.w2.f97529i = surfaceTexture;
        android.os.Handler handler = az0.w2.f97533p;
        az0.w2 w2Var2 = this.f97445d;
        surfaceTexture.setOnFrameAvailableListener(w2Var2, handler);
        az0.w2.f97534q = new android.view.Surface(az0.w2.f97529i);
        az0.w2.f97542y = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d c4028xa5c0f76d = new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4028xa5c0f76d(this.f97446e, (rg.c) this.f97447f.f391656d, w2Var2);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c4028xa5c0f76d.f129446a);
        az0.w2.D = valueOf;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            az0.w2.f97530m = new az0.n2();
            az0.w2.f97536s = az0.m2.f97220f;
            az0.w2.f97526f = c4028xa5c0f76d;
        } else {
            c4028xa5c0f76d.a();
        }
        java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f97542y;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
