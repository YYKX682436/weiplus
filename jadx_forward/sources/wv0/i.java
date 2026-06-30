package wv0;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv0.q f531448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f531449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wv0.q qVar, rv0.n1 n1Var) {
        super(1);
        this.f531448d = qVar;
        this.f531449e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        wv0.q qVar = this.f531448d;
        if (qVar.m160994x67ad68cc()) {
            rv0.n1 n1Var = this.f531449e;
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        qVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
