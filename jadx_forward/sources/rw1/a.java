package rw1;

/* loaded from: classes14.dex */
public final class a implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f482115a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f482116b = true;

    public a() {
        new java.lang.ThreadLocal();
        new java.lang.ThreadLocal();
        new java.lang.ThreadLocal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        if ((r3 != null ? r3.capacity() : 0) < r2.length) goto L36;
     */
    @Override // hw1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(rw1.b r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rw1.a.c(rw1.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:30:0x0088, B:32:0x008c), top: B:29:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.nio.ByteBuffer r16, rw1.b r17) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r16.clear()
            pw1.g r10 = r1.f482118b
            qw1.e r11 = r1.f482119c
            java.util.concurrent.locks.ReentrantLock r12 = r11.f448620e
            r12.lock()
            boolean r1 = r11.f448619d     // Catch: java.lang.Throwable -> L95
            r13 = 0
            if (r1 == 0) goto L1e
            qw1.d r1 = r11.f448616a     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f448614b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L1e
            is0.c r1 = r1.f448613a     // Catch: java.lang.Throwable -> L95
            goto L1f
        L1e:
            r1 = r13
        L1f:
            if (r1 == 0) goto L31
            int r2 = r10.f440209a     // Catch: java.lang.Throwable -> L95
            int r3 = r10.f440210b     // Catch: java.lang.Throwable -> L95
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L31:
            int r1 = r10.f440209a     // Catch: java.lang.Throwable -> L95
            int r14 = r10.f440210b
            int r1 = r1 * r14
            r0.position(r1)     // Catch: java.lang.Throwable -> L95
            boolean r1 = r11.f448619d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L46
            qw1.d r1 = r11.f448617b     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f448614b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L46
            is0.c r1 = r1.f448613a     // Catch: java.lang.Throwable -> L95
            goto L47
        L46:
            r1 = r13
        L47:
            int r10 = r10.f440209a
            if (r1 == 0) goto L5b
            int r2 = r10 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L5b:
            int r1 = r10 * r14
            int r1 = r1 * 5
            int r1 = r1 / 4
            r0.position(r1)     // Catch: java.lang.Throwable -> L95
            boolean r1 = r11.f448619d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L71
            qw1.d r1 = r11.f448618c     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f448614b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L71
            is0.c r1 = r1.f448613a     // Catch: java.lang.Throwable -> L95
            goto L72
        L71:
            r1 = r13
        L72:
            if (r1 == 0) goto L84
            int r2 = r10 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L84:
            r16.clear()     // Catch: java.lang.Throwable -> L95
            r1 = r15
            boolean r0 = r1.f482116b     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8f
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Throwable -> L93
        L8f:
            r12.unlock()
            return
        L93:
            r0 = move-exception
            goto L97
        L95:
            r0 = move-exception
            r1 = r15
        L97:
            r12.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rw1.a.e(java.nio.ByteBuffer, rw1.b):void");
    }
}
