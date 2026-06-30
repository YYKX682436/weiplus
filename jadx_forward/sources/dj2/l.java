package dj2;

/* loaded from: classes10.dex */
public final class l extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // hn5.c
    public void f() {
        super.f();
        this.f314430d.J();
    }

    @Override // dj2.b, hn5.c
    public void g(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.g(i17, view);
        if (view instanceof lj2.j) {
            lj2.j jVar = (lj2.j) view;
            jVar.l(jVar instanceof xj2.j ? pm2.a.f438389i : pm2.a.f438393p, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f314430d;
        lj2.v0 v0Var = this.f314429c;
        android.content.Context context = this.f314428b;
        return i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 5 ? i17 != 6 ? new android.view.View(context) : new qj2.d(context, v0Var, x0Var) : new qj2.a(context, v0Var, x0Var) : new xj2.j(context, v0Var, x0Var) : new xj2.b(context, v0Var, x0Var) : new xj2.a(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String i(xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String i17 = super.i(data);
        xh2.i iVar = data.f536054b;
        return i17 + (iVar.f536089h ? iVar.mo133838x9616526c() : "");
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "CrossRoomPkRatioAdapter";
    }
}
