package cx;

/* loaded from: classes7.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f305910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(cx.f0 f0Var, java.lang.String str) {
        super(0);
        this.f305910d = f0Var;
        this.f305911e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cx.f0 f0Var = this.f305910d;
        f0Var.Di(10);
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "brandServiceAdInfo");
        gVar.h("frameSetName", this.f305911e);
        gVar.p(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.System.currentTimeMillis());
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        cx.w0 w0Var = f0Var.f305955e;
        if (w0Var != null) {
            w0Var.G1(new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd().f229414d, gVar2);
        }
        return jz5.f0.f384359a;
    }
}
