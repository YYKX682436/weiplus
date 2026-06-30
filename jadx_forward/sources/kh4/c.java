package kh4;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh4.d f389581d;

    public c(kh4.d dVar) {
        this.f389581d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f389581d.f389584d = android.view.Choreographer.getInstance();
        synchronized (this.f389581d.f389589i) {
            this.f389581d.f389589i.notify();
        }
    }
}
