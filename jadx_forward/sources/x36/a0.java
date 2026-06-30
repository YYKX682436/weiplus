package x36;

/* loaded from: classes14.dex */
public final class a0 extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.b0 f533186d;

    public a0(x36.b0 b0Var) {
        this.f533186d = b0Var;
    }

    @Override // java.io.InputStream
    public int available() {
        x36.b0 b0Var = this.f533186d;
        if (b0Var.f533188e) {
            throw new java.io.IOException("closed");
        }
        return (int) java.lang.Math.min(b0Var.f533187d.f533227e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533186d.close();
    }

    @Override // java.io.InputStream
    public int read() {
        x36.b0 b0Var = this.f533186d;
        if (!b0Var.f533188e) {
            x36.k kVar = b0Var.f533187d;
            if (kVar.f533227e == 0 && b0Var.f533189f.B(kVar, 8192) == -1) {
                return -1;
            }
            return b0Var.f533187d.mo174955xcc4273be() & 255;
        }
        throw new java.io.IOException("closed");
    }

    /* renamed from: toString */
    public java.lang.String m174953x9616526c() {
        return this.f533186d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] data, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        x36.b0 b0Var = this.f533186d;
        if (!b0Var.f533188e) {
            x36.b.b(data.length, i17, i18);
            x36.k kVar = b0Var.f533187d;
            if (kVar.f533227e == 0 && b0Var.f533189f.B(kVar, 8192) == -1) {
                return -1;
            }
            return b0Var.f533187d.i(data, i17, i18);
        }
        throw new java.io.IOException("closed");
    }
}
