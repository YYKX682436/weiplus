package com.github.henryye.nativeiv;

/* loaded from: classes7.dex */
public class BaseImageDecodeService implements com.github.henryye.nativeiv.api.IImageDecodeService {
    private static final java.lang.String TAG = "BaseImageDecodeService";
    private h8.c mFallbackImageStreamFetcher;
    private final h8.a mHttpImageStreamFetcher;
    private java.util.LinkedList<h8.c> mImageStreamFetcherList;
    private boolean mIsTrackInitImages = false;
    private e8.b mDecodeSlave = null;
    private final java.util.List<e8.d> mDecodeEventListeners = new java.util.LinkedList();
    private final e8.d mCompactDecodeEventListener = new d8.b(this, null);

    public BaseImageDecodeService() {
        h8.a aVar = new h8.a();
        this.mHttpImageStreamFetcher = aVar;
        this.mImageStreamFetcherList = new java.util.LinkedList<>();
        addImageStreamFetcher(aVar, false);
        setBitmapDecodeSlave(new d8.e());
    }

    private android.graphics.Bitmap.CompressFormat ensureCompressFormat(java.lang.String str) {
        if ("image/webp".equals(str)) {
            return android.graphics.Bitmap.CompressFormat.WEBP;
        }
        if (!"image/jpeg".equals(str) && !"image/jpg".equals(str)) {
            return android.graphics.Bitmap.CompressFormat.PNG;
        }
        return android.graphics.Bitmap.CompressFormat.JPEG;
    }

    private int ensureQuality(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            f17 = 0.92f;
        }
        return (int) (f17 * 100.0f);
    }

    private void runInThreadPool(java.lang.Object obj, java.lang.Runnable runnable) {
        if (this.mHttpImageStreamFetcher.accept(obj)) {
            ((java.util.concurrent.ThreadPoolExecutor) d8.o.INSTANCE.f226914d).execute(runnable);
        } else {
            ((java.util.concurrent.ThreadPoolExecutor) d8.o.INSTANCE.f226915e).execute(runnable);
        }
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void addDecodeEventListener(e8.d dVar) {
        this.mDecodeEventListeners.add(dVar);
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void addImageStreamFetcher(h8.c cVar, boolean z17) {
        g8.g.b(TAG, "hy: %d adding stream fetcher: %s %b", java.lang.Integer.valueOf(hashCode()), cVar.getClass().getSimpleName(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.mFallbackImageStreamFetcher = cVar;
        } else {
            this.mImageStreamFetcherList.push(cVar);
        }
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public java.lang.String encodeToBase64(android.graphics.Bitmap bitmap, int i17, float f17) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && !bitmap.isRecycled()) {
            android.graphics.Bitmap.CompressFormat ensureCompressFormat = ensureCompressFormat(i17);
            int ensureQuality = ensureQuality(f17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            boolean compress = bitmap.compress(ensureCompressFormat, ensureQuality, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e17) {
                g8.g.a(TAG, "base64_encode IOException e %s", e17.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            g8.g.a(TAG, "base64_encode Bitmap compress error.", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public byte[] encodeToBuffer(android.graphics.Bitmap bitmap, int i17, float f17) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && !bitmap.isRecycled()) {
            android.graphics.Bitmap.CompressFormat ensureCompressFormat = ensureCompressFormat(i17);
            int ensureQuality = ensureQuality(f17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            boolean compress = bitmap.compress(ensureCompressFormat, ensureQuality, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e17) {
                g8.g.a(TAG, "encodeToBuffer IOException e %s", e17.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return byteArrayOutputStream.toByteArray();
            }
            g8.g.a(TAG, "encodeToBuffer Bitmap compress error.", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void forceSetUseType(com.github.henryye.nativeiv.bitmap.BitmapType bitmapType) {
        ((d8.e) this.mDecodeSlave).f226900d = bitmapType;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public android.graphics.Bitmap getBitmap(int i17, int i18) {
        d8.s sVar;
        if (d8.s.f226916b == null) {
            synchronized (d8.s.class) {
                if (d8.s.f226916b == null) {
                    d8.s.f226916b = new d8.s();
                }
                sVar = d8.s.f226916b;
            }
        } else {
            sVar = d8.s.f226916b;
        }
        ((d8.q) sVar.f226917a).getClass();
        g8.g.b("MiroMsg.MBBitmapPool", "hy: dummy getTask", new java.lang.Object[0]);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/github/henryye/nativeiv/MBBitmapPool$DefaultBitmapPoolInstance", "get", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/github/henryye/nativeiv/MBBitmapPool$DefaultBitmapPoolInstance", "get", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void init() {
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void loadBitmapAsync(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        loadBitmapAsync(str, new com.github.henryye.nativeiv.ImageDecodeConfig());
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        h8.c cVar;
        h8.b b17;
        com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig2 = imageDecodeConfig == null ? new com.github.henryye.nativeiv.ImageDecodeConfig() : imageDecodeConfig;
        java.util.Iterator<h8.c> it = this.mImageStreamFetcherList.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.accept(obj)) {
                break;
            }
        }
        if (cVar == null) {
            cVar = this.mFallbackImageStreamFetcher;
        }
        h8.c cVar2 = cVar;
        if (cVar2 == null) {
            g8.g.a(TAG, "No fit image stream fetcher found for %s", obj.toString());
            return null;
        }
        e8.b bVar = this.mDecodeSlave;
        if (bVar != null) {
            d8.e eVar = (d8.e) bVar;
            if (!eVar.f226902f) {
                java.lang.String obj2 = obj.toString();
                e8.a aVar = new e8.a();
                int i17 = eVar.f226897a;
                aVar.f249984d = eVar.f226898b;
                aVar.f249983c = i17;
                aVar.f249987g = cVar2.a();
                try {
                    b17 = cVar2.b(obj, imageDecodeConfig2);
                } catch (java.lang.Exception e17) {
                    eVar.f226901e.a(obj2, e8.c.THROW_EXCEPTION, aVar);
                    g8.g.c("DefaultBitmapDecoder", e17, "ImageDecoder(%s) decode path[%s]", cVar2, obj.toString());
                }
                if (b17.f279511a != null && android.text.TextUtils.isEmpty(b17.f279512b)) {
                    java.io.InputStream inputStream = b17.f279511a;
                    d8.l a17 = eVar.a(eVar.f226899c, aVar);
                    a17.f226906a = eVar.f226900d;
                    a17.f226908c = eVar.f226901e;
                    com.github.henryye.nativeiv.bitmap.IBitmap iBitmap = a17.f226907b;
                    if (iBitmap != null) {
                        iBitmap.recycle();
                    }
                    f8.d a18 = inputStream != null ? a17.a(inputStream) : null;
                    if (a18 == null) {
                        eVar.f226901e.a(obj2, e8.c.PRE_DECODE_ERROR, aVar);
                        return null;
                    }
                    long j17 = a18.f260073b;
                    aVar.f249986f = j17;
                    long j18 = a18.f260074c;
                    aVar.f249985e = j18;
                    if (a18.f260072a == f8.c.UNKNOWN) {
                        eVar.f226901e.a(obj2, e8.c.UNSUPPORTED_IMG_FORMAT, aVar);
                    } else {
                        if (j17 <= eVar.f226897a && j18 <= eVar.f226898b) {
                            eVar.b(a17, obj2, inputStream, imageDecodeConfig2, a18);
                            return a17.f226907b;
                        }
                        eVar.f226901e.a(obj2, e8.c.HUGE_SIZE, aVar);
                        a17.f226907b.recycle();
                    }
                    return null;
                }
                aVar.f249988h = b17.f279512b;
                eVar.f226901e.a(obj2, e8.c.NOT_EXIST, aVar);
                return null;
            }
        }
        g8.g.f269409a.w(TAG, "BitmapDecodeSlave destroyed", new java.lang.Object[0]);
        return null;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void release() {
        e8.b bVar = this.mDecodeSlave;
        if (bVar != null) {
            d8.e eVar = (d8.e) bVar;
            eVar.f226902f = true;
            d8.i iVar = eVar.f226899c;
            int i17 = 0;
            while (true) {
                android.util.SparseArray sparseArray = iVar.f226904b;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                java.util.Map map = (java.util.Map) sparseArray.get(sparseArray.keyAt(i17));
                if (map != null) {
                    java.util.Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((f8.b) it.next()).destroy();
                    }
                }
                i17++;
            }
            java.util.Map map2 = iVar.f226903a;
            if (map2 != null) {
                java.util.Iterator it6 = ((java.util.HashMap) map2).values().iterator();
                while (it6.hasNext()) {
                    ((f8.b) it6.next()).destroy();
                }
            }
            this.mDecodeSlave = null;
        }
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void releaseBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        g8.g.b(TAG, "recycle because releaseBitmap", new java.lang.Object[0]);
        bitmap.recycle();
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void removeDecodeEventListener(e8.d dVar) {
        this.mDecodeEventListeners.remove(dVar);
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void removeImageStreamFetcher(h8.c cVar, boolean z17) {
        g8.g.b(TAG, "hy: %d removing stream fetcher: %s %b", java.lang.Integer.valueOf(hashCode()), cVar.getClass().getSimpleName(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.mFallbackImageStreamFetcher = null;
        } else {
            this.mImageStreamFetcherList.remove(cVar);
        }
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void setBitmapDecodeSlave(e8.b bVar) {
        this.mDecodeSlave = bVar;
        ((d8.e) bVar).f226901e = this.mCompactDecodeEventListener;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void setIdKeyReportDelegate(g8.h hVar) {
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void setKvReportDelegate(g8.i iVar) {
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void setMaxDecodeDimension(int i17, int i18) {
        d8.e eVar = (d8.e) this.mDecodeSlave;
        eVar.f226897a = i17;
        eVar.f226898b = i18;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void setNetworkTimeout(int i17, int i18) {
        h8.a aVar = this.mHttpImageStreamFetcher;
        aVar.getClass();
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        aVar.f279509a = i17;
        aVar.f279510b = i18;
        g8.g.b("NativeImageHttpFetcher", "Http Timeout Set: connection[%d] read[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void loadBitmapAsync(java.lang.String str, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        loadBitmapAsync((java.lang.Object) str, imageDecodeConfig);
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public void loadBitmapAsync(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        if (imageDecodeConfig == null) {
            imageDecodeConfig = new com.github.henryye.nativeiv.ImageDecodeConfig();
        }
        runInThreadPool(obj, new d8.d(this, obj, imageDecodeConfig));
    }

    private android.graphics.Bitmap.CompressFormat ensureCompressFormat(int i17) {
        if (i17 == 1) {
            return android.graphics.Bitmap.CompressFormat.WEBP;
        }
        if (i17 != 2) {
            return android.graphics.Bitmap.CompressFormat.PNG;
        }
        return android.graphics.Bitmap.CompressFormat.JPEG;
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return loadBitmapSync(str, new com.github.henryye.nativeiv.ImageDecodeConfig());
    }

    @Override // com.github.henryye.nativeiv.api.IImageDecodeService
    public com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.String str, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        return loadBitmapSync((java.lang.Object) str, imageDecodeConfig);
    }
}
