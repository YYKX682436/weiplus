package en5;

/* loaded from: classes5.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f336881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f336882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(n0.e5 e5Var, fn5.n0 n0Var, java.lang.String str) {
        super(3);
        this.f336881d = e5Var;
        this.f336882e = n0Var;
        this.f336883f = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        fn5.o0 o0Var;
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        n0.e5 e5Var = this.f336881d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((e5Var == null || (o0Var = (fn5.o0) e5Var.mo128745x754a37bb()) == null) ? null : o0Var.name(), "STOP")) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-597782364);
            en5.n0.e(this.f336882e, y0Var2, 8);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(-597782281);
            java.lang.String loadingText = this.f336883f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadingText, "$loadingText");
            en5.n0.f(loadingText, y0Var3, 0);
            y0Var3.o(false);
        }
        return jz5.f0.f384359a;
    }
}
