package androidx.loader.content;

/* loaded from: classes13.dex */
public class g extends androidx.loader.content.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.loader.content.m f11677e;

    public g(androidx.loader.content.m mVar) {
        this.f11677e = mVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        androidx.loader.content.m mVar = this.f11677e;
        mVar.f11692h.set(true);
        java.lang.Object obj = null;
        try {
            android.os.Process.setThreadPriority(10);
            androidx.loader.content.a aVar = (androidx.loader.content.a) mVar;
            try {
                obj = aVar.f11675p.onLoadInBackground();
            } catch (j3.q e17) {
                if (!aVar.f11691g.get()) {
                    throw e17;
                }
            }
            android.os.Binder.flushPendingCommands();
            return obj;
        } finally {
        }
    }
}
