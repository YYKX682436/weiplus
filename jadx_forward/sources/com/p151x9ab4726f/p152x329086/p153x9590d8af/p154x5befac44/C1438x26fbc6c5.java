package com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44;

/* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder */
/* loaded from: classes13.dex */
public class C1438x26fbc6c5 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 {

    /* renamed from: RESOURCE_PREFIX */
    private static final java.lang.String f4430x903e3e3 = "android.resource://";

    /* renamed from: _hellAccFlag_ */
    private byte f4431x7f11beae;

    /* renamed from: bitmapConfig */
    private final android.graphics.Bitmap.Config f4432xcfe98151;

    /* renamed from: decoder */
    private android.graphics.BitmapRegionDecoder f4433x5befac44;

    /* renamed from: decoderLock */
    private final java.util.concurrent.locks.ReadWriteLock f4434x481c238f;

    public C1438x26fbc6c5() {
        this(null);
    }

    /* renamed from: getDecodeLock */
    private java.util.concurrent.locks.Lock m15474xa630dc2f() {
        return this.f4434x481c238f.readLock();
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: decodeRegion */
    public android.graphics.Bitmap mo15470x8629fa82(android.graphics.Rect rect, int i17) {
        m15474xa630dc2f().lock();
        try {
            android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.f4433x5befac44;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = i17;
            options.inPreferredConfig = this.f4432xcfe98151;
            android.graphics.BitmapRegionDecoder bitmapRegionDecoder2 = this.f4433x5befac44;
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
            m15474xa630dc2f().unlock();
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: init */
    public android.graphics.Point mo15471x316510(android.content.Context context, android.net.Uri uri) {
        int i17;
        if (uri.toString().startsWith(f4430x903e3e3)) {
            java.lang.String authority = uri.getAuthority();
            android.content.res.Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
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
            this.f4433x5befac44 = android.graphics.BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i17), false);
        } else {
            java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(new com.p314xaae8f345.mm.vfs.z7(uri), null);
            try {
                this.f4433x5befac44 = android.graphics.BitmapRegionDecoder.newInstance(D, false);
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
        return new android.graphics.Point(this.f4433x5befac44.getWidth(), this.f4433x5befac44.getHeight());
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: isReady */
    public synchronized boolean mo15472x7b5e8699() {
        boolean z17;
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.f4433x5befac44;
        if (bitmapRegionDecoder != null) {
            z17 = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z17;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135
    /* renamed from: recycle */
    public synchronized void mo15473x408b7293() {
        this.f4434x481c238f.writeLock().lock();
        try {
            this.f4433x5befac44.recycle();
            this.f4433x5befac44 = null;
        } finally {
            this.f4434x481c238f.writeLock().unlock();
        }
    }

    public C1438x26fbc6c5(android.graphics.Bitmap.Config config) {
        this.f4434x481c238f = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        android.graphics.Bitmap.Config m15597x9613fabc = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15597x9613fabc();
        if (config != null) {
            this.f4432xcfe98151 = config;
        } else if (m15597x9613fabc != null) {
            this.f4432xcfe98151 = m15597x9613fabc;
        } else {
            this.f4432xcfe98151 = android.graphics.Bitmap.Config.RGB_565;
        }
    }
}
