package ve1;

/* loaded from: classes12.dex */
public abstract class p {
    public static java.lang.Object a(java.util.concurrent.Callable callable, int i17, boolean z17, java.lang.String str, java.lang.String str2) {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        java.util.concurrent.Future submit = newSingleThreadExecutor.submit(callable);
        newSingleThreadExecutor.shutdown();
        java.lang.String str3 = "job " + str + " ";
        try {
            return submit.get(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            if (z17) {
                ve1.g.p(4, str2, str3 + "cancelled", null);
                submit.cancel(true);
            }
            return null;
        }
    }

    public static java.util.concurrent.Future b(java.lang.Runnable runnable, java.lang.String str) {
        ve1.n nVar = new ve1.n("job " + str + " ");
        java.util.concurrent.Future<?> submit = nVar.submit(runnable);
        nVar.shutdown();
        return submit;
    }
}
