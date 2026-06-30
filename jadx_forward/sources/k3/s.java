package k3;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Callable f385346d;

    /* renamed from: e, reason: collision with root package name */
    public final m3.a f385347e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f385348f;

    public s(android.os.Handler handler, java.util.concurrent.Callable callable, m3.a aVar) {
        this.f385346d = callable;
        this.f385347e = aVar;
        this.f385348f = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        try {
            obj = this.f385346d.call();
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        this.f385348f.post(new k3.r(this, this.f385347e, obj));
    }
}
