package xn2;

/* loaded from: classes2.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b f537059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xn2.p0 p0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b) {
        super(0);
        this.f537058d = p0Var;
        this.f537059e = c5505x8c69712b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn2.p0 p0Var = this.f537058d;
        if (!p0Var.f537076a.isFinishing()) {
            android.app.Activity activity = p0Var.f537076a;
            if (!activity.isDestroyed()) {
                int a17 = com.p314xaae8f345.mm.ui.bl.a(activity) + com.p314xaae8f345.mm.ui.bl.i(activity, -1) + i65.a.b(activity, 24);
                int B = i65.a.B(activity);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b = this.f537059e;
                do2.b bVar = new do2.b(activity, new xn2.j0(p0Var, c5505x8c69712b, c5505x8c69712b.f135836g.f88470b));
                bVar.e(B / 2, a17);
                p0Var.f537100y = bVar;
                bVar.show();
                pm0.v.V(3000L, new xn2.k0(p0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
