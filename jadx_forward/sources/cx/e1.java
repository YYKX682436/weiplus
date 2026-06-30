package cx;

/* loaded from: classes7.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f305931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(cx.j1 j1Var) {
        super(0);
        this.f305931d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String pj6;
        java.lang.String pj7;
        boolean z17;
        java.lang.String pj8;
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        cx.j1 j1Var = this.f305931d;
        pj6 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj6, "is appbrand so open true");
        boolean fj6 = j1Var.fj();
        pj7 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj7, "is biz open " + fj6);
        if (fj6) {
            boolean Ai = cx.j1.Ai(j1Var);
            pj8 = j1Var.pj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj8, "is stability open " + Ai);
            if (Ai) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
