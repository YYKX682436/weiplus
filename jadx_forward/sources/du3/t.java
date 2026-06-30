package du3;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f325239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f325240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(du3.b0 b0Var, ju3.d0 d0Var) {
        super(1);
        this.f325239d = b0Var;
        this.f325240e = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        du3.b item = (du3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str = a17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            du3.b0 b0Var = this.f325239d;
            ((vh0.f3) n1Var).bj(b0Var.f325057f.getContext(), "wxid_wi_1d142z0zdj03", 10, str, new du3.s(b0Var, item, this.f325240e));
        }
        return jz5.f0.f384359a;
    }
}
