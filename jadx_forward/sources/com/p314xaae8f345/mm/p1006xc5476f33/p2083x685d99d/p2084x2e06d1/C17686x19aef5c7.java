package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1;

/* renamed from: com.tencent.mm.plugin.sight.base.SightVideoJNI */
/* loaded from: classes10.dex */
public class C17686x19aef5c7 {

    /* renamed from: MMSIGHT_YUV420P */
    public static final int f37993xa9dc2676 = 2;

    /* renamed from: MMSIGHT_YUV420SP */
    public static final int f37994x91a8a8f7 = 1;

    /* renamed from: MMSightLock */
    private static final java.lang.Object f37995xf10ce6a8 = new java.lang.Object();
    private static final java.lang.String TAG = "MicroMsg.SightVideoJNI";

    /* renamed from: TYPE_BITMAP */
    public static final int f37996x33e2a5d4 = 1;

    /* renamed from: TYPE_SURFACE */
    public static final int f37997xe016cc88 = 0;

    /* renamed from: com.tencent.mm.plugin.sight.base.SightVideoJNI$VideoTSRange */
    /* loaded from: classes5.dex */
    public static class VideoTSRange {

        /* renamed from: beginTs */
        public double f37999xf258fd08;

        /* renamed from: dataOffset */
        public long f38000x447f58dd;

        /* renamed from: dataSize */
        public long f38001x6aa25ecb;

        /* renamed from: endTs */
        public double f38002x5c2c8ba;
    }

    static {
        mq1.w0.wi();
    }

    @java.lang.Deprecated
    /* renamed from: NV21ToYUV420XXAndScaleRotate */
    public static native void m69154xaa5b77e8(byte[] bArr, byte[] bArr2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, boolean z18);

    /* renamed from: addReportArrayMetadata */
    public static void m69155x19f5f973(java.lang.String str, int[] iArr, int i17, int i18) {
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ABA: array method aba switch is closed");
            return;
        }
        byte[] bArr = {1, 0, 0, 0};
        if (iArr != null) {
            bArr[2] = (byte) iArr[3];
        }
        bArr[3] = 68;
        java.lang.String str2 = "wxmmca" + ((iArr == null || iArr[3] <= 0) ? (iArr == null || iArr[4] <= 0) ? "br00" : "br22" : "br11") + ((iArr == null || iArr[35] <= 0) ? "dr0" : "dr1") + ((iArr == null || iArr[20] != 1) ? (iArr == null || iArr[20] != 2) ? "0" : "2" : "1") + "00";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ABA: array method add the metadata filename: [%s] cprt [%s]", str, str2);
        m69245x2bf5d767(str, str2, bArr, true);
        m69219x922a682f(str);
    }

    /* renamed from: addReportMetadata */
    public static void m69156x769d784(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, int i17, int i18) {
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ABA: aba switch is closed");
            return;
        }
        byte[] bArr = {1, 0, 0, 0};
        if (c17683x770f5025 != null) {
            bArr[2] = (byte) c17683x770f5025.f37961x8ac7cede;
        }
        bArr[3] = 68;
        java.lang.String str2 = "wxmmca" + ((c17683x770f5025 == null || c17683x770f5025.f37961x8ac7cede <= 0) ? (c17683x770f5025 == null || c17683x770f5025.f37960xf8085845 <= 0) ? "br00" : "br22" : "br11") + ((c17683x770f5025 == null || c17683x770f5025.f37987x2c4c29be <= 0) ? "dr0" : "dr1") + ((c17683x770f5025 == null || c17683x770f5025.f37975xf23d7137 != 1) ? (c17683x770f5025 == null || c17683x770f5025.f37975xf23d7137 != 2) ? "0" : "2" : "1") + "00";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ABA: add the metadata filename: [%s] cprt [%s]", str, str2);
        m69245x2bf5d767(str, str2, bArr, true);
        m69219x922a682f(str);
    }

    @java.lang.Deprecated
    /* renamed from: blendYuvFrame */
    public static native void m69157x458c0024(byte[] bArr, byte[] bArr2, int i17, int i18);

    /* renamed from: checkAIGCMetaData */
    public static void m69158x329f4f7b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        lp0.b.h0("media").J();
        java.lang.String str3 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_remove_metadata_temp";
        com.p314xaae8f345.mm.vfs.w6.e(str3);
        boolean m69159x329f4f7b = m69159x329f4f7b(com.p314xaae8f345.mm.vfs.w6.i(str, false), com.p314xaae8f345.mm.vfs.w6.i(str2, false), com.p314xaae8f345.mm.vfs.w6.i(str3, true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkAIGCMetaData, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(m69159x329f4f7b), str2, str3);
        if (m69159x329f4f7b) {
            com.p314xaae8f345.mm.vfs.w6.w(str3, str2);
        }
        com.p314xaae8f345.mm.vfs.w6.h(str3);
    }

    /* renamed from: checkAIGCMetaData */
    private static native boolean m69159x329f4f7b(java.lang.String str, java.lang.String str2, java.lang.String str3);

    @java.lang.Deprecated
    /* renamed from: cropCameraData */
    public static native void m69160x80eaf1f(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    @java.lang.Deprecated
    /* renamed from: cropCameraDataLongEdge */
    public static native void m69161x5e678e98(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    @java.lang.Deprecated
    /* renamed from: cropCameraDataLongEdgeCenterCrop */
    public static native void m69162xc8a4d53d(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    /* renamed from: drawFrame */
    public static native int m69163x75e3689(int i17, android.graphics.Bitmap bitmap, int i18, android.graphics.Bitmap bitmap2, boolean z17, boolean z18);

    /* renamed from: drawScaledFrame */
    public static native int m69164xeeb6094f(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    /* renamed from: drawSurfaceColor */
    public static native int m69165x7d50f21a(android.view.Surface surface, int i17);

    /* renamed from: drawSurfaceFrame */
    public static native int m69166x7d7c6c24(int i17, android.view.Surface surface, int i18, android.graphics.Bitmap bitmap, boolean z17);

    /* renamed from: drawSurfaceThumb */
    public static native int m69167x7e3d748d(android.view.Surface surface, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2);

    /* renamed from: finishVideoEncode */
    public static native void m69168xb71d47de(int i17);

    /* renamed from: freeAll */
    public static native int m69169xdc024395();

    /* renamed from: freeObj */
    public static native int m69170xdc0276eb(int i17);

    /* renamed from: getAACADTSHeaderData */
    public static native byte[] m69171x1b3f01a6(int i17, long j17, int i18, int i19, int i27);

    @java.lang.Deprecated
    /* renamed from: getHeight */
    public static native int m69172x1c4fb41d(int i17);

    /* renamed from: getMP4Chpl */
    private static native byte[] m69173x4f54f79c(java.lang.String str);

    /* renamed from: getMP4Cprt */
    private static native byte[] m69174x4f5515ea(java.lang.String str);

    /* renamed from: getMP4CprtH */
    public static java.lang.String m69175x9b4da79e(java.lang.String str) {
        byte[] m69174x4f5515ea;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (m69174x4f5515ea = m69174x4f5515ea(kk.w.a(str, false))) != null && m69174x4f5515ea.length > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= m69174x4f5515ea.length) {
                    i17 = 0;
                    break;
                }
                if (m69174x4f5515ea[i17] == -57) {
                    break;
                }
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tagMP4Cprt, index: %s", java.lang.Integer.valueOf(i17));
            int i18 = i17 + 1;
            if (i18 < m69174x4f5515ea.length) {
                try {
                    int length = m69174x4f5515ea.length - i18;
                    byte[] bArr = new byte[length];
                    java.lang.System.arraycopy(m69174x4f5515ea, i18, bArr, 0, length);
                    return new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: getMP4RecordInfo */
    private static native byte[] m69176x93bc0eda(java.lang.String str);

    /* renamed from: getMp4RecordInfo */
    public static java.lang.String m69177x89f0baba(java.lang.String str) {
        byte[] m69176x93bc0eda;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (m69176x93bc0eda = m69176x93bc0eda(kk.w.a(str, false))) != null && m69176x93bc0eda.length > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= m69176x93bc0eda.length) {
                    i17 = 0;
                    break;
                }
                if (m69176x93bc0eda[i17] == -60) {
                    break;
                }
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getMp4RecordInfo, index: %s", java.lang.Integer.valueOf(i17));
            int i18 = i17 + 1;
            if (i18 < m69176x93bc0eda.length) {
                try {
                    int length = m69176x93bc0eda.length - i18;
                    byte[] bArr = new byte[length];
                    java.lang.System.arraycopy(m69176x93bc0eda, i18, bArr, 0, length);
                    return new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: getMp4Rotate */
    private static native int m69178xe41828f6(java.lang.String str);

    /* renamed from: getMp4RotateVFS */
    public static int m69179x9787f6ed(java.lang.String str) {
        return m69178xe41828f6(kk.w.a(str, false));
    }

    /* renamed from: getMuxerTempVideoPath */
    public static native java.lang.String m69180xc04a2645(int i17);

    /* renamed from: getSimpleMp4Info */
    private static native java.lang.String m69181x83add577(java.lang.String str, boolean z17);

    /* renamed from: getSimpleMp4InfoVFS */
    public static java.lang.String m69182xa23d6ecc(java.lang.String str) {
        return m69181x83add577(kk.w.a(str, false), d11.o.a());
    }

    /* renamed from: getSoftEncodeDtsArray */
    public static native long[] m69184x1be0ef2c(int i17);

    /* renamed from: getSoftEncodePtsArray */
    public static native long[] m69185xfa6f09a0(int i17);

    /* renamed from: getVideoDuration */
    public static native double m69186x36bbd779(int i17);

    /* renamed from: getVideoHeight */
    public static native int m69187x463504c(int i17);

    /* renamed from: getVideoInfo */
    public static native java.lang.String m69188x4edba913(int i17);

    /* renamed from: getVideoMetaData */
    public static native java.lang.String m69189x92967934(java.lang.String str);

    /* renamed from: getVideoPlayTime */
    public static native double m69190x1d732206(int i17);

    /* renamed from: getVideoRate */
    public static native double m69191x4edf9145(int i17);

    /* renamed from: getVideoStartTime */
    public static native double m69192x828f3d0a(int i17);

    /* renamed from: getVideoWidth */
    public static native int m69193x8d5c7601(int i17);

    @java.lang.Deprecated
    /* renamed from: getWidth */
    public static native int m69194x755bd410(int i17);

    /* renamed from: handleThumb */
    public static native int m69195x5864ec8e(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3);

    /* renamed from: initDataBufferForCapture */
    public static native int m69196xa9b2bf97(int i17, int i18, boolean z17, int i19, float f17, int i27, int i28, int i29, float f18, int i37, int i38, boolean z18, boolean z19, boolean z27, java.lang.String str);

    /* renamed from: initDataBufferForHardRemux */
    public static native int m69197x39e35aa3(java.lang.String str, boolean z17, boolean z18, boolean z19);

    @java.lang.Deprecated
    /* renamed from: initDataBufferForMMSight */
    public static native int m69198x96f2444e(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19, java.lang.String str, boolean z27, boolean z28, boolean z29);

    @java.lang.Deprecated
    /* renamed from: initDataBufferForMMSightLock */
    public static int m69200x909fa699(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19, boolean z27, boolean z28) {
        int m69198x96f2444e;
        synchronized (f37995xf10ce6a8) {
            m69198x96f2444e = m69198x96f2444e(i17, i18, i19, i27, i28, f17, i29, i37, i38, i39, f18, i47, i48, z17, z18, i49, z19, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b(), z28, true, z27);
        }
        return m69198x96f2444e;
    }

    /* renamed from: initDataBufferForSoftRemux */
    public static native int m69201xe7a756c4(int i17, int i18, int i19, float f17, boolean z17, int i27, int i28, int i29, float f18, int i37, int i38, boolean z18, int i39, int i47, int i48, boolean z19, java.lang.String str);

    @java.lang.Deprecated
    /* renamed from: initScaleAndRoateBuffer */
    public static native void m69202x4626d238(int i17);

    /* renamed from: isH265Video */
    private static native boolean m69203x53f39ae8(java.lang.String str);

    /* renamed from: isH265VideoVFS */
    public static boolean m69204x8998e7bb(java.lang.String str) {
        return m69203x53f39ae8(kk.w.a(str, false));
    }

    /* renamed from: isSightOk */
    private static native int m69205x59e737cf(java.lang.String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i17);

    /* renamed from: isSightOkVFS */
    public static int m69206x2218cd74(java.lang.String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i17) {
        return m69205x59e737cf(kk.w.a(str, false), iArr, iArr2, iArr3, iArr4, iArr5, i17);
    }

    /* renamed from: loadAACData */
    public static native byte[] m69207x5f67a2c7(int i17);

    @java.lang.Deprecated
    /* renamed from: mirrorCameraData */
    public static native void m69208x53f0f18e(byte[] bArr, int i17, int i18, boolean z17);

    /* renamed from: muxVideo */
    public static native int m69209x39cbde8b(int i17, java.lang.String str, int i18, float f17, boolean z17, int i19, int i27);

    @java.lang.Deprecated
    /* renamed from: muxing */
    private static native int m69210xc0a91e12(int i17, java.lang.String str, int i18, int i19, int i27, int i28, long j17, java.lang.String str2, float f17, int i29, int i37, int i38, int i39, int i47, float f18, int i48, int i49, byte[] bArr, int i57, boolean z17, boolean z18, boolean z19, boolean z27);

    @java.lang.Deprecated
    /* renamed from: muxingLock */
    public static int m69211xec0bfe5d(int i17, java.lang.String str, int i18, int i19, float f17, int i27, int i28, boolean z17, boolean z18) {
        return m69212xec0bfe5d(i17, null, i18, 1024, 2, i19, 0L, str, f17, i27, i28, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243939a, 8, 2, 23.0f, 0, 0, null, 0, false, z17, false, false, z18);
    }

    /* renamed from: nativeBufferCopy */
    public static native void m69213x5793d34c(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18, int i19);

    /* renamed from: nativeCalcAllVideoRangeTs */
    public static native java.lang.String m69214xccd54336(java.lang.String str, double d17, long j17);

    /* renamed from: nativeCalcVideoRangeForTime */
    public static native com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.VideoTSRange m69215xab2d1da8(java.lang.String str, double d17, double d18);

    /* renamed from: openFile */
    private static native int m69216xe1e55ae6(java.lang.String str, int i17, int i18, boolean z17);

    /* renamed from: openFileVFS */
    public static int m69217xc14e3efd(java.lang.String str, int i17, int i18, boolean z17) {
        return m69216xe1e55ae6(kk.w.a(str, false), i17, i18, z17);
    }

    /* renamed from: optimizeMP4 */
    private static native boolean m69218x79c30ef4(java.lang.String str, java.lang.String str2);

    /* renamed from: optimizeMP4VFS */
    public static boolean m69219x922a682f(java.lang.String str) {
        final java.lang.String a17 = kk.w.a(str, true);
        java.lang.String str2 = a17 + ".tmp";
        boolean m69218x79c30ef4 = m69218x79c30ef4(a17, str2);
        if (m69218x79c30ef4) {
            com.p314xaae8f345.mm.vfs.w6.w(str2, a17);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (!a17.contains("/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName()) && !new java.io.File(new java.io.File(a17).getParent(), ".nomedia").exists()) {
                    ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sight.base.SightVideoJNI.1
                        @Override // java.lang.Runnable
                        public void run() {
                            q75.c.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, a17);
                        }
                    }, 800L);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "optimizeMP4VFS error");
            com.p314xaae8f345.mm.vfs.w6.h(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 147L, 1L);
        }
        return m69218x79c30ef4;
    }

    @java.lang.Deprecated
    /* renamed from: paddingYuvData16 */
    public static native void m69220x6eddcfb8(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    /* renamed from: readMetaData */
    private static native java.lang.String m69221x8edeb705(java.lang.String str, java.lang.String str2);

    /* renamed from: readMetaDataVFS */
    public static java.lang.String m69222xef957a7e(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str2 == null) {
            return null;
        }
        return m69221x8edeb705(kk.w.a(str, false), str2);
    }

    /* renamed from: registerALL */
    public static native void m69223x80d827fe();

    /* renamed from: releaseBigSightDataBuffer */
    public static native void m69224x213cc94e(int i17);

    @java.lang.Deprecated
    /* renamed from: releaseBigSightDataBufferLock */
    public static void m69225x381fab99(int i17) {
        synchronized (f37995xf10ce6a8) {
            m69224x213cc94e(i17);
        }
    }

    @java.lang.Deprecated
    /* renamed from: releaseRecorderBuffer */
    public static native int m69226x5980fe85();

    @java.lang.Deprecated
    /* renamed from: releaseRecorderBufferRef */
    public static void m69227xaa33f7ce(java.lang.String str) {
        m69226x5980fe85();
    }

    @java.lang.Deprecated
    /* renamed from: releaseRecorderBufferRefLock */
    public static void m69228xfcdb9a19(java.lang.String str) {
        synchronized (f37995xf10ce6a8) {
            m69226x5980fe85();
        }
    }

    @java.lang.Deprecated
    /* renamed from: releaseScaleAndRoateBuffer */
    public static native void m69229x7e91a5e1(int i17);

    /* renamed from: removeVideoMetadata */
    public static void m69230xd68876a6(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        lp0.b.h0("media").J();
        java.lang.String str2 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_remove_metadata_temp";
        com.p314xaae8f345.mm.vfs.w6.e(str2);
        boolean m69231xd68876a6 = m69231xd68876a6(com.p314xaae8f345.mm.vfs.w6.i(str, false), com.p314xaae8f345.mm.vfs.w6.i(str2, true), z17, z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "removeVideoMetadata, removeCreationTime:%s, removeLocation:%s, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(m69231xd68876a6), str, str2);
        if (m69231xd68876a6) {
            com.p314xaae8f345.mm.vfs.w6.w(str2, str);
        }
        com.p314xaae8f345.mm.vfs.w6.h(str2);
    }

    /* renamed from: removeVideoMetadata */
    private static native boolean m69231xd68876a6(java.lang.String str, java.lang.String str2, boolean z17, boolean z18);

    /* renamed from: remuxing */
    private static native int m69232xe1c47a05(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39, java.lang.String str3, boolean z18);

    /* renamed from: remuxingVFS */
    public static int m69233xcf34d77e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39) {
        boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.d();
        int m69232xe1c47a05 = m69232xe1c47a05(kk.w.a(str, false), kk.w.a(str2, true), i17, i18, i19, i27, i28, i29, f17, f18, bArr, i37, z17, i38, i39, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b(), d17);
        if (d17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(82L, 1L);
            if (m69232xe1c47a05 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(81L, 1L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(80L, 1L);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(85L, 1L);
            if (m69232xe1c47a05 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(84L, 1L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.e(83L, 1L);
            }
        }
        return m69232xe1c47a05;
    }

    @java.lang.Deprecated
    /* renamed from: reportIDKey */
    public static void m69234xf0018e90(long j17, long j18, long j19) {
        try {
            jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, false);
        } catch (java.lang.Error e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "reportIDKey jni called error", new java.lang.Object[0]);
        }
    }

    /* renamed from: rgbaToNV21 */
    public static native void m69235xd544ad56(int[] iArr, byte[] bArr, int i17, int i18);

    /* renamed from: seekStream */
    public static native int m69236xe8495018(double d17, int i17);

    /* renamed from: seekStreamWithFlag */
    public static native int m69237xa4256d8a(double d17, int i17, int i18);

    /* renamed from: setCropBorder */
    public static native int m69238x4192f4de(int i17, int i18, int i19, int i27, int i28);

    /* renamed from: setEnableVCodecEncode */
    public static native void m69239x7390649b(int i17);

    @java.lang.Deprecated
    /* renamed from: setI420Format */
    public static native void m69240x1f55bbc2(int i17, boolean z17);

    @java.lang.Deprecated
    /* renamed from: setRotateForBufId */
    public static native void m69241xeb56bb22(int i17, int i18);

    /* renamed from: setVideoFormatHeader */
    public static native void m69242xebc3cd3d(int i17, java.lang.String[] strArr, int[] iArr);

    /* renamed from: shouldRemuxing */
    private static native int m69243x9dbe90d8(java.lang.String str, int i17, int i18, int i19, double d17, int i27);

    /* renamed from: shouldRemuxingVFS */
    public static int m69244xe35aebcb(java.lang.String str, int i17, int i18, int i19, double d17, int i27) {
        return m69243x9dbe90d8(kk.w.a(str, false), i17, i18, i19, d17, i27);
    }

    /* renamed from: tagMP4CprtChpl */
    public static void m69245x2bf5d767(java.lang.String str, java.lang.String str2, byte[] bArr, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bytes = str2.getBytes();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length + 2);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{21, -57});
        allocateDirect.put(bytes);
        byte[] array = allocateDirect.array();
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(2 + bArr.length);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect2.put(new byte[]{85, -60});
        allocateDirect2.put(bArr);
        byte[] array2 = allocateDirect2.array();
        m69246x2bf5d767(kk.w.a(str, false), array, array.length, array2, array2.length, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tagMP4CprtInfo used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: tagMP4CprtChpl */
    private static native void m69246x2bf5d767(java.lang.String str, byte[] bArr, int i17, byte[] bArr2, int i18, boolean z17);

    /* renamed from: tagMP4Dscp */
    public static void m69247x1f8f4ef3(java.lang.String str, byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || bArr == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(2 + bArr.length);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{85, -60});
        allocateDirect.put(bArr);
        byte[] array = allocateDirect.array();
        m69248x1f8f4ef3(kk.w.a(str, false), array, array.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tagMP4Dscp used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: tagMP4Dscp */
    private static native void m69248x1f8f4ef3(java.lang.String str, byte[] bArr, int i17);

    /* renamed from: tagMP4RecordInfo */
    private static native void m69249x28736d16(java.lang.String str, byte[] bArr, int i17);

    /* renamed from: tagMp4RecordInfo */
    public static void m69250x1ea818f6(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bytes = str2.getBytes();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(2 + bytes.length);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{85, -60});
        allocateDirect.put(bytes);
        byte[] array = allocateDirect.array();
        m69249x28736d16(kk.w.a(str, false), array, array.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tagMP4RecordInfo used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: tagRotateVideo */
    private static native int m69251xa2a56be6(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: tagRotateVideoVFS */
    public static int m69252x50488dfd(java.lang.String str, java.lang.String str2, int i17) {
        return m69251xa2a56be6(kk.w.a(str, false), kk.w.a(str2, true), i17);
    }

    @java.lang.Deprecated
    /* renamed from: triggerEncode */
    public static native int m69253x89b555ee(int i17, int i18, boolean z17);

    /* renamed from: writeAACData */
    public static native void m69254x1f9475ae(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17);

    @java.lang.Deprecated
    /* renamed from: writeAACDataLock */
    public static void m69255xb00a27f9(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17) {
        synchronized (f37995xf10ce6a8) {
            m69254x1f9475ae(i17, byteBuffer, i18, j17);
        }
    }

    /* renamed from: writeAACDataWithADTS */
    public static native void m69256x2491bf76(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17, int i19, int i27, int i28);

    @java.lang.Deprecated
    /* renamed from: writeAACDataWithADTSLock */
    public static void m69257xfe3d4dc1(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17, int i19, int i27, int i28) {
        synchronized (f37995xf10ce6a8) {
            m69256x2491bf76(i17, byteBuffer, i18, j17, i19, i27, i28);
        }
    }

    /* renamed from: writeDtsData */
    public static native void m69258x17f2b74e(int i17, long j17);

    /* renamed from: writeH264Data */
    public static native void m69259x798715d1(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17);

    @java.lang.Deprecated
    /* renamed from: writeH264DataLock */
    public static void m69260x9199fe9c(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17) {
        synchronized (f37995xf10ce6a8) {
            m69259x798715d1(i17, byteBuffer, i18, j17);
        }
    }

    /* renamed from: writeMetaData */
    private static native boolean m69261x77115c4e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: writeMetaDataVFS */
    public static void m69262xd45e495(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        lp0.b.h0("media").J();
        java.lang.String str4 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_write_metadata_temp";
        com.p314xaae8f345.mm.vfs.w6.e(str4);
        boolean m69261x77115c4e = m69261x77115c4e(com.p314xaae8f345.mm.vfs.w6.i(str, false), com.p314xaae8f345.mm.vfs.w6.i(str4, true), str2, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "writeMetaDataVFS, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(m69261x77115c4e), str, str4);
        if (m69261x77115c4e && !com.p314xaae8f345.mm.vfs.w6.x(str4, str, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "writeMetaDataVFS overwrite error, temp:%s, dest:%s", str4, str);
        }
        com.p314xaae8f345.mm.vfs.w6.h(str4);
    }

    /* renamed from: writeRGBDataForMMSight */
    public static native void m69263x83fe2a4c(int i17, java.nio.Buffer buffer, int i18, int i19, boolean z17, boolean z18, int i27, int i28);

    @java.lang.Deprecated
    /* renamed from: writeYuvDataForMMSight */
    public static native void m69264x816aaf99(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, int i28, int i29);

    /* renamed from: writeYuvDataForMMSightEncode */
    public static native void m69265xc600030f(int i17, java.nio.Buffer buffer, int i18, int i19);

    @java.lang.Deprecated
    /* renamed from: writeYuvDataForMMSightWithBuffer */
    public static native void m69266x73a2a51f(int i17, java.nio.Buffer buffer, int i18, int i19, boolean z17, boolean z18, int i27, int i28);

    @java.lang.Deprecated
    /* renamed from: muxingLock */
    public static int m69212xec0bfe5d(int i17, java.lang.String str, int i18, int i19, int i27, int i28, long j17, java.lang.String str2, float f17, int i29, int i37, int i38, int i39, int i47, float f18, int i48, int i49, byte[] bArr, int i57, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        int m69210xc0a91e12;
        synchronized (f37995xf10ce6a8) {
            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            m69210xc0a91e12 = m69210xc0a91e12(i17, kk.w.a(str, false), i18, i19, i27, i28, j17, kk.w.a(str2, true), f17, i29, i37, i38, i39, i47, f18, i48, i49, bArr, i57, z17, z18, z28, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.g());
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.f(m69210xc0a91e12, elapsedRealtime);
        }
        return m69210xc0a91e12;
    }

    /* renamed from: getSimpleMp4InfoVFS */
    public static java.lang.String m69183xa23d6ecc(java.lang.String str, boolean z17) {
        boolean a17 = d11.o.a();
        if (str == null) {
            return null;
        }
        return m69181x83add577(kk.w.a(str, false), a17);
    }

    @java.lang.Deprecated
    /* renamed from: initDataBufferForMMSightLock */
    public static int m69199x909fa699(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19) {
        int m69198x96f2444e;
        synchronized (f37995xf10ce6a8) {
            m69198x96f2444e = m69198x96f2444e(i17, i18, i19, i27, i28, f17, i29, i37, i38, i39, f18, i47, i48, z17, z18, i49, z19, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b(), com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.c(z18, false), true, false);
        }
        return m69198x96f2444e;
    }
}
