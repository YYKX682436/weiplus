package jp0;

/* loaded from: classes10.dex */
public class d implements jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f382509a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.InputStream f382510b = null;

    public d(byte[] bArr) {
        this.f382509a = bArr;
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        if (this.f382510b == null) {
            this.f382510b = new java.io.ByteArrayInputStream(this.f382509a);
        }
        return this.f382510b;
    }

    @Override // jp0.g
    /* renamed from: close */
    public void mo141195x5a5ddf8() {
        java.io.InputStream inputStream = this.f382510b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
