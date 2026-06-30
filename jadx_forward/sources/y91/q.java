package y91;

/* loaded from: classes13.dex */
public class q implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final java.net.Socket f541841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y91.t f541842e;

    public q(y91.t tVar, java.net.Socket socket) {
        this.f541842e = tVar;
        this.f541841d = socket;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:6:0x000b, B:16:0x005b, B:18:0x005f, B:19:0x0065, B:25:0x0067, B:26:0x0040, B:27:0x004d, B:28:0x0025, B:31:0x002f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:6:0x000b, B:16:0x005b, B:18:0x005f, B:19:0x0065, B:25:0x0067, B:26:0x0040, B:27:0x004d, B:28:0x0025, B:31:0x002f), top: B:5:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(aa1.d r8, java.io.BufferedWriter r9) {
        /*
            r7 = this;
            y91.t r0 = r7.f541842e
            y91.m r0 = r0.f541849e
            if (r0 == 0) goto L74
            y91.l r0 = (y91.l) r0
            java.lang.Class<y91.m> r1 = y91.m.class
            monitor-enter(r1)
            aa1.b r2 = r8.f84021a     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = "SID"
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = r8.f84019c     // Catch: java.lang.Throwable -> L71
            int r4 = r3.hashCode()     // Catch: java.lang.Throwable -> L71
            r5 = -2006516997(0xffffffff8866fafb, float:-6.9508133E-34)
            r6 = 1
            if (r4 == r5) goto L2f
            r5 = -1725405015(0xffffffff992868a9, float:-8.706532E-24)
            if (r4 == r5) goto L25
            goto L39
        L25:
            java.lang.String r4 = "rdcEvent"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L39
            r3 = r6
            goto L3a
        L2f:
            java.lang.String r4 = "avtEvent"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L39
            r3 = 0
            goto L3a
        L39:
            r3 = -1
        L3a:
            if (r3 == 0) goto L4d
            if (r3 == r6) goto L40
            r0 = 0
            goto L59
        L40:
            y91.o r0 = r0.f541833a     // Catch: java.lang.Throwable -> L71
            java.util.Map r0 = r0.f541839d     // Catch: java.lang.Throwable -> L71
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L71
            aa1.c r0 = (aa1.c) r0     // Catch: java.lang.Throwable -> L71
            goto L59
        L4d:
            y91.o r0 = r0.f541833a     // Catch: java.lang.Throwable -> L71
            java.util.Map r0 = r0.f541838c     // Catch: java.lang.Throwable -> L71
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L71
            aa1.c r0 = (aa1.c) r0     // Catch: java.lang.Throwable -> L71
        L59:
            if (r0 == 0) goto L67
            z91.b r0 = r0.f84018b     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L67
            x91.h r0 = (x91.h) r0     // Catch: java.lang.Throwable -> L71
            boolean r6 = r0.b(r8)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            goto L68
        L67:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
        L68:
            if (r6 == 0) goto L6b
            goto L74
        L6b:
            java.lang.String r8 = "HTTP/1.1 500 Internal Server Error\r\nContent-Length: 0\r\n\r\n"
            r9.write(r8)
            goto L79
        L71:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            throw r8
        L74:
            java.lang.String r8 = "HTTP/1.1 200 OK\r\nContent-Length: 0\r\n\r\n"
            r9.write(r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y91.q.a(aa1.d, java.io.BufferedWriter):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x00e5, IOException -> 0x00ec, TryCatch #4 {IOException -> 0x00ec, all -> 0x00e5, blocks: (B:3:0x0002, B:4:0x0020, B:7:0x0028, B:11:0x002e, B:13:0x0038, B:15:0x004a, B:17:0x0062, B:18:0x006d, B:20:0x0073, B:21:0x0079, B:23:0x007f, B:24:0x0085, B:32:0x00c3, B:33:0x00d8, B:42:0x00c9, B:43:0x00d1, B:44:0x00ab, B:47:0x00b5, B:9:0x0055), top: B:2:0x0002 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y91.q.call():java.lang.Object");
    }
}
