package rc3;

/* loaded from: classes7.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f475481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(rc3.f1 f1Var) {
        super(0);
        this.f475481d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc3.q1 q1Var = this.f475481d.f475523h;
        if (q1Var != null) {
            return new oc3.c(q1Var.f488009e, null, 2, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("server");
        throw null;
    }
}
