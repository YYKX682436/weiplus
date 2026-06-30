package dj2;

/* loaded from: classes10.dex */
public final class e extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            ((lj2.j) view).l(pm2.a.f438386f, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f314430d;
        lj2.v0 v0Var = this.f314429c;
        android.content.Context context = this.f314428b;
        return i17 != 1 ? i17 != 2 ? i17 != 5 ? i17 != 6 ? new android.view.View(context) : new tj2.a(context, v0Var, x0Var) : new tj2.b(context, v0Var, x0Var) : new wj2.e0(context, v0Var, x0Var) : new wj2.d(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicFullNormalRatioAdapter";
    }
}
