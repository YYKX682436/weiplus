package a7;

/* loaded from: classes13.dex */
public final class x implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f1874d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.y f1875e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1876f;

    public x(java.io.File file, a7.y yVar) {
        this.f1874d = file;
        this.f1875e = yVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return this.f1875e.a();
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
            java.lang.Object b17 = this.f1875e.b(this.f1874d);
            this.f1876f = b17;
            dVar.c(b17);
        } catch (java.io.FileNotFoundException e17) {
            android.util.Log.isLoggable("FileLoader", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f1876f;
        if (obj != null) {
            try {
                this.f1875e.c(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
