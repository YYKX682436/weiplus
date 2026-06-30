package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.AudioFormat */
/* loaded from: classes13.dex */
public class C25315x67516f4d {

    /* renamed from: EXTENSION_AAC */
    private static final java.lang.String f45443x1d003003 = "aac";

    /* renamed from: EXTENSION_AMR */
    private static final java.lang.String f45444x1d003186 = "amr";

    /* renamed from: EXTENSION_APE */
    private static final java.lang.String f45445x1d0031d6 = "ape";

    /* renamed from: EXTENSION_FLAC */
    private static final java.lang.String f45446x83083f88 = "flac";

    /* renamed from: EXTENSION_M4A */
    private static final java.lang.String f45447x1d005b7a = "m4a";

    /* renamed from: EXTENSION_MP3 */
    private static final java.lang.String f45448x1d005ed0 = "mp3";

    /* renamed from: EXTENSION_MP4 */
    private static final java.lang.String f45449x1d005ed1 = "mp4";

    /* renamed from: EXTENSION_OGG */
    private static final java.lang.String f45450x1d00654f = "ogg";

    /* renamed from: EXTENSION_WAV */
    private static final java.lang.String f45451x1d0082ac = "wav";

    /* renamed from: EXTENSION_WMA */
    private static final java.lang.String f45452x1d00840b = "wma";

    /* renamed from: VALUE_AAC */
    private static final int f45453x7887b435 = 11;

    /* renamed from: VALUE_AMR */
    private static final int f45454x7887b5b8 = 6;

    /* renamed from: VALUE_APE */
    private static final int f45455x7887b608 = 5;

    /* renamed from: VALUE_FLAC */
    private static final int f45456x98714196 = 2;

    /* renamed from: VALUE_M4A */
    private static final int f45457x7887dfac = 3;

    /* renamed from: VALUE_MP3 */
    private static final int f45458x7887e302 = 9;

    /* renamed from: VALUE_MP4 */
    private static final int f45459x7887e303 = 10;

    /* renamed from: VALUE_OGG */
    private static final int f45460x7887e981 = 4;

    /* renamed from: VALUE_UNSUPPORT */
    private static final int f45461x4c5f7588 = 1;

    /* renamed from: VALUE_WAV */
    private static final int f45462x788806de = 8;

    /* renamed from: VALUE_WMA */
    private static final int f45463x7888083d = 7;

    /* renamed from: com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType */
    /* loaded from: classes13.dex */
    public enum AudioType {
        UNSUPPORT(1, "Unknown"),
        MP3(9, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45448x1d005ed0),
        OGG(4, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45450x1d00654f),
        M4A(3, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45447x1d005b7a),
        FLAC(2, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45446x83083f88),
        APE(5, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45445x1d0031d6),
        WAV(8, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45451x1d0082ac),
        WMA(7, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45452x1d00840b),
        AMR(6, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45444x1d003186),
        MP4(10, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45449x1d005ed1),
        AAC(11, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.f45443x1d003003);


        /* renamed from: extension */
        private java.lang.String f45467xdb7d1c3f;

        /* renamed from: value */
        private int f45468x6ac9171;

        AudioType(int i17, java.lang.String str) {
            this.f45468x6ac9171 = i17;
            this.f45467xdb7d1c3f = str;
        }

        /* renamed from: getExtension */
        public java.lang.String m93532xdaea8d89() {
            return this.f45467xdb7d1c3f;
        }

        /* renamed from: getValue */
        public int m93533x754a37bb() {
            return this.f45468x6ac9171;
        }
    }

    /* renamed from: getAudioType */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93526xaa5357a(int i17) {
        for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.m93531xcee59d22()) {
            if (audioType.f45468x6ac9171 == i17) {
                return audioType;
            }
        }
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    /* renamed from: isAudioType */
    public static boolean m93527x51750626(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        return (audioType == null || com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT.equals(audioType)) ? false : true;
    }
}
