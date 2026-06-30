package jp0;

/* loaded from: classes10.dex */
public class a implements jp0.h, jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f382505a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.InputStream f382506b = null;

    public a(java.lang.String str) {
        this.f382505a = str;
    }

    @Override // jp0.h
    public byte[] a() {
        byte[] bArr = null;
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(this.f382505a);
            this.f382506b = E;
            bArr = new byte[E.available()];
            this.f382506b.read(bArr);
            return bArr;
        } catch (java.lang.Exception unused) {
            return bArr;
        }
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(this.f382505a);
            this.f382506b = E;
            return E;
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    @Override // jp0.g
    /* renamed from: close */
    public void mo141195x5a5ddf8() {
        java.io.InputStream inputStream = this.f382506b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
