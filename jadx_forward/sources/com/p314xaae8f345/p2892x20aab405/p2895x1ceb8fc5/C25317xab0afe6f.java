package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure */
/* loaded from: classes13.dex */
public class C25317xab0afe6f {

    /* renamed from: LIB_PREFIX */
    private static final java.lang.String f45483xc3f671ac = "lib";

    /* renamed from: LIB_SUFFIX */
    private static final java.lang.String f45484xc93fb66b = ".so";
    private static final java.lang.String TAG = "AudioPlayerConfigure";

    /* renamed from: mISoLibraryLoader */
    static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29 f45485x743d6296 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29() { // from class: com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.1

        /* renamed from: _hellAccFlag_ */
        private byte f45489x7f11beae;

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29
        /* renamed from: findLibPath */
        public java.lang.String mo67216x3bad2051(java.lang.String str) {
            if (!str.startsWith("lib")) {
                str = "lib".concat(str);
            }
            return !str.endsWith(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.f45484xc93fb66b) ? str.concat(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.f45484xc93fb66b) : str;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29
        /* renamed from: load */
        public boolean mo67217x32c4e6(java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        }
    };

    /* renamed from: minAudioTrackWaitTimeMs */
    static int f45486xab244d8f = 300;

    /* renamed from: sAudioTrackCreator */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25329x8ef3c60e f45487xcee2df24;

    /* renamed from: sIsNlogEnabled */
    private static boolean f45488x7403390e;

    /* renamed from: enableNativeLog */
    public static boolean m93557x3f52cd6a(java.lang.String str) {
        return m93558x3f52cd6a(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.nlog.m93815xfb82e301(), str);
    }

    /* renamed from: findLibPath */
    private static byte[] m93559x3bad2051(byte[] bArr) {
        return f45485x743d6296.mo67216x3bad2051(new java.lang.String(bArr)).getBytes();
    }

    /* renamed from: getAudioTrackCreator */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25329x8ef3c60e m93560xe9ca92a1() {
        return f45487xcee2df24;
    }

    /* renamed from: getSoLibraryLoader */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29 m93561xe920b17c() {
        return f45485x743d6296;
    }

    /* renamed from: setAudioTrackCreator */
    public static void m93562xc5609f15(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25329x8ef3c60e interfaceC25329x8ef3c60e) {
        f45487xcee2df24 = interfaceC25329x8ef3c60e;
    }

    /* renamed from: setAudioTrackMinWaitTimeMs */
    public static void m93563xdede7f43(int i17) {
        f45486xab244d8f = i17;
    }

    /* renamed from: setLog */
    public static void m93564xca027b82(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25331x225a3b interfaceC25331x225a3b) {
        if (interfaceC25331x225a3b != null) {
            interfaceC25331x225a3b.i(TAG, "QQMusicAudioPlayer codec version:1.30.31");
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.m94392xca027b82(interfaceC25331x225a3b);
    }

    /* renamed from: setSoLibraryLoader */
    public static void m93565x1ff74af0(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25332x1be9dc29 interfaceC25332x1be9dc29) {
        if (interfaceC25332x1be9dc29 != null) {
            f45485x743d6296 = interfaceC25332x1be9dc29;
        }
    }

    /* renamed from: enableNativeLog */
    public static boolean m93558x3f52cd6a(java.lang.String str, java.lang.String str2) {
        if (f45488x7403390e) {
            return true;
        }
        java.lang.String mo67216x3bad2051 = m93561xe920b17c().mo67216x3bad2051(str);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[enableNativeLog] loading log lib: " + mo67216x3bad2051);
        boolean z17 = str2 == null;
        if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25334x24a016.m93804x316510(str, str2, 0) && com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25336x3b596f8d.m93819x316510(mo67216x3bad2051) == 0) {
            f45488x7403390e = true;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25334x24a016.m93806xd7e4b002(z17);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[enableNativeLog] succeed");
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[enableNativeLog] failed");
        }
        return f45488x7403390e;
    }
}
