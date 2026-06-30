package af1;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af1.x f4484d;

    public k(af1.x xVar) {
        this.f4484d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f4484d) {
            this.f4484d.R();
            this.f4484d.notifyAll();
        }
    }
}
