package lr5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f402297d;

    public a(java.lang.Runnable runnable) {
        this.f402297d = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:7:0x0042, B:9:0x0046), top: B:6:0x0042 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "exception: %s"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dns-work-"
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = lr5.e.f402301a
            int r2 = r2.getAndIncrement()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.setName(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.os.Process.myTid()     // Catch: java.lang.Exception -> L39
            int r3 = android.os.Process.getThreadPriority(r3)     // Catch: java.lang.Exception -> L39
            r4 = 10
            if (r4 == r3) goto L42
            android.os.Process.setThreadPriority(r4)     // Catch: java.lang.Exception -> L37
            goto L42
        L37:
            r4 = move-exception
            goto L3b
        L39:
            r4 = move-exception
            r3 = r1
        L3b:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            or5.b.b(r0, r4)
        L42:
            java.lang.Runnable r4 = r8.f402297d     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L54
            r4.run()     // Catch: java.lang.Exception -> L4a
            goto L54
        L4a:
            r4 = move-exception
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 5
            java.lang.String r7 = "Run task in executor failed"
            or5.b.c(r6, r4, r7, r5)
        L54:
            if (r1 != r3) goto L57
            goto L6d
        L57:
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Exception -> L65
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch: java.lang.Exception -> L65
            if (r3 == r1) goto L6d
            android.os.Process.setThreadPriority(r3)     // Catch: java.lang.Exception -> L65
            goto L6d
        L65:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            or5.b.b(r0, r1)
        L6d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setName(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr5.a.run():void");
    }
}
