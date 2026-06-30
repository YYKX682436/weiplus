package az0;

/* loaded from: classes14.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f97389d;

    public r2(android.opengl.EGLContext eGLContext) {
        this.f97389d = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f97524d;
        android.opengl.EGLContext eGLContext = this.f97389d;
        az0.w2.f97527g = eGLContext == null ? rs0.g.n(rs0.i.f480829a, null, null, 1, 1, null, 16, null) : rs0.i.f480829a.m(null, null, 1, 1, eGLContext);
        java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f97541x;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
