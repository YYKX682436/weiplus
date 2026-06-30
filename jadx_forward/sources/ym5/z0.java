package ym5;

/* loaded from: classes15.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n0 f545118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f545119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ym5.n0 n0Var, android.view.View view) {
        super(0);
        this.f545118d = n0Var;
        this.f545119e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        jz5.f0 f0Var2 = null;
        android.view.View view = this.f545119e;
        ym5.n0 n0Var = this.f545118d;
        if (n0Var != null) {
            ym5.b1 c17 = ym5.a1.c(view);
            if (c17 != null) {
                c17.f544747e = n0Var;
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                ym5.b1 b1Var = new ym5.b1(view);
                b1Var.f544744b = true;
                b1Var.f544747e = n0Var;
                ym5.a1.a(view.hashCode(), b1Var);
            }
        } else {
            ym5.b1 c18 = ym5.a1.c(view);
            if (c18 != null) {
                c18.f544747e = null;
                if (c18.f544748f == null) {
                    c18.f544743a.removeOnAttachStateChangeListener(c18.f544746d);
                    ym5.a1.d(view.hashCode());
                }
            }
        }
        return f0Var;
    }
}
