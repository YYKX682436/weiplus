package k50;

/* loaded from: classes.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.y0 f385788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(k50.y0 y0Var) {
        super(0);
        this.f385788d = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k50.y0 y0Var = this.f385788d;
        y0Var.getClass();
        qd0.q0 q0Var = (qd0.q0) i95.n0.c(qd0.q0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = y0Var.m158354x19263085();
        java.lang.String string = y0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.util.List clawBotUsernames = y0Var.f385807h;
        q0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clawBotUsernames, "clawBotUsernames");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", string);
        intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(clawBotUsernames, ","));
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        pf5.j0.a(intent, fj5.b.class);
        pf5.j0.a(intent, fj5.e.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        y0Var.m158354x19263085().startActivityForResult(intent, 1001);
        return jz5.f0.f384359a;
    }
}
