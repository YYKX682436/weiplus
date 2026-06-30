package k91;

/* loaded from: classes7.dex */
public class r4 implements k91.a5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k91.d5 f387292c;

    public r4(java.lang.String str, k91.d5 d5Var) {
        this.f387291b = str;
        this.f387292c = d5Var;
    }

    @Override // k91.a5
    public boolean a(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        return k91.h5.a(v5Var) || k91.h5.b(v5Var);
    }

    @Override // k91.a5
    public k91.k1 b(java.lang.String str) {
        k91.d5 d5Var = this.f387292c;
        return d5Var != null ? new k91.k1(str, null, false, d5Var.c(), d5Var.b(), d5Var.a()) : new k91.k1(str, null, false);
    }

    @Override // k91.a5
    public java.lang.Object e(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(this.f387291b, k91.a5.f387072a);
    }

    @Override // k91.a5
    /* renamed from: getUsername */
    public java.lang.String mo142140x6c03c64c() {
        return this.f387291b;
    }
}
