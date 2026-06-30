package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public class f extends androidx.exifinterface.media.b {
    public f(byte[] bArr) {
        super(bArr);
        this.f11177d.mark(Integer.MAX_VALUE);
    }

    public void b(long j17) {
        int i17 = this.f11178e;
        if (i17 > j17) {
            this.f11178e = 0;
            this.f11177d.reset();
        } else {
            j17 -= i17;
        }
        a((int) j17);
    }

    public f(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f11177d.mark(Integer.MAX_VALUE);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
