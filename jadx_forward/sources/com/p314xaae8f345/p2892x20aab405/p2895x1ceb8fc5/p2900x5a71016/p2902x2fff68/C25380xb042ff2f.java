package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2902x2fff68;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.flac.FLACRecognition */
/* loaded from: classes13.dex */
public class C25380xb042ff2f implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a {
    public static final java.lang.String TAG = "FLACRecognition";

    /* renamed from: checkFormatBySoftDecoder */
    private boolean m94035x65bb1304(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d();
        boolean z17 = false;
        try {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            }
        } catch (java.lang.Throwable th7) {
            try {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th7);
                c25375x52862c0d.mo93996x41012807();
            } finally {
                try {
                    c25375x52862c0d.mo93996x41012807();
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th8);
                }
            }
        }
        if (c25375x52862c0d.mo93995x316510(str, false) != 0) {
            c25375x52862c0d.mo93996x41012807();
            return false;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec = c25375x52862c0d.mo93985x6e8c46ec();
        if (mo93985x6e8c46ec != null) {
            if (mo93985x6e8c46ec.m93536xaa5357a() == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC) {
                z17 = true;
            }
        }
        return z17;
    }

    /* renamed from: isFlac */
    public static boolean m94036xb9a2dbb2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        int i17;
        boolean z17;
        int i18;
        byte[] bArr = new byte[10];
        try {
            interfaceC25439x37e1318e.mo94264xc8455469(0L, bArr, 0, 10);
        } catch (java.io.IOException unused) {
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i19 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) > 0) {
                i17 = i19 + 20;
                z17 = true;
            } else {
                i17 = i19 + 10;
                z17 = false;
            }
            if (!z17) {
                byte[] bArr2 = new byte[1];
                try {
                    i18 = interfaceC25439x37e1318e.mo94264xc8455469(i17, bArr2, 0, 1);
                } catch (java.io.IOException unused2) {
                    i18 = 0;
                }
                while (bArr2[0] == 0 && i18 == 1) {
                    i17++;
                    try {
                        i18 = interfaceC25439x37e1318e.mo94264xc8455469(i17, bArr2, 0, 1);
                    } catch (java.io.IOException unused3) {
                    }
                }
            }
        } else {
            i17 = 0;
        }
        byte[] bArr3 = new byte[4];
        try {
            interfaceC25439x37e1318e.mo94264xc8455469(i17, bArr3, 0, 4);
        } catch (java.io.IOException unused4) {
        }
        return bArr3[0] == 102 && bArr3[1] == 76 && bArr3[2] == 97 && bArr3[3] == 67;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94000xaa5357a(java.lang.String str, byte[] bArr) {
        if ((bArr == null || bArr.length <= 0 || !new java.lang.String(bArr).startsWith("flaC")) && !m94035x65bb1304(str)) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        }
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.InterfaceC25373x39d17c6a
    /* renamed from: guessAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94001xd985819(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.toLowerCase().contains(".flac")) {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21 c25437x56394f21 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str);
            boolean z17 = false;
            try {
                c25437x56394f21.mo94263x34264a();
                z17 = m94036xb9a2dbb2(c25437x56394f21);
                c25437x56394f21.close();
            } catch (java.io.IOException unused) {
            }
            if (z17) {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
            }
        }
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }
}
