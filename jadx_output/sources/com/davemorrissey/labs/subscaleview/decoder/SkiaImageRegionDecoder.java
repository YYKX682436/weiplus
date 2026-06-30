package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes13.dex */
public class SkiaImageRegionDecoder implements com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder {
    private static final java.lang.String RESOURCE_PREFIX = "android.resource://";
    private byte _hellAccFlag_;
    private final android.graphics.Bitmap.Config bitmapConfig;
    private android.graphics.BitmapRegionDecoder decoder;
    private final java.util.concurrent.locks.ReadWriteLock decoderLock;

    public SkiaImageRegionDecoder() {
        this(null);
    }

    private java.util.concurrent.locks.Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public android.graphics.Bitmap decodeRegion(android.graphics.Rect rect, int i17) {
        getDecodeLock().lock();
        try {
            android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = i17;
            options.inPreferredConfig = this.bitmapConfig;
            android.graphics.BitmapRegionDecoder bitmapRegionDecoder2 = this.decoder;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(rect);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bitmapRegionDecoder2, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeRegion = bitmapRegionDecoder2.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(bitmapRegionDecoder2, decodeRegion, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder", "decodeRegion", "(Landroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new java.lang.RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            getDecodeLock().unlock();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public android.graphics.Point init(android.content.Context context, android.net.Uri uri) {
        int i17;
        if (uri.toString().startsWith(RESOURCE_PREFIX)) {
            java.lang.String authority = uri.getAuthority();
            android.content.res.Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
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
            this.decoder = android.graphics.BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i17), false);
        } else {
            java.io.InputStream D = com.tencent.mm.vfs.w6.D(new com.tencent.mm.vfs.z7(uri), null);
            try {
                this.decoder = android.graphics.BitmapRegionDecoder.newInstance(D, false);
                if (D != null) {
                    D.close();
                }
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
        return new android.graphics.Point(this.decoder.getWidth(), this.decoder.getHeight());
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
        boolean z17;
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
        if (bitmapRegionDecoder != null) {
            z17 = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z17;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            this.decoder.recycle();
            this.decoder = null;
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaImageRegionDecoder(android.graphics.Bitmap.Config config) {
        this.decoderLock = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
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
