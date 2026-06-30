package ec;

/* loaded from: classes13.dex */
public class b implements ec.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer[] f332459b;

    /* renamed from: c, reason: collision with root package name */
    public final long f332460c;

    /* renamed from: d, reason: collision with root package name */
    public long f332461d;

    public b(java.io.File file) {
        long length = file.length();
        this.f332460c = length;
        long j17 = 1073741824;
        int i17 = ((int) (length / j17)) + 1;
        this.f332459b = new java.nio.ByteBuffer[i17];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        long j18 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            try {
                this.f332459b[i18] = fileInputStream.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, j18, java.lang.Math.min(this.f332460c - j18, 1073742848));
                this.f332459b[i18].order(ec.a.f332458a);
                j18 += j17;
            } finally {
                fileInputStream.close();
            }
        }
        this.f332461d = 0L;
    }

    public final int a() {
        return (int) (this.f332461d / 1073741824);
    }

    public final int b() {
        return (int) (this.f332461d % 1073741824);
    }

    public byte c() {
        byte b17 = this.f332459b[a()].get(b());
        this.f332461d++;
        return b17;
    }

    public int d() {
        int i17 = this.f332459b[a()].getInt(b());
        this.f332461d += 4;
        return i17;
    }

    public long e() {
        long j17 = this.f332459b[a()].getLong(b());
        this.f332461d += 8;
        return j17;
    }

    public short f() {
        short s17 = this.f332459b[a()].getShort(b());
        this.f332461d += 2;
        return s17;
    }
}
