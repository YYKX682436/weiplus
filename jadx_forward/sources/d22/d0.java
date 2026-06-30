package d22;

/* loaded from: classes12.dex */
public final class d0 extends qk.k7 implements d22.v {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f307367p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.qj0 f307368q;

    /* renamed from: r, reason: collision with root package name */
    public final j12.i f307369r;

    public d0(java.lang.String productId, r45.qj0 qj0Var, j12.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        this.f307367p = productId;
        this.f307368q = qj0Var;
        this.f307369r = iVar;
    }

    @Override // d22.v
    public boolean a() {
        return this.f445736l;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.e0();
    }

    @Override // d22.v
    /* renamed from: isValid */
    public boolean mo123369x7b953cf2() {
        r45.qj0 a17;
        java.lang.String str = this.f307367p;
        if (str.length() == 0) {
            return false;
        }
        j12.i iVar = this.f307369r;
        if (iVar != null) {
            if (iVar != null && (a17 = iVar.a(true)) != null) {
                r1 = a17.f465565d;
            }
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, r1);
        }
        r45.qj0 qj0Var = this.f307368q;
        if (qj0Var != null) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, qj0Var != null ? qj0Var.f465565d : null);
        }
        return true;
    }
}
