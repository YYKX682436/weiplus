package jp0;

/* loaded from: classes10.dex */
public class c implements jp0.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f382508a;

    public c(java.io.InputStream inputStream) {
        this.f382508a = inputStream;
    }

    @Override // jp0.h
    public byte[] a() {
        try {
            return new byte[this.f382508a.available()];
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // jp0.g
    /* renamed from: close */
    public void mo141195x5a5ddf8() {
        java.io.InputStream inputStream = this.f382508a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
