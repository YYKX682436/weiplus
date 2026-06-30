package az0;

/* loaded from: classes14.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f15856d;

    public r2(android.opengl.EGLContext eGLContext) {
        this.f15856d = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f15991d;
        android.opengl.EGLContext eGLContext = this.f15856d;
        az0.w2.f15994g = eGLContext == null ? rs0.g.n(rs0.i.f399296a, null, null, 1, 1, null, 16, null) : rs0.i.f399296a.m(null, null, 1, 1, eGLContext);
        java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f16008x;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
