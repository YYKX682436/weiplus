package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public class a extends android.media.MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public long f11175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.exifinterface.media.f f11176e;

    public a(androidx.exifinterface.media.ExifInterface exifInterface, androidx.exifinterface.media.f fVar) {
        this.f11176e = fVar;
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
            long j18 = this.f11175d;
            androidx.exifinterface.media.f fVar = this.f11176e;
            if (j18 != j17) {
                if (j18 >= 0 && j17 >= j18 + fVar.available()) {
                    return -1;
                }
                fVar.b(j17);
                this.f11175d = j17;
            }
            if (i18 > fVar.available()) {
                i18 = fVar.available();
            }
            int read = fVar.read(bArr, i17, i18);
            if (read >= 0) {
                this.f11175d += read;
                return read;
            }
        } catch (java.io.IOException unused) {
        }
        this.f11175d = -1L;
        return -1;
    }
}
