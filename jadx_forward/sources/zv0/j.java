package zv0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f557723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f557724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zv0.f0 f0Var, rv0.n1 n1Var) {
        super(1);
        this.f557723d = f0Var;
        this.f557724e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        zv0.f0 f0Var = this.f557723d;
        if (f0Var.m160994x67ad68cc()) {
            gx0.kh q76 = this.f557724e.q7();
            java.lang.String string = f0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        f0Var.D = false;
        return java.lang.Boolean.TRUE;
    }
}
