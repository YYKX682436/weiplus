package rc3;

/* loaded from: classes7.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f475641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(rc3.f1 f1Var, int i17) {
        super(1);
        this.f475641d = f1Var;
        this.f475642e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lc3.a0 result = (lc3.a0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        sc3.q1 q1Var = this.f475641d.f475523h;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("server");
            throw null;
        }
        q1Var.J5(this.f475642e, result.a());
        return jz5.f0.f384359a;
    }
}
