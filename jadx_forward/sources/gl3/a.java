package gl3;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public vl3.a f354343a;

    /* renamed from: b, reason: collision with root package name */
    public gl3.d f354344b;

    /* renamed from: c, reason: collision with root package name */
    public gl3.i f354345c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f354346d = new byte[81920];

    /* renamed from: e, reason: collision with root package name */
    public int f354347e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f354348f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f354349g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f354350h = 0;

    public a(vl3.a aVar) {
        this.f354343a = aVar;
    }

    public final synchronized void a(byte[] bArr, int i17, int i18) {
        int i19 = i17 - this.f354347e;
        this.f354348f = i19 + i18;
        java.lang.System.arraycopy(bArr, 0, this.f354346d, i19, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: all -> 0x00b0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x002a, B:14:0x0033, B:16:0x0038, B:19:0x003d, B:21:0x0041, B:23:0x004b, B:28:0x0081, B:29:0x008b, B:32:0x0050, B:35:0x005c, B:37:0x0065, B:41:0x006d, B:42:0x0092, B:45:0x0096), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f354347e     // Catch: java.lang.Throwable -> Lb0
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L96
            int r3 = r7.f354348f     // Catch: java.lang.Throwable -> Lb0
            if (r3 > 0) goto Ld
            goto L96
        Ld:
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> Lb0
            byte[] r4 = r7.f354346d     // Catch: java.lang.Throwable -> Lb0
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)     // Catch: java.lang.Throwable -> Lb0
            gl3.i r3 = r7.f354345c     // Catch: java.lang.Throwable -> Lb0
            int r4 = r7.f354347e     // Catch: java.lang.Throwable -> Lb0
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lb0
            int r6 = r7.f354348f     // Catch: java.lang.Throwable -> Lb0
            r3.e(r0, r4, r6)     // Catch: java.lang.Throwable -> Lb0
            gl3.d r0 = r7.f354344b     // Catch: java.lang.Throwable -> Lb0
            int r3 = r7.f354347e     // Catch: java.lang.Throwable -> Lb0
            int r4 = r7.f354348f     // Catch: java.lang.Throwable -> Lb0
            int[] r0 = r0.c(r3, r4)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L33
            java.lang.String r0 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r1 = "flushBufferAll, range is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r7)
            return r2
        L33:
            r3 = r0[r2]     // Catch: java.lang.Throwable -> Lb0
            r4 = -1
            if (r3 == r4) goto L92
            r5 = r0[r1]     // Catch: java.lang.Throwable -> Lb0
            if (r5 != r4) goto L3d
            goto L92
        L3d:
            r5 = r0[r1]     // Catch: java.lang.Throwable -> Lb0
            if (r3 > r5) goto L4b
            gl3.d r5 = r7.f354344b     // Catch: java.lang.Throwable -> Lb0
            java.util.BitSet r5 = r5.f354355a     // Catch: java.lang.Throwable -> Lb0
            r5.set(r3)     // Catch: java.lang.Throwable -> Lb0
            int r3 = r3 + 1
            goto L3d
        L4b:
            r3 = r0[r2]     // Catch: java.lang.Throwable -> Lb0
            if (r3 > 0) goto L50
            goto L7e
        L50:
            int r3 = r3 + r4
            gl3.d r4 = r7.f354344b     // Catch: java.lang.Throwable -> Lb0
            java.util.BitSet r4 = r4.f354355a     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L5c
            goto L7e
        L5c:
            int r4 = r7.f354349g     // Catch: java.lang.Throwable -> Lb0
            int r5 = r7.f354350h     // Catch: java.lang.Throwable -> Lb0
            int r4 = r4 + r5
            int r6 = r7.f354347e     // Catch: java.lang.Throwable -> Lb0
            if (r4 != r6) goto L7e
            int r4 = r7.f354348f     // Catch: java.lang.Throwable -> Lb0
            if (r4 <= 0) goto L7e
            r4 = 8192(0x2000, float:1.148E-41)
            if (r5 < r4) goto L7e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r5 = "isCanSavePreviousIndex, save index :%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> Lb0
            r3 = r1
            goto L7f
        L7e:
            r3 = r2
        L7f:
            if (r3 == 0) goto L8b
            gl3.d r3 = r7.f354344b     // Catch: java.lang.Throwable -> Lb0
            r0 = r0[r2]     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0 - r1
            java.util.BitSet r2 = r3.f354355a     // Catch: java.lang.Throwable -> Lb0
            r2.set(r0)     // Catch: java.lang.Throwable -> Lb0
        L8b:
            gl3.d r0 = r7.f354344b     // Catch: java.lang.Throwable -> Lb0
            r0.d()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r7)
            return r1
        L92:
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r7)
            return r2
        L96:
            java.lang.String r3 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r4 = "flushBufferAll(), mOffset:%d, mSize:%d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb0
            r5[r2] = r0     // Catch: java.lang.Throwable -> Lb0
            int r0 = r7.f354348f     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb0
            r5[r1] = r0     // Catch: java.lang.Throwable -> Lb0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r5)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r7)
            return r2
        Lb0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl3.a.b():boolean");
    }

    public long c() {
        return this.f354343a.mo94094xfb854877();
    }

    public final synchronized boolean d(int i17) {
        boolean z17;
        int i18 = this.f354347e;
        if (i18 <= i17) {
            z17 = i17 <= i18 + this.f354348f;
        }
        return z17;
    }

    public final synchronized boolean e(int i17) {
        int i18;
        i18 = this.f354347e;
        return i18 <= i17 && i17 <= i18 + 81920;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl3.a.f(byte[], int, int):int");
    }

    public final synchronized void g(int i17) {
        this.f354349g = this.f354347e;
        this.f354350h = this.f354348f;
        this.f354347e = i17;
        this.f354348f = 0;
    }

    public int h(byte[] bArr, int i17, int i18) {
        if (bArr == null || i17 < 0 || i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.FileBytesCacheMgr", "write() params is invalid, offset:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return -1;
        }
        if (c() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.FileBytesCacheMgr", "write() fileLength is error, file length is " + c());
            return -1;
        }
        int i19 = i17 + i18;
        long j17 = i19;
        if (j17 > c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.FileBytesCacheMgr", "write() endOffset is error, endOffset:%d, file length:%d", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(c()));
            return -1;
        }
        if (e(i17) && e(i19)) {
            if (!d(i17) || !d(i19)) {
                if (d(i17)) {
                    a(bArr, i17, i18);
                    if (this.f354348f == 81920) {
                        b();
                        g(i19);
                    }
                } else {
                    b();
                    g(i17);
                    a(bArr, i17, i18);
                }
            }
        } else if (e(i17) && !e(i19) && d(i17)) {
            int i27 = 81920 - this.f354348f;
            int i28 = i18 - i27;
            if (i27 > 0) {
                a(bArr, i17, i27);
            }
            b();
            int i29 = i17 + i27;
            g(i29);
            if (i28 > 0) {
                synchronized (this) {
                    int i37 = i29 - this.f354347e;
                    this.f354348f = i37 + i28;
                    java.lang.System.arraycopy(bArr, i27, this.f354346d, i37, i28);
                }
            }
        } else {
            b();
            g(i17);
            a(bArr, i17, i18);
        }
        if (j17 != c()) {
            return 1;
        }
        b();
        g(i19);
        return 1;
    }
}
