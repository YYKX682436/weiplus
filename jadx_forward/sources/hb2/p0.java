package hb2;

/* loaded from: classes8.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f361614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, yz5.l lVar, zy2.gc gcVar) {
        super(3);
        this.f361612d = str;
        this.f361613e = lVar;
        this.f361614f = gcVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.l13 resp = (r45.l13) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(3, resp.m75945x2fec8307(3));
        if (this.f361612d == null) {
            this.f361613e.mo146xb9724478(ri2Var);
        } else {
            pm0.v.X(hb2.o0.f361610d);
            hb2.w0.a(hb2.s0.f361623e, this.f361612d, ri2Var, this.f361614f, false, false, null, 56, null);
        }
        return jz5.f0.f384359a;
    }
}
