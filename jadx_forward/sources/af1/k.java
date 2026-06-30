package af1;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f86017d;

    public k(af1.x xVar) {
        this.f86017d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f86017d) {
            this.f86017d.R();
            this.f86017d.notifyAll();
        }
    }
}
