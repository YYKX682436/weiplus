package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674;

/* renamed from: com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper */
/* loaded from: classes14.dex */
public final class C26509xdf1d2322 {
    public static final java.lang.String TAG = "ReuseHelper";

    /* renamed from: com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$AdaptationWorkaroundMode */
    /* loaded from: classes6.dex */
    public enum AdaptationWorkaroundMode {
        ADAPTATION_WORKAROUND_MODE_NEVER,
        ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION,
        ADAPTATION_WORKAROUND_MODE_ALWAYS
    }

    /* renamed from: com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper$ReuseType */
    /* loaded from: classes14.dex */
    public enum ReuseType {
        KEEP_CODEC_RESULT_NO,
        KEEP_CODEC_RESULT_YES_WITH_FLUSH,
        KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION,
        KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION
    }

    private C26509xdf1d2322() {
    }

    /* renamed from: codecAdaptationWorkaroundMode */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.AdaptationWorkaroundMode m103487xef90f50a(java.lang.String str) {
        return (android.os.Build.VERSION.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().startsWith("SM-T585") || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().startsWith("SM-A510") || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().startsWith("SM-A520") || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().startsWith("SM-J700"))) ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_ALWAYS : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_NEVER;
    }

    /* renamed from: initFormatWrapper */
    public static void m103488x1717156c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c, android.media.MediaFormat mediaFormat) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 m103307x63bd5790 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103307x63bd5790();
        int max = java.lang.Math.max(m103307x63bd5790.f54205xf02e8296, c26493xe13fc07c.f54093x6be2dc6);
        int max2 = java.lang.Math.max(m103307x63bd5790.f54204xfbd2d657, c26493xe13fc07c.f54083xb7389127);
        if (m103307x63bd5790.f54206x508b7ee1) {
            m103307x63bd5790.f54205xf02e8296 = max;
            m103307x63bd5790.f54204xfbd2d657 = max2;
        }
        int max3 = java.lang.Math.max(0, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103543xe0b97c67(c26493xe13fc07c.f54091x7fd47d58, max, max2, false));
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "initFormatWrapper initWidth:" + max + " initHeight:" + max2 + " initMaxInputSize:" + max3 + " reusePolicy:" + m103307x63bd5790);
        }
        c26493xe13fc07c.f54089x17dd56c2 = max;
        c26493xe13fc07c.f54087xc9fe87ab = max2;
        c26493xe13fc07c.f54088x10e801e7 = max3;
        mediaFormat.setInteger("max-input-size", java.lang.Math.max(max3, 0));
        if (c26493xe13fc07c.m103389x7b98c171()) {
            mediaFormat.setInteger("max-width", max);
            mediaFormat.setInteger("max-height", max2);
        }
    }

    /* renamed from: isSeamlessAdaptationSupported */
    public static boolean m103489xaedbdb3a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        return m103490xaedbdb3a(abstractC26494xe34e9411, c26493xe13fc07c, false);
    }

    /* renamed from: isSeamlessAdaptationSupported */
    public static boolean m103490xaedbdb3a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c2 = abstractC26494xe34e9411.f54112x3cc1ec4;
        if (abstractC26494xe34e9411 instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
            if (android.text.TextUtils.equals(c26493xe13fc07c2.f54091x7fd47d58, c26493xe13fc07c.f54091x7fd47d58) && c26493xe13fc07c2.f54090x461e29c9 == c26493xe13fc07c.f54090x461e29c9) {
                return abstractC26494xe34e9411.f54101xd7257e03 || (c26493xe13fc07c2.f54093x6be2dc6 == c26493xe13fc07c.f54093x6be2dc6 && c26493xe13fc07c2.f54083xb7389127 == c26493xe13fc07c.f54083xb7389127);
            }
            return false;
        }
        if (!(abstractC26494xe34e9411 instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26488x28070673)) {
            return true;
        }
        if (android.text.TextUtils.equals("audio/mp4a-latm", c26493xe13fc07c2.f54091x7fd47d58)) {
            android.text.TextUtils.equals(c26493xe13fc07c2.f54091x7fd47d58, c26493xe13fc07c.f54091x7fd47d58);
        }
        return false;
    }
}
