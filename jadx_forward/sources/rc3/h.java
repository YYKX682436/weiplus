package rc3;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lc3.b0 f475533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rc3.w0 w0Var, int i17, lc3.b0 b0Var) {
        super(1);
        this.f475531d = w0Var;
        this.f475532e = i17;
        this.f475533f = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lc3.a0 result = (lc3.a0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String a17 = result.a();
        boolean p17 = this.f475533f.p();
        rc3.w0 w0Var = this.f475531d;
        w0Var.getClass();
        w0Var.M(new rc3.z(w0Var, a17, p17, this.f475532e));
        return jz5.f0.f384359a;
    }
}
