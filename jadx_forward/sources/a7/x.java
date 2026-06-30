package a7;

/* loaded from: classes13.dex */
public final class x implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f83407d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.y f83408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f83409f;

    public x(java.io.File file, a7.y yVar) {
        this.f83407d = file;
        this.f83408e = yVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return this.f83408e.a();
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
            java.lang.Object b17 = this.f83408e.b(this.f83407d);
            this.f83409f = b17;
            dVar.c(b17);
        } catch (java.io.FileNotFoundException e17) {
            android.util.Log.isLoggable("FileLoader", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f83409f;
        if (obj != null) {
            try {
                this.f83408e.c(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
