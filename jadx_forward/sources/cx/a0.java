package cx;

/* loaded from: classes7.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f305899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cx.f0 f0Var, int i17, java.lang.String str) {
        super(0);
        this.f305899d = f0Var;
        this.f305900e = i17;
        this.f305901f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cx.f0 f0Var = this.f305899d;
        f0Var.Di(1);
        java.lang.String str = this.f305901f;
        int i17 = this.f305900e;
        if (i17 == 1) {
            cx.w0 w0Var = f0Var.f305955e;
            if (w0Var != null) {
                w0Var.G1(new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p709x3a7517a9.p710x5c6729a.C10485x89be7d2f().f229414d, str);
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p709x3a7517a9.p710x5c6729a.C10486x3faed6b4 c10486x3faed6b4 = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p709x3a7517a9.p710x5c6729a.C10486x3faed6b4();
            cl0.g gVar = new cl0.g();
            gVar.h("adInfo", str);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c10486x3faed6b4.f229415e = gVar2;
            cx.w0 w0Var2 = f0Var.f305955e;
            if (w0Var2 != null) {
                w0Var2.G1(c10486x3faed6b4.f229414d, gVar2);
            }
        }
        return jz5.f0.f384359a;
    }
}
