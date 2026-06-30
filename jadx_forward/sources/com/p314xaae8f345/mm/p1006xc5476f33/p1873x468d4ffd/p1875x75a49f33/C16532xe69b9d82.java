package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever */
/* loaded from: classes12.dex */
public class C16532xe69b9d82 {

    /* renamed from: METADATA_CHAPTER_COUNT */
    public static final java.lang.String f37634x65aead4d = "chapter_count";

    /* renamed from: METADATA_KEY_ALBUM */
    public static final java.lang.String f37635xb5a3973f = "album";

    /* renamed from: METADATA_KEY_ALBUM_ARTIST */
    public static final java.lang.String f37636xb3e46447 = "album_artist";

    /* renamed from: METADATA_KEY_ARTIST */
    public static final java.lang.String f37637xff2be057 = "artist";

    /* renamed from: METADATA_KEY_AUDIO_CODEC */
    public static final java.lang.String f37638x714c9b1d = "audio_codec";

    /* renamed from: METADATA_KEY_CHAPTER_END_TIME */
    public static final java.lang.String f37639x28b6b8b3 = "chapter_end_time";

    /* renamed from: METADATA_KEY_CHAPTER_START_TIME */
    public static final java.lang.String f37640xc56ee50c = "chapter_start_time";

    /* renamed from: METADATA_KEY_COMMENT */
    public static final java.lang.String f37641x4a9d0f2f = "comment";

    /* renamed from: METADATA_KEY_COMPOSER */
    public static final java.lang.String f37642x933ba30 = "composer";

    /* renamed from: METADATA_KEY_COPYRIGHT */
    public static final java.lang.String f37643xcb779c97 = "copyright";

    /* renamed from: METADATA_KEY_CREATION_TIME */
    public static final java.lang.String f37644x7bb2391d = "creation_time";

    /* renamed from: METADATA_KEY_DATE */
    public static final java.lang.String f37645x68f5f8be = "date";

    /* renamed from: METADATA_KEY_DISC */
    public static final java.lang.String f37646x68f616a5 = "disc";

    /* renamed from: METADATA_KEY_DURATION */
    public static final java.lang.String f37647xb63146a4 = "duration";

    /* renamed from: METADATA_KEY_ENCODED_BY */
    public static final java.lang.String f37648x883f9258 = "encoded_by";

    /* renamed from: METADATA_KEY_ENCODER */
    public static final java.lang.String f37649xb228a5ec = "encoder";

    /* renamed from: METADATA_KEY_FILENAME */
    public static final java.lang.String f37650x1214b17 = "filename";

    /* renamed from: METADATA_KEY_FILESIZE */
    public static final java.lang.String f37651x123b08d = "filesize";

    /* renamed from: METADATA_KEY_FRAMERATE */
    public static final java.lang.String f37652x913da09d = "framerate";

    /* renamed from: METADATA_KEY_GENRE */
    public static final java.lang.String f37653xb5f52253 = "genre";

    /* renamed from: METADATA_KEY_ICY_METADATA */
    public static final java.lang.String f37654x32bfe1ff = "icy_metadata";

    /* renamed from: METADATA_KEY_LANGUAGE */
    public static final java.lang.String f37655xccbf8c68 = "language";

    /* renamed from: METADATA_KEY_PERFORMER */
    public static final java.lang.String f37656x8d5fc89e = "performer";

    /* renamed from: METADATA_KEY_PUBLISHER */
    public static final java.lang.String f37657xc6f7cacc = "publisher";

    /* renamed from: METADATA_KEY_SERVICE_NAME */
    public static final java.lang.String f37658xa3d12f05 = "service_name";

    /* renamed from: METADATA_KEY_SERVICE_PROVIDER */
    public static final java.lang.String f37659x416fe56b = "service_provider";

    /* renamed from: METADATA_KEY_TITLE */
    public static final java.lang.String f37660xb6ae3b28 = "title";

    /* renamed from: METADATA_KEY_TRACK */
    public static final java.lang.String f37661xb6b20a1b = "track";

    /* renamed from: METADATA_KEY_VARIANT_BITRATE */
    public static final java.lang.String f37662xd14eba63 = "bitrate";

    /* renamed from: METADATA_KEY_VIDEO_CODEC */
    public static final java.lang.String f37663x95194402 = "video_codec";

    /* renamed from: METADATA_KEY_VIDEO_HEIGHT */
    public static final java.lang.String f37664x160cda9b = "video_height";

    /* renamed from: METADATA_KEY_VIDEO_ROTATION */
    public static final java.lang.String f37665xf880c7f2 = "rotate";

    /* renamed from: METADATA_KEY_VIDEO_WIDTH */
    public static final java.lang.String f37666x963061b2 = "video_width";

    /* renamed from: OPTION_CLOSEST */
    public static final int f37667xb269b86f = 3;

    /* renamed from: OPTION_CLOSEST_SYNC */
    public static final int f37668x25b5006b = 2;

    /* renamed from: OPTION_NEXT_SYNC */
    public static final int f37669x25e1511d = 1;

    /* renamed from: OPTION_PREVIOUS_SYNC */
    public static final int f37670xba494099 = 0;
    private static final java.lang.String TAG = "FFmpegMetadataRetriever";

    /* renamed from: _hellAccFlag_ */
    private byte f37671x7f11beae;

    /* renamed from: mNativeContext */
    private long f37672x5abc8e2b;

    /* renamed from: reuse */
    private android.graphics.Bitmap f37673x6762674;

    static {
        m66843x685b4438();
    }

    public C16532xe69b9d82() {
        m66844xa3964055();
    }

    /* renamed from: _getFrameAtTime */
    private native byte[] m66836xb2f4656(long j17, int i17);

    /* renamed from: _getScaledFrameAtTime */
    private native byte[] m66837x24cfdedc(long j17, int i17, int i18, int i19);

    /* renamed from: _setDataSource */
    private native void m66838x398b3468(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: _setDataSourceVFS */
    private void m66839x6e68de3b(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        m66838x398b3468(kk.w.a(str, false), strArr, strArr2);
    }

    /* renamed from: getBitmapFromPixels */
    private android.graphics.Bitmap m66840xc31060fc(byte[] bArr, int i17, int i18) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (i17 == -1) {
            i17 = m66857x8d5c7601();
        }
        if (i18 == -1) {
            i18 = m66855x463504c();
        }
        if (i17 <= 0 || i18 <= 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.CHINA, "Can not get bitmap width and height [%d, %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        android.graphics.Bitmap bitmap = this.f37673x6762674;
        if (bitmap == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getBitmapFromPixels", "([BII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getBitmapFromPixels", "([BII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        bitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        return bitmap;
    }

    /* renamed from: native_finalize */
    private native void m66841x4bbae746();

    /* renamed from: native_getMetadata */
    private final native java.util.HashMap<java.lang.String, java.lang.String> m66842x8a03fc7d(boolean z17, boolean z18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    /* renamed from: native_init */
    private static native void m66843x685b4438();

    /* renamed from: native_setup */
    private native void m66844xa3964055();

    /* renamed from: extractMetadata */
    public native java.lang.String m66845xcf1aaad0(java.lang.String str);

    /* renamed from: extractMetadataFromChapter */
    public native java.lang.String m66846x67dc0453(java.lang.String str, int i17);

    /* renamed from: finalize */
    public void m66847xd764dc1e() {
        try {
            try {
                m66841x4bbae746();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "do nothing");
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getFrameAtTime */
    public android.graphics.Bitmap m66850xb2c2d837(long j17, int i17) {
        if (i17 >= 0 && i17 <= 3) {
            byte[] m66836xb2f4656 = m66836xb2f4656(j17, i17);
            if (m66836xb2f4656 != null) {
                return m66840xc31060fc(m66836xb2f4656, -1, -1);
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("Unsupported option: " + i17);
    }

    /* renamed from: getMetadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d m66851x6107b8a5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d(this);
        if (m66842x8a03fc7d(false, false, null) == null) {
            return null;
        }
        return dVar;
    }

    /* renamed from: getScaledFrameAtTime */
    public android.graphics.Bitmap m66853x780cc3fd(long j17, int i17, int i18, int i19) {
        if (i17 >= 0 && i17 <= 3) {
            byte[] m66837x24cfdedc = m66837x24cfdedc(j17, i17, i18, i19);
            if (m66837x24cfdedc != null) {
                return m66840xc31060fc(m66837x24cfdedc, i18, i19);
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("Unsupported option: " + i17);
    }

    /* renamed from: getScaledFrameAtTimeUndecoded */
    public byte[] m66854x6c9d3800(long j17, int i17, int i18) {
        return m66837x24cfdedc(j17, 2, i17, i18);
    }

    /* renamed from: getVideoHeight */
    public int m66855x463504c() {
        java.lang.String m66845xcf1aaad0;
        try {
            java.lang.String m66845xcf1aaad02 = m66845xcf1aaad0(f37665xf880c7f2);
            if (!"90".equals(m66845xcf1aaad02) && !"270".equals(m66845xcf1aaad02)) {
                m66845xcf1aaad0 = m66845xcf1aaad0(f37664x160cda9b);
                return java.lang.Integer.valueOf(m66845xcf1aaad0).intValue();
            }
            m66845xcf1aaad0 = m66845xcf1aaad0(f37666x963061b2);
            return java.lang.Integer.valueOf(m66845xcf1aaad0).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can not get video height %s", e17.getMessage());
            return 0;
        }
    }

    /* renamed from: getVideoRotation */
    public int m66856xab109963() {
        try {
            return java.lang.Integer.valueOf(m66845xcf1aaad0(f37665xf880c7f2)).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can not get video rotation. %s", e17.getMessage());
            return 0;
        }
    }

    /* renamed from: getVideoWidth */
    public int m66857x8d5c7601() {
        java.lang.String m66845xcf1aaad0;
        try {
            java.lang.String m66845xcf1aaad02 = m66845xcf1aaad0(f37665xf880c7f2);
            if (!"90".equals(m66845xcf1aaad02) && !"270".equals(m66845xcf1aaad02)) {
                m66845xcf1aaad0 = m66845xcf1aaad0(f37666x963061b2);
                return java.lang.Integer.valueOf(m66845xcf1aaad0).intValue();
            }
            m66845xcf1aaad0 = m66845xcf1aaad0(f37664x160cda9b);
            return java.lang.Integer.valueOf(m66845xcf1aaad0).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can not get video width %s", e17.getMessage());
            return 0;
        }
    }

    /* renamed from: release */
    public native void m66858x41012807();

    /* renamed from: reuseBitmap */
    public void m66859x71b25cc3(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f37673x6762674;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f37673x6762674 = bitmap;
    }

    /* renamed from: setDataSource */
    public native void m66862x683d6267(java.io.FileDescriptor fileDescriptor, long j17, long j18);

    /* renamed from: setDataSource */
    public void m66863x683d6267(java.lang.String str) {
        m66839x6e68de3b(str, null, null);
    }

    /* renamed from: setDataSource */
    public void m66864x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = new java.lang.String[map.size()];
        java.lang.String[] strArr2 = new java.lang.String[map.size()];
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            strArr[i17] = entry.getKey();
            strArr2[i17] = entry.getValue();
            i17++;
        }
        m66839x6e68de3b(str, strArr, strArr2);
    }

    /* renamed from: getFrameAtTime */
    public android.graphics.Bitmap m66849xb2c2d837(long j17) {
        byte[] m66836xb2f4656 = m66836xb2f4656(j17, 2);
        if (m66836xb2f4656 != null) {
            return m66840xc31060fc(m66836xb2f4656, -1, -1);
        }
        return null;
    }

    /* renamed from: getScaledFrameAtTime */
    public android.graphics.Bitmap m66852x780cc3fd(long j17, int i17, int i18) {
        byte[] m66837x24cfdedc = m66837x24cfdedc(j17, 0, i17, i18);
        if (m66837x24cfdedc != null) {
            return m66840xc31060fc(m66837x24cfdedc, i17, i18);
        }
        return null;
    }

    /* renamed from: getFrameAtTime */
    public android.graphics.Bitmap m66848xb2c2d837() {
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(2);
        aVar.c(-1L);
        yj0.a.d(this, aVar.b(), "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getFrameAtTime", "()Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        zj0.c.f554818a.set(aVar);
        android.graphics.Bitmap m66850xb2c2d837 = m66850xb2c2d837(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
        yj0.a.e(this, m66850xb2c2d837, "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getFrameAtTime", "()Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        return m66850xb2c2d837;
    }

    /* renamed from: setDataSource */
    public void m66861x683d6267(java.io.FileDescriptor fileDescriptor) {
        m66862x683d6267(fileDescriptor, 0L, 576460752303423487L);
    }

    /* renamed from: setDataSource */
    public void m66860x683d6267(android.content.Context context, android.net.Uri uri) {
        if (uri != null) {
            java.lang.String scheme = uri.getScheme();
            if (scheme != null && !scheme.equals("file")) {
                android.content.res.AssetFileDescriptor assetFileDescriptor = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                        if (openAssetFileDescriptor != null) {
                            java.io.FileDescriptor fileDescriptor = openAssetFileDescriptor.getFileDescriptor();
                            if (fileDescriptor.valid()) {
                                if (openAssetFileDescriptor.getDeclaredLength() < 0) {
                                    m66861x683d6267(fileDescriptor);
                                } else {
                                    m66862x683d6267(fileDescriptor, openAssetFileDescriptor.getStartOffset(), openAssetFileDescriptor.getDeclaredLength());
                                }
                                try {
                                    openAssetFileDescriptor.close();
                                    return;
                                } catch (java.io.IOException unused) {
                                    return;
                                }
                            }
                            throw new java.lang.IllegalArgumentException();
                        }
                        throw new java.lang.IllegalArgumentException();
                    } catch (java.io.FileNotFoundException unused2) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } catch (java.lang.SecurityException unused3) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    m66863x683d6267(uri.toString());
                    return;
                } catch (java.lang.Throwable th6) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    throw th6;
                }
            }
            m66863x683d6267(uri.getPath());
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
