package a7;

/* loaded from: classes13.dex */
public final class m implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f83371d;

    public m(java.io.File file) {
        this.f83371d = file;
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
    /* renamed from: cancel */
    public void mo751xae7a2e7a() {
    }

    @Override // u6.e
    public void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        try {
            dVar.c(q7.c.a(this.f83371d));
        } catch (java.io.IOException e17) {
            android.util.Log.isLoggable("ByteBufferFileLoader", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
    }
}
