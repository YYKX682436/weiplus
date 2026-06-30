package dj2;

/* loaded from: classes10.dex */
public final class h extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            lj2.v0 v0Var = this.f314429c;
            jVar.l((v0Var.a0().g().size() != 0 || v0Var.a0().l().size() < 5) ? pm2.a.f438386f : pm2.a.f438387g, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f314430d;
        lj2.v0 v0Var = this.f314429c;
        android.content.Context context = this.f314428b;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 5 ? i17 != 6 ? i17 != 7 ? new android.view.View(context) : new wj2.a(context, v0Var, x0Var) : new wj2.y(context, v0Var, x0Var) : new wj2.c0(context, v0Var, x0Var) : new wj2.b(context, v0Var, x0Var) : new wj2.e0(context, v0Var, x0Var) : new wj2.d(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicNormalRatioAdapter";
    }
}
