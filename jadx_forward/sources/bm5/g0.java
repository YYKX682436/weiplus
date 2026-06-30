package bm5;

/* loaded from: classes7.dex */
public class g0 implements java.util.concurrent.ForkJoinPool.ManagedBlocker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f104114a;

    public g0(java.util.Collection collection) {
        this.f104114a = collection;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean block() {
        /*
            r2 = this;
            java.util.Collection r0 = r2.f104114a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            if (r1 != 0) goto L15
            goto L6
        L15:
            r1.get()     // Catch: java.lang.InterruptedException -> L6 java.lang.Throwable -> L19
            goto L6
        L19:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L20:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bm5.g0.block():boolean");
    }

    @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
    public boolean isReleasable() {
        for (java.util.concurrent.Future future : this.f104114a) {
            if (future != null && !future.isCancelled() && !future.isDone()) {
                return false;
            }
        }
        return true;
    }
}
