package b26;

/* loaded from: classes16.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.s0 f99002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p16.h0 f99003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b26.c f99004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(b26.s0 s0Var, p16.h0 h0Var, b26.c cVar) {
        super(0);
        this.f99002d = s0Var;
        this.f99003e = h0Var;
        this.f99004f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b26.s0 s0Var = this.f99002d;
        b26.x0 a17 = s0Var.a(s0Var.f99046a.f99050c);
        java.util.List c17 = a17 != null ? s0Var.f99046a.f99048a.f99020e.c(a17, this.f99003e, this.f99004f) : null;
        return c17 == null ? kz5.p0.f395529d : c17;
    }
}
