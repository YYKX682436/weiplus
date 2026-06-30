package cw0;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f304223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cw0.w0 w0Var, cw0.l0 l0Var) {
        super(1);
        this.f304223d = w0Var;
        this.f304224e = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        cw0.w0 w0Var = this.f304223d;
        boolean m160994x67ad68cc = w0Var.m160994x67ad68cc();
        cw0.l0 l0Var = this.f304224e;
        if (m160994x67ad68cc) {
            java.lang.String string = w0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.chs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            l0Var.U7(string);
        }
        w0Var.D = false;
        l0Var.R7();
        return java.lang.Boolean.TRUE;
    }
}
