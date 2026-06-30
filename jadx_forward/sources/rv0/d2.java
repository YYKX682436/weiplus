package rv0;

/* loaded from: classes5.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(rv0.d dVar, rv0.n1 n1Var) {
        super(1);
        this.f481501d = dVar;
        this.f481502e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        rv0.d dVar = this.f481501d;
        if (dVar.m160994x67ad68cc()) {
            gx0.kh q76 = this.f481502e.q7();
            java.lang.String string = dVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lm_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        dVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
