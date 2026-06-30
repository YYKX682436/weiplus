package lt5;

/* loaded from: classes8.dex */
public class h implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f402840f;

    public h(lt5.j jVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.lang.Object obj) {
        this.f402838d = atomicReference;
        this.f402839e = atomicReference2;
        this.f402840f = obj;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f402838d.set(iBinder);
        this.f402839e.set(this);
        synchronized (this.f402840f) {
            try {
                this.f402840f.notifyAll();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
