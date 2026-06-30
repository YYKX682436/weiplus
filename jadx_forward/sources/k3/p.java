package k3;

/* loaded from: classes13.dex */
public class p extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f385341d;

    public p(java.lang.Runnable runnable, java.lang.String str, int i17) {
        super(runnable, str);
        this.f385341d = i17;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(this.f385341d);
        super.run();
    }
}
