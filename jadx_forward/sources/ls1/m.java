package ls1;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ls1.e0 e0Var) {
        super(0);
        this.f402534d = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ls1.e0 e0Var = this.f402534d;
        boolean z17 = !e0Var.p0(-122);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("history.replaceState({},\"\",\"");
        java.lang.String str = e0Var.X1;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullUrl");
            throw null;
        }
        sb6.append(str);
        sb6.append("\");");
        e0Var.L(sb6.toString(), new ls1.y(e0Var));
        java.lang.String str2 = e0Var.X1;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullUrl");
            throw null;
        }
        e0Var.J(e0Var.f263486s0, str2);
        r45.wm6 wm6Var = e0Var.N1;
        if (z17) {
            java.lang.String str3 = e0Var.X1;
            if (str3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullUrl");
                throw null;
            }
            java.lang.String a17 = hy4.i.a(str3, e0Var.C1());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "[updateAuth]ok fullUrl:%s", a17);
            e0Var.L("window.onPageAuthOK(" + new org.json.JSONObject().put("fullUrl", a17) + ')', new ls1.z(e0Var));
            ax4.a.b(wm6Var.f470833o, 133, 1, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "[updateAuth]fail");
            e0Var.L("window.onPageAuthFail()", new ls1.a0(e0Var));
            ax4.a.b(wm6Var.f470833o, 134, 1, true);
        }
        return jz5.f0.f384359a;
    }
}
