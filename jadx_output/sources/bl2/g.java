package bl2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f21708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f21709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f21710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bw5.lp0 lp0Var, bl2.k kVar, r45.d22 d22Var) {
        super(0);
        this.f21708d = lp0Var;
        this.f21709e = kVar;
        this.f21710f = d22Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(qk.g9.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        bw5.lp0 tingItem = this.f21708d;
        kotlin.jvm.internal.o.f(tingItem, "$tingItem");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        pm0.v.X(new rk4.y8(tingItem, null, new il4.e(null, 0, 2200, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null)));
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        bl2.k kVar = this.f21709e;
        qk.f9.b(aj6, kVar.f118381d, false, this.f21708d, null, null, null, null, null, 248, null);
        com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var = kVar.f21718i;
        qo0.c cVar = jj0Var.f113325g;
        fm2.c cVar2 = cVar instanceof fm2.c ? (fm2.c) cVar : null;
        if (cVar2 != null) {
            jj0Var.f113125x = true;
            androidx.fragment.app.Fragment uicFragment = cVar2.getUicFragment();
            if (uicFragment != null) {
                androidx.fragment.app.Fragment fragment = uicFragment.isAdded() ? uicFragment : null;
                if (fragment != null) {
                    ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
                    um2.x5 startUIC = cVar2.getStartUIC();
                    if (startUIC != null) {
                        startUIC.d0();
                    }
                }
            }
        }
        r45.d22 d22Var = this.f21710f;
        boolean b17 = dk2.q.b(d22Var);
        java.lang.String string = d22Var.getString(9);
        if (string == null) {
            string = "";
        }
        bl2.k.y(kVar, 3, b17, string);
        return jz5.f0.f302826a;
    }
}
