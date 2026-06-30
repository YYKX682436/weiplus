package by5;

/* loaded from: classes13.dex */
public class w0 extends java.util.concurrent.FutureTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f118142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(by5.u0 u0Var, java.util.concurrent.Callable callable) {
        super(callable);
        this.f118142d = u0Var;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        by5.u0 u0Var = this.f118142d;
        try {
            java.lang.Object obj = get();
            if (u0Var.f118134e.get()) {
                return;
            }
            yu5.c.b(new by5.RunnableC1359x6871ba6(u0Var, obj));
        } catch (java.lang.InterruptedException e17) {
            by5.c4.g("XWebAsyncTask", e17.toString());
        } catch (java.util.concurrent.CancellationException unused) {
            if (u0Var.f118134e.get()) {
                return;
            }
            yu5.c.b(new by5.RunnableC1359x6871ba6(u0Var, null));
        } catch (java.util.concurrent.ExecutionException e18) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e18.getCause());
        }
    }
}
