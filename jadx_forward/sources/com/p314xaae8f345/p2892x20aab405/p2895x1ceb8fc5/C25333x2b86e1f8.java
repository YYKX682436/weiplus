package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.MediaCodecFactory */
/* loaded from: classes13.dex */
public class C25333x2b86e1f8 {
    private static final java.lang.String TAG = "MediaCodecFactory";

    /* renamed from: mDecoderMap */
    private static java.util.HashMap<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType, java.lang.Class<? extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a>> f45602x9432e2c5 = new java.util.HashMap<>();

    /* renamed from: mSupportAudioType */
    private static java.util.ArrayList<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> f45603x8e1087ae = new java.util.ArrayList<>();

    static {
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.M4A, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45.C25378xb1d9d012.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.OGG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.ogg.C25385x28206404.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2902x2fff68.C25380xb042ff2f.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25384x7eb4c6a7.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.APE, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.ape.C25377x39626fe1.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WAV, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wav.C25386x2b905d4b.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WMA, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP4, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45.C25378xb1d9d012.class);
        m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.AAC, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45.C25378xb1d9d012.class);
    }

    /* renamed from: createDecoderByType */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a m93795x1c769f9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(audioType) || !f45602x9432e2c5.containsKey(audioType)) {
            return null;
        }
        try {
            return f45602x9432e2c5.get(audioType).newInstance();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "createDecoderByType error", th6);
            return null;
        }
    }

    /* renamed from: getSupportAudioType */
    public static java.util.ArrayList<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> m93796xfd12497() {
        return new java.util.ArrayList<>(f45603x8e1087ae);
    }

    /* renamed from: registerDecoder */
    private static void m93797x533be821(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType, java.lang.Class<? extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a> cls) {
        f45602x9432e2c5.put(audioType, cls);
        f45603x8e1087ae.add(audioType);
    }

    /* renamed from: unRegisterDecoder */
    public static void m93798xe21e6c48(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        f45603x8e1087ae.remove(audioType);
        f45602x9432e2c5.remove(audioType);
    }
}
