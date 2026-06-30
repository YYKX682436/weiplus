package jh;

/* loaded from: classes13.dex */
public class w implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.y f381293d;

    public w(jh.y yVar) {
        this.f381293d = yVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f381293d.f381296b = new android.os.Messenger(iBinder);
        synchronized (this.f381293d.f381300f) {
            boolean[] zArr = this.f381293d.f381300f;
            zArr[0] = true;
            zArr.notifyAll();
        }
        oj.j.c("Matrix.WarmUpInvoker", "This remote invoker(%s) connected.", this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f381293d.f381296b = null;
        synchronized (this.f381293d.f381300f) {
            boolean[] zArr = this.f381293d.f381300f;
            zArr[0] = false;
            zArr.notifyAll();
        }
        oj.j.c("Matrix.WarmUpInvoker", "This remote invoker(%s) disconnected.", this);
        synchronized (this.f381293d.f381297c) {
            android.os.Bundle[] bundleArr = this.f381293d.f381297c;
            bundleArr[0] = null;
            bundleArr.notifyAll();
        }
    }
}
