package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.InputStreamDataSource */
/* loaded from: classes7.dex */
public class C25442x17de3fcf implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {

    /* renamed from: currentPosition */
    private long f46139xb2e431c2;

    /* renamed from: currentStream */
    private java.io.InputStream f46140x85b63a59;

    /* renamed from: factory */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25442x17de3fcf.InputStreamFactory f46141xbeeb310a;

    /* renamed from: size */
    private long f46142x35e001;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.InputStreamDataSource$InputStreamFactory */
    /* loaded from: classes7.dex */
    public interface InputStreamFactory {
        /* renamed from: create */
        java.io.InputStream m94310xaf65a0fc();
    }

    public C25442x17de3fcf(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25442x17de3fcf.InputStreamFactory inputStreamFactory) {
        this.f46141xbeeb310a = inputStreamFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.InputStream inputStream = this.f46140x85b63a59;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd.m94078xddbe0e37((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e) this, false);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        return this.f46142x35e001;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        java.io.InputStream inputStream = this.f46140x85b63a59;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f46140x85b63a59 = this.f46141xbeeb310a.m94310xaf65a0fc();
        this.f46142x35e001 = r0.available();
        this.f46139xb2e431c2 = 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        long j18 = this.f46139xb2e431c2;
        if (j17 < j18) {
            mo94263x34264a();
            return mo94264xc8455469(j17, bArr, i17, i18);
        }
        if (j17 > j18) {
            long j19 = j17 - j18;
            while (true) {
                long skip = this.f46140x85b63a59.skip(j19);
                j19 -= skip;
                if (j19 <= 0 && skip > 0) {
                    break;
                }
            }
            if (j19 < 0) {
                throw new java.io.IOException("skipped too much bytes");
            }
            this.f46139xb2e431c2 = j17;
        }
        int read = this.f46140x85b63a59.read(bArr, i17, i18);
        if (read > 0) {
            this.f46139xb2e431c2 += read;
        }
        return read;
    }
}
