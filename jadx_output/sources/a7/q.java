package a7;

/* loaded from: classes13.dex */
public final class q implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1850d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.p f1851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1852f;

    public q(java.lang.String str, a7.p pVar) {
        this.f1850d = str;
        this.f1851e = pVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        this.f1851e.getClass();
        return java.io.InputStream.class;
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
            java.lang.Object a17 = ((a7.r) this.f1851e).a(this.f1850d);
            this.f1852f = a17;
            dVar.c(a17);
        } catch (java.lang.IllegalArgumentException e17) {
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        try {
            a7.p pVar = this.f1851e;
            java.lang.Object obj = this.f1852f;
            ((a7.r) pVar).getClass();
            ((java.io.InputStream) obj).close();
        } catch (java.io.IOException unused) {
        }
    }
}
