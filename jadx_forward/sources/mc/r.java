package mc;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f407074b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f407075c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f407076d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaMuxer f407077e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f407079g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f407080h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f407081i;

    /* renamed from: m, reason: collision with root package name */
    public long f407085m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f407089q;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ArrayBlockingQueue f407073a = new java.util.concurrent.ArrayBlockingQueue(10);

    /* renamed from: f, reason: collision with root package name */
    public int f407078f = -1;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f407082j = false;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f407083k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f407084l = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f407086n = true;

    /* renamed from: o, reason: collision with root package name */
    public int f407087o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f407088p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f407090r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f407091s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f407092t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f407093u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f407094v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f407095w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f407096x = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: y, reason: collision with root package name */
    public int f407097y = 1;

    public r() {
        this.f407089q = true;
        int i17 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
        if (c2920x9dce3f52 == null) {
            return;
        }
        this.f407089q = c2920x9dce3f52.m21858xf9f75f20();
        if (c2920x9dce3f52.m21844xed40851c()) {
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new java.lang.Runnable() { // from class: mc.r$$a
                @Override // java.lang.Runnable
                public final void run() {
                    mc.r.this.getClass();
                    int i18 = ic.d.f371814k;
                    android.content.Context a17 = ic.c.f371813a.a();
                    if (a17 == null) {
                        mc.p.f407064a.e("VideoRecorderManager", "Context is null");
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(a17.getFilesDir());
                    java.lang.String str = java.io.File.separator;
                    sb6.append(str);
                    sb6.append("cloud-huiyan");
                    sb6.append(str);
                    sb6.append("video");
                    java.io.File file = new java.io.File(sb6.toString());
                    if (file.isDirectory()) {
                        java.io.File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            return;
                        }
                        for (java.io.File file2 : listFiles) {
                            file2.delete();
                        }
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                }
            });
        }
    }

    public static java.lang.String a(java.lang.String str) {
        int i17 = ic.d.f371814k;
        android.content.Context a17 = ic.c.f371813a.a();
        if (a17 == null) {
            mc.p.f407064a.e("VideoRecorderManager", "Context is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cloud-huiyan");
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("video");
        sb6.append(str2);
        sb6.append(str);
        java.lang.String str3 = a17.getFilesDir() + str2 + sb6.toString();
        java.io.File file = new java.io.File(str3);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            mc.p.f407064a.e("VideoRecorderManager", "Create parent dir error!");
        }
        if (file.exists() && !file.delete()) {
            mc.p.f407064a.e("VideoRecorderManager", "delete last video error!");
        }
        return str3;
    }

    public static void e(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("max-input-size")) {
            return;
        }
        int integer = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("max-height")) {
            integer = java.lang.Math.max(integer, mediaFormat.getInteger("max-height"));
        }
        int integer2 = mediaFormat.getInteger("width");
        if (mediaFormat.containsKey("max-width")) {
            integer2 = java.lang.Math.max(integer, mediaFormat.getInteger("max-width"));
        }
        mediaFormat.setInteger("max-input-size", ((((((integer + 15) / 16) * ((integer2 + 15) / 16)) * 16) * 16) * 3) / 4);
    }

    public static void h(byte[] bArr, int i17, int i18) {
        int i19 = 0;
        int i27 = 0;
        while (i27 < i18) {
            int i28 = i27 * i17;
            i27++;
            for (int i29 = (i27 * i17) - 1; i28 < i29; i29--) {
                byte b17 = bArr[i28];
                bArr[i28] = bArr[i29];
                bArr[i29] = b17;
                i28++;
            }
        }
        int i37 = i17 * i18;
        while (i19 < i18 / 2) {
            int i38 = i19 * i17;
            i19++;
            for (int i39 = (i19 * i17) - 2; i38 < i39; i39 -= 2) {
                int i47 = i38 + i37;
                byte b18 = bArr[i47];
                int i48 = i39 + i37;
                bArr[i47] = bArr[i48];
                bArr[i48] = b18;
                int i49 = i47 + 1;
                byte b19 = bArr[i49];
                int i57 = i48 + 1;
                bArr[i49] = bArr[i57];
                bArr[i57] = b19;
                i38 += 2;
            }
        }
    }

    public static byte[] j(byte[] bArr, int i17, int i18) {
        pc.b bVar = pc.a.f434733a;
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e c2908x217bf10e = bVar.f434734a;
        byte[] bArr2 = c2908x217bf10e == null ? null : (byte[]) c2908x217bf10e.m21724xba9b60d6();
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        int i27 = 0;
        for (int i28 = i19 - 1; i28 >= 0; i28--) {
            bArr2[i27] = bArr[i28];
            i27++;
        }
        for (int i29 = ((i19 * 3) / 2) - 1; i29 >= i19; i29 -= 2) {
            int i37 = i27 + 1;
            bArr2[i27] = bArr[i29 - 1];
            i27 = i37 + 1;
            bArr2[i37] = bArr[i29];
        }
        bVar.a(bArr);
        return bArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:26|(8:45|30|(2:31|(1:34)(1:33))|35|36|37|38|39)|29|30|(3:31|(0)(0)|33)|35|36|37|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        mc.p.f407064a.e("VideoRecorderManager", "cutMediaMuxer.stop(): " + r4.getLocalizedMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: IOException -> 0x0107, LOOP:1: B:31:0x00b2->B:33:0x00e3, LOOP_END, TryCatch #1 {IOException -> 0x0107, blocks: (B:14:0x0031, B:15:0x0038, B:17:0x003e, B:21:0x0055, B:22:0x0059, B:24:0x006c, B:26:0x0079, B:30:0x00ac, B:31:0x00b2, B:35:0x00b8, B:37:0x00bb, B:38:0x00da, B:42:0x00c0, B:33:0x00e3, B:43:0x00a2, B:47:0x00fa), top: B:13:0x0031, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[EDGE_INSN: B:34:0x00b8->B:35:0x00b8 BREAK  A[LOOP:1: B:31:0x00b2->B:33:0x00e3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(jc.d r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.r.b(jc.d):java.lang.String");
    }

    public final void c(int i17, int i18, int i19) {
        this.f407092t = i17;
        this.f407093u = i18;
        this.f407094v = i17;
        this.f407095w = i18;
        this.f407097y = 1;
        this.f407074b = (i17 / 64) * 64;
        this.f407075c = (this.f407095w / 64) * 64;
        if (5 == i19) {
            this.f407091s = true;
        }
        int i27 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
        if (c2920x9dce3f52 != null && c2920x9dce3f52.m21863x9f3426c9()) {
            this.f407090r = false;
        }
        this.f407094v = i17;
        this.f407095w = i18;
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new java.lang.Runnable() { // from class: mc.r$$d
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0086, code lost:
            
                if (r2 != false) goto L50;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: mc.RunnableC29136x345e32.run():void");
            }
        });
    }

    public final void d(long j17, byte[] bArr) {
        java.nio.ByteBuffer[] inputBuffers = this.f407076d.getInputBuffers();
        java.nio.ByteBuffer[] outputBuffers = this.f407076d.getOutputBuffers();
        int dequeueInputBuffer = this.f407076d.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            java.nio.ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f407076d.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, (java.lang.System.nanoTime() - j17) / 1000, 0);
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.f407076d.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer == -2) {
            int addTrack = this.f407077e.addTrack(this.f407076d.getOutputFormat());
            this.f407078f = addTrack;
            if (addTrack >= 0) {
                this.f407077e.start();
                mc.p.f407064a.b("VideoRecorderManager", "mediaMuxer.start!");
            }
        }
        while (dequeueOutputBuffer > 0) {
            java.nio.ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
            int i17 = this.f407078f;
            if (i17 >= 0) {
                this.f407077e.writeSampleData(i17, byteBuffer2, bufferInfo);
            }
            this.f407076d.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f407076d.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    public final byte[] f(byte[] bArr) {
        int i17 = this.f407097y;
        if (i17 != 1) {
            int i18 = this.f407092t;
            int i19 = this.f407093u;
            if (i17 <= 0) {
                throw new java.lang.IllegalArgumentException("scaleFactor must be positive");
            }
            int i27 = (i19 / i17) * (i18 / i17);
            byte[] bArr2 = new byte[(i27 * 3) / 2];
            int i28 = 0;
            for (int i29 = 0; i29 < i19; i29 += i17) {
                for (int i37 = 0; i37 < i18; i37 += i17) {
                    bArr2[i28] = bArr[(i29 * i18) + i37];
                    i28++;
                }
            }
            int i38 = i18 * i19;
            for (int i39 = 0; i39 < i19 / 2; i39 += i17) {
                for (int i47 = 0; i47 < i18; i47 += i17 * 2) {
                    int i48 = (i39 * i18) + i38 + i47;
                    bArr2[i27] = bArr[i48];
                    bArr2[i27 + 1] = bArr[i48 + 1];
                    i27 += 2;
                }
            }
            bArr = bArr2;
        }
        int i49 = (this.f407095w - this.f407075c) / 2;
        int i57 = (this.f407094v - this.f407074b) / 2;
        int i58 = this.f407094v;
        int i59 = this.f407095w;
        int i66 = this.f407074b;
        int i67 = this.f407075c;
        if (i57 % 2 == 1) {
            i57--;
        }
        if (i49 % 2 == 1) {
            i49--;
        }
        int i68 = i49 + i67;
        int i69 = ((i66 * i67) * 3) / 2;
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e c2908x217bf10e = pc.a.f434733a.f434734a;
        byte[] bArr3 = c2908x217bf10e == null ? null : (byte[]) c2908x217bf10e.m21724xba9b60d6();
        if (bArr3 == null) {
            bArr3 = new byte[i69];
        }
        for (int i76 = i49; i76 < i68; i76++) {
            java.lang.System.arraycopy(bArr, (i76 * i58) + i57, bArr3, (i76 - i49) * i66, i66);
        }
        int i77 = (i49 / 2) + i59;
        int i78 = (i68 / 2) + i59;
        for (int i79 = i77; i79 < i78; i79++) {
            java.lang.System.arraycopy(bArr, (i79 * i58) + i57, bArr3, ((i79 - i77) + i67) * i66, i66);
        }
        return bArr3;
    }

    public final byte[] g(byte[] bArr, int i17, int i18) {
        byte[] bArr2;
        int i19;
        int i27 = this.f407087o;
        pc.b bVar = pc.a.f434733a;
        if (i27 == 19) {
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e c2908x217bf10e = bVar.f434734a;
            bArr2 = c2908x217bf10e != null ? (byte[]) c2908x217bf10e.m21724xba9b60d6() : null;
            if (bArr2 == null) {
                bArr2 = new byte[((i17 * i18) * 3) / 2];
            }
            int i28 = i17 * i18;
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2, 0, i28);
            int i29 = i28 / 4;
            java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr2, i28, i29);
            java.nio.ByteBuffer wrap3 = java.nio.ByteBuffer.wrap(bArr2, i28 + i29, i29);
            wrap.put(bArr, 0, i28);
            while (i28 < bArr.length) {
                wrap3.put(bArr[i28]);
                wrap2.put(bArr[i28 + 1]);
                i28 += 2;
            }
            return bArr2;
        }
        if (i27 != 21) {
            return null;
        }
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e c2908x217bf10e2 = bVar.f434734a;
        bArr2 = c2908x217bf10e2 != null ? (byte[]) c2908x217bf10e2.m21724xba9b60d6() : null;
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i37 = i17 * i18;
        for (int i38 = 0; i38 < i37; i38++) {
            bArr2[i38] = bArr[i38];
        }
        int i39 = 0;
        while (true) {
            i19 = i37 / 2;
            if (i39 >= i19) {
                break;
            }
            int i47 = i37 + i39;
            bArr2[i47 - 1] = bArr[i47];
            i39 += 2;
        }
        for (int i48 = 0; i48 < i19; i48 += 2) {
            int i49 = i37 + i48;
            bArr2[i49] = bArr[i49 - 1];
        }
        return bArr2;
    }

    public final boolean i() {
        return (this.f407089q && this.f407086n && !this.f407088p) ? false : true;
    }

    public final void k() {
        if (i()) {
            mc.p.f407064a.e("VideoRecorderManager", "start thread not need video!");
        } else {
            this.f407085m = java.lang.System.nanoTime();
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new java.lang.Runnable() { // from class: mc.r$$c
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.Object obj;
                    byte[] bArr;
                    mc.r rVar = mc.r.this;
                    rVar.getClass();
                    try {
                        rVar.f407096x.await();
                    } catch (java.lang.InterruptedException e17) {
                        mc.p.f407064a.e("VideoRecorderManager", "countDownLatch.wait(): " + e17.getLocalizedMessage());
                    }
                    while (!rVar.f407082j) {
                        long j17 = rVar.f407085m;
                        if (rVar.f407073a.size() > 0) {
                            byte[] bArr2 = (byte[]) rVar.f407073a.poll();
                            try {
                                try {
                                    bArr = rVar.f(bArr2);
                                    pc.c.f434735a.a(bArr2);
                                } catch (java.lang.Exception e18) {
                                    e = e18;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bArr = bArr2;
                            }
                            try {
                                if (rVar.f407090r) {
                                    mc.r.h(bArr, rVar.f407074b, rVar.f407075c);
                                }
                                byte[] j18 = rVar.f407091s ? mc.r.j(bArr, rVar.f407074b, rVar.f407075c) : bArr;
                                byte[] g17 = rVar.g(j18, rVar.f407074b, rVar.f407075c);
                                if (g17 == null) {
                                    pc.b bVar = pc.a.f434733a;
                                    bVar.a(j18);
                                    if (g17 != null) {
                                        bVar.a(g17);
                                    }
                                    bVar.a(bArr);
                                } else {
                                    rVar.d(j17, g17);
                                    pc.b bVar2 = pc.a.f434733a;
                                    bVar2.a(g17);
                                    bVar2.a(bArr);
                                }
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                bArr2 = bArr;
                                mc.p.f407064a.e("VideoRecorderManager", "record video has some error! " + e.getLocalizedMessage());
                                rVar.f407082j = true;
                                if (0 != 0) {
                                    pc.a.f434733a.a(null);
                                }
                                pc.a.f434733a.a(bArr2);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                if (0 != 0) {
                                    pc.a.f434733a.a(null);
                                }
                                pc.a.f434733a.a(bArr);
                                throw th;
                            }
                        }
                    }
                    synchronized (rVar.f407081i) {
                        try {
                            try {
                                android.media.MediaMuxer mediaMuxer = rVar.f407077e;
                                if (mediaMuxer != null) {
                                    try {
                                        mediaMuxer.stop();
                                    } catch (java.lang.IllegalStateException e27) {
                                        mc.p.f407064a.e("VideoRecorderManager", "mediaMuxer.stop(): " + e27.getLocalizedMessage());
                                    }
                                    rVar.f407077e.release();
                                    rVar.f407077e = null;
                                }
                                android.media.MediaCodec mediaCodec = rVar.f407076d;
                                if (mediaCodec != null) {
                                    mediaCodec.stop();
                                    rVar.f407076d.release();
                                    rVar.f407076d = null;
                                }
                                obj = rVar.f407081i;
                            } catch (java.lang.RuntimeException e28) {
                                mc.p.f407064a.e("VideoRecorderManager", "release media state error! e: " + e28.getLocalizedMessage());
                                obj = rVar.f407081i;
                            }
                            obj.notifyAll();
                            if (rVar.f407083k) {
                                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new pc.e(rVar.f407079g));
                            }
                        } catch (java.lang.Throwable th8) {
                            rVar.f407081i.notifyAll();
                            throw th8;
                        }
                    }
                }
            });
        }
    }
}
