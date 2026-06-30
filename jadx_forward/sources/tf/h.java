package tf;

/* loaded from: classes7.dex */
public class h implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f500345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f500346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.k0 f500347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.j f500348g;

    public h(tf.j jVar, java.util.concurrent.Future future, java.lang.Runnable runnable, tf.k0 k0Var) {
        this.f500348g = jVar;
        this.f500345d = future;
        this.f500346e = runnable;
        this.f500347f = k0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f500348g.f500359a, "scheduleAfterTransferToTask, onFrameAvailable");
        this.f500345d.cancel(false);
        this.f500346e.run();
        tf.k0 k0Var = this.f500347f;
        synchronized (k0Var) {
            ((java.util.ArrayList) k0Var.f500368b).remove(new tf.j0(this, null));
        }
    }
}
