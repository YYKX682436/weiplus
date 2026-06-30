package com.p314xaae8f345.tav.p2968xc84c5534;

/* renamed from: com.tencent.tav.report.AudioBufferPrintHelper */
/* loaded from: classes13.dex */
public class C25853x6d35db45 {

    /* renamed from: CLEAR_MODE */
    public static final boolean f48766xf2fc0075 = false;

    /* renamed from: ENABLE */
    public static final boolean f48767x7a281983 = false;

    /* renamed from: SDCARD_TAVKIT_DEMO_INFO */
    public static final java.lang.String f48768xccc3df6 = "/sdcard/tavkit_demo/info/";
    private static final java.lang.String TAG = "DebugUtils";

    /* renamed from: waitMs */
    private long f48775xd09911fb;

    /* renamed from: startTimeMs */
    private long f48774x91dc3c55 = 0;

    /* renamed from: startName */
    private java.lang.String f48773x8112b20d = "";

    /* renamed from: enable */
    private boolean f48769xb2952583 = false;

    /* renamed from: maxPrintCount */
    private int f48771xc0d966e6 = 0;

    /* renamed from: startIndex */
    private long f48772xa102e190 = 0;

    /* renamed from: list */
    private java.util.List<java.lang.String> f48770x32b09e = new java.util.ArrayList();

    /* renamed from: com.tencent.tav.report.AudioBufferPrintHelper$Instance */
    /* loaded from: classes13.dex */
    public static class Instance {

        /* renamed from: INSTANCE */
        private static com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45 f48776x4fbc8495 = new com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45();

        private Instance() {
        }
    }

    /* renamed from: clearFiles */
    public static void m98280xd2ecfc2a() {
    }

    /* renamed from: clone */
    public static java.nio.ByteBuffer m98281x5a5dd5d(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    /* renamed from: createNewFile */
    public static java.io.File m98283xf3dc66a0(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str2);
        try {
            file2.delete();
            if (file2.createNewFile()) {
                return file2;
            }
            file2.getAbsolutePath();
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: deleteAllFiles */
    private static void m98284xef6c3c21(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                m98284xef6c3c21(file2);
                file2.delete();
            } else if (file2.exists()) {
                m98284xef6c3c21(file2);
                file2.delete();
            }
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45 m98285x9cf0d20b() {
        return com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45.Instance.f48776x4fbc8495;
    }

    /* renamed from: initFlag */
    private void m98286xff9d09c(int i17) {
        if (this.f48774x91dc3c55 == 0) {
            this.f48774x91dc3c55 = java.lang.System.currentTimeMillis();
            this.f48773x8112b20d = new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date(this.f48774x91dc3c55));
        }
        if (this.f48771xc0d966e6 == 0) {
            this.f48771xc0d966e6 = i17;
        }
    }

    /* renamed from: reset */
    public static void m98287x6761d4f() {
        com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45 unused = com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45.Instance.f48776x4fbc8495 = new com.p314xaae8f345.tav.p2968xc84c5534.C25853x6d35db45();
    }

    /* renamed from: printByteBuffer */
    public void m98288xf5dbd5f5(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
    }

    /* renamed from: startDelay */
    public void m98291xa0b87241(long j17) {
        m98292xa0b87241(j17, 100);
    }

    /* renamed from: startIgnoreBegin */
    public void m98293x11531035(int i17) {
        m98294x11531035(i17, 100);
    }

    /* renamed from: printByteBuffer */
    public void m98289xf5dbd5f5(java.lang.String str, java.nio.ShortBuffer shortBuffer) {
    }

    /* renamed from: startDelay */
    public void m98292xa0b87241(long j17, int i17) {
        m98286xff9d09c(i17);
        boolean z17 = java.lang.System.currentTimeMillis() >= this.f48774x91dc3c55 + j17;
        this.f48769xb2952583 = z17;
        if (z17) {
            int i18 = this.f48771xc0d966e6;
            this.f48771xc0d966e6 = i18 - 1;
            if (i18 < 0) {
                this.f48769xb2952583 = false;
            }
        }
    }

    /* renamed from: startIgnoreBegin */
    public void m98294x11531035(int i17, int i18) {
        m98286xff9d09c(i18);
        long j17 = this.f48772xa102e190;
        this.f48772xa102e190 = 1 + j17;
        if (j17 > i17) {
            this.f48769xb2952583 = true;
        }
        if (this.f48769xb2952583) {
            int i19 = this.f48771xc0d966e6;
            this.f48771xc0d966e6 = i19 - 1;
            if (i19 < 0) {
                this.f48769xb2952583 = false;
            }
        }
    }

    /* renamed from: printByteBuffer */
    public void m98290xf5dbd5f5(java.lang.String str, short[] sArr) {
    }

    /* renamed from: clone */
    public static java.nio.ShortBuffer m98282x5a5dd5d(java.nio.ShortBuffer shortBuffer) {
        java.nio.ShortBuffer allocate = java.nio.ShortBuffer.allocate(shortBuffer.capacity());
        shortBuffer.rewind();
        allocate.put(shortBuffer);
        shortBuffer.rewind();
        allocate.flip();
        return allocate;
    }
}
