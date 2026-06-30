package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.WaveWriter */
/* loaded from: classes13.dex */
public class C25353x8e7120ec {

    /* renamed from: OUTPUT_STREAM_BUFFER */
    private static final int f45731xafddb21 = 16384;
    private static final java.lang.String TAG = "WaveWriter";

    /* renamed from: mBytesWritten */
    private int f45732x86e1d339 = 0;

    /* renamed from: mChannels */
    private int f45733x7a61cb5d;

    /* renamed from: mOutFile */
    private java.io.File f45734x5c1774bd;

    /* renamed from: mOutStream */
    private java.io.BufferedOutputStream f45735xcada0281;

    /* renamed from: mSampleBits */
    private int f45736xe4b2221d;

    /* renamed from: mSampleRate */
    private int f45737xe4b949f7;

    /* renamed from: mTmpStream */
    private java.io.ByteArrayOutputStream f45738x9d8dd98a;

    public C25353x8e7120ec(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f45734x5c1774bd = new java.io.File(str + java.io.File.separator + str2);
        this.f45737xe4b949f7 = i17;
        this.f45733x7a61cb5d = i18;
        this.f45736xe4b2221d = i19;
    }

    /* renamed from: interpolate */
    private short[] m93866x8828d901(int i17, int i18, short[] sArr) {
        if (i17 == i18) {
            return sArr;
        }
        int round = java.lang.Math.round((sArr.length / i17) * i18);
        float length = round / sArr.length;
        short[] sArr2 = new short[round];
        for (int i19 = 0; i19 < round; i19++) {
            int i27 = (int) (i19 / length);
            int i28 = i27 + 1;
            if (i28 >= sArr.length) {
                i28 = sArr.length - 1;
            }
            short s17 = sArr[i28];
            short s18 = sArr[i27];
            sArr2[i19] = (short) (((s17 - s18) * (r2 - i27)) + s18);
        }
        return sArr2;
    }

    /* renamed from: reSample */
    private byte[] m93867xb447bdbd(byte[] bArr, int i17, int i18, int i19) {
        byte[] bArr2;
        int i27 = i17 / 8;
        if (i27 <= 0) {
            return null;
        }
        int length = bArr.length / i27;
        short[] sArr = new short[length];
        int i28 = 0;
        int i29 = 0;
        for (int i37 = 0; i37 < length; i37++) {
            int i38 = 0;
            short s17 = 0;
            while (i38 < i27) {
                s17 = (short) (((short) ((bArr[i29] & 255) << (i38 * 8))) | s17);
                i38++;
                i29++;
            }
            sArr[i37] = s17;
        }
        short[] m93866x8828d901 = m93866x8828d901(i18, i19, sArr);
        int length2 = m93866x8828d901.length;
        if (i27 == 1) {
            bArr2 = new byte[length2];
            while (i28 < length2) {
                bArr2[i28] = (byte) m93866x8828d901[i28];
                i28++;
            }
        } else {
            bArr2 = new byte[length2 * 2];
            while (i28 < m93866x8828d901.length) {
                int i39 = i28 * 2;
                short s18 = m93866x8828d901[i28];
                bArr2[i39] = (byte) (s18 & 255);
                bArr2[i39 + 1] = (byte) ((s18 >> 8) & 255);
                i28++;
            }
        }
        this.f45737xe4b949f7 = i19;
        return bArr2;
    }

    /* renamed from: writeUnsignedShortLE */
    private static void m93868x6e4b8861(java.io.ByteArrayOutputStream byteArrayOutputStream, short s17) {
        byteArrayOutputStream.write(s17);
        byteArrayOutputStream.write(s17 >> 8);
    }

    /* renamed from: writeWaveHeader */
    private void m93869xdc56ac25() {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.f45734x5c1774bd, "rw");
        randomAccessFile.seek(0L);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
        int i17 = (this.f45736xe4b2221d + 7) / 8;
        try {
            dataOutputStream.writeBytes("RIFF");
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.f45732x86e1d339 + 36));
            dataOutputStream.writeBytes("WAVE");
            dataOutputStream.writeBytes("fmt ");
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(16));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) 1));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) this.f45733x7a61cb5d));
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.f45737xe4b949f7));
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.f45737xe4b949f7 * this.f45733x7a61cb5d * i17));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) (this.f45733x7a61cb5d * i17)));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) this.f45736xe4b2221d));
            dataOutputStream.writeBytes(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.f45732x86e1d339));
            byteArrayOutputStream.flush();
            randomAccessFile.write(byteArrayOutputStream.toByteArray());
        } finally {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            randomAccessFile.close();
        }
    }

    /* renamed from: changeStereoToMono */
    public byte[] m93870xb6d611e6(byte[] bArr) {
        int i17 = this.f45733x7a61cb5d;
        if (i17 != 2) {
            return bArr;
        }
        int i18 = this.f45736xe4b2221d / 8;
        long length = (bArr.length / i17) / i18;
        byte[] bArr2 = new byte[(int) (i18 * length)];
        for (int i19 = 0; i19 < length; i19++) {
            for (int i27 = 0; i27 < i18; i27++) {
                int i28 = this.f45733x7a61cb5d;
                bArr2[(i19 * i18) + i27] = (byte) ((bArr[((i19 * i28) * i18) + i27] + bArr[(((i28 * i19) + 1) * i18) + i27]) / 2);
            }
        }
        this.f45733x7a61cb5d = 1;
        return bArr2;
    }

    /* renamed from: closeWaveFile */
    public void m93871x6e93a22d() {
        java.io.BufferedOutputStream bufferedOutputStream = this.f45735xcada0281;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
            this.f45735xcada0281.close();
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f45738x9d8dd98a;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.flush();
            this.f45738x9d8dd98a.close();
        }
        m93869xdc56ac25();
    }

    /* renamed from: createWaveFile */
    public boolean m93872x5af22131() {
        if (this.f45734x5c1774bd.exists()) {
            this.f45734x5c1774bd.delete();
        }
        this.f45734x5c1774bd.getParentFile().mkdirs();
        if (!this.f45734x5c1774bd.createNewFile()) {
            return false;
        }
        this.f45735xcada0281 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(this.f45734x5c1774bd), 16384);
        this.f45738x9d8dd98a = new java.io.ByteArrayOutputStream();
        this.f45735xcada0281.write(new byte[44]);
        return true;
    }

    /* renamed from: getChannels */
    public int m93873xd13e6146() {
        return this.f45733x7a61cb5d;
    }

    /* renamed from: reSampler */
    public boolean m93874xd4affa55() {
        try {
            byte[] m93867xb447bdbd = m93867xb447bdbd(this.f45738x9d8dd98a.toByteArray(), this.f45736xe4b2221d, this.f45737xe4b949f7, 8000);
            if (m93867xb447bdbd == null) {
                return false;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "mTmpStream length = " + this.f45738x9d8dd98a.toByteArray().length);
            byte[] m93870xb6d611e6 = m93870xb6d611e6(m93867xb447bdbd);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "monoData length = " + m93870xb6d611e6.length);
            byte[] m93867xb447bdbd2 = m93867xb447bdbd(m93870xb6d611e6, this.f45736xe4b2221d, 8000, 4000);
            if (m93867xb447bdbd2 == null) {
                return false;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "resultData length = " + m93867xb447bdbd2.length);
            this.f45732x86e1d339 = m93867xb447bdbd2.length;
            this.f45735xcada0281.write(m93867xb447bdbd2);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            return false;
        }
    }

    /* renamed from: reSamplerTo8K */
    public boolean m93875xacf89ec3() {
        try {
            byte[] m93867xb447bdbd = m93867xb447bdbd(this.f45738x9d8dd98a.toByteArray(), this.f45736xe4b2221d, this.f45737xe4b949f7, 8000);
            if (m93867xb447bdbd == null) {
                return false;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "mTmpStream length = " + this.f45738x9d8dd98a.toByteArray().length);
            byte[] m93870xb6d611e6 = m93870xb6d611e6(m93867xb447bdbd);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "resultData length = " + m93870xb6d611e6.length);
            this.f45732x86e1d339 = m93870xb6d611e6.length;
            this.f45735xcada0281.write(m93870xb6d611e6);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            return false;
        }
    }

    /* renamed from: setSampleByte */
    public void m93876x24e56bd4(int i17) {
        this.f45736xe4b2221d = i17;
    }

    /* renamed from: write */
    public void m93877x6c257df(short[] sArr, int i17, int i18) {
        if (i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("offset %d is greater than length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        while (i17 < i18) {
            m93868x6e4b8861(this.f45738x9d8dd98a, sArr[i17]);
            this.f45732x86e1d339 += 2;
            i17++;
        }
    }

    /* renamed from: writeDone */
    public void m93879xac25e801() {
        try {
            this.f45735xcada0281.write(this.f45738x9d8dd98a.toByteArray());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: write */
    public void m93878x6c257df(short[] sArr, short[] sArr2, int i17, int i18) {
        if (this.f45733x7a61cb5d != 2) {
            return;
        }
        if (i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("offset %d is greater than length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        while (i17 < i18) {
            m93868x6e4b8861(this.f45738x9d8dd98a, sArr[i17]);
            m93868x6e4b8861(this.f45738x9d8dd98a, sArr2[i17]);
            this.f45732x86e1d339 += 4;
            i17++;
        }
    }

    public C25353x8e7120ec(java.io.File file, int i17, int i18, int i19) {
        this.f45734x5c1774bd = file;
        this.f45737xe4b949f7 = i17;
        this.f45733x7a61cb5d = i18;
        this.f45736xe4b2221d = i19;
    }
}
