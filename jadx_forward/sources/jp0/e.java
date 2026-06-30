package jp0;

/* loaded from: classes10.dex */
public class e implements jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f382511a;

    public e(java.io.InputStream inputStream) {
        this.f382511a = inputStream;
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        return this.f382511a;
    }

    @Override // jp0.g
    /* renamed from: close */
    public void mo141195x5a5ddf8() {
        java.io.InputStream inputStream = this.f382511a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
