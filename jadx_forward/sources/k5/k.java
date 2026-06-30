package k5;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final k5.l f385667d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f385668e;

    public k(k5.l lVar, java.lang.Runnable runnable) {
        this.f385667d = lVar;
        this.f385668e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        k5.l lVar = this.f385667d;
        try {
            this.f385668e.run();
        } finally {
            lVar.a();
        }
    }
}
