package ac5;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f84620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f84621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yb5.d dVar, android.app.Activity activity) {
        super(1);
        this.f84620d = dVar;
        this.f84621e = activity;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a doAction = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doAction, "doAction");
        android.content.Context g17 = this.f84620d.g();
        if (g17 == null) {
            g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(g17);
        u1Var.g(this.f84621e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncg));
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.ohw);
        u1Var.b(new ac5.c(doAction));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
