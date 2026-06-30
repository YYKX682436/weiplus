package ym5;

/* loaded from: classes15.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.o0 f545108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f545109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ym5.o0 o0Var, android.view.ViewGroup viewGroup) {
        super(0);
        this.f545108d = o0Var;
        this.f545109e = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        jz5.f0 f0Var2 = null;
        android.view.ViewGroup viewGroup = this.f545109e;
        ym5.o0 o0Var = this.f545108d;
        if (o0Var != null) {
            ym5.b1 b17 = ym5.a1.b(viewGroup);
            if (b17 != null) {
                b17.f544748f = o0Var;
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                ym5.b1 b1Var = new ym5.b1(viewGroup);
                b1Var.f544748f = o0Var;
                ym5.a1.a(viewGroup.hashCode(), b1Var);
            }
        } else {
            ym5.b1 b18 = ym5.a1.b(viewGroup);
            if (b18 != null) {
                b18.f544748f = null;
                if (b18.f544747e == null) {
                    b18.f544743a.removeOnAttachStateChangeListener(b18.f544746d);
                    ym5.a1.d(viewGroup.hashCode());
                }
            }
        }
        return f0Var;
    }
}
