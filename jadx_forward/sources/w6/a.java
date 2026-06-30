package w6;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f524583d;

    public a(w6.b bVar, java.lang.Runnable runnable) {
        this.f524583d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(10);
        this.f524583d.run();
    }
}
