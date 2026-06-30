package u7;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u7.q f506604d;

    public p(u7.q qVar, u7.o oVar) {
        this.f506604d = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r3 = r3 + r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:9:0x0032, B:11:0x003c, B:21:0x0048, B:16:0x004a, B:17:0x0051), top: B:8:0x0032, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[EDGE_INSN: B:20:0x0048->B:21:0x0048 BREAK  A[LOOP:0: B:4:0x0024->B:19:0x0054], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            u7.q r0 = r9.f506604d
            r0.getClass()
            r1 = -1
            r3 = 0
            u7.a r5 = r0.f506606b     // Catch: java.lang.Throwable -> L67
            v7.b r5 = (v7.b) r5     // Catch: java.lang.Throwable -> L67
            long r3 = r5.b()     // Catch: java.lang.Throwable -> L67
            u7.t r5 = r0.f506605a     // Catch: java.lang.Throwable -> L67
            u7.l r5 = (u7.l) r5     // Catch: java.lang.Throwable -> L67
            r5.d(r3)     // Catch: java.lang.Throwable -> L67
            u7.t r5 = r0.f506605a     // Catch: java.lang.Throwable -> L67
            u7.l r5 = (u7.l) r5     // Catch: java.lang.Throwable -> L67
            long r1 = r5.c()     // Catch: java.lang.Throwable -> L67
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L67
        L24:
            u7.t r6 = r0.f506605a     // Catch: java.lang.Throwable -> L67
            u7.l r6 = (u7.l) r6     // Catch: java.lang.Throwable -> L67
            int r6 = r6.f(r5)     // Catch: java.lang.Throwable -> L67
            r7 = -1
            if (r6 == r7) goto L5a
            java.lang.Object r7 = r0.f506608d     // Catch: java.lang.Throwable -> L67
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L43
            boolean r8 = r8.isInterrupted()     // Catch: java.lang.Throwable -> L43
            if (r8 != 0) goto L45
            boolean r8 = r0.f506611g     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L41
            goto L45
        L41:
            r8 = 0
            goto L46
        L43:
            r5 = move-exception
            goto L58
        L45:
            r8 = 1
        L46:
            if (r8 == 0) goto L4a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            goto L6f
        L4a:
            u7.a r8 = r0.f506606b     // Catch: java.lang.Throwable -> L43
            v7.b r8 = (v7.b) r8     // Catch: java.lang.Throwable -> L43
            r8.a(r5, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            long r6 = (long) r6
            long r3 = r3 + r6
            r0.b(r3, r1)     // Catch: java.lang.Throwable -> L67
            goto L24
        L58:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L67
        L5a:
            r0.e()     // Catch: java.lang.Throwable -> L67
            r5 = 100
            r0.f506612h = r5     // Catch: java.lang.Throwable -> L67
            int r5 = r0.f506612h     // Catch: java.lang.Throwable -> L67
            r0.c(r5)     // Catch: java.lang.Throwable -> L67
            goto L6f
        L67:
            r5 = move-exception
            java.util.concurrent.atomic.AtomicInteger r6 = r0.f506609e     // Catch: java.lang.Throwable -> L76
            r6.incrementAndGet()     // Catch: java.lang.Throwable -> L76
            boolean r5 = r5 instanceof u7.n     // Catch: java.lang.Throwable -> L76
        L6f:
            r0.a()
            r0.b(r3, r1)
            return
        L76:
            r5 = move-exception
            r0.a()
            r0.b(r3, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.p.run():void");
    }
}
