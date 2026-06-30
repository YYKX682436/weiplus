package a7;

/* loaded from: classes13.dex */
public final class q implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83383d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.p f83384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f83385f;

    public q(java.lang.String str, a7.p pVar) {
        this.f83383d = str;
        this.f83384e = pVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        this.f83384e.getClass();
        return java.io.InputStream.class;
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
            java.lang.Object a17 = ((a7.r) this.f83384e).a(this.f83383d);
            this.f83385f = a17;
            dVar.c(a17);
        } catch (java.lang.IllegalArgumentException e17) {
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        try {
            a7.p pVar = this.f83384e;
            java.lang.Object obj = this.f83385f;
            ((a7.r) pVar).getClass();
            ((java.io.InputStream) obj).close();
        } catch (java.io.IOException unused) {
        }
    }
}
