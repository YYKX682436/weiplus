package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09;

/* renamed from: com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager */
/* loaded from: classes14.dex */
public final class C26506xc08c3740 {
    private static final java.lang.String TAG = "PreloadCodecManager";

    /* renamed from: mIsPreloaded */
    private boolean f54160xadeb6fb1;

    /* renamed from: getPreloadMediaFormat */
    private android.media.MediaFormat m103466x6f018528(java.lang.String str) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 m103307x63bd5790 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103307x63bd5790();
        int i17 = m103307x63bd5790.f54205xf02e8296;
        int i18 = m103307x63bd5790.f54204xfbd2d657;
        int max = java.lang.Math.max(0, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103542xe0b97c67(str, i17, i18));
        mediaFormat.setInteger("width", 1);
        mediaFormat.setInteger("height", 1);
        mediaFormat.setInteger("rotation-degrees", 0);
        mediaFormat.setInteger("max-input-size", java.lang.Math.max(max, 0));
        mediaFormat.setInteger("max-width", i17);
        mediaFormat.setInteger("max-height", i18);
        return mediaFormat;
    }

    /* renamed from: getSurface */
    private android.view.Surface m103467xcf572877() {
        return new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c(1, 1).m103476xcf572877();
    }

    /* renamed from: isInvalidMimeType */
    public static boolean m103468x8ffbce1b(java.lang.String str) {
        return android.text.TextUtils.equals(str, "video/avc") || android.text.TextUtils.equals(str, "video/hevc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preloadCodecByMimeType */
    public void m103469x8267b672(java.lang.String str) {
        android.view.Surface m103467xcf572877 = m103467xcf572877();
        if (m103467xcf572877 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " failed...");
            return;
        }
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 m103324x1c769f9 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.m103324x1c769f9(str);
            m103324x1c769f9.mo103283xd00d62e6(m103466x6f018528(str), m103467xcf572877, (android.media.MediaCrypto) null, 0);
            m103324x1c769f9.mo103289x68ac462();
            m103324x1c769f9.mo103290x360802();
            m103324x1c769f9.mo103284x41012807();
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " surface:" + m103467xcf572877 + " success");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " exception...", th6);
        }
    }

    /* renamed from: preload */
    public final void m103470xed046e09(final java.util.Set<java.lang.String> set) {
        if (!this.f54160xadeb6fb1) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26517x68dfca23.m103555xb158f775(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.1
                @Override // java.lang.Runnable
                public void run() {
                    for (java.lang.String str : set) {
                        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740.m103468x8ffbce1b(str)) {
                            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740.this.m103469x8267b672(str);
                        }
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "preload codec return, for isPreload:" + this.f54160xadeb6fb1 + " apiLevel:" + android.os.Build.VERSION.SDK_INT);
    }
}
