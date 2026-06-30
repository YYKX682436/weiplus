package ls1;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ls1.e0 e0Var) {
        super(1);
        this.f402538d = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        ls1.e0 e0Var = this.f402538d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "load pageFrame : ".concat(value));
        e0Var.V.a("onTmplLoadEnd", java.lang.System.currentTimeMillis());
        boolean B = r26.n0.B(value, "ok", false);
        boolean z17 = e0Var.Z1;
        r45.wm6 wm6Var = e0Var.N1;
        if (!z17) {
            e0Var.Z1 = true;
            is1.l.f375956a.k(wm6Var, B);
        }
        if (B) {
            e0Var.I(-102);
            ax4.a.b(wm6Var.f470833o, 114, 1, true);
        } else {
            e0Var.I(-103);
            ax4.a.b(wm6Var.f470833o, 115, 1, true);
        }
        return jz5.f0.f384359a;
    }
}
