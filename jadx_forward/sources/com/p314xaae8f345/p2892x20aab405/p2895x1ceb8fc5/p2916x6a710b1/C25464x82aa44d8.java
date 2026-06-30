package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2916x6a710b1;

/* renamed from: com.tencent.qqmusic.mediaplayer.utils.AudioUtil */
/* loaded from: classes13.dex */
public class C25464x82aa44d8 {

    /* renamed from: DEFAULT_DECODE_BUFFER_SIZE */
    private static final int f46178xb978e6ad = 8192;
    private static final java.lang.String TAG = "AudioUtil";

    /* renamed from: getDecodeBufferSize */
    public static int m94416xa4088c65(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec = c25375x52862c0d.mo93985x6e8c46ec();
        int mo93991x55bbc89d = (mo93985x6e8c46ec == null || mo93985x6e8c46ec.m93536xaa5357a() != com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC) ? 0 : (int) c25375x52862c0d.mo93991x55bbc89d();
        if (mo93991x55bbc89d <= 0) {
            return 8192;
        }
        return mo93991x55bbc89d;
    }

    /* renamed from: getDecodeBufferSizeForPlay */
    public static int m94417x9e233f78(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d) {
        int i17;
        int m94416xa4088c65 = m94416xa4088c65(c25375x52862c0d);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec = c25375x52862c0d.mo93985x6e8c46ec();
        if (mo93985x6e8c46ec == null || mo93985x6e8c46ec.m93536xaa5357a() == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC) {
            return m94416xa4088c65;
        }
        int m93539xd13e6146 = mo93985x6e8c46ec.m93539xd13e6146();
        if (m93539xd13e6146 == 1) {
            i17 = 4;
        } else {
            if (m93539xd13e6146 != 2) {
                if (m93539xd13e6146 == 6) {
                    i17 = 252;
                } else if (m93539xd13e6146 == 8) {
                    i17 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
                }
            }
            i17 = 12;
        }
        return java.lang.Math.max(android.media.AudioTrack.getMinBufferSize((int) mo93985x6e8c46ec.m93542xf6c809a0(), i17, mo93985x6e8c46ec.m93537xbc5bbb2c() == 1 ? 3 : 2), m94416xa4088c65);
    }

    /* renamed from: getDecoder */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d m94418x99bce80e(java.lang.String str, boolean z17, long j17, long j18) {
        return z17 ? m94419xfff18b53(str, j17, j18) : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25318x39612e21.m93569x5e22d28e(str);
    }

    /* renamed from: getDecoderFromTrack */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d m94419xfff18b53(java.lang.String str, long j17, long j18) {
        if (android.text.TextUtils.isEmpty(str) || j17 >= j18) {
            return null;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.AbstractC25357x47859e49.f45739x6698f8e);
        c25358xa2ed4c79.m93900x4ab94e43(str);
        c25358xa2ed4c79.m93902x845c6269(j17);
        c25358xa2ed4c79.m93899x12a3340f(j18);
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0 c25450x685bfff0 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0(c25358xa2ed4c79);
            if (c25375x52862c0d.mo93993x316510(c25450x685bfff0) != 0) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "init decoder from track failed!");
                return null;
            }
            long mo94148x35ce78 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25407xdbc379bf(c25375x52862c0d).mo94148x35ce78(j18);
            if (mo94148x35ce78 <= 0) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "endPos from track <= 0");
                return null;
            }
            c25450x685bfff0.m94325x83ddae0a(mo94148x35ce78);
            c25375x52862c0d.mo93997xc9fc1b13((int) j17);
            return c25375x52862c0d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            return null;
        }
    }

    /* renamed from: getPlaybackHeadPositionSafely */
    public static int m94420x5e709fd4(android.media.AudioTrack audioTrack) {
        if (audioTrack != null) {
            try {
                return audioTrack.getPlaybackHeadPosition();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getPlaybackHeadPositionSafely", e17);
            }
        }
        return 0;
    }
}
