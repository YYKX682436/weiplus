package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wav;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.wav.WaveReader */
/* loaded from: classes13.dex */
public class C25387x852dd53c {
    private static final java.lang.String TAG = "WaveReader";

    /* renamed from: WAV_FORMAT */
    private static final int f45905xad5d9cca = 1463899717;

    /* renamed from: WAV_FORMAT_CHUNK_ID */
    private static final int f45906x39b45c22 = 1718449184;

    /* renamed from: WAV_HEADER_CHUNK_ID */
    private static final int f45907x69cefa4c = 1380533830;

    /* renamed from: WAV_HEADER_SIZE */
    private static final int f45908xa67ca580 = 50;

    /* renamed from: byteToShortLE */
    private static short m94070x59401fd2(byte b17, byte b18) {
        return (short) ((b17 & 255) | ((b18 & 255) << 8));
    }

    /* renamed from: isWavFormat */
    public static boolean m94071x6e430ff9(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        byte[] bArr = new byte[50];
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream(str);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            int m94072x28ebed44 = m94072x28ebed44(bArr, 0);
            if (m94072x28ebed44 != f45907x69cefa4c) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isWavFormat Invalid WAVE header chunk ID = " + m94072x28ebed44);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e18);
                }
                return false;
            }
            int m94072x28ebed442 = m94072x28ebed44(bArr, 8);
            if (m94072x28ebed442 != f45905xad5d9cca) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isWavFormat Invalid WAVE format = " + m94072x28ebed442);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e19);
                }
                return false;
            }
            int m94072x28ebed443 = m94072x28ebed44(bArr, 12);
            if (m94072x28ebed443 != f45906x39b45c22) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isWavFormat Invalid WAVE format chunk ID formatId = " + m94072x28ebed443);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e27);
                }
                return false;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isWavFormat formatSize = " + m94073x9da5b5bd(bArr, 16));
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isWavFormat mAudioFormat = " + ((int) m94074xd19c01ca(bArr, 20)));
            try {
                fileInputStream.close();
                return true;
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e28);
                return true;
            }
        } catch (java.lang.Exception e29) {
            e = e29;
            fileInputStream2 = fileInputStream;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.lang.Exception e37) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e37);
                }
            }
            return false;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.lang.Exception e38) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e38);
                }
            }
            throw th;
        }
    }

    /* renamed from: readUnsignedInt */
    private static int m94072x28ebed44(byte[] bArr, int i17) {
        if (i17 + 4 > bArr.length) {
            return -1;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    /* renamed from: readUnsignedIntLE */
    private static int m94073x9da5b5bd(byte[] bArr, int i17) {
        if (i17 + 4 > bArr.length) {
            return -1;
        }
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[0] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    /* renamed from: readUnsignedShortLE */
    private static short m94074xd19c01ca(byte[] bArr, int i17) {
        if (i17 + 2 > bArr.length) {
            return (short) -1;
        }
        return m94070x59401fd2(bArr[i17], bArr[i17 + 1]);
    }
}
