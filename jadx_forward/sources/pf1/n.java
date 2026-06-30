package pf1;

/* loaded from: classes7.dex */
public final class n extends pf1.q {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 f435314i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f435315m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f435316n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f435317o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f435318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6) {
        super(context, rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f435314i = context;
        this.f435315m = rt6;
        this.f435318p = new java.util.concurrent.atomic.AtomicBoolean(false);
        pf1.m mVar = new pf1.m();
        pf1.l lVar = new pf1.l(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(getContext());
        a17.setBackgroundColor(0);
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = a17.mo120153xd15cf999();
        mo120153xd15cf999.z(true);
        mo120153xd15cf999.E(true);
        mo120153xd15cf999.I(false);
        mo120153xd15cf999.J(0);
        a17.mo120519x347eaca1(false);
        a17.mo120520x57c53c73(false);
        mo120153xd15cf999.r(true);
        mo120153xd15cf999.G(true);
        mo120153xd15cf999.M(false);
        mo120153xd15cf999.L(false);
        mo120153xd15cf999.C(false);
        mo120153xd15cf999.D(false);
        mo120153xd15cf999.k(true);
        mo120153xd15cf999.t(true);
        mo120153xd15cf999.p(true);
        a17.mo120190xd6bb225d(mVar);
        a17.mo74800x23d27c02(lVar);
        mo120153xd15cf999.R(2);
        mo120153xd15cf999.h(false);
        java.lang.String g17 = mo120153xd15cf999.g();
        ik1.k0 k0Var = (ik1.k0) nd.f.a(ik1.k0.class);
        if (k0Var == null) {
            zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
            android.content.Context context2 = a17.getContext();
            ((yg0.e4) g3Var).getClass();
            k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.y(context2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        if (!r26.n0.B(g17, " MicroMessenger/", false)) {
            mo120153xd15cf999.Q(ik1.l0.a(a17.getContext(), g17, k0Var) + " miniProgram/" + mo158327x5db1c38().f156336n);
        }
        a17.mo120177x7619e5de(pf1.j.f435311a);
        this.f435317o = a17;
        addView(a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        a17.mo120128x74041feb(new pf1.h(this), "WeixinJSCore");
        a17.mo64581x9b341568(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128890i0 + m158331x74292566() + '/' + mo158327x5db1c38().d2() + "/vConsole.html", mo158327x5db1c38().S2(false).M("WAPageFrame.html"), "text/html", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, null);
    }

    public final void b() {
        if (this.f435318p.getAndSet(true)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f435317o;
        c22633x83752a59.mo14660x738236e6("window.__wxjs_environment = \"miniprogram\";", null);
        c22633x83752a59.mo14660x738236e6(ik1.f.e("wxa_library/vconsole-wxjs.js"), null);
        m158334x8e6896da().L();
        c22633x83752a59.mo14660x738236e6(mo158327x5db1c38().S2(false).M("WAGlobalConsole.js"), null);
    }

    public final void c(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLVConsoleView", "onReceivedError url:" + str + ", code:" + i17 + ", message:" + str2);
    }

    @Override // pf1.q
    /* renamed from: destroy */
    public void mo158326x5cd39ffa() {
        pf1.p pVar = new pf1.p(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            pVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(pVar);
        }
        pf1.k kVar = new pf1.k(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            kVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(kVar);
        }
    }

    /* renamed from: getViewWV */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 m158328x346a533a() {
        return this.f435317o;
    }

    @Override // pf1.q, pf1.c
    /* renamed from: getWebView */
    public pf1.d mo158318x86b9ebe3() {
        return new pf1.x(this.f435317o);
    }

    @Override // pf1.q, android.view.View
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 getContext() {
        return this.f435314i;
    }

    @Override // pf1.q
    /* renamed from: getRt */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo158327x5db1c38() {
        return this.f435315m;
    }
}
