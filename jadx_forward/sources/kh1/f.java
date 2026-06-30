package kh1;

/* loaded from: classes13.dex */
public class f extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public byte[] f389511g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.OutputStream f389512h;

    /* renamed from: i, reason: collision with root package name */
    public int f389513i = 2;

    @Override // kh1.e
    /* renamed from: close */
    public void mo51970x5a5ddf8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "close");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12413xf074c0bf.m51945x5a5ddf8();
        java.io.OutputStream outputStream = this.f389512h;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MP3AudioEncoder", e17, "close", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(20);
            }
            this.f389512h = null;
        }
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        int i18 = this.f389506b;
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MP3AudioEncoder", "mMinBufferSize %d is invalid", java.lang.Integer.valueOf(i18));
            return false;
        }
        if (this.f389512h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MP3AudioEncoder", "mFileOutputStream is null");
            return false;
        }
        if (this.f389511g == null) {
            int i19 = (int) ((i18 * r2 * 1.25d) + 7200.0d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", java.lang.Integer.valueOf(this.f389513i), java.lang.Integer.valueOf(this.f389506b), java.lang.Integer.valueOf(i19));
            this.f389511g = new byte[i19];
        }
        int i27 = i17 / 2;
        short[] sArr = new short[i27];
        for (int i28 = 0; i28 < i27; i28++) {
            int i29 = i28 * 2;
            sArr[i28] = (short) (((bArr[i29 + 1] & 255) << 8) | (bArr[i29] & 255));
        }
        int m51946xb2963e16 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12413xf074c0bf.m51946xb2963e16(sArr, sArr, i27, this.f389511g);
        if (m51946xb2963e16 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", java.lang.Integer.valueOf(m51946xb2963e16));
            return false;
        }
        try {
            this.f389512h.write(this.f389511g, 0, m51946xb2963e16);
            e(this.f389511g, m51946xb2963e16, false);
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MP3AudioEncoder", e17, "encode write", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(20);
            return false;
        }
    }

    @Override // kh1.e
    /* renamed from: flush */
    public void mo51971x5d03b04() {
        byte[] bArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "flush");
        if (this.f389512h == null || (bArr = this.f389511g) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
            return;
        }
        int m51948x5d03b04 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12413xf074c0bf.m51948x5d03b04(bArr);
        if (m51948x5d03b04 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MP3AudioEncoder", "flush fail, flushResult:%d", java.lang.Integer.valueOf(m51948x5d03b04));
            return;
        }
        try {
            this.f389512h.write(this.f389511g, 0, m51948x5d03b04);
            e(this.f389511g, m51948x5d03b04, true);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MP3AudioEncoder", e17, "flush write", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(20);
        }
    }

    @Override // kh1.e
    /* renamed from: init */
    public boolean mo51972x316510(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f389513i = i18;
        int m51950x316510 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12413xf074c0bf.m51950x316510(i17, i18, i17, i19 / 1000, 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", java.lang.Integer.valueOf(m51950x316510));
        if (m51950x316510 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(17);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MP3AudioEncoder", "lame MPEG version:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1155xb2963e16.C12413xf074c0bf.m51949x52c258a2()));
        try {
            this.f389512h = com.p314xaae8f345.mm.vfs.w6.K(str, false);
            return true;
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MP3AudioEncoder", e17, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(18);
            return false;
        }
    }
}
