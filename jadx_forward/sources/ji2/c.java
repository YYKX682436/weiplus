package ji2;

/* loaded from: classes10.dex */
public final class c extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        jz5.g gVar = ki2.e.f389642b;
        gi2.g gVar2 = (gi2.g) ((jz5.n) ki2.e.f389642b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.ktv.adapter.FinderLivePrepareKTVRoomAdapter.getMicLayout>");
        return gVar2;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).l(pm2.a.f438389i, g(i17));
        }
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f353804e;
        lj2.v0 v0Var = this.f353803d;
        android.content.Context context = this.f353802c;
        return i17 != 1 ? (i17 == 2 || i17 == 3) ? new li2.j(context, v0Var, x0Var) : new android.view.View(context) : new li2.i(context, v0Var, x0Var);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "PrepareKTVRoomAdapter";
    }
}
