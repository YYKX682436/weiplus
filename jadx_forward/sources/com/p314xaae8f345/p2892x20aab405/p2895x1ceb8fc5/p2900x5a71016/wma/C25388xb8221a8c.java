package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition */
/* loaded from: classes13.dex */
public class C25388xb8221a8c implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {
    public static java.lang.String TAG = "WmaRecognition";

    /* renamed from: HEARER_LENGTH */
    private final int f45909x98f67c8a = 16;

    /* renamed from: WMA_HEADER */
    private final byte[] f45910x1def0d21 = {48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 16
            if (r6 == 0) goto L8
            int r1 = r6.length
            if (r1 < r0) goto L8
            goto L3c
        L8:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1.read(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1.close()     // Catch: java.io.IOException -> L17
            goto L3c
        L17:
            r5 = move-exception
            java.lang.String r1 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.TAG
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r1, r5)
            goto L3c
        L1e:
            r5 = move-exception
            r6 = r1
            goto L58
        L21:
            r5 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L2a
        L26:
            r5 = move-exception
            goto L58
        L28:
            r5 = move-exception
            r1 = r6
        L2a:
            java.lang.String r2 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.TAG     // Catch: java.lang.Throwable -> L26
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r2, r5)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L3b
            r6.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r5 = move-exception
            java.lang.String r6 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.TAG
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r6, r5)
        L3b:
            r6 = r1
        L3c:
            if (r6 == 0) goto L55
            int r5 = r6.length
            if (r5 < r0) goto L55
            r5 = 0
        L42:
            if (r5 >= r0) goto L50
            r1 = r6[r5]
            byte[] r2 = r4.f45910x1def0d21
            r2 = r2[r5]
            if (r1 == r2) goto L4d
            goto L50
        L4d:
            int r5 = r5 + 1
            goto L42
        L50:
            if (r5 != r0) goto L55
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WMA
            return r5
        L55:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT
            return r5
        L58:
            if (r6 == 0) goto L64
            r6.close()     // Catch: java.io.IOException -> L5e
            goto L64
        L5e:
            r6 = move-exception
            java.lang.String r0 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.TAG
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r0, r6)
        L64:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wma.C25388xb8221a8c.mo94000xaa5357a(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wma")) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WMA;
    }
}
