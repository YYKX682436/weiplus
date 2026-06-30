package y91;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.t f541843d;

    public r(y91.t tVar) {
        this.f541843d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(4);
        while (true) {
            y91.t tVar = this.f541843d;
            if (!tVar.f541845a) {
                return;
            } else {
                try {
                    newScheduledThreadPool.submit(new y91.q(tVar, tVar.f541848d.accept()));
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
