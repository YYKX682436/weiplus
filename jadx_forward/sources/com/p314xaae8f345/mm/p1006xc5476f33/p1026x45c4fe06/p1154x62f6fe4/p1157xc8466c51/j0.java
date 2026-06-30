package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes13.dex */
public class j0 extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k0 f167354g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f167355h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f167356i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f167357j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f167358k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f167359l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167360m = "";

    @Override // kh1.e
    /* renamed from: close */
    public void mo51970x5a5ddf8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "close");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k0 k0Var = this.f167354g;
        if (k0Var != null) {
            long j17 = k0Var.f167361a;
            if (j17 != 0) {
                com.p314xaae8f345.mm.p963x7eba77a9.C11152x3ab2b471.m48267x1478624c(j17);
                this.f167354g = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12414xc49bc380.m51953x55374a93();
        this.f167358k = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "close totalEncodeSize:%d, writeTotalBytes:%d, fileSize:%d", java.lang.Integer.valueOf(this.f389510f), java.lang.Integer.valueOf(this.f167359l), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(this.f167360m)));
        this.f167359l = 0;
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        int i18;
        int i19;
        int i27;
        int max = java.lang.Math.max(i17 + 16, 1518);
        if (this.f167354g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "mOpusAudioEncodeJni is null");
            return false;
        }
        if (bArr == null || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "pcm is null");
            return false;
        }
        if (this.f167357j != max) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "pcm len is not equal to last len");
            this.f167357j = max;
            this.f167355h = new byte[max];
            this.f167356i = new byte[max];
        }
        int[] iArr = new int[1];
        java.util.Arrays.fill(this.f167355h, 0, max, (byte) 0);
        java.util.Arrays.fill(this.f167356i, 0, max, (byte) 0);
        try {
            int m48268x76f0cd0d = com.p314xaae8f345.mm.p963x7eba77a9.C11152x3ab2b471.m48268x76f0cd0d(bArr, i17, this.f167355h, iArr, this.f167354g.f167361a);
            if (m48268x76f0cd0d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode fail, encodeRet:%d", java.lang.Integer.valueOf(m48268x76f0cd0d));
                return false;
            }
            int i28 = iArr[0];
            if (i28 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode fail, outLen:%d", java.lang.Integer.valueOf(i28));
                return false;
            }
            this.f167358k++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode, outLen:%d", java.lang.Integer.valueOf(i28));
            int i29 = this.f167358k;
            if (i29 == 1 && (i27 = iArr[0]) > 16) {
                int i37 = i27 - 16;
                iArr[0] = i37;
                byte[] bArr2 = this.f167355h;
                java.lang.System.arraycopy(bArr2, 16, bArr2, 0, i37);
                java.lang.System.arraycopy(this.f167355h, 0, this.f167356i, 2, iArr[0]);
                int i38 = iArr[0];
                i19 = i38 + 2;
                byte[] bArr3 = this.f167356i;
                bArr3[0] = (byte) (i38 & 255);
                bArr3[1] = (byte) ((i38 >> 8) & 255);
            } else {
                if (i29 <= 1 || (i18 = iArr[0]) <= 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode length illegal, outLen:%d", java.lang.Integer.valueOf(iArr[0]));
                    return false;
                }
                java.lang.System.arraycopy(this.f167355h, 0, this.f167356i, 0, i18);
                int i39 = iArr[0];
                int i47 = i39 - 2;
                iArr[0] = i47;
                byte[] bArr4 = this.f167355h;
                java.lang.System.arraycopy(bArr4, 2, bArr4, 0, i47);
                i19 = i39;
            }
            int i48 = this.f167359l;
            int i49 = iArr[0];
            this.f167359l = i48 + i49;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12414xc49bc380.m51955xb78ab82a(this.f167355h, i49);
            e(this.f167356i, i19, false);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.OggOpusAudioEncoderImpl", e17, "encode", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(20);
            return false;
        }
    }

    @Override // kh1.e
    /* renamed from: flush */
    public void mo51971x5d03b04() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "flush");
        e(new byte[0], 0, true);
    }

    @Override // kh1.e
    /* renamed from: init */
    public boolean mo51972x316510(java.lang.String str, int i17, int i18, int i19) {
        this.f167360m = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12414xc49bc380.m51954x2b4adb0f(str, i18, i17, i19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "createOggFile ogg jni api fail");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(22);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "createOggFile ogg jni api ok");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k0(i17, i18, i19);
        this.f167354g = k0Var;
        if (0 == k0Var.f167361a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "init OpusAudioEncodeJni Error");
            this.f167354g = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12414xc49bc380.m51953x55374a93();
            return false;
        }
        this.f167358k = 0;
        this.f167359l = 0;
        this.f389510f = 0;
        return true;
    }
}
