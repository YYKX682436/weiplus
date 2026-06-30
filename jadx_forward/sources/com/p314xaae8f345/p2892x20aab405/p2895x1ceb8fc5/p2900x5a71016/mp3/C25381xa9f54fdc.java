package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.mp3.MP3FileCheck */
/* loaded from: classes13.dex */
public class C25381xa9f54fdc {
    private static final java.lang.String TAG = "MP3FileCheck";

    /* renamed from: endPos */
    private int f45867xb2963f79;
    private boolean eof;

    /* renamed from: frameCount */
    private int f45868xee5393a2;

    /* renamed from: headerMask */
    private int f45872x75db4f19;

    /* renamed from: mFilePath */
    private java.lang.String f45874xf924574e;
    private int pos;

    /* renamed from: skipped */
    private int f45877x7fff6730;

    /* renamed from: sync */
    private boolean f45878x361a9b;

    /* renamed from: hasCheck */
    private boolean f45869x6d4f28e = false;

    /* renamed from: mRandomAccessFile */
    private java.io.RandomAccessFile f45876xcbcb80b0 = null;

    /* renamed from: mID3V2Size */
    private int f45875x21f3b68 = -1;

    /* renamed from: hasID3V2 */
    private boolean f45870x71864ba = false;

    /* renamed from: header */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25382x196b059d f45871xb734e28d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25382x196b059d();
    private byte[] buf = new byte[8192];

    /* renamed from: isMP3 */
    private boolean f45873x5fd1586 = false;

    public C25381xa9f54fdc(java.lang.String str) {
        this.f45874xf924574e = null;
        this.f45874xf924574e = str;
    }

    /* renamed from: available */
    private boolean m94037xd4418ac9(int i17, int i18) {
        int i19;
        return ((i17 & i18) != i18 || ((i17 >> 19) & 3) == 1 || ((i17 >> 17) & 3) == 0 || (i19 = (i17 >> 12) & 15) == 15 || i19 == 0 || ((i17 >> 10) & 3) == 3) ? false : true;
    }

    /* renamed from: byte2int */
    private int m94038x909eef85(byte[] bArr, int i17) {
        return (bArr[i17 + 3] & 255) | (bArr[i17] << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    /* renamed from: checkAndSeekID3V2Tag */
    private boolean m94039xcfd553ad() {
        byte[] bArr = new byte[10];
        int m94041xc0b507a3 = m94041xc0b507a3(bArr, 0, 10);
        if (m94041xc0b507a3 <= 0) {
            return false;
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i17 = (bArr[6] << 21) + (bArr[7] << 14) + (bArr[8] << 7) + bArr[9];
            this.f45875x21f3b68 = i17;
            this.f45870x71864ba = true;
            m94045xc9fc1b13(i17 - m94041xc0b507a3);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "有ID3V2，ID3V2大小 = " + this.f45875x21f3b68);
        } else {
            m94040x8977c834();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "没有有ID3V2");
        }
        return this.f45870x71864ba;
    }

    /* renamed from: closeFileStream */
    private void m94040x8977c834() {
        java.io.RandomAccessFile randomAccessFile = this.f45876xcbcb80b0;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            }
            this.f45876xcbcb80b0 = null;
        }
    }

    /* renamed from: fillBuffer */
    private int m94041xc0b507a3(byte[] bArr, int i17, int i18) {
        try {
            if (this.f45876xcbcb80b0 == null) {
                this.f45876xcbcb80b0 = new java.io.RandomAccessFile(this.f45874xf924574e, "r");
            }
            return this.f45876xcbcb80b0.read(bArr, i17, i18);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: isMp3File */
    public static boolean m94043x25876002(java.lang.String str) {
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25381xa9f54fdc(str).m94042x25876002();
    }

    /* renamed from: nextFrameHeader */
    private void m94044x4a2cc967() {
        int i17 = 0;
        while (!this.eof && !m94046x1c190792()) {
            int i18 = this.f45867xb2963f79;
            int i19 = this.pos;
            int i27 = i18 - i19;
            if (i27 > 0) {
                byte[] bArr = this.buf;
                java.lang.System.arraycopy(bArr, i19, bArr, 0, i27);
            }
            int m94041xc0b507a3 = m94041xc0b507a3(this.buf, i27, this.pos) + i27;
            this.f45867xb2963f79 = m94041xc0b507a3;
            if (m94041xc0b507a3 <= i27 || (i17 = i17 + this.pos) > 65536) {
                this.eof = true;
            }
            this.pos = 0;
        }
    }

    /* renamed from: seekTo */
    private void m94045xc9fc1b13(int i17) {
        try {
            this.f45876xcbcb80b0.seek(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: syncFrame */
    private boolean m94046x1c190792() {
        int i17 = this.pos;
        if (this.f45867xb2963f79 - i17 <= 4) {
            return false;
        }
        int m94038x909eef85 = m94038x909eef85(this.buf, i17);
        this.pos += 4;
        java.lang.System.out.println(this.f45868xee5393a2);
        while (true) {
            if (this.eof) {
                break;
            }
            while (!m94037xd4418ac9(m94038x909eef85, this.f45872x75db4f19)) {
                byte[] bArr = this.buf;
                int i18 = this.pos;
                int i19 = i18 + 1;
                this.pos = i19;
                m94038x909eef85 = (m94038x909eef85 << 8) | (bArr[i18] & 255);
                if (i19 == this.f45867xb2963f79) {
                    int i27 = this.f45877x7fff6730;
                    int i28 = i19 - 4;
                    this.pos = i28;
                    this.f45877x7fff6730 = i27 + (i28 - i17);
                    return false;
                }
            }
            int i29 = this.pos;
            if (i29 > i17 + 4) {
                this.f45878x361a9b = false;
                this.f45877x7fff6730 += (i29 - 4) - i17;
            }
            this.f45871xb734e28d.m94049xb06291ee(m94038x909eef85);
            int m94050x1feaf058 = this.f45871xb734e28d.m94050x1feaf058();
            int i37 = this.pos;
            int i38 = i37 + m94050x1feaf058;
            int i39 = this.f45867xb2963f79;
            if (i38 <= i39 + 4) {
                if (this.f45878x361a9b) {
                    break;
                }
                if (i37 + m94050x1feaf058 > i39) {
                    int i47 = this.f45877x7fff6730;
                    int i48 = i37 - 4;
                    this.pos = i48;
                    this.f45877x7fff6730 = i47 + (i48 - i17);
                    return false;
                }
                int i49 = (1572864 & m94038x909eef85) | (-2097152) | (393216 & m94038x909eef85) | (m94038x909eef85 & 3072);
                if (m94037xd4418ac9(m94038x909eef85(this.buf, (i37 - 4) + m94050x1feaf058), i49)) {
                    if (this.f45872x75db4f19 == -2097152) {
                        this.f45872x75db4f19 = i49;
                    }
                    this.f45878x361a9b = true;
                } else {
                    byte[] bArr2 = this.buf;
                    int i57 = this.pos;
                    this.pos = i57 + 1;
                    m94038x909eef85 = (m94038x909eef85 << 8) | (bArr2[i57] & 255);
                }
            } else {
                int i58 = this.f45877x7fff6730;
                int i59 = i37 - 4;
                this.pos = i59;
                this.f45877x7fff6730 = i58 + (i59 - i17);
                return false;
            }
        }
        if (this.f45871xb734e28d.m94052x21f7ada4()) {
            this.pos += 2;
        }
        this.f45868xee5393a2++;
        int i66 = this.f45877x7fff6730;
        if (i66 > 0 || (i66 == 0 && this.f45878x361a9b)) {
            this.f45873x5fd1586 = true;
            this.f45877x7fff6730 = 0;
        }
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0039 -> B:7:0x003c). Please report as a decompilation issue!!! */
    /* renamed from: fileCheck */
    public void m94047xaffb0cec() {
        try {
            try {
                try {
                    this.f45869x6d4f28e = true;
                    m94039xcfd553ad();
                    this.f45872x75db4f19 = -2097152;
                    this.f45878x361a9b = false;
                    this.eof = false;
                    this.f45868xee5393a2 = 0;
                    int length = this.buf.length;
                    this.pos = length;
                    this.f45867xb2963f79 = length;
                    this.f45871xb734e28d.m94051x33ebcb90();
                    m94044x4a2cc967();
                    java.io.RandomAccessFile randomAccessFile = this.f45876xcbcb80b0;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
                    java.io.RandomAccessFile randomAccessFile2 = this.f45876xcbcb80b0;
                    if (randomAccessFile2 == null) {
                    } else {
                        randomAccessFile2.close();
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e18);
            }
        } catch (java.lang.Throwable th6) {
            java.io.RandomAccessFile randomAccessFile3 = this.f45876xcbcb80b0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e19);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getFrameSize */
    public int m94048x1feaf058() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3.C25382x196b059d c25382x196b059d = this.f45871xb734e28d;
        if (c25382x196b059d != null) {
            return c25382x196b059d.m94050x1feaf058();
        }
        return -1;
    }

    /* renamed from: isMp3File */
    private boolean m94042x25876002() {
        if (!this.f45869x6d4f28e) {
            m94047xaffb0cec();
        }
        return this.f45873x5fd1586;
    }
}
