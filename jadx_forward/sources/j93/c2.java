package j93;

/* loaded from: classes.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.e2 f379900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(j93.e2 e2Var) {
        super(1);
        this.f379900d = e2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.c0 c0Var;
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (!state.e() && (c0Var = (wi5.c0) state.a(wi5.c0.class)) != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f527815b, 0)) != null) {
            j93.e2 e2Var = this.f379900d;
            e2Var.getClass();
            e2Var.f379911f = str;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            j45.l.n(e2Var.m80379x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 1);
        }
        return jz5.f0.f384359a;
    }
}
