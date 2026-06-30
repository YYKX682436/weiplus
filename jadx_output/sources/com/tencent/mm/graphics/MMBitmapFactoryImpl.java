package com.tencent.mm.graphics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class MMBitmapFactoryImpl {
    private static final int DENSITY_DEFAULT = 160;
    private static final int REWIND_BUFFER_SIZE = 8388608;
    private static final java.lang.String TAG = "MicroMsg.MMBitmapFactory";
    private static final int TEMP_STORAGE_SIZE = 4096;
    private static com.tencent.mm.graphics.a sDecodeCanary;
    private static boolean sForceUsingSystemDecoderOpt;
    private static com.tencent.mm.graphics.b sMMCodecListener;
    private static final com.tencent.mm.graphics.c[] sNativeLibraryLoader = {null};
    private static com.tencent.mm.graphics.d sStreamProvider;
    private byte _hellAccFlag_;

    private void announceDecodeResult(android.graphics.BitmapFactory.Options options, android.graphics.Bitmap bitmap, boolean z17) {
        assertNotNull(options, "[-] opts is null.");
        java.lang.String str = z17 ? "system" : "mmcodec";
        if ((bitmap == null && options.outMimeType == null) || options.outWidth <= 0 || options.outHeight <= 0) {
            com.tencent.stubs.logger.Log.e(TAG, "[+] fail to decode by %s", str);
            return;
        }
        com.tencent.stubs.logger.Log.i(TAG, "[+] decode success by %s, boundsOnly:%s, w:%s, h:%s, mime-type:%s, sampleSize:%s", str, java.lang.Boolean.valueOf(options.inJustDecodeBounds), java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), options.outMimeType, java.lang.Integer.valueOf(options.inSampleSize));
        if (sDecodeCanary != null && bitmap != null && !options.inJustDecodeBounds) {
            int byteCount = bitmap.getByteCount();
            long j17 = byteCount;
            sDecodeCanary.getClass();
            if (j17 >= 20971520) {
                com.tencent.mm.feature.performance.p2 p2Var = (com.tencent.mm.feature.performance.p2) sDecodeCanary;
                p2Var.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "WARNING: bitmap decode oversize \n(%s B/%s B), [w:%s, h:%s]", java.lang.Integer.valueOf(byteCount), 20971520L, java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
                java.lang.Throwable th6 = new java.lang.Throwable();
                int i17 = 0;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginPerformance", th6, "bitmap stacktrace", new java.lang.Object[0]);
                if (byteCount > 52428800) {
                    jx3.f.INSTANCE.d(18613, bm5.f1.a(), android.util.Log.getStackTraceString(th6).replace('\n', ';').replace("\t", ""), java.lang.Integer.valueOf(byteCount), com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e);
                    i17 = 2;
                } else if (byteCount > 31457280) {
                    i17 = 1;
                }
                jx3.f.INSTANCE.t(1230, i17);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z65.c.a()) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.performance.o2(p2Var, byteCount, options));
                }
            }
        }
        if (z17 || sMMCodecListener == null || bitmap == null || options.inJustDecodeBounds) {
            return;
        }
        int byteCount2 = bitmap.getByteCount();
        pb0.g.a(pb0.g.f353121a, bitmap, byteCount2, "mmcodec", byteCount2 >= ((java.lang.Number) ((jz5.n) pb0.g.f353123c).getValue()).intValue() ? new java.lang.Throwable("mmcodec") : null);
    }

    private static void assertNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    private static void closeQuietly(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    private android.graphics.Bitmap decodeByteArrayInternal(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options) {
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        if (isForceSystemDecoder(options2)) {
            com.tencent.stubs.logger.Log.w(TAG, "[!] force decoding data by system codec.");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options2);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            announceDecodeResult(options2, decodeByteArray, true);
            return decodeByteArray;
        }
        try {
            android.graphics.Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i17, i18, options2);
            if (options2.outMimeType != null) {
                announceDecodeResult(options2, nativeDecodeByteArray, false);
                setDensityFromOptions(nativeDecodeByteArray, options2);
                return scaleBitmapOnDemand(nativeDecodeByteArray, options2);
            }
            com.tencent.stubs.logger.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(options2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(bArr);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray2 = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(3));
            yj0.a.e(obj2, decodeByteArray2, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            announceDecodeResult(options2, decodeByteArray2, true);
            return decodeByteArray2;
        } catch (java.lang.Throwable th6) {
            com.tencent.stubs.logger.Log.e(TAG, th6, "decode failed.");
            return null;
        }
    }

    private android.graphics.Bitmap decodeFileDescriptorInternal(java.io.FileDescriptor fileDescriptor, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        java.io.FileInputStream fileInputStream;
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        if (isForceSystemDecoder(options2)) {
            com.tencent.stubs.logger.Log.w(TAG, "[!] force decoding fd %s by system codec.", fileDescriptor);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options2);
            arrayList.add(rect);
            arrayList.add(fileDescriptor);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2));
            yj0.a.e(obj, decodeFileDescriptor, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            announceDecodeResult(options2, decodeFileDescriptor, true);
            return decodeFileDescriptor;
        }
        if (nativeIsSeekable(fileDescriptor)) {
            try {
                android.graphics.Bitmap nativeDecodeFileDescriptor = nativeDecodeFileDescriptor(fileDescriptor, getOrCreateStorageBuffer(options2), rect, options2);
                if (options2.outMimeType != null) {
                    announceDecodeResult(options2, nativeDecodeFileDescriptor, false);
                    setDensityFromOptions(nativeDecodeFileDescriptor, options2);
                    return scaleBitmapOnDemand(nativeDecodeFileDescriptor, options2);
                }
                com.tencent.stubs.logger.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options2);
                arrayList2.add(rect);
                arrayList2.add(fileDescriptor);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFileDescriptor2 = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, decodeFileDescriptor2, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                announceDecodeResult(options2, decodeFileDescriptor2, true);
                return decodeFileDescriptor2;
            } catch (java.lang.Throwable th6) {
                com.tencent.stubs.logger.Log.e(TAG, th6, "decode failed.");
                return null;
            }
        }
        try {
            fileInputStream = new java.io.FileInputStream(fileDescriptor);
            try {
                return decodeStreamInternal(fileInputStream, rect, options2);
            } catch (java.lang.Throwable th7) {
                th = th7;
                try {
                    com.tencent.stubs.logger.Log.e(TAG, th, "decode failed.");
                    return null;
                } finally {
                    closeQuietly(fileInputStream);
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileInputStream = null;
        }
    }

    private android.graphics.Bitmap decodeFileInternal(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        if (options == null) {
            options = new android.graphics.BitmapFactory.Options();
        }
        if (isForceSystemDecoder(options)) {
            com.tencent.stubs.logger.Log.w(TAG, "[!] force decoding file %s by system codec.", str);
            return decodeFileWithStreamBySystemInternal(str, options);
        }
        try {
            inputStream = wrapUnResetableStreamOnDemand(getStreamFromPath(str));
            try {
                inputStream.mark(getCompatibleRewindBufferSize());
                android.graphics.Bitmap nativeDecodeStream = nativeDecodeStream(inputStream, null, options);
                if (!(options.outMimeType != null)) {
                    com.tencent.stubs.logger.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
                    return decodeFileWithStreamBySystemInternal(str, options);
                }
                announceDecodeResult(options, nativeDecodeStream, false);
                setDensityFromOptions(nativeDecodeStream, options);
                return scaleBitmapOnDemand(nativeDecodeStream, options);
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.tencent.stubs.logger.Log.e(TAG, th, "decode failed.");
                    return null;
                } finally {
                    closeQuietly(inputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    private android.graphics.Bitmap decodeFileWithStreamBySystemInternal(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        if (sStreamProvider == null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
                yj0.a.e(obj, decodeFile, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                announceDecodeResult(options, decodeFile, true);
                return decodeFile;
            } catch (java.lang.Throwable th6) {
                com.tencent.stubs.logger.Log.e(TAG, th6, "decode by system failed.");
                return null;
            }
        }
        try {
            inputStream = wrapUnResetableStreamOnDemand(getStreamFromPath(str));
            try {
                inputStream.mark(getCompatibleRewindBufferSize());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options);
                arrayList2.add(null);
                arrayList2.add(inputStream);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, decodeStream, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                announceDecodeResult(options, decodeStream, true);
                return decodeStream;
            } catch (java.lang.Throwable th7) {
                th = th7;
                try {
                    com.tencent.stubs.logger.Log.e(TAG, th, "decode by system failed.");
                    return null;
                } finally {
                    closeQuietly(inputStream);
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap decodeStreamInternal(java.io.InputStream r18, android.graphics.Rect r19, android.graphics.BitmapFactory.Options r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.graphics.MMBitmapFactoryImpl.decodeStreamInternal(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private static int getCompatibleRewindBufferSize() {
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        return 8388608;
    }

    public static com.tencent.mm.graphics.MMBitmapFactoryImpl getInstance() {
        return com.tencent.mm.graphics.h.f68212a;
    }

    private static byte[] getOrCreateStorageBuffer(android.graphics.BitmapFactory.Options options) {
        byte[] bArr = options != null ? options.inTempStorage : null;
        return bArr != null ? bArr : new byte[4096];
    }

    private java.io.InputStream getStreamFromPath(java.lang.String str) {
        com.tencent.mm.graphics.d dVar = sStreamProvider;
        if (dVar == null) {
            return new java.io.FileInputStream(str);
        }
        ((com.tencent.mm.plugin.zero.e1) dVar).getClass();
        java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
        if (E != null) {
            return E;
        }
        throw new java.lang.IllegalArgumentException("Injected stream provider returned null in getStreamFromPath.");
    }

    private boolean isForceSystemDecoder(android.graphics.BitmapFactory.Options options) {
        return sForceUsingSystemDecoderOpt || (options != null && android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.HARDWARE.equals(options.inPreferredConfig));
    }

    private void loadNativeModule(java.lang.String str) {
        try {
            com.tencent.mm.graphics.c[] cVarArr = sNativeLibraryLoader;
            synchronized (cVarArr) {
                com.tencent.mm.graphics.c cVar = cVarArr[0];
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
            com.tencent.stubs.logger.Log.i(TAG, "Successfully load native module: %s", str);
        } catch (java.lang.Throwable th6) {
            com.tencent.stubs.logger.Log.e(TAG, th6, "Fail to load native module: %s", str);
            throw new java.lang.RuntimeException(th6);
        }
    }

    private native void nativeAddExternalLibDir(java.lang.String str);

    private native android.graphics.Bitmap nativeDecodeByteArray(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options);

    private native android.graphics.Bitmap nativeDecodeFileDescriptor(java.io.FileDescriptor fileDescriptor, byte[] bArr, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    private native android.graphics.Bitmap nativeDecodeStream(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    private native boolean nativeIsSeekable(java.io.FileDescriptor fileDescriptor);

    private native int nativePinBitmap(android.graphics.Bitmap bitmap);

    private native int nativeUnPinBitmap(android.graphics.Bitmap bitmap);

    private static android.graphics.Bitmap scaleBitmapOnDemand(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
        if (bitmap == null || options == null || !options.inScaled) {
            return bitmap;
        }
        int i17 = options.inDensity;
        int i18 = options.inTargetDensity;
        float f17 = (i17 == 0 || i18 == 0 || i17 == options.inScreenDensity) ? 1.0f : i18 / i17;
        if (f17 == 1.0f) {
            return bitmap;
        }
        int width = (int) ((bitmap.getWidth() * f17) + 0.5f);
        bitmap.getWidth();
        bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(width / bitmap.getWidth(), ((int) ((bitmap.getHeight() * f17) + 0.5f)) / bitmap.getHeight());
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width2));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "scaleBitmapOnDemand", "(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "scaleBitmapOnDemand", "(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static void setDecodeCanary(com.tencent.mm.graphics.a aVar) {
        sDecodeCanary = aVar;
    }

    private static void setDensityFromOptions(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
        if (bitmap == null || options == null) {
            return;
        }
        int i17 = options.inDensity;
        if (i17 == 0) {
            if (options.inBitmap != null) {
                bitmap.setDensity(160);
                return;
            }
            return;
        }
        bitmap.setDensity(i17);
        int i18 = options.inTargetDensity;
        if (i18 == 0 || i17 == i18 || i17 == options.inScreenDensity) {
            return;
        }
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        boolean z17 = ninePatchChunk != null && android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk);
        if (options.inScaled || z17) {
            bitmap.setDensity(i18);
        }
    }

    public static void setForceUsingSystemDecoder(boolean z17) {
        com.tencent.stubs.logger.Log.w(TAG, "[!] setForceUsingSystemDecoder, value: %s", java.lang.Boolean.valueOf(z17));
        sForceUsingSystemDecoderOpt = z17;
    }

    public static void setMMCodecListener(com.tencent.mm.graphics.b bVar) {
        sMMCodecListener = bVar;
    }

    public static void setNativeLibraryLoader(com.tencent.mm.graphics.c cVar) {
        com.tencent.mm.graphics.c[] cVarArr = sNativeLibraryLoader;
        synchronized (cVarArr) {
            cVarArr[0] = cVar;
        }
    }

    public static void setStreamProvider(com.tencent.mm.graphics.d dVar) {
        sStreamProvider = dVar;
    }

    private static java.io.InputStream wrapUnResetableStreamOnDemand(java.io.InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : inputStream instanceof java.io.FileInputStream ? new com.tencent.mm.graphics.g((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
    }

    public void addExternalCodecLibDir(java.lang.String str) {
        com.tencent.stubs.logger.Log.i(TAG, "[+] add external codec library path: %s", str);
        nativeAddExternalLibDir(str);
    }

    public android.graphics.Bitmap decodeByteArray(byte[] bArr, int i17, int i18) {
        assertNotNull(bArr, "'data' is null.");
        return decodeByteArrayInternal(bArr, i17, i18, null);
    }

    public android.graphics.Bitmap decodeFile(java.lang.String str) {
        assertNotNull(str, "'pathName' is null.");
        return decodeFileInternal(str, null);
    }

    public android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor fileDescriptor) {
        assertNotNull(fileDescriptor, "'fd' is null.");
        return decodeFileDescriptorInternal(fileDescriptor, null, null);
    }

    public android.graphics.Bitmap decodeResource(android.content.res.Resources resources, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    public android.graphics.Bitmap decodeResourceStream(android.content.res.Resources resources, android.util.TypedValue typedValue, java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        arrayList.add(inputStream);
        arrayList.add(typedValue);
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResourceStream = android.graphics.BitmapFactory.decodeResourceStream((android.content.res.Resources) arrayList.get(0), (android.util.TypedValue) arrayList.get(1), (java.io.InputStream) arrayList.get(2), (android.graphics.Rect) arrayList.get(3), (android.graphics.BitmapFactory.Options) arrayList.get(4));
        yj0.a.e(obj, decodeResourceStream, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeResourceStream;
    }

    public android.graphics.Bitmap decodeStream(java.io.InputStream inputStream) {
        assertNotNull(inputStream, "'is' is null.");
        return decodeStreamInternal(inputStream, null, null);
    }

    public android.graphics.Bitmap pinBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.stubs.logger.Log.i(TAG, "[tomys] Try to pin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), java.lang.Integer.valueOf(bitmap.getByteCount()));
            int nativePinBitmap = nativePinBitmap(bitmap);
            if (nativePinBitmap < 0) {
                com.tencent.stubs.logger.Log.e(TAG, "pinBitmap failed, ret: %s", java.lang.Integer.valueOf(nativePinBitmap));
            }
        }
        return bitmap;
    }

    public android.graphics.Bitmap unPinBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.stubs.logger.Log.i(TAG, "[tomys] Try to unpin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), java.lang.Integer.valueOf(bitmap.getByteCount()));
            int nativeUnPinBitmap = nativeUnPinBitmap(bitmap);
            if (nativeUnPinBitmap < 0) {
                com.tencent.stubs.logger.Log.e(TAG, "unPinBitmap failed, ret: %s", java.lang.Integer.valueOf(nativeUnPinBitmap));
            }
        }
        return bitmap;
    }

    private MMBitmapFactoryImpl() {
        loadNativeModule("mmimgcodec");
    }

    public android.graphics.Bitmap decodeByteArray(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options) {
        assertNotNull(bArr, "'data' is null.");
        return decodeByteArrayInternal(bArr, i17, i18, options);
    }

    public android.graphics.Bitmap decodeFile(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        assertNotNull(str, "'pathName' is null.");
        return decodeFileInternal(str, options);
    }

    public android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor fileDescriptor, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        assertNotNull(fileDescriptor, "'fd' is null.");
        return decodeFileDescriptorInternal(fileDescriptor, rect, options);
    }

    public android.graphics.Bitmap decodeStream(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        assertNotNull(inputStream, "'is' is null.");
        return decodeStreamInternal(inputStream, rect, options);
    }

    public android.graphics.Bitmap decodeResource(android.content.res.Resources resources, int i17, android.graphics.BitmapFactory.Options options) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2));
        yj0.a.e(obj, decodeResource, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeResource;
    }
}
