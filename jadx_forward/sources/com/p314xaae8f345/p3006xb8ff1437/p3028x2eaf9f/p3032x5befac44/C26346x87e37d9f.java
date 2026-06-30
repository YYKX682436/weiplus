package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44;

/* renamed from: com.tencent.thumbplayer.core.decoder.TPMediaCodecManager */
/* loaded from: classes14.dex */
public class C26346x87e37d9f {
    private static final java.lang.String TAG = "TPMediaCodecManager";

    /* renamed from: mCodecList */
    private static android.util.SparseArray<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d> f52573x37b083e7 = new android.util.SparseArray<>();

    /* renamed from: codecNum */
    private static java.util.concurrent.atomic.AtomicInteger f52572xcc4a2390 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: _onMediaCodecException */
    private static native void m102106xf63fce7f(int i17, java.lang.String str);

    /* renamed from: _onMediaCodecReady */
    private static native void m102107x12fc6fd3(int i17, java.lang.String str);

    /* renamed from: _onMediaCodecReportEvent */
    private static native void m102108xd1c97ff6(int i17, int i18);

    /* renamed from: _onMediaDrmInfo */
    private static native void m102109x4173b007(int i17, java.lang.Object obj);

    /* renamed from: addCodecToList */
    private static void m102110x9681c20e(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d interfaceC26342xbf303b4d) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.class) {
            f52573x37b083e7.put(i17, interfaceC26342xbf303b4d);
        }
    }

    /* renamed from: createMediaCodec */
    public static int m102111xdee270ae(boolean z17) {
        if (f52572xcc4a2390.get() >= Integer.MAX_VALUE) {
            f52572xcc4a2390.set(0);
        }
        int andIncrement = f52572xcc4a2390.getAndIncrement();
        m102110x9681c20e(andIncrement, z17 ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26345x4b844dc(andIncrement) : new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26348x5a80b897(andIncrement));
        return andIncrement;
    }

    /* renamed from: flushMediaCodec */
    public static int m102112xf37a20b6(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102035x5d03b04();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "flushMediaCodec failed!");
        return 3;
    }

    /* renamed from: getCodecById */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d interfaceC26342xbf303b4d;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.class) {
            interfaceC26342xbf303b4d = f52573x37b083e7.get(i17);
        }
        if (interfaceC26342xbf303b4d != null) {
            return interfaceC26342xbf303b4d;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "No such codec by id:" + i17);
        return null;
    }

    /* renamed from: getSDKVersion */
    public static int m102114xf491df34() {
        return android.os.Build.VERSION.SDK_INT;
    }

    /* renamed from: initAudioMediaCodec */
    public static boolean m102115xf382b3d8(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "initAudioMediaCodec failed!");
            return false;
        }
        if (m102113xbc625652.mo102036xaa9e0d14(str, i18, i19, i27, i28)) {
            return m102113xbc625652.mo102051x53ec2d82();
        }
        return false;
    }

    /* renamed from: initVideoMediaCodec */
    public static boolean m102116x9d56623d(int i17, java.lang.String str, int i18, int i19, int i27, android.view.Surface surface, int i28, int i29, int i37) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "initVideoMediaCodec failed!");
            return false;
        }
        if (m102113xbc625652.mo102037xaa9e0d14(str, i18, i19, i27, surface, i28, i29, i37)) {
            return m102113xbc625652.mo102051x53ec2d82();
        }
        return false;
    }

    /* renamed from: onMediaCodecException */
    public static void m102117xa9f8d7e(int i17, java.lang.String str) {
        m102106xf63fce7f(i17, str);
    }

    /* renamed from: onMediaCodecReady */
    public static void m102118x20d98652(int i17, java.lang.String str) {
        m102107x12fc6fd3(i17, str);
    }

    /* renamed from: onMediaCodecReportEvent */
    public static void m102119x4d357b35(int i17, int i18) {
        m102108xd1c97ff6(i17, i18);
    }

    /* renamed from: onMediaDrmInfo */
    public static void m102120xe90741e8(int i17, java.lang.Object obj) {
        m102109x4173b007(i17, obj);
    }

    /* renamed from: receiveOneFrame */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f m102121xa725eaa(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102034x436dd5f1();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "receiveOneFrame failed!");
        return null;
    }

    /* renamed from: releaseMediaCodec */
    public static int m102122x6ad4e5f9(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "releaseMediaCodec failed!");
            return 3;
        }
        m102124x2e62837a(i17);
        return m102113xbc625652.mo102038x41012807();
    }

    /* renamed from: releaseVideoFrame */
    public static int m102123x96f22119(int i17, int i18, boolean z17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102039xab26be48(i18, z17, j17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "releaseVideoFrame failed!");
        return 3;
    }

    /* renamed from: removeCodecFromList */
    private static void m102124x2e62837a(int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.class) {
            f52573x37b083e7.remove(i17);
        }
    }

    /* renamed from: sendOnePacket */
    public static int m102125x65a54be6(int i17, byte[] bArr, boolean z17, long j17, boolean z18) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102033xb06291ee(bArr, z17, j17, z18);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "sendOnePacket failed!");
        return 3;
    }

    /* renamed from: setCryptoInfo */
    public static void m102126xa59e8711(int i17, int i18, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i19, int i27, int i28) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamObject failed!");
        } else {
            m102113xbc625652.mo102040xa59e8711(i18, iArr, iArr2, bArr, bArr2, i19, i27, i28);
        }
    }

    /* renamed from: setMediaCodecOperateRate */
    public static int m102127xdab02750(int i17, float f17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102041x77b122c2(f17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecOperateRate failed!");
        return 3;
    }

    /* renamed from: setMediaCodecParamBool */
    public static boolean m102128x84a2bae3(int i17, int i18, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102043xd02fead5(i18, z17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamBool failed!");
        return false;
    }

    /* renamed from: setMediaCodecParamBytes */
    public static boolean m102129xfb93f92(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102044x35d20de0(i18, bArr);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamBytes failed!");
        return false;
    }

    /* renamed from: setMediaCodecParamInt */
    public static boolean m102130xa970b4d6(int i17, int i18, int i19) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102045xbc64bea4(i18, i19);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamInt failed!");
        return false;
    }

    /* renamed from: setMediaCodecParamLong */
    public static boolean m102131x84a74675(int i17, int i18, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102046xd0347667(i18, j17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamLong failed!");
        return false;
    }

    /* renamed from: setMediaCodecParamObject */
    public static boolean m102132xfc5508f8(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102047x9956046a(i18, obj);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamObject failed!");
        return false;
    }

    /* renamed from: setMediaCodecParamString */
    public static boolean m102133x429c5ca(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102048xa12ac13c(i18, str);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecParamString failed!");
        return false;
    }

    /* renamed from: setMediaCodecSharpenSwitch */
    public static int m102134x90fecef3(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102049xf1aeb5e5();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecSharpenSwitch failed!");
        return 3;
    }

    /* renamed from: setMediaCodecSurface */
    public static int m102135x422bf179(int i17, android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102042x610a9b2a(surface);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecSurface failed!");
        return 3;
    }

    /* renamed from: signalEndOfStream */
    public static int m102136x4eaf2e6a(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102050x4eaf2e6a();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "signalEndOfStream failed!");
        return 3;
    }

    /* renamed from: switchHdrModeWithSurface */
    public static int m102137x40944be2(int i17, android.view.Surface surface, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d m102113xbc625652 = m102113xbc625652(i17);
        if (m102113xbc625652 != null) {
            return m102113xbc625652.mo102052x40944be2(surface, i18);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "setMediaCodecSurface failed!");
        return 3;
    }
}
