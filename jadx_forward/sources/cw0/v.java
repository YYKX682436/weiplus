package cw0;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f304219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cw0.l0 l0Var, cw0.w0 w0Var, java.lang.Float f17, java.lang.Float f18) {
        super(1);
        this.f304218d = l0Var;
        this.f304219e = w0Var;
        this.f304220f = f17;
        this.f304221g = f18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        cw0.l0 l0Var = this.f304218d;
        boolean booleanValue = bool != null ? bool.booleanValue() : !l0Var.f304181t;
        l0Var.f304181t = booleanValue;
        if (booleanValue) {
            l0Var.n7(0.5f);
            l0Var.m7(0.25f);
            l0Var.o7(0.25f);
            this.f304219e.L(0.5f, this.f304220f != null ? java.lang.Float.valueOf(0.25f) : null, this.f304221g != null ? java.lang.Float.valueOf(0.25f) : null);
        }
        return java.lang.Boolean.valueOf(l0Var.f304181t);
    }
}
