package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2;

/* renamed from: com.tencent.qqmusic.mediaplayer.downstream.FileDataSink */
/* loaded from: classes13.dex */
public class C25391x28d8cf19 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 {
    private static final java.lang.String TAG = "FileDataSink";

    /* renamed from: filePath */
    private final java.lang.String f45924xd426afc1;

    /* renamed from: randomAccessFile */
    private java.io.RandomAccessFile f45926xa5b3b623 = null;

    /* renamed from: currentPosition */
    private long f45923xb2e431c2 = 0;

    /* renamed from: opened */
    private boolean f45925xc3c3c869 = false;

    public C25391x28d8cf19(java.lang.String str) {
        this.f45924xd426afc1 = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f45925xc3c3c869) {
            this.f45926xa5b3b623.close();
            this.f45923xb2e431c2 = 0L;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6
    /* renamed from: open */
    public void mo94075x34264a() {
        if (this.f45925xc3c3c869) {
            return;
        }
        this.f45926xa5b3b623 = new java.io.RandomAccessFile(this.f45924xd426afc1, "rw");
        this.f45923xb2e431c2 = 0L;
        this.f45925xc3c3c869 = true;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6
    /* renamed from: write */
    public int mo94076x6c257df(long j17, byte[] bArr, int i17, int i18) {
        if (this.f45926xa5b3b623 == null) {
            return 0;
        }
        if (this.f45923xb2e431c2 != j17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "[write] seek to: " + j17);
            this.f45926xa5b3b623.seek(j17);
            this.f45923xb2e431c2 = j17;
        }
        this.f45926xa5b3b623.write(bArr, i17, i18);
        this.f45923xb2e431c2 += i18;
        return i18;
    }
}
