package cj5;

/* loaded from: classes.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(cj5.l2 l2Var) {
        super(1);
        this.f123651d = l2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        j75.f m67437x4bd53102;
        j75.f m67437x4bd53103;
        j75.f m67437x4bd53104;
        android.view.View view;
        xm3.t0 t0Var;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "InitAction");
            cj5.l2 l2Var = this.f123651d;
            zm3.a T6 = l2Var.T6();
            if (T6 != null) {
                ym3.f T62 = T6.T6();
                xm3.n0 n0Var = new xm3.n0();
                n0Var.f536895g = 6;
                com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62 c22460x20778e62 = new com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62(T62, n0Var, l2Var.m158354x19263085());
                xm3.t0 t0Var2 = new xm3.t0(c22460x20778e62, new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactMainRecycleViewUIC$buildItemConvertFactory$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        ri5.h hVar = ri5.j.I;
                        if (type == ri5.j.f477639p0) {
                            return new ri5.c();
                        }
                        if (type == ri5.j.M) {
                            return new ri5.k();
                        }
                        boolean z17 = true;
                        if (type != ri5.j.K && type != ri5.j.N) {
                            z17 = false;
                        }
                        return z17 ? new ri5.a() : type == ri5.j.f477638J ? new ri5.p() : new ri5.g();
                    }
                }, false);
                t0Var2.B = (cj5.g2) ((jz5.n) l2Var.f123719i).mo141623x754a37bb();
                l2Var.f123718h = t0Var2;
                j75.e eVar = h0Var.f379600a;
                if (eVar != null && (eVar instanceof wi5.i0)) {
                    wi5.i0 i0Var = (wi5.i0) eVar;
                    for (yz5.a aVar : i0Var.f527828a) {
                        if (aVar != null && (view = (android.view.View) aVar.mo152xb9724478()) != null && (t0Var = l2Var.f123718h) != null) {
                            in5.n0.U(t0Var, view, view.hashCode(), false, 4, null);
                        }
                    }
                    v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) l2Var.f123715e).mo141623x754a37bb(), null, new cj5.c2(c22460x20778e62, l2Var, i0Var, null), 1, null);
                }
                l2Var.Y6().k().mo7960x6cab2c8d(l2Var.f123718h);
                l2Var.Y6().k().mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) l2Var.f123717g).mo141623x754a37bb());
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = l2Var.Y6().k();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z();
                zVar.f93704f = 0L;
                k17.m7964x8d4ad49c(zVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = l2Var.P6();
                if (P62 != null && (m67437x4bd53104 = P62.m67437x4bd5310()) != null) {
                    m67437x4bd53104.B3(new wi5.p());
                }
            }
            l2Var.Y6().k().setOnTouchListener(new cj5.d2(l2Var));
            l2Var.Y6().k().i(new cj5.e2(l2Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = l2Var.P6();
            if (P63 != null && (m67437x4bd53103 = P63.m67437x4bd5310()) != null) {
                cj5.x1 x1Var = new cj5.x1(l2Var);
                cj5.y1 y1Var = new cj5.y1(l2Var);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = l2Var.Y6().k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
                m67437x4bd53103.B3(new wi5.q(x1Var, y1Var, k18));
            }
            if (h0Var.f527825b && (P6 = l2Var.P6()) != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
                m67437x4bd53102.B3(new wi5.e());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P64 = l2Var.P6();
            if (P64 != null && (m67437x4bd5310 = P64.m67437x4bd5310()) != null) {
                m67437x4bd5310.B3(new wi5.s());
            }
            ((jz5.n) l2Var.f123723p).mo141623x754a37bb();
        }
        return jz5.f0.f384359a;
    }
}
