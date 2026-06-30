package jh;

/* loaded from: classes13.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public volatile android.os.Messenger f381295a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.os.Messenger f381296b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle[] f381297c = {null};

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread[] f381298d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ServiceConnection f381299e = new jh.w(this);

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f381300f = {false};

    public void a(android.content.Context context) {
        try {
            context.unbindService(this.f381299e);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.WarmUpInvoker", th6, "", new java.lang.Object[0]);
        }
        oj.j.c("Matrix.WarmUpInvoker", "Start disconnecting to remote. (%s)", java.lang.Integer.valueOf(hashCode()));
        synchronized (this.f381298d) {
            android.os.HandlerThread handlerThread = this.f381298d[0];
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f381298d[0] = null;
            }
        }
        synchronized (this.f381297c) {
            android.os.Bundle[] bundleArr = this.f381297c;
            bundleArr[0] = null;
            bundleArr.notifyAll();
        }
    }
}
