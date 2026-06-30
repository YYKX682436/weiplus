package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes13.dex */
public class SkiaPooledImageRegionDecoder implements com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder {
    private static final java.lang.String ASSET_PREFIX = "file:///android_asset/";
    private static final java.lang.String FILE_PREFIX = "file://";
    private static final java.lang.Integer MAX_DECODER_NUM;
    private static final java.lang.String RESOURCE_PREFIX = "android.resource://";
    private static final java.lang.String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private static final boolean isUsingZoomOpt;
    private byte _hellAccFlag_;
    private final android.graphics.Bitmap.Config bitmapConfig;
    private android.content.Context context;
    private final java.util.concurrent.locks.ReadWriteLock decoderLock;
    private com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool decoderPool;
    private long fileLength;
    private android.graphics.Point imageDimensions;
    private final java.util.concurrent.atomic.AtomicBoolean lazyInited;
    private android.net.Uri uri;

    /* loaded from: classes13.dex */
    public static class DecoderPool {
        private final java.util.concurrent.Semaphore available;
        private java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> decoders;

        private DecoderPool() {
            this.available = new java.util.concurrent.Semaphore(0, true);
            this.decoders = new java.util.concurrent.ConcurrentHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public android.graphics.BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return getNextAvailable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void add(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            this.decoders.put(bitmapRegionDecoder, java.lang.Boolean.FALSE);
            this.available.release();
        }

        private synchronized android.graphics.BitmapRegionDecoder getNextAvailable() {
            for (java.util.Map.Entry<android.graphics.BitmapRegionDecoder, java.lang.Boolean> entry : this.decoders.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    entry.setValue(java.lang.Boolean.TRUE);
                    return entry.getKey();
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isEmpty() {
            return this.decoders.isEmpty();
        }

        private synchronized boolean markAsUnused(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            for (java.util.Map.Entry<android.graphics.BitmapRegionDecoder, java.lang.Boolean> entry : this.decoders.entrySet()) {
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
        public synchronized void recycle() {
            while (!this.decoders.isEmpty()) {
                android.graphics.BitmapRegionDecoder acquire = acquire();
                acquire.recycle();
                this.decoders.remove(acquire);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release(android.graphics.BitmapRegionDecoder bitmapRegionDecoder) {
            if (markAsUnused(bitmapRegionDecoder)) {
                this.available.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized int size() {
            return this.decoders.size();
        }
    }

    static {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigImageGalleryZoomOptimization()) == 1;
        isUsingZoomOpt = z17;
        MAX_DECODER_NUM = java.lang.Integer.valueOf(z17 ? 8 : 4);
        debug = false;
    }

    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debug(java.lang.String str) {
    }

    private int getNumCoresOldPhones() {
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

    private int getNumberOfCores() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialiseDecoder() {
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder;
        com.tencent.mm.vfs.x1 m17;
        int i17;
        boolean equals = RESOURCE_PREFIX.equals(this.uri.getScheme());
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        if (equals) {
            java.lang.String authority = this.uri.getAuthority();
            android.content.res.Resources resources = this.context.getPackageName().equals(authority) ? this.context.getResources() : this.context.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = this.uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i17 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && android.text.TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i17 = com.tencent.mm.sdk.platformtools.t8.P(pathSegments.get(0), 0);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                i17 = 0;
            }
            try {
                j17 = this.context.getResources().openRawResourceFd(i17).getLength();
            } catch (java.lang.Exception unused2) {
            }
            bitmapRegionDecoder = android.graphics.BitmapRegionDecoder.newInstance(this.context.getResources().openRawResource(i17), false);
        } else {
            com.tencent.mm.vfs.z7 z7Var = new com.tencent.mm.vfs.z7(this.uri);
            java.lang.String str = z7Var.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, l17, z7Var.f213280g, z7Var.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            long j18 = (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L;
            if (j18 != 0) {
                j17 = j18;
            }
            java.io.InputStream D = com.tencent.mm.vfs.w6.D(new com.tencent.mm.vfs.z7(this.uri), null);
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
        this.fileLength = j17;
        this.imageDimensions.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.decoderLock.writeLock().lock();
        try {
            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                decoderPool.add(bitmapRegionDecoder);
            }
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    private boolean isLowMemory() {
        android.app.ActivityManager activityManager;
        android.content.Context context = this.context;
        if (context == null || (activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)) == null) {
            return true;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private void lazyInit() {
        if (!this.lazyInited.compareAndSet(false, true) || this.fileLength >= com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return;
        }
        debug("Starting lazy newInstance of additional decoders");
        new java.lang.Thread() { // from class: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                    com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this;
                    if (!skiaPooledImageRegionDecoder.allowAdditionalDecoder(skiaPooledImageRegionDecoder.decoderPool.size(), com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.fileLength)) {
                        return;
                    }
                    try {
                        if (com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.debug("Starting decoder");
                            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.initialiseDecoder();
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.debug("Started decoder, took " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                        }
                    } catch (java.lang.Exception e17) {
                        com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.this.debug("Failed to start decoder: " + e17.getMessage());
                    }
                }
            }
        }.start();
    }

    public static void setDebug(boolean z17) {
        debug = z17;
    }

    public boolean allowAdditionalDecoder(int i17, long j17) {
        java.lang.Integer num = MAX_DECODER_NUM;
        if (i17 >= num.intValue()) {
            debug("No additional decoders allowed, reached hard limit (" + num + ")");
            return false;
        }
        if (!isUsingZoomOpt && i17 * j17 > 20971520) {
            debug("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if (i17 >= getNumberOfCores()) {
            debug("No additional encoders allowed, limited by CPU cores (" + getNumberOfCores() + ")");
            return false;
        }
        if (isLowMemory()) {
            debug("No additional encoders allowed, memory is low");
            return false;
        }
        debug("Additional decoder allowed, current count is " + i17 + ", estimated native memory " + ((j17 * i17) / 1048576) + "Mb");
        return true;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public android.graphics.Bitmap decodeRegion(android.graphics.Rect rect, int i17) {
        debug("Decode region " + rect + " on thread " + java.lang.Thread.currentThread().getName());
        if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
            lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                android.graphics.BitmapRegionDecoder acquire = decoderPool.acquire();
                if (acquire != null) {
                    try {
                        if (!acquire.isRecycled()) {
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inSampleSize = i17;
                            options.inPreferredConfig = this.bitmapConfig;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(options);
                            arrayList.add(rect);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(acquire, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap decodeRegion = acquire.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
                            yj0.a.e(acquire, decodeRegion, "com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new java.lang.RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        this.decoderPool.release(acquire);
                    }
                }
                if (acquire != null) {
                }
            }
            throw new java.lang.IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            this.decoderLock.readLock().unlock();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public android.graphics.Point init(android.content.Context context, android.net.Uri uri) {
        this.context = context;
        this.uri = uri;
        initialiseDecoder();
        return this.imageDimensions;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
        boolean z17;
        com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool decoderPool = this.decoderPool;
        if (decoderPool != null) {
            z17 = decoderPool.isEmpty() ? false : true;
        }
        return z17;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                decoderPool.recycle();
                this.decoderPool = null;
                this.context = null;
                this.uri = null;
            }
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaPooledImageRegionDecoder(android.graphics.Bitmap.Config config) {
        this.decoderPool = new com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.DecoderPool();
        this.decoderLock = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        this.fileLength = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.imageDimensions = new android.graphics.Point(0, 0);
        this.lazyInited = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.graphics.Bitmap.Config preferredBitmapConfig = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = android.graphics.Bitmap.Config.RGB_565;
        }
    }
}
