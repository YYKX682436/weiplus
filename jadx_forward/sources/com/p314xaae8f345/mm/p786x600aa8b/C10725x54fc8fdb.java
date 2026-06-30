package com.p314xaae8f345.mm.p786x600aa8b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.graphics.MMBitmapFactoryImpl */
/* loaded from: classes12.dex */
public class C10725x54fc8fdb {

    /* renamed from: DENSITY_DEFAULT */
    private static final int f28972x261de1aa = 160;

    /* renamed from: REWIND_BUFFER_SIZE */
    private static final int f28973x48f2af1c = 8388608;
    private static final java.lang.String TAG = "MicroMsg.MMBitmapFactory";

    /* renamed from: TEMP_STORAGE_SIZE */
    private static final int f28974x245a89f0 = 4096;

    /* renamed from: sDecodeCanary */
    private static com.p314xaae8f345.mm.p786x600aa8b.a f28975x9b033c39;

    /* renamed from: sForceUsingSystemDecoderOpt */
    private static boolean f28976xd31b64aa;

    /* renamed from: sMMCodecListener */
    private static com.p314xaae8f345.mm.p786x600aa8b.b f28977x426a3857;

    /* renamed from: sNativeLibraryLoader */
    private static final com.p314xaae8f345.mm.p786x600aa8b.c[] f28978x84579a64 = {null};

    /* renamed from: sStreamProvider */
    private static com.p314xaae8f345.mm.p786x600aa8b.d f28979x5123c0e4;

    /* renamed from: _hellAccFlag_ */
    private byte f28980x7f11beae;

    /* renamed from: announceDecodeResult */
    private void m45681x4a422eb4(android.graphics.BitmapFactory.Options options, android.graphics.Bitmap bitmap, boolean z17) {
        m45682x12c24cd4(options, "[-] opts is null.");
        java.lang.String str = z17 ? "system" : "mmcodec";
        if ((bitmap == null && options.outMimeType == null) || options.outWidth <= 0 || options.outHeight <= 0) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, "[+] fail to decode by %s", str);
            return;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(TAG, "[+] decode success by %s, boundsOnly:%s, w:%s, h:%s, mime-type:%s, sampleSize:%s", str, java.lang.Boolean.valueOf(options.inJustDecodeBounds), java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), options.outMimeType, java.lang.Integer.valueOf(options.inSampleSize));
        if (f28975x9b033c39 != null && bitmap != null && !options.inJustDecodeBounds) {
            int byteCount = bitmap.getByteCount();
            long j17 = byteCount;
            f28975x9b033c39.getClass();
            if (j17 >= 20971520) {
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p2 p2Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p2) f28975x9b033c39;
                p2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginPerformance", "WARNING: bitmap decode oversize \n(%s B/%s B), [w:%s, h:%s]", java.lang.Integer.valueOf(byteCount), 20971520L, java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
                java.lang.Throwable th6 = new java.lang.Throwable();
                int i17 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginPerformance", th6, "bitmap stacktrace", new java.lang.Object[0]);
                if (byteCount > 52428800) {
                    jx3.f.INSTANCE.d(18613, bm5.f1.a(), android.util.Log.getStackTraceString(th6).replace('\n', ';').replace("\t", ""), java.lang.Integer.valueOf(byteCount), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    i17 = 2;
                } else if (byteCount > 31457280) {
                    i17 = 1;
                }
                jx3.f.INSTANCE.t(1230, i17);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (z65.c.a()) {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.o2(p2Var, byteCount, options));
                }
            }
        }
        if (z17 || f28977x426a3857 == null || bitmap == null || options.inJustDecodeBounds) {
            return;
        }
        int byteCount2 = bitmap.getByteCount();
        pb0.g.a(pb0.g.f434654a, bitmap, byteCount2, "mmcodec", byteCount2 >= ((java.lang.Number) ((jz5.n) pb0.g.f434656c).mo141623x754a37bb()).intValue() ? new java.lang.Throwable("mmcodec") : null);
    }

    /* renamed from: assertNotNull */
    private static void m45682x12c24cd4(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    /* renamed from: closeQuietly */
    private static void m45683xd71209a9(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: decodeByteArrayInternal */
    private android.graphics.Bitmap m45684x9279f7c0(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options) {
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        if (m45693x72435cb4(options2)) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] force decoding data by system codec.");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options2);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            m45681x4a422eb4(options2, decodeByteArray, true);
            return decodeByteArray;
        }
        try {
            android.graphics.Bitmap m45696x3f41b6cc = m45696x3f41b6cc(bArr, i17, i18, options2);
            if (options2.outMimeType != null) {
                m45681x4a422eb4(options2, m45696x3f41b6cc, false);
                m45704x79d498e(m45696x3f41b6cc, options2);
                return m45702x37314343(m45696x3f41b6cc, options2);
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(options2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(bArr);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray2 = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(3));
            yj0.a.e(obj2, decodeByteArray2, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeByteArrayInternal", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            m45681x4a422eb4(options2, decodeByteArray2, true);
            return decodeByteArray2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th6, "decode failed.");
            return null;
        }
    }

    /* renamed from: decodeFileDescriptorInternal */
    private android.graphics.Bitmap m45685xb0c4e176(java.io.FileDescriptor fileDescriptor, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        java.io.FileInputStream fileInputStream;
        android.graphics.BitmapFactory.Options options2 = options == null ? new android.graphics.BitmapFactory.Options() : options;
        if (m45693x72435cb4(options2)) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] force decoding fd %s by system codec.", fileDescriptor);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options2);
            arrayList.add(rect);
            arrayList.add(fileDescriptor);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2));
            yj0.a.e(obj, decodeFileDescriptor, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            m45681x4a422eb4(options2, decodeFileDescriptor, true);
            return decodeFileDescriptor;
        }
        if (m45699xf21b4a93(fileDescriptor)) {
            try {
                android.graphics.Bitmap m45697x9250f250 = m45697x9250f250(fileDescriptor, m45691x9c494666(options2), rect, options2);
                if (options2.outMimeType != null) {
                    m45681x4a422eb4(options2, m45697x9250f250, false);
                    m45704x79d498e(m45697x9250f250, options2);
                    return m45702x37314343(m45697x9250f250, options2);
                }
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options2);
                arrayList2.add(rect);
                arrayList2.add(fileDescriptor);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFileDescriptor2 = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, decodeFileDescriptor2, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileDescriptorInternal", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                m45681x4a422eb4(options2, decodeFileDescriptor2, true);
                return decodeFileDescriptor2;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th6, "decode failed.");
                return null;
            }
        }
        try {
            fileInputStream = new java.io.FileInputStream(fileDescriptor);
            try {
                return m45688x7e7c5feb(fileInputStream, rect, options2);
            } catch (java.lang.Throwable th7) {
                th = th7;
                try {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th, "decode failed.");
                    return null;
                } finally {
                    m45683xd71209a9(fileInputStream);
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileInputStream = null;
        }
    }

    /* renamed from: decodeFileInternal */
    private android.graphics.Bitmap m45686x2175567(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        if (options == null) {
            options = new android.graphics.BitmapFactory.Options();
        }
        if (m45693x72435cb4(options)) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] force decoding file %s by system codec.", str);
            return m45687xc2806273(str, options);
        }
        try {
            inputStream = m45709x9f55fc30(m45692xe8e0b85(str));
            try {
                inputStream.mark(m45689x3ae8a666());
                android.graphics.Bitmap m45698xe0925cc5 = m45698xe0925cc5(inputStream, null, options);
                if (!(options.outMimeType != null)) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] unsupported image format, try to decode with system codec.");
                    return m45687xc2806273(str, options);
                }
                m45681x4a422eb4(options, m45698xe0925cc5, false);
                m45704x79d498e(m45698xe0925cc5, options);
                return m45702x37314343(m45698xe0925cc5, options);
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th, "decode failed.");
                    return null;
                } finally {
                    m45683xd71209a9(inputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    /* renamed from: decodeFileWithStreamBySystemInternal */
    private android.graphics.Bitmap m45687xc2806273(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        if (f28979x5123c0e4 == null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
                yj0.a.e(obj, decodeFile, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                m45681x4a422eb4(options, decodeFile, true);
                return decodeFile;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th6, "decode by system failed.");
                return null;
            }
        }
        try {
            inputStream = m45709x9f55fc30(m45692xe8e0b85(str));
            try {
                inputStream.mark(m45689x3ae8a666());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options);
                arrayList2.add(null);
                arrayList2.add(inputStream);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, decodeStream, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeFileWithStreamBySystemInternal", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                m45681x4a422eb4(options, decodeStream, true);
                return decodeStream;
            } catch (java.lang.Throwable th7) {
                th = th7;
                try {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th, "decode by system failed.");
                    return null;
                } finally {
                    m45683xd71209a9(inputStream);
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: decodeStreamInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap m45688x7e7c5feb(java.io.InputStream r18, android.graphics.Rect r19, android.graphics.BitmapFactory.Options r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p786x600aa8b.C10725x54fc8fdb.m45688x7e7c5feb(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: getCompatibleRewindBufferSize */
    private static int m45689x3ae8a666() {
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        return 8388608;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p786x600aa8b.C10725x54fc8fdb m45690x9cf0d20b() {
        return com.p314xaae8f345.mm.p786x600aa8b.h.f149745a;
    }

    /* renamed from: getOrCreateStorageBuffer */
    private static byte[] m45691x9c494666(android.graphics.BitmapFactory.Options options) {
        byte[] bArr = options != null ? options.inTempStorage : null;
        return bArr != null ? bArr : new byte[4096];
    }

    /* renamed from: getStreamFromPath */
    private java.io.InputStream m45692xe8e0b85(java.lang.String str) {
        com.p314xaae8f345.mm.p786x600aa8b.d dVar = f28979x5123c0e4;
        if (dVar == null) {
            return new java.io.FileInputStream(str);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.e1) dVar).getClass();
        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
        if (E != null) {
            return E;
        }
        throw new java.lang.IllegalArgumentException("Injected stream provider returned null in getStreamFromPath.");
    }

    /* renamed from: isForceSystemDecoder */
    private boolean m45693x72435cb4(android.graphics.BitmapFactory.Options options) {
        return f28976xd31b64aa || (options != null && android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.HARDWARE.equals(options.inPreferredConfig));
    }

    /* renamed from: loadNativeModule */
    private void m45694x6e562569(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p786x600aa8b.c[] cVarArr = f28978x84579a64;
            synchronized (cVarArr) {
                com.p314xaae8f345.mm.p786x600aa8b.c cVar = cVarArr[0];
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(TAG, "Successfully load native module: %s", str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, th6, "Fail to load native module: %s", str);
            throw new java.lang.RuntimeException(th6);
        }
    }

    /* renamed from: nativeAddExternalLibDir */
    private native void m45695x38b5031d(java.lang.String str);

    /* renamed from: nativeDecodeByteArray */
    private native android.graphics.Bitmap m45696x3f41b6cc(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options);

    /* renamed from: nativeDecodeFileDescriptor */
    private native android.graphics.Bitmap m45697x9250f250(java.io.FileDescriptor fileDescriptor, byte[] bArr, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    /* renamed from: nativeDecodeStream */
    private native android.graphics.Bitmap m45698xe0925cc5(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options);

    /* renamed from: nativeIsSeekable */
    private native boolean m45699xf21b4a93(java.io.FileDescriptor fileDescriptor);

    /* renamed from: nativePinBitmap */
    private native int m45700x913a44cd(android.graphics.Bitmap bitmap);

    /* renamed from: nativeUnPinBitmap */
    private native int m45701xffe8ebf4(android.graphics.Bitmap bitmap);

    /* renamed from: scaleBitmapOnDemand */
    private static android.graphics.Bitmap m45702x37314343(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
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
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    /* renamed from: setDecodeCanary */
    public static void m45703x39789a8(com.p314xaae8f345.mm.p786x600aa8b.a aVar) {
        f28975x9b033c39 = aVar;
    }

    /* renamed from: setDensityFromOptions */
    private static void m45704x79d498e(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
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

    /* renamed from: setForceUsingSystemDecoder */
    public static void m45705xa46fa87a(boolean z17) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(TAG, "[!] setForceUsingSystemDecoder, value: %s", java.lang.Boolean.valueOf(z17));
        f28976xd31b64aa = z17;
    }

    /* renamed from: setMMCodecListener */
    public static void m45706x44894088(com.p314xaae8f345.mm.p786x600aa8b.b bVar) {
        f28977x426a3857 = bVar;
    }

    /* renamed from: setNativeLibraryLoader */
    public static void m45707xd2652215(com.p314xaae8f345.mm.p786x600aa8b.c cVar) {
        com.p314xaae8f345.mm.p786x600aa8b.c[] cVarArr = f28978x84579a64;
        synchronized (cVarArr) {
            cVarArr[0] = cVar;
        }
    }

    /* renamed from: setStreamProvider */
    public static void m45708xe5da6e93(com.p314xaae8f345.mm.p786x600aa8b.d dVar) {
        f28979x5123c0e4 = dVar;
    }

    /* renamed from: wrapUnResetableStreamOnDemand */
    private static java.io.InputStream m45709x9f55fc30(java.io.InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : inputStream instanceof java.io.FileInputStream ? new com.p314xaae8f345.mm.p786x600aa8b.g((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
    }

    /* renamed from: addExternalCodecLibDir */
    public void m45710xf5035c52(java.lang.String str) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(TAG, "[+] add external codec library path: %s", str);
        m45695x38b5031d(str);
    }

    /* renamed from: decodeByteArray */
    public android.graphics.Bitmap m45711x4ec05fe3(byte[] bArr, int i17, int i18) {
        m45682x12c24cd4(bArr, "'data' is null.");
        return m45684x9279f7c0(bArr, i17, i18, null);
    }

    /* renamed from: decodeFile */
    public android.graphics.Bitmap m45713xb7ed548a(java.lang.String str) {
        m45682x12c24cd4(str, "'pathName' is null.");
        return m45686x2175567(str, null);
    }

    /* renamed from: decodeFileDescriptor */
    public android.graphics.Bitmap m45715xbd35f99(java.io.FileDescriptor fileDescriptor) {
        m45682x12c24cd4(fileDescriptor, "'fd' is null.");
        return m45685xb0c4e176(fileDescriptor, null, null);
    }

    /* renamed from: decodeResource */
    public android.graphics.Bitmap m45717xb866ec1c(android.content.res.Resources resources, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    /* renamed from: decodeResourceStream */
    public android.graphics.Bitmap m45719xefeea2bc(android.content.res.Resources resources, android.util.TypedValue typedValue, java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
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

    /* renamed from: decodeStream */
    public android.graphics.Bitmap m45720x88b7230e(java.io.InputStream inputStream) {
        m45682x12c24cd4(inputStream, "'is' is null.");
        return m45688x7e7c5feb(inputStream, null, null);
    }

    /* renamed from: pinBitmap */
    public android.graphics.Bitmap m45722xaad74b24(android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(TAG, "[tomys] Try to pin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), java.lang.Integer.valueOf(bitmap.getByteCount()));
            int m45700x913a44cd = m45700x913a44cd(bitmap);
            if (m45700x913a44cd < 0) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, "pinBitmap failed, ret: %s", java.lang.Integer.valueOf(m45700x913a44cd));
            }
        }
        return bitmap;
    }

    /* renamed from: unPinBitmap */
    public android.graphics.Bitmap m45723x265db88b(android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(TAG, "[tomys] Try to unpin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), java.lang.Integer.valueOf(bitmap.getByteCount()));
            int m45701xffe8ebf4 = m45701xffe8ebf4(bitmap);
            if (m45701xffe8ebf4 < 0) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(TAG, "unPinBitmap failed, ret: %s", java.lang.Integer.valueOf(m45701xffe8ebf4));
            }
        }
        return bitmap;
    }

    private C10725x54fc8fdb() {
        m45694x6e562569("mmimgcodec");
    }

    /* renamed from: decodeByteArray */
    public android.graphics.Bitmap m45712x4ec05fe3(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options) {
        m45682x12c24cd4(bArr, "'data' is null.");
        return m45684x9279f7c0(bArr, i17, i18, options);
    }

    /* renamed from: decodeFile */
    public android.graphics.Bitmap m45714xb7ed548a(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        m45682x12c24cd4(str, "'pathName' is null.");
        return m45686x2175567(str, options);
    }

    /* renamed from: decodeFileDescriptor */
    public android.graphics.Bitmap m45716xbd35f99(java.io.FileDescriptor fileDescriptor, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        m45682x12c24cd4(fileDescriptor, "'fd' is null.");
        return m45685xb0c4e176(fileDescriptor, rect, options);
    }

    /* renamed from: decodeStream */
    public android.graphics.Bitmap m45721x88b7230e(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        m45682x12c24cd4(inputStream, "'is' is null.");
        return m45688x7e7c5feb(inputStream, rect, options);
    }

    /* renamed from: decodeResource */
    public android.graphics.Bitmap m45718xb866ec1c(android.content.res.Resources resources, int i17, android.graphics.BitmapFactory.Options options) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
