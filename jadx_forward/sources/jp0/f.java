package jp0;

/* loaded from: classes10.dex */
public final class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f382512d = null;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f382513e = null;

    /* renamed from: f, reason: collision with root package name */
    public jp0.i f382514f;

    /* renamed from: g, reason: collision with root package name */
    public final jp0.h f382515g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f382516h;

    public f(jp0.i iVar, jp0.h hVar, java.lang.Object obj) {
        this.f382514f = iVar;
        this.f382515g = hVar;
        this.f382516h = obj;
    }

    public static jp0.f c(java.lang.String str, java.lang.Object obj) {
        jp0.a aVar = new jp0.a(str);
        return new jp0.f(aVar, aVar, obj);
    }

    public byte[] a() {
        byte[] bArr = this.f382513e;
        if (bArr != null) {
            return bArr;
        }
        jp0.h hVar = this.f382515g;
        if (hVar == null) {
            return null;
        }
        byte[] a17 = hVar.a();
        this.f382513e = a17;
        return a17;
    }

    public java.io.InputStream b() {
        java.io.InputStream inputStream = this.f382512d;
        if (inputStream != null) {
            return inputStream;
        }
        jp0.i iVar = this.f382514f;
        if (iVar == null) {
            return null;
        }
        java.io.InputStream b17 = iVar.b();
        this.f382512d = b17;
        return b17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jp0.i iVar = this.f382514f;
        if (iVar != null) {
            iVar.mo141195x5a5ddf8();
            this.f382514f = null;
        }
        jp0.h hVar = this.f382515g;
        if (hVar != null) {
            hVar.mo141195x5a5ddf8();
        }
    }
}
