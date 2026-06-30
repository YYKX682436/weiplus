package com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44;

/* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder */
/* loaded from: classes13.dex */
public class C1439x81c2b3e0 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 {

    /* renamed from: ASSET_PREFIX */
    private static final java.lang.String f4435xa8fce6e1 = "file:///android_asset/";

    /* renamed from: FILE_PREFIX */
    private static final java.lang.String f4436x9213d2b5 = "file://";

    /* renamed from: MAX_DECODER_NUM */
    private static final java.lang.Integer f4437xcca650;

    /* renamed from: RESOURCE_PREFIX */
    private static final java.lang.String f4438x903e3e3 = "android.resource://";
    private static final java.lang.String TAG = "SkiaPooledImageRegionDecoder";

    /* renamed from: debug */
    private static boolean f4439x5b09653;

    /* renamed from: isUsingZoomOpt */
    private static final boolean f4440x4955af06;

    /* renamed from: _hellAccFlag_ */
    private byte f4441x7f11beae;

    /* renamed from: bitmapConfig */
    private final android.graphics.Bitmap.Config f4442xcfe98151;

    /* renamed from: context */
    private android.content.Context f4443x38b735af;

    /* renamed from: decoderLock */
    private final java.util.concurrent.locks.ReadWriteLock f4444x481c238f;

    /* renamed from: decoderPool */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool f4445x481df680;

    /* renamed from: fileLength */
    private long f4446x5e9c0f82;

    /* renamed from: imageDimensions */
    private android.graphics.Point f4447xcc4b0f88;

    /* renamed from: lazyInited */
    private final java.util.concurrent.atomic.AtomicBoolean f4448x41dc8643;
    private android.net.Uri uri;

    /* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$DecoderPool */
    /* loaded from: classes13.dex */
    public static class DecoderPool {

        /* renamed from: available */
        private final java.util.concurrent.Semaphore f4451xd4418ac9;

        /* renamed from: decoders */
        private java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> f4452x2205dcaf;

        private DecoderPool() {
            this.f4451xd4418ac9 = new java.util.concurrent.Semaphore(0, true);
            this.f4452x2205dcaf = new java.util.concurrent.ConcurrentHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: acquire */
        public android.graphics.BitmapRegionDecoder m15494xba9b60d6() {
            this.f4451xd4418ac9.acquireUninterruptibly();
            return m15495xaf17d60();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void add(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            this.f4452x2205dcaf.put(bitmapRegionDecoder, java.lang.Boolean.FALSE);
            this.f4451xd4418ac9.release();
        }

        /* renamed from: getNextAvailable */
        private synchronized android.graphics.BitmapRegionDecoder m15495xaf17d60() {
            for (java.util.Map.Entry<android.graphics.BitmapRegionDecoder, java.lang.Boolean> entry : this.f4452x2205dcaf.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    entry.setValue(java.lang.Boolean.TRUE);
                    return entry.getKey();
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: isEmpty */
        public synchronized boolean m15496x7aab3243() {
            return this.f4452x2205dcaf.isEmpty();
        }

        /* renamed from: markAsUnused */
        private synchronized boolean m15497x2d83de95(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            for (java.util.Map.Entry<android.graphics.BitmapRegionDecoder, java.lang.Boolean> entry : this.f4452x2205dcaf.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!entry.getValue().booleanValue()) {
                        return false;
                    }
                    entry.setValue(java.lang.Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: recycle */
        public synchronized void m15498x408b7293() {
            while (!this.f4452x2205dcaf.isEmpty()) {
                android.graphics.BitmapRegionDecoder m15494xba9b60d6 = m15494xba9b60d6();
                m15494xba9b60d6.recycle();
                this.f4452x2205dcaf.remove(m15494xba9b60d6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: release */
        public void m15499x41012807(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            if (m15497x2d83de95(bitmapRegionDecoder)) {
                this.f4451xd4418ac9.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: size */
        public synchronized int m15500x35e001() {
            return this.f4452x2205dcaf.size();
        }
    }

    static {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20016x12512b93()) == 1;
        f4440x4955af06 = z17;
        f4437xcca650 = java.lang.Integer.valueOf(z17 ? 8 : 4);
        f4439x5b09653 = false;
    }

    public C1439x81c2b3e0() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: debug */
    public void m15480x5b09653(java.lang.String str) {
    }

    /* renamed from: getNumCoresOldPhones */
    private int m15481x92f5d3e8() {
        try {
            return new java.io.File("/sys/devices/system/cpu/").listFiles(new java.io.FileFilter() { // from class: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file) {
                    return java.util.regex.Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    /* renamed from: getNumberOfCores */
    private int m15482x6d9f39de() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initialiseDecoder */
    public void m15483x4c3c4d8d() {
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder;
        com.p314xaae8f345.mm.vfs.x1 m17;
        int i17;
        boolean equals = f4438x903e3e3.equals(this.uri.getScheme());
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        if (equals) {
            java.lang.String authority = this.uri.getAuthority();
            android.content.res.Resources resources = this.f4443x38b735af.getPackageName().equals(authority) ? this.f4443x38b735af.getResources() : this.f4443x38b735af.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = this.uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i17 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && android.text.TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(pathSegments.get(0), 0);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                i17 = 0;
            }
            try {
                j17 = this.f4443x38b735af.getResources().openRawResourceFd(i17).getLength();
            } catch (java.lang.Exception unused2) {
            }
            bitmapRegionDecoder = android.graphics.BitmapRegionDecoder.newInstance(this.f4443x38b735af.getResources().openRawResource(i17), false);
        } else {
            com.p314xaae8f345.mm.vfs.z7 z7Var = new com.p314xaae8f345.mm.vfs.z7(this.uri);
            java.lang.String str = z7Var.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, l17, z7Var.f294813g, z7Var.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            long j18 = (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L;
            if (j18 != 0) {
                j17 = j18;
            }
            java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(new com.p314xaae8f345.mm.vfs.z7(this.uri), null);
            try {
                android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(D, false);
                if (D != null) {
                    D.close();
                }
                bitmapRegionDecoder = newInstance;
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        this.f4446x5e9c0f82 = j17;
        this.f4447xcc4b0f88.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.f4444x481c238f.writeLock().lock();
        try {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool decoderPool = this.f4445x481df680;
            if (decoderPool != null) {
                decoderPool.add(bitmapRegionDecoder);
            }
        } finally {
            this.f4444x481c238f.writeLock().unlock();
        }
    }

    /* renamed from: isLowMemory */
    private boolean m15484xfdebbf6b() {
        android.app.ActivityManager activityManager;
        android.content.Context context = this.f4443x38b735af;
        if (context == null || (activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)) == null) {
            return true;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* renamed from: lazyInit */
    private void m15485xb53692a4() {
        if (!this.f4448x41dc8643.compareAndSet(false, true) || this.f4446x5e9c0f82 >= com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return;
        }
        m15480x5b09653("Starting lazy newInstance of additional decoders");
        new java.lang.Thread() { // from class: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.f4445x481df680 != null) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0 c1439x81c2b3e0 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this;
                    if (!c1439x81c2b3e0.m15487x65fc99d4(c1439x81c2b3e0.f4445x481df680.m15500x35e001(), com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.f4446x5e9c0f82)) {
                        return;
                    }
                    try {
                        if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.f4445x481df680 != null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.m15480x5b09653("Starting decoder");
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.m15483x4c3c4d8d();
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.m15480x5b09653("Started decoder, took " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                        }
                    } catch (java.lang.Exception e17) {
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.this.m15480x5b09653("Failed to start decoder: " + e17.getMessage());
                    }
                }
            }
        }.start();
    }

    /* renamed from: setDebug */
    public static void m15486x52dc5711(boolean z17) {
        f4439x5b09653 = z17;
    }

    /* renamed from: allowAdditionalDecoder */
    public boolean m15487x65fc99d4(int i17, long j17) {
        java.lang.Integer num = f4437xcca650;
        if (i17 >= num.intValue()) {
            m15480x5b09653("No additional decoders allowed, reached hard limit (" + num + ")");
            return false;
        }
        if (!f4440x4955af06 && i17 * j17 > 20971520) {
            m15480x5b09653("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if (i17 >= m15482x6d9f39de()) {
            m15480x5b09653("No additional encoders allowed, limited by CPU cores (" + m15482x6d9f39de() + ")");
            return false;
        }
        if (m15484xfdebbf6b()) {
            m15480x5b09653("No additional encoders allowed, memory is low");
            return false;
        }
        m15480x5b09653("Additional decoder allowed, current count is " + i17 + ", estimated native memory " + ((j17 * i17) / 1048576) + "Mb");
        return true;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: decodeRegion */
    public android.graphics.Bitmap mo15470x8629fa82(android.graphics.Rect rect, int i17) {
        m15480x5b09653("Decode region " + rect + " on thread " + java.lang.Thread.currentThread().getName());
        if (rect.width() < this.f4447xcc4b0f88.x || rect.height() < this.f4447xcc4b0f88.y) {
            m15485xb53692a4();
        }
        this.f4444x481c238f.readLock().lock();
        try {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool decoderPool = this.f4445x481df680;
            if (decoderPool != null) {
                android.graphics.BitmapRegionDecoder m15494xba9b60d6 = decoderPool.m15494xba9b60d6();
                if (m15494xba9b60d6 != null) {
                    try {
                        if (!m15494xba9b60d6.isRecycled()) {
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inSampleSize = i17;
                            options.inPreferredConfig = this.f4442xcfe98151;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(options);
                            arrayList.add(rect);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(m15494xba9b60d6, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap decodeRegion = m15494xba9b60d6.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
                            yj0.a.e(m15494xba9b60d6, decodeRegion, "com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new java.lang.RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        this.f4445x481df680.m15499x41012807(m15494xba9b60d6);
                    }
                }
                if (m15494xba9b60d6 != null) {
                }
            }
            throw new java.lang.IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            this.f4444x481c238f.readLock().unlock();
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: init */
    public android.graphics.Point mo15471x316510(android.content.Context context, android.net.Uri uri) {
        this.f4443x38b735af = context;
        this.uri = uri;
        m15483x4c3c4d8d();
        return this.f4447xcc4b0f88;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: isReady */
    public synchronized boolean mo15472x7b5e8699() {
        boolean z17;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool decoderPool = this.f4445x481df680;
        if (decoderPool != null) {
            z17 = decoderPool.m15496x7aab3243() ? false : true;
        }
        return z17;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: recycle */
    public synchronized void mo15473x408b7293() {
        this.f4444x481c238f.writeLock().lock();
        try {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool decoderPool = this.f4445x481df680;
            if (decoderPool != null) {
                decoderPool.m15498x408b7293();
                this.f4445x481df680 = null;
                this.f4443x38b735af = null;
                this.uri = null;
            }
        } finally {
            this.f4444x481c238f.writeLock().unlock();
        }
    }

    public C1439x81c2b3e0(android.graphics.Bitmap.Config config) {
        this.f4445x481df680 = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.DecoderPool();
        this.f4444x481c238f = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        this.f4446x5e9c0f82 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f4447xcc4b0f88 = new android.graphics.Point(0, 0);
        this.f4448x41dc8643 = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.graphics.Bitmap.Config m15597x9613fabc = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15597x9613fabc();
        if (config != null) {
            this.f4442xcfe98151 = config;
        } else if (m15597x9613fabc != null) {
            this.f4442xcfe98151 = m15597x9613fabc;
        } else {
            this.f4442xcfe98151 = android.graphics.Bitmap.Config.RGB_565;
        }
    }
}
