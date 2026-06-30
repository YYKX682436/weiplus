package a5;

/* loaded from: classes13.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.Worker f1437d;

    public u0(androidx.work.Worker worker) {
        this.f1437d = worker;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.work.Worker worker = this.f1437d;
        try {
            worker.f12464i.i(worker.h());
        } catch (java.lang.Throwable th6) {
            worker.f12464i.j(th6);
        }
    }
}
