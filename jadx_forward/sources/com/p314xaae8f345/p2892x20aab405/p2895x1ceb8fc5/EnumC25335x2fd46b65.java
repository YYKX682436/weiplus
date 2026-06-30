package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.NativeLibs */
/* loaded from: classes13.dex */
public enum EnumC25335x2fd46b65 {
    nlog("NLog", 1),
    audioCommon("audio_common", 1),
    QmNativeDataSource("QmNativeDataSource", 1),
    formatDetector("FormatDetector", 1),
    codecFactory("codec_factory", 3),
    decoderJni("qqmusic_decoder_jni", 3),
    xFFmpeg("xffmpeg", 3),
    cppShared("c++_shared", 3),
    xlog("wechatxlog", 3);


    /* renamed from: SUFFIX */
    private static final android.util.SparseArray<java.lang.String> f45611x9270eb51;
    private static final java.lang.String TAG = "NativeLibs";

    /* renamed from: mHasLoadSoSuccess */
    private boolean f45620x592399d4;

    /* renamed from: name */
    private final java.lang.String f45621x337a8b;

    /* renamed from: supportedAbi */
    private final long f45622xa43dc4da;

    static {
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        f45611x9270eb51 = sparseArray;
        sparseArray.put(1, "");
        sparseArray.put(2, "");
    }

    EnumC25335x2fd46b65(java.lang.String str, long j17) {
        this.f45621x337a8b = str;
        this.f45622xa43dc4da = j17;
    }

    /* renamed from: loadAll */
    public static boolean m93811x14104adb(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65... enumC25335x2fd46b65Arr) {
        return m93810x14104adb(java.util.Arrays.asList(enumC25335x2fd46b65Arr));
    }

    /* renamed from: loadLibrary */
    private boolean m93812xeb57c8f5(java.lang.String str) {
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[loadLibrary] loading: " + str);
            z17 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93561xe920b17c().mo67217x32c4e6(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[loadLibrary] failed: " + str, th6);
        }
        if (z17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[loadLibrary] succeed: " + str);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[loadLibrary] failed: " + str);
        }
        return z17;
    }

    /* renamed from: getName */
    public java.lang.String m93815xfb82e301() {
        return this.f45621x337a8b;
    }

    /* renamed from: load */
    public boolean m93816x32c4e6() {
        if (this.f45620x592399d4) {
            return true;
        }
        boolean m93812xeb57c8f5 = m93812xeb57c8f5(m93815xfb82e301());
        this.f45620x592399d4 = m93812xeb57c8f5;
        return m93812xeb57c8f5;
    }

    /* renamed from: supportAbi */
    public boolean m93817xdb683a19(int i17) {
        long j17 = i17;
        return (this.f45622xa43dc4da & j17) == j17;
    }

    /* renamed from: loadAll */
    public static boolean m93810x14104adb(java.lang.Iterable<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65> iterable) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65> it = iterable.iterator();
        while (it.hasNext()) {
            if (!it.next().m93816x32c4e6()) {
                return false;
            }
        }
        return true;
    }
}
