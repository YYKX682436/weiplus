package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.FileDataSource */
/* loaded from: classes13.dex */
public class C25437x56394f21 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {

    /* renamed from: currentPosition */
    private long f46130xb2e431c2;

    /* renamed from: file */
    private java.io.RandomAccessFile f46131x2ff57c;

    /* renamed from: fileInputStream */
    private java.io.FileInputStream f46132x6aedc0ce;

    /* renamed from: filePath */
    private final java.lang.String f46133xd426afc1;

    /* renamed from: opened */
    private boolean f46134xc3c3c869 = false;

    /* renamed from: readingStream */
    private java.io.BufferedInputStream f46135x6675f12c;

    public C25437x56394f21(java.lang.String str) {
        this.f46133xd426afc1 = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46134xc3c3c869) {
            java.io.FileInputStream fileInputStream = this.f46132x6aedc0ce;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            java.io.BufferedInputStream bufferedInputStream = this.f46135x6675f12c;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            java.io.RandomAccessFile randomAccessFile = this.f46131x2ff57c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f46134xc3c3c869 = false;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25318x39612e21.m93572x14e0fcb6(this.f46133xd426afc1);
    }

    /* renamed from: getFilePath */
    public java.lang.String m94308x5000ed37() {
        return this.f46133xd426afc1;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        return this.f46131x2ff57c.length();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        if (this.f46134xc3c3c869) {
            return;
        }
        this.f46134xc3c3c869 = true;
        this.f46131x2ff57c = new java.io.RandomAccessFile(this.f46133xd426afc1, "r");
        this.f46132x6aedc0ce = new java.io.FileInputStream(this.f46131x2ff57c.getFD());
        this.f46135x6675f12c = new java.io.BufferedInputStream(this.f46132x6aedc0ce);
        this.f46130xb2e431c2 = 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        long m94406x98f3dfca;
        long j18 = this.f46130xb2e431c2;
        if (j18 != j17) {
            if (j18 > j17) {
                this.f46131x2ff57c.seek(j17);
                this.f46135x6675f12c = new java.io.BufferedInputStream(this.f46132x6aedc0ce);
                m94406x98f3dfca = j17;
            } else {
                m94406x98f3dfca = j18 + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25460xc3de28f1.m94406x98f3dfca(this.f46135x6675f12c, j17 - j18);
            }
            if (m94406x98f3dfca != j17) {
                return -1;
            }
            this.f46130xb2e431c2 = j17;
        }
        int read = this.f46135x6675f12c.read(bArr, i17, i18);
        if (read >= 0) {
            this.f46130xb2e431c2 += read;
        }
        return read;
    }

    /* renamed from: toString */
    public java.lang.String m94309x9616526c() {
        return "(fd)" + this.f46133xd426afc1;
    }
}
