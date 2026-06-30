package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public class h extends java.util.concurrent.FutureTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p094xbe953013.p095x38b73479.m f93211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p094xbe953013.p095x38b73479.m mVar, java.util.concurrent.Callable callable) {
        super(callable);
        this.f93211d = mVar;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        p012xc85e97e9.p094xbe953013.p095x38b73479.m mVar = this.f93211d;
        try {
            java.lang.Object obj = get();
            if (mVar.f93225h.get()) {
                return;
            }
            mVar.a(obj);
        } catch (java.lang.InterruptedException unused) {
        } catch (java.util.concurrent.CancellationException unused2) {
            if (mVar.f93225h.get()) {
                return;
            }
            mVar.a(null);
        } catch (java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e17.getCause());
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th6);
        }
    }
}
