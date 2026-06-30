package cw0;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f304203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f304207h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(cw0.w0 w0Var, cw0.l0 l0Var, java.lang.Float f17, java.lang.Float f18, float f19) {
        super(0);
        this.f304203d = w0Var;
        this.f304204e = l0Var;
        this.f304205f = f17;
        this.f304206g = f18;
        this.f304207h = f19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw0.l0 l0Var = this.f304204e;
        boolean z17 = l0Var.f304181t;
        cw0.w0 w0Var = this.f304203d;
        w0Var.M(z17);
        boolean z18 = l0Var.f304181t;
        java.lang.Float f17 = this.f304206g;
        java.lang.Float f18 = this.f304205f;
        if (z18) {
            l0Var.n7(0.5f);
            l0Var.m7(0.25f);
            l0Var.o7(0.25f);
            w0Var.L(0.5f, f18 != null ? java.lang.Float.valueOf(0.25f) : null, f17 != null ? java.lang.Float.valueOf(0.25f) : null);
        } else {
            w0Var.L(this.f304207h, f18, f17);
        }
        return jz5.f0.f384359a;
    }
}
