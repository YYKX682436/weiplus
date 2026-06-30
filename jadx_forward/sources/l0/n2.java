package l0;

/* loaded from: classes14.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.u0 f395919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f395920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(b0.u0 u0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var) {
        super(1);
        this.f395919d = u0Var;
        this.f395920e = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.e animateTo = (z.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateTo, "$this$animateTo");
        float floatValue = ((java.lang.Number) animateTo.d()).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f395920e;
        ((b0.j) this.f395919d).f97885a.f97906a.mo146xb9724478(java.lang.Float.valueOf(floatValue - e0Var.f391648d));
        e0Var.f391648d = ((java.lang.Number) animateTo.d()).floatValue();
        return jz5.f0.f384359a;
    }
}
