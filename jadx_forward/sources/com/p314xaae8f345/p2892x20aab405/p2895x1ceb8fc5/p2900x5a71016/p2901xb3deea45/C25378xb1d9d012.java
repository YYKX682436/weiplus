package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition */
/* loaded from: classes13.dex */
public class C25378xb1d9d012 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {

    /* renamed from: SO_AUDIO_COMMON */
    private static final java.lang.String f45862xe031397 = "audio_common";

    /* renamed from: SO_BASE_NAME */
    private static final java.lang.String f45863x54008916 = "FFmpeg";

    /* renamed from: SO_NAME */
    private static final java.lang.String f45864xb2d33a8e = "ffmpeg_decoder";

    /* renamed from: SO_NEON_BASE_NAME */
    private static final java.lang.String f45865xd6bc5053 = "FFmpeg_v7a";

    /* renamed from: SO_NEON_NAME */
    private static final java.lang.String f45866x227d2131 = "ffmpeg_decoder_v7a";
    private static final java.lang.String TAG = "FfmpegRecognition";

    /* renamed from: isM4a */
    public static boolean m94034x5fd1250(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        byte[] bArr = new byte[4];
        try {
            interfaceC25439x37e1318e.mo94264xc8455469(4L, bArr, 0, 4);
        } catch (java.io.IOException unused) {
        }
        return bArr[0] == 102 && bArr[1] == 116 && bArr[2] == 121 && bArr[3] == 112;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r0 = "FfmpegRecognition"
            if (r6 == 0) goto Le
            int r1 = r6.length
            if (r1 != 0) goto L8
            goto Le
        L8:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L41
        Le:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r5 = 64
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.read(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.close()     // Catch: java.lang.Exception -> L24
            goto L28
        L24:
            r5 = move-exception
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r0, r5)
        L28:
            r5 = r3
            goto L41
        L2a:
            r5 = move-exception
            r1 = r2
            goto L6f
        L2d:
            r5 = move-exception
            goto L33
        L2f:
            r5 = move-exception
            goto L6f
        L31:
            r5 = move-exception
            r2 = r1
        L33:
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r0, r5)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.lang.Exception -> L3c
            goto L40
        L3c:
            r5 = move-exception
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r0, r5)
        L40:
            r5 = r1
        L41:
            if (r5 == 0) goto L4e
            java.lang.String r0 = "ftyp"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L4e
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.M4A
            return r5
        L4e:
            if (r6 == 0) goto L6c
            int r5 = r6.length
            r0 = 2
            if (r5 <= r0) goto L6c
            r5 = 0
            r5 = r6[r5]
            r0 = -1
            if (r5 != r0) goto L6c
            r5 = 1
            r5 = r6[r5]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 240(0xf0, float:3.36E-43)
            if (r6 != r0) goto L6c
            r5 = r5 & 15
            r5 = r5 & 6
            if (r5 != 0) goto L6c
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.M4A
            return r5
        L6c:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT
            return r5
        L6f:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r6 = move-exception
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r0, r6)
        L79:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45.C25378xb1d9d012.mo94000xaa5357a(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        return mo94000xaa5357a(str, null);
    }
}
