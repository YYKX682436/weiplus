package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPMediaDecoderList */
/* loaded from: classes13.dex */
public final class C26308xa59a071a {

    /* renamed from: GET_SYSTEM_MEDIA_CODEC_LIST_TIMEOUT_MS */
    private static final int f52180x8270feba = 2000;

    /* renamed from: MEDIA_DECODER_INFO_KEY */
    private static final java.lang.String f52181x658b7404 = "DecoderInfos_Key";

    /* renamed from: MEDIA_DECODER_VERSION */
    private static java.lang.String f52182x51b1e922 = "2.33.0.1025.wechat";

    /* renamed from: MEDIA_DECODER_VERSION_KEY */
    private static final java.lang.String f52183xe6a0d9a2 = "Version_Key";
    private static final java.lang.String TAG = "TPMediaDecoderList";

    /* renamed from: sDecoderInfos */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] f52184xe9e4dfb4;

    /* renamed from: access$000 */
    public static /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101841xbbd77af0() {
        return m101849xed5986d5();
    }

    /* renamed from: buildCacheDecoderVersion */
    private static java.lang.String m101842x38da02c8() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f52182x51b1e922);
        stringBuffer.append("_");
        stringBuffer.append(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        stringBuffer.append("_");
        stringBuffer.append(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101952x9bd081ad());
        stringBuffer.append("_");
        stringBuffer.append(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101953xe125e46f());
        stringBuffer.append("_");
        stringBuffer.append(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101934xb471af00());
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: cacheDecoderInfos */
    private static void m101843xaa47043(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] c26307xa598bb2aArr) {
        try {
            c26450xc2f3a6f7.put(f52181x658b7404, (java.io.Serializable) c26307xa598bb2aArr);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "cache decode infos failed");
        }
    }

    /* renamed from: cacheVersion */
    private static void m101844x8c92eef6(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7, java.lang.String str) {
        try {
            c26450xc2f3a6f7.put(f52183xe6a0d9a2, str);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "cache version failed");
        }
    }

    /* renamed from: getCachedDecoderInfos */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101845x7167f3d9(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7) {
        try {
            return (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[]) c26450xc2f3a6f7.m102933x27fe6b87(f52181x658b7404);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "get decoder info failed");
            return null;
        }
    }

    /* renamed from: getCachedVersion */
    private static java.lang.String m101846x41c505a0(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7) {
        try {
            java.lang.String m102934x2fd32859 = c26450xc2f3a6f7.m102934x2fd32859(f52183xe6a0d9a2);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "version:" + m102934x2fd32859);
            return m102934x2fd32859;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "get version failed");
            return null;
        }
    }

    /* renamed from: getCodecInfos */
    private static final android.media.MediaCodecInfo[] m101847xd0468705() {
        try {
            return new android.media.MediaCodecList(1).getCodecInfos();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "getCodecInfos MediaCodecList " + e17.getMessage());
            return new android.media.MediaCodecInfo[0];
        }
    }

    /* renamed from: getLocalCacheMediaCodecList */
    private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101848xa8636e7d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101845x7167f3d9;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getLocalCacheMediaCodecList");
        if (!android.text.TextUtils.equals(m101846x41c505a0(c26450xc2f3a6f7), m101842x38da02c8()) || (m101845x7167f3d9 = m101845x7167f3d9(c26450xc2f3a6f7)) == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getCachedDecoderInfos length " + m101845x7167f3d9.length);
        return m101845x7167f3d9;
    }

    /* renamed from: getSystemMediaCodecList */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101849xed5986d5() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getSystemMediaCodecList");
        android.media.MediaCodecInfo[] m101847xd0468705 = m101847xd0468705();
        if (m101847xd0468705 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.MediaCodecInfo mediaCodecInfo : m101847xd0468705) {
            if (!mediaCodecInfo.isEncoder()) {
                for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a(str, mediaCodecInfo.getName(), mediaCodecInfo.getCapabilitiesForType(str));
                    if (c26307xa598bb2a.m101838xfb53f2f2()) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "MediaCodecList codecName " + mediaCodecInfo.getName() + " supportedType " + str);
                        arrayList.add(c26307xa598bb2a);
                    }
                }
            }
        }
        return (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[]) arrayList.toArray(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[arrayList.size()]);
    }

    /* renamed from: getSystemMediaCodecListAsyncAndTimeOutWait */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101850x5ee56886() {
        boolean z17;
        final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[][] c26307xa598bb2aArr = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.class, 1, 1);
        c26307xa598bb2aArr[0] = null;
        final boolean[] zArr = {false};
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.common.TPMediaDecoderList.1
            @Override // java.lang.Runnable
            public void run() {
                c26307xa598bb2aArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101841xbbd77af0();
                synchronized (c26307xa598bb2aArr) {
                    zArr[0] = true;
                    c26307xa598bb2aArr.notify();
                }
            }
        }).start();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (c26307xa598bb2aArr) {
            z17 = false;
            for (long j17 = 2000; j17 > 0; j17 -= java.lang.System.currentTimeMillis() - currentTimeMillis) {
                if (zArr[0]) {
                    break;
                }
                try {
                    c26307xa598bb2aArr.wait(j17);
                } catch (java.lang.InterruptedException unused) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] c26307xa598bb2aArr2 = c26307xa598bb2aArr[0];
        return c26307xa598bb2aArr2 == null ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[0] : c26307xa598bb2aArr2;
    }

    /* renamed from: getTPMediaDecoderInfos */
    public static final synchronized com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101851x1afabf73(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] c26307xa598bb2aArr;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.class) {
            if (f52184xe9e4dfb4 == null || c26450xc2f3a6f7 == null) {
                f52184xe9e4dfb4 = m101852x1992a6a4(c26450xc2f3a6f7);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] c26307xa598bb2aArr2 = f52184xe9e4dfb4;
            c26307xa598bb2aArr = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[]) java.util.Arrays.copyOf(c26307xa598bb2aArr2, c26307xa598bb2aArr2.length);
        }
        return c26307xa598bb2aArr;
    }

    /* renamed from: initCodecList */
    private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101852x1992a6a4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101848xa8636e7d = m101848xa8636e7d(c26450xc2f3a6f7);
        if (m101848xa8636e7d != null && m101848xa8636e7d.length != 0) {
            return m101848xa8636e7d;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101850x5ee56886 = m101850x5ee56886();
        m101853x79bba708(c26450xc2f3a6f7, m101850x5ee56886);
        return m101850x5ee56886;
    }

    /* renamed from: storeLocalCacheMediaCodecList */
    private static final void m101853x79bba708(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] c26307xa598bb2aArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "storeLocalCacheMediaCodecList");
        m101843xaa47043(c26450xc2f3a6f7, c26307xa598bb2aArr);
        m101844x8c92eef6(c26450xc2f3a6f7, m101842x38da02c8());
    }
}
