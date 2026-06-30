package a7;

/* loaded from: classes13.dex */
public final class m implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f1838d;

    public m(java.io.File file) {
        this.f1838d = file;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return java.nio.ByteBuffer.class;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    @Override // u6.e
    public void cancel() {
    }

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        try {
            dVar.c(q7.c.a(this.f1838d));
        } catch (java.io.IOException e17) {
            android.util.Log.isLoggable("ByteBufferFileLoader", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
    }
}
