package az0;

/* loaded from: classes14.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.w2 f15912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f15914f;

    public t2(az0.w2 w2Var, boolean z17, kotlin.jvm.internal.h0 h0Var) {
        this.f15912d = w2Var;
        this.f15913e = z17;
        this.f15914f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f15991d;
        az0.w2.f15995h = new is0.c(false, 24L);
        is0.c cVar = az0.w2.f15995h;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar != null ? cVar.f294395e : 0);
        az0.w2.f15996i = surfaceTexture;
        android.os.Handler handler = az0.w2.f16000p;
        az0.w2 w2Var2 = this.f15912d;
        surfaceTexture.setOnFrameAvailableListener(w2Var2, handler);
        az0.w2.f16001q = new android.view.Surface(az0.w2.f15996i);
        az0.w2.f16009y = new java.util.concurrent.CountDownLatch(1);
        com.tencent.maas.camstudio.MJCaptureSession mJCaptureSession = new com.tencent.maas.camstudio.MJCaptureSession(this.f15913e, (rg.c) this.f15914f.f310123d, w2Var2);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(mJCaptureSession.f47913a);
        az0.w2.D = valueOf;
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            az0.w2.f15997m = new az0.n2();
            az0.w2.f16003s = az0.m2.f15687f;
            az0.w2.f15993f = mJCaptureSession;
        } else {
            mJCaptureSession.a();
        }
        java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f16009y;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
