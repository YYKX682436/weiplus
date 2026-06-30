package h51;

/* loaded from: classes12.dex */
public class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final h51.b f360557d;

    /* renamed from: e, reason: collision with root package name */
    public h51.a f360558e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f360559f;

    public f(java.io.OutputStream outputStream, int i17) {
        new java.util.ArrayList();
        this.f360558e = new h51.a(outputStream);
        h51.b bVar = new h51.b();
        this.f360557d = bVar;
        bVar.f360550c = true;
        this.f360559f = new byte[i17];
    }

    public long a(java.io.InputStream inputStream, h51.e eVar) {
        java.util.zip.Inflater inflater;
        long j17 = this.f360558e.f360547d;
        if (eVar == h51.e.COPY) {
            while (true) {
                int read = inputStream.read(this.f360559f);
                if (read < 0) {
                    break;
                }
                this.f360558e.write(this.f360559f, 0, read);
            }
        } else if (eVar != h51.e.UNCOPY) {
            boolean z17 = eVar == h51.e.UNCOMPRESS_NOWRAP;
            h51.b bVar = this.f360557d;
            if (z17 != bVar.f360548a) {
                java.util.zip.Inflater inflater2 = bVar.f360549b;
                if (inflater2 != null) {
                    inflater2.end();
                    bVar.f360549b = null;
                }
                bVar.f360548a = z17;
            }
            h51.a aVar = this.f360558e;
            java.util.zip.Inflater inflater3 = bVar.f360549b;
            if (inflater3 == null) {
                inflater3 = new java.util.zip.Inflater(bVar.f360548a);
                if (bVar.f360550c) {
                    bVar.f360549b = inflater3;
                }
            } else {
                inflater3.reset();
            }
            java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(inputStream, inflater3, 32768);
            byte[] bArr = new byte[32768];
            while (true) {
                int read2 = inflaterInputStream.read(bArr);
                if (read2 < 0) {
                    break;
                }
                aVar.write(bArr, 0, read2);
            }
            if (!bVar.f360550c && (inflater = bVar.f360549b) != null) {
                inflater.end();
                bVar.f360549b = null;
            }
        }
        this.f360558e.flush();
        return this.f360558e.f360547d - j17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h51.b bVar = this.f360557d;
        java.util.zip.Inflater inflater = bVar.f360549b;
        if (inflater != null) {
            inflater.end();
            bVar.f360549b = null;
        }
        this.f360558e.close();
        this.f360559f = null;
        this.f360558e = null;
    }
}
