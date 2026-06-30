package qx4;

/* loaded from: classes8.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f449006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.m0 f449007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(qx4.z0 z0Var, qx4.m0 m0Var) {
        super(0);
        this.f449006d = z0Var;
        this.f449007e = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qx4.x0 x0Var = new qx4.x0(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE, new android.content.MutableContextWrapper(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        x0Var.m81408x9e42f747(true);
        qx4.z0 z0Var = this.f449006d;
        int i17 = z0Var.f449010b == 2 ? 10 : 0;
        qx4.m0 m0Var = this.f449007e;
        x0Var.J0(null, new qx4.u0(i17, m0Var, z0Var, x0Var));
        m0Var.f448960c = x0Var;
        if (m0Var.f448959b == 2) {
            qx4.e eVar = new qx4.e(new qx4.v0(x0Var));
            x0Var.mo120128x74041feb(eVar, "preloadJSApi");
            m0Var.f448961d = eVar;
        } else {
            nw4.p2 p2Var = new nw4.p2();
            x0Var.mo120128x74041feb(p2Var, "__wx");
            qx4.d0 d0Var = new qx4.d0(new qx4.w0(x0Var), new mu4.h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.class, "webSearch", "", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h).a());
            x0Var.mo120128x74041feb(d0Var, "webSearchJSApi");
            m0Var.f448962e = p2Var;
            m0Var.f448963f = d0Var;
        }
        x0Var.mo32265x141096a9(z0Var.f449009a);
        return jz5.f0.f384359a;
    }
}
