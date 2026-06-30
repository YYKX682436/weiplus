package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.AudioRecognition */
/* loaded from: classes13.dex */
public class C25318x39612e21 {

    /* renamed from: READ_FILE_HEADER_SIZE */
    private static final int f45490x1ddd6bb9 = 64;
    private static java.lang.String TAG = "AudioRecognition";

    /* renamed from: mRecognitionResultCache */
    private static java.util.HashMap<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> f45492x1a26dfb = new java.util.HashMap<>();

    /* renamed from: mGuessFormatResultCache */
    private static java.util.HashMap<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> f45491xe5d6e8a4 = new java.util.HashMap<>();

    /* renamed from: calcBitDept */
    public static int m93567x3a4364dd(long j17, long j18, int i17, long j19) {
        if (0 == j18 || i17 == 0) {
            return 0;
        }
        double d17 = (((float) j17) * 1000.0f) / ((float) ((i17 * j18) * j19));
        int round = (int) java.lang.Math.round(d17);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "byteNumbers = " + j17 + ",time = " + j18 + ",channels = " + i17 + ",sampleRate = " + j19 + ",bitDept = " + d17);
        return round;
    }

    /* renamed from: getAudioBitDept */
    public static int m93568xfc3752b2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 abstractC25371x4886c813, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396) {
        int i17 = 0;
        boolean z17 = c25316x94782396.m93536xaa5357a() == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
        if (z17) {
            try {
                i17 = (int) abstractC25371x4886c813.mo93991x55bbc89d();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            }
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize((int) c25316x94782396.m93542xf6c809a0(), c25316x94782396.m93539xd13e6146(), 2);
        if (!z17) {
            if (minBufferSize % 2048 != 0) {
                minBufferSize = ((minBufferSize / 2048) + 1) * 2048;
            }
            i17 = minBufferSize;
        }
        int mo93984xb7ec4eb8 = abstractC25371x4886c813.mo93984xb7ec4eb8(i17, new byte[i17]);
        if (mo93984xb7ec4eb8 <= 0) {
            mo93984xb7ec4eb8 = i17 * 2;
        }
        return m93567x3a4364dd(mo93984xb7ec4eb8, abstractC25371x4886c813.mo93988xfdac66b0(), c25316x94782396.m93539xd13e6146(), c25316x94782396.m93542xf6c809a0());
    }

    /* renamed from: getDecoderFormFile */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d m93569x5e22d28e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d();
        if (c25375x52862c0d.mo93995x316510(str, false) == 0) {
            return c25375x52862c0d;
        }
        return null;
    }

    /* renamed from: guessFormat */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93570xf7ed14ae(java.lang.String str) {
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> hashMap = f45491xe5d6e8a4;
        if (hashMap != null && hashMap.containsKey(str)) {
            return f45491xe5d6e8a4.get(str);
        }
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType> it = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25333x2b86e1f8.m93796xfd12497().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a m93795x1c769f9 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25333x2b86e1f8.m93795x1c769f9(it.next());
            if (m93795x1c769f9 != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819 = m93795x1c769f9.mo94001xd985819(str);
                if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(mo94001xd985819)) {
                    f45491xe5d6e8a4.put(str, mo94001xd985819);
                    return mo94001xd985819;
                }
            }
        }
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    /* renamed from: recognitionAudioFormatByExtensions */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93571xa3c80e21(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (f45492x1a26dfb.containsKey(str)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = f45492x1a26dfb.get(str);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "Get from cache " + audioType + ",filepath = " + str + ",retType = " + audioType);
            return audioType;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93570xf7ed14ae = m93570xf7ed14ae(str);
        if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(m93570xf7ed14ae)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly filepath = " + str);
            try {
                m93570xf7ed14ae = m93572x14e0fcb6(str);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            }
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "recognitionAudioFormatByExtensions filepath = " + str + ",guessAudioType = " + m93570xf7ed14ae);
        return m93570xf7ed14ae;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f A[EDGE_INSN: B:50:0x013f->B:18:0x013f BREAK  A[LOOP:0: B:34:0x00d5->B:45:0x00d5], SYNTHETIC] */
    /* renamed from: recognitionAudioFormatExactly */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93572x14e0fcb6(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25318x39612e21.m93572x14e0fcb6(java.lang.String):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }
}
