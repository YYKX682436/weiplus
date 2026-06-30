package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdDictCompress */
/* loaded from: classes5.dex */
public class C4615xd30f3b61 implements java.io.Closeable {

    /* renamed from: nativePtr */
    private long f19814xc3e75f57;

    public C4615xd30f3b61(byte[] bArr, int i17) {
        this(bArr, 0, bArr.length, i17);
    }

    /* renamed from: free */
    private native void m40668x30166c();

    /* renamed from: init */
    private native void m40669x316510(byte[] bArr, int i17, int i18, int i19);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m40668x30166c();
        this.f19814xc3e75f57 = 0L;
    }

    /* renamed from: finalize */
    public void m40670xd764dc1e() {
        close();
    }

    public C4615xd30f3b61(byte[] bArr, int i17, int i18, int i19) {
        this.f19814xc3e75f57 = 0L;
        if (bArr.length - i17 >= 0) {
            m40669x316510(bArr, i17, i18, i19);
            if (0 == this.f19814xc3e75f57) {
                throw new java.lang.IllegalStateException("ZSTD_createCDict failed");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Dictionary buffer is to short");
    }
}
