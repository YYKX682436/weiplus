package a5;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.CoroutineWorker f1397d;

    public i(androidx.work.CoroutineWorker coroutineWorker) {
        this.f1397d = coroutineWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1397d.f12456m.f316534d instanceof l5.c) {
            kotlinx.coroutines.p2.a(this.f1397d.f12455i, null, 1, null);
        }
    }
}
