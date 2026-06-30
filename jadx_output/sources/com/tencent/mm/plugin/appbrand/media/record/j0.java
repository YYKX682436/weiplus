package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes13.dex */
public class j0 extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.k0 f85821g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f85822h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f85823i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f85824j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f85825k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f85826l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f85827m = "";

    @Override // kh1.e
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "close");
        com.tencent.mm.plugin.appbrand.media.record.k0 k0Var = this.f85821g;
        if (k0Var != null) {
            long j17 = k0Var.f85828a;
            if (j17 != 0) {
                com.tencent.mm.modelvoice.VoiceOpus.nativeEncUninit(j17);
                this.f85821g = null;
            }
        }
        com.tencent.mm.plugin.appbrand.media.encode.OggMuxerFormatJni.closeOggFile();
        this.f85825k = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "close totalEncodeSize:%d, writeTotalBytes:%d, fileSize:%d", java.lang.Integer.valueOf(this.f307977f), java.lang.Integer.valueOf(this.f85826l), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(this.f85827m)));
        this.f85826l = 0;
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        int i18;
        int i19;
        int i27;
        int max = java.lang.Math.max(i17 + 16, 1518);
        if (this.f85821g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "mOpusAudioEncodeJni is null");
            return false;
        }
        if (bArr == null || i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "pcm is null");
            return false;
        }
        if (this.f85824j != max) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "pcm len is not equal to last len");
            this.f85824j = max;
            this.f85822h = new byte[max];
            this.f85823i = new byte[max];
        }
        int[] iArr = new int[1];
        java.util.Arrays.fill(this.f85822h, 0, max, (byte) 0);
        java.util.Arrays.fill(this.f85823i, 0, max, (byte) 0);
        try {
            int nativeEncode = com.tencent.mm.modelvoice.VoiceOpus.nativeEncode(bArr, i17, this.f85822h, iArr, this.f85821g.f85828a);
            if (nativeEncode != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode fail, encodeRet:%d", java.lang.Integer.valueOf(nativeEncode));
                return false;
            }
            int i28 = iArr[0];
            if (i28 <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode fail, outLen:%d", java.lang.Integer.valueOf(i28));
                return false;
            }
            this.f85825k++;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode, outLen:%d", java.lang.Integer.valueOf(i28));
            int i29 = this.f85825k;
            if (i29 == 1 && (i27 = iArr[0]) > 16) {
                int i37 = i27 - 16;
                iArr[0] = i37;
                byte[] bArr2 = this.f85822h;
                java.lang.System.arraycopy(bArr2, 16, bArr2, 0, i37);
                java.lang.System.arraycopy(this.f85822h, 0, this.f85823i, 2, iArr[0]);
                int i38 = iArr[0];
                i19 = i38 + 2;
                byte[] bArr3 = this.f85823i;
                bArr3[0] = (byte) (i38 & 255);
                bArr3[1] = (byte) ((i38 >> 8) & 255);
            } else {
                if (i29 <= 1 || (i18 = iArr[0]) <= 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "encode length illegal, outLen:%d", java.lang.Integer.valueOf(iArr[0]));
                    return false;
                }
                java.lang.System.arraycopy(this.f85822h, 0, this.f85823i, 0, i18);
                int i39 = iArr[0];
                int i47 = i39 - 2;
                iArr[0] = i47;
                byte[] bArr4 = this.f85822h;
                java.lang.System.arraycopy(bArr4, 2, bArr4, 0, i47);
                i19 = i39;
            }
            int i48 = this.f85826l;
            int i49 = iArr[0];
            this.f85826l = i48 + i49;
            com.tencent.mm.plugin.appbrand.media.encode.OggMuxerFormatJni.writeAudioBuff(this.f85822h, i49);
            e(this.f85823i, i19, false);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.OggOpusAudioEncoderImpl", e17, "encode", new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.o0.a(20);
            return false;
        }
    }

    @Override // kh1.e
    public void flush() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "flush");
        e(new byte[0], 0, true);
    }

    @Override // kh1.e
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        this.f85827m = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (!com.tencent.mm.plugin.appbrand.media.encode.OggMuxerFormatJni.createOggFile(str, i18, i17, i19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "createOggFile ogg jni api fail");
            com.tencent.mm.plugin.appbrand.media.record.o0.a(22);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OggOpusAudioEncoderImpl", "createOggFile ogg jni api ok");
        com.tencent.mm.plugin.appbrand.media.record.k0 k0Var = new com.tencent.mm.plugin.appbrand.media.record.k0(i17, i18, i19);
        this.f85821g = k0Var;
        if (0 == k0Var.f85828a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.OggOpusAudioEncoderImpl", "init OpusAudioEncodeJni Error");
            this.f85821g = null;
            com.tencent.mm.plugin.appbrand.media.encode.OggMuxerFormatJni.closeOggFile();
            return false;
        }
        this.f85825k = 0;
        this.f85826l = 0;
        this.f307977f = 0;
        return true;
    }
}
