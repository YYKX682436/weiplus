package ve1;

/* loaded from: classes12.dex */
public class o extends java.util.concurrent.ThreadPoolExecutor {
    public o(int i17) {
        super(i17, i17, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue());
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return (java.util.concurrent.RunnableFuture) runnable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return (java.util.concurrent.RunnableFuture) callable;
    }
}
