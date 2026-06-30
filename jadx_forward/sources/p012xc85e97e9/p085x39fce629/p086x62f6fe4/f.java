package p012xc85e97e9.p085x39fce629.p086x62f6fe4;

/* loaded from: classes13.dex */
public class f extends p012xc85e97e9.p085x39fce629.p086x62f6fe4.b {
    public f(byte[] bArr) {
        super(bArr);
        this.f92710d.mark(Integer.MAX_VALUE);
    }

    public void b(long j17) {
        int i17 = this.f92711e;
        if (i17 > j17) {
            this.f92711e = 0;
            this.f92710d.reset();
        } else {
            j17 -= i17;
        }
        a((int) j17);
    }

    public f(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f92710d.mark(Integer.MAX_VALUE);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
