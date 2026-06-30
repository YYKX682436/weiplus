package a05;

/* loaded from: classes8.dex */
public class a extends a05.c {

    /* renamed from: d, reason: collision with root package name */
    public int f82008d;

    @Override // a05.c, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int read = super.read(bArr);
        this.f82008d += read >= 0 ? read : 0;
        return read;
    }

    @Override // a05.c, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long skip = super.skip(j17);
        this.f82008d = (int) (this.f82008d + skip);
        return skip;
    }

    @Override // a05.c, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = super.read(bArr, i17, i18);
        this.f82008d += read >= 0 ? read : 0;
        return read;
    }

    @Override // a05.c, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        this.f82008d += read >= 0 ? 1 : 0;
        return read;
    }
}
