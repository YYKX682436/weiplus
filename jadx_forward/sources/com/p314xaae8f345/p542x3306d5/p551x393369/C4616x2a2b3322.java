package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdDictDecompress */
/* loaded from: classes5.dex */
public class C4616x2a2b3322 implements java.io.Closeable {

    /* renamed from: nativePtr */
    private long f19815xc3e75f57;

    public C4616x2a2b3322(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* renamed from: free */
    private native void m40671x30166c();

    /* renamed from: init */
    private native void m40672x316510(byte[] bArr, int i17, int i18);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m40671x30166c();
        this.f19815xc3e75f57 = 0L;
    }

    /* renamed from: finalize */
    public void m40673xd764dc1e() {
        close();
    }

    public C4616x2a2b3322(byte[] bArr, int i17, int i18) {
        this.f19815xc3e75f57 = 0L;
        if (bArr.length >= 0) {
            m40672x316510(bArr, i17, i18);
            if (this.f19815xc3e75f57 == 0) {
                throw new java.lang.IllegalStateException("ZSTD_createDDict failed");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Dictionary buffer is to short");
    }
}
