package p012xc85e97e9.p085x39fce629.p086x62f6fe4;

/* loaded from: classes13.dex */
public class a extends android.media.MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public long f92708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p085x39fce629.p086x62f6fe4.f f92709e;

    public a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar) {
        this.f92709e = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        if (j17 < 0) {
            return -1;
        }
        try {
            long j18 = this.f92708d;
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar = this.f92709e;
            if (j18 != j17) {
                if (j18 >= 0 && j17 >= j18 + fVar.available()) {
                    return -1;
                }
                fVar.b(j17);
                this.f92708d = j17;
            }
            if (i18 > fVar.available()) {
                i18 = fVar.available();
            }
            int read = fVar.read(bArr, i17, i18);
            if (read >= 0) {
                this.f92708d += read;
                return read;
            }
        } catch (java.io.IOException unused) {
        }
        this.f92708d = -1L;
        return -1;
    }
}
