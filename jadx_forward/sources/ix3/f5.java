package ix3;

/* loaded from: classes.dex */
public final class f5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i5 f376949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f376950e;

    public f5(ix3.i5 i5Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f376949d = i5Var;
        this.f376950e = f9Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ix3.i5 i5Var = this.f376949d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) i5Var.m80379x76847179(), 0, false);
        k0Var.f293405n = new ix3.d5(i5Var);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f376950e;
        k0Var.f293414s = new ix3.e5(this.f376950e, this.f376949d, ((k90.b) u0Var).rj(f9Var, f0Var, f9Var.z0(), false), ((t21.w2) i5Var.e7()).g(f9Var.z0()), ((vf0.c) ((c35.m) ((jz5.n) i5Var.f376985f).mo141623x754a37bb())).Ai(f9Var, false));
        k0Var.v();
        return true;
    }
}
