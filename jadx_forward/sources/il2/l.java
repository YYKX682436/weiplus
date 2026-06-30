package il2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.p5 f373603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f373604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mm2.p5 p5Var, il2.r rVar) {
        super(3);
        this.f373603d = p5Var;
        this.f373604e = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String verifyId = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyId, "verifyId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        il2.r rVar = this.f373604e;
        mm2.p5 p5Var = this.f373603d;
        if (booleanValue) {
            p5Var.getClass();
            p5Var.f410884c = verifyId;
            p5Var.f410885d = url;
            il2.r.t1(rVar, p5Var);
        } else {
            zl2.j5.f555383a.e(p5Var.f410883b);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.q5.f410900a);
        }
        return jz5.f0.f384359a;
    }
}
