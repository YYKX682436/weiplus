package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.StreamUtils */
/* loaded from: classes13.dex */
public class C25460xc3de28f1 {
    /* renamed from: skipForBufferStream */
    public static long m94406x98f3dfca(java.io.InputStream inputStream, long j17) {
        if (inputStream == null || j17 <= 0) {
            return 0L;
        }
        long j18 = j17;
        long j19 = 0;
        do {
            j18 -= j19;
            j19 = inputStream.skip(j18);
            if (j19 <= 0) {
                break;
            }
        } while (j19 < j18);
        return j19 > 0 ? j17 : j17 - j18;
    }
}
