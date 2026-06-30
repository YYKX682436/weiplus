package rv0;

/* loaded from: classes5.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f f481734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(rv0.f fVar, rv0.n1 n1Var) {
        super(1);
        this.f481734d = fVar;
        this.f481735e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        rv0.f fVar = this.f481734d;
        if (fVar.m160994x67ad68cc()) {
            gx0.kh q76 = this.f481735e.q7();
            java.lang.String string = fVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lm8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        fVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
